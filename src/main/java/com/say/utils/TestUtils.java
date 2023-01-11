package com.say.utils;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TestUtils {






    public static void main(String[] args) {


        //生成组数
        int NUMBER_GROUP = 5;

        //前
        List<String> front = new ArrayList<>(new HashSet<>(Arrays.asList(
                "01","03","05","07","09",
                "12","14","16","18",
                "20","22","24","26",
                "28","30","32","34",
                "35"
        )));
        //后
        //List<String> last = new ArrayList<>(new HashSet<>(Arrays.asList("05","09")));
        List<String> last = new ArrayList<>(new HashSet<>(Arrays.asList("01","03","07","08","11")));

        Map<LinkedHashSet<String>, LinkedHashSet<String>> map = new HashMap<>();


        LinkedHashSet<String> setf = new LinkedHashSet<>();
        LinkedHashSet<String> setl = new LinkedHashSet<>();

        boolean a = true;


        while (a) {

            int frontAreaRandom = new Random().nextInt(front.size());
            if (setf.size() < 5) {
                setf.add(front.get(frontAreaRandom));
            }

            int randomBackArea = new Random().nextInt(last.size());
            if (setl.size() < 2) {
                setl.add(last.get(randomBackArea));
            }


            if (setf.size() == 5 && setl.size() == 2) {
                map.put(setf, setl);
                //初始化盒子
                setf = new LinkedHashSet<>();
                setl = new LinkedHashSet<>();
            }

            if (map.size() == NUMBER_GROUP) {
                a = false;
            }

        }


        AtomicInteger i = new AtomicInteger(1);
        map.forEach((k, v) -> {


                    int andIncrement = i.getAndIncrement();

                    String number = andIncrement < 10 ? "0" + andIncrement : String.valueOf(andIncrement);

                    System.out.println(number + ": " + k + " + " + v);

                }

        );


    }

}
