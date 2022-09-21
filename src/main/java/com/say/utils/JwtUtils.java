package com.say.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JwtUtils {

    public static final String jwtId = "tokenId";
    /**
     * token 过期时间, 单位: 秒. 这个值表示 30 天
     */
    private static final long TOKEN_EXPIRED_TIME = 30 * 24 * 60 * 60;
    /**
     * jwt 加密解密密钥(可自行填写)
     */
    private static final String JWT_SECRET = "1234567890";

    /**
     * 创建JWT
     */
    public static String createJWT(Map<String, Object> claims, Long time) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256; //指定签名的时候使用的签名算法，也就是header那部分，jjwt已经将这部分内容封装好了。
        Date now = new Date(System.currentTimeMillis());

        SecretKey secretKey = generalKey();
        long nowMillis = System.currentTimeMillis();//生成JWT的时间
        //下面就是在为payload添加各种标准声明和私有声明了
        JwtBuilder builder = Jwts.builder() //这里其实就是new一个JwtBuilder，设置jwt的body
                .setClaims(claims)          //如果有私有声明，一定要先设置这个自己创建的私有的声明，这个是给builder的claim赋值，一旦写在标准的声明赋值之后，就是覆盖了那些标准的声明的
                .setId(jwtId)                  //设置jti(JWT ID)：是JWT的唯一标识，根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token,从而回避重放攻击。
                .setIssuedAt(now)           //iat: jwt的签发时间
                .signWith(signatureAlgorithm, secretKey);//设置签名使用的签名算法和签名使用的秘钥
        if (time >= 0) {
            long expMillis = nowMillis + time;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);     //设置过期时间
        }
        return builder.compact();
    }


    /**
     * 验证jwt
     */
    public static Claims verifyJwt(String token) {
        //签名秘钥，和生成的签名的秘钥一模一样
        SecretKey key = generalKey();
        Claims claims;
        try {
            claims = Jwts.parser()  //得到DefaultJwtParser
                    .setSigningKey(key)         //设置签名的秘钥
                    .parseClaimsJws(token).getBody();
        } catch (Exception e) {
            claims = null;
        }//设置需要解析的jwt
        return claims;

    }

    /**
     * 由字符串生成加密key
     *
     * @return
     */
    public static SecretKey generalKey() {
        String stringKey = JWT_SECRET;
        byte[] encodedKey = Base64.decodeBase64(stringKey);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    /**
     * 根据userId和openid生成token
     */
    public static String generateToken(String openId, Integer userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("openId", openId);
        map.put("sub", openId);
        return createJWT(map, TOKEN_EXPIRED_TIME);
    }


    /**
     * 获取集合中最接近的数
     *
     * @param number  需要查找的数字
     * @param numbers 数字集合
     * @param flag    如果有两个相近的数据   true:选择大数  false:选择小数
     * @param <T>     必须为数字类型
     * @return 相近结果
     */
    public static <T extends Number> T getSimilarNumber(T number, Collection<T> numbers, Boolean flag) {
        if (null == numbers || numbers.isEmpty()) {
            throw new RuntimeException("数字集合不能为空");
        }
        // 如果集合包含需要查找的数字,直接返回
        if (numbers.contains(number)) {
            return number;
        }
        // 判断集合是否为List
        if (numbers instanceof List) {
            // 因为List为重复集合,转成Set去重
            numbers = new HashSet<>(numbers);
        }
        // 把需要查找的数字添加到集合中
        numbers.add(number);
        // 对集合进行排序,转换成有序集合
        List<T> numList = numbers.stream().sorted().collect(Collectors.toList());
        // 获取集合的长度
        int size = numList.size();
        // 获取需要查找的数字所在位置
        int index = numList.indexOf(number);
        // 如果所在位置为最前面,表示第一位及为临近数
        if (index <= 0) {
            return numList.get(1);
        }
        // 如果所在位置为最后一位,表示在它前面的一位为临近数
        if (index >= size - 1) {
            return numList.get(size - 2);
        }
        // 前一个数据
        T before = numList.get(index - 1);
        // 后一个数据
        T after = numList.get(index + 1);
        // 需要查找的数字和前一个数字相差值
        double beforeDifference = number.doubleValue() - before.doubleValue();
        // 需要查找的数字和后一个数字相差值
        double afterDifference = after.doubleValue() - number.doubleValue();
        // 如果两个值相同
        if (beforeDifference == afterDifference) {
            // 判断取大值,还是取小值
            return flag ? after : before;
        }
        // 取最相近的值
        return beforeDifference < afterDifference ? before : after;
    }


    public static void main(String[] args) {
        String str = "20220802";

        int date = Integer.parseInt(str);

        List<Integer> dates = Stream.of("20220801", "20220803").map(Integer::parseInt).collect(Collectors.toList());


        Integer similarNumber = getSimilarNumber(date, dates, true);

        System.out.println("最大相邻数：" + similarNumber);


    }
}
