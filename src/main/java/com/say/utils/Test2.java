package com.say.utils;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {

    /** 前区杀号
     * 05 14 16 29 35
     * 06 16 19 24 30
     * 01 04 10 12 16
     * 09 11 19 24 30
     * 02 10 14 16 20
     * 26 30 32 01 03
     * 07 09 10 16 19
     * 31 09 12 16 23
     * 25 28 32 34
     * @param args
     */
    public static void main(String[] args) {
       /* List<String> list = Arrays.asList(
              "9","8","3","4" ,"7", "7",
              "6","1","7","9", "4" ,"7",
              "6","8","0","7","1","2","5","6"
        );

        Map<String, Long> stringLongMap = frequencyOfListQ(list);

        stringLongMap.forEach((k,v)->{
            if (v>=2){
                System.out.println(k);
            }
        });

        System.out.println(stringLongMap);*/

        //前
        List<String> front = new ArrayList<>(new HashSet<>(Arrays.asList(
                "01","02","03","05",
                "06","07","08","10",
                "18","15","14","11",
                "23","24","28","29",
                "34"
        )));

        List<String> last = new ArrayList<>(new HashSet<>(Arrays.asList("1","4","6","7","8","9")));

        List<List<String>> list = new ArrayList<>();
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        boolean x = true;
        while (x){

        if (a.size()<5){
            String s = front.get(new Random().nextInt(front.size()));
            a.add(s);
        }

        if (b.size()<2){
            b.add(front.get(new Random().nextInt(last.size())));
        }

        if (a.size()==5 && b.size()==2){
            c.addAll(a);
            c.addAll(b);
            list.add(c);
            c = new ArrayList<>();
        }

        if (list.size()==5){
            x=false;
        }
        }

        System.out.println(list);


    }

    /**
     * 适用于 jdk 1.8及以上， 统计List集合中每个元素出现的次数
     * 例如frequencyOfListElements(["111","111","222","333"])
     *  ->
     * 则返回Map {111=2, 222=1, 333=1}
     * @param falcons
     * @return Map<String,Integer>
     */
    public static Map<String, Long> frequencyOfListQ(List<String> falcons){
        if(CollectionUtils.isEmpty(falcons)){
            return new HashMap<>();
        }
        return falcons.stream().collect(Collectors.groupingBy(k->k, Collectors.counting()));
    }
}
