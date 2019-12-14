package com.sl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author shuliangzhao
 * @Title: Letter
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/12 12:50
 */
public class Letter {

    public static String addHeader(String text){
        return "From Raoul, Mario and Alan: " + text;
    }
    public static String addFooter(String text){
        return text + " Kind regards";
    }
    public static String checkSpelling(String text){
        return text.replaceAll("labda", "lambda");
    }

    public static void main(String[] args) {
        Function<String,String> addheader = Letter::addHeader;
        String hello = addheader.apply("hello");
        System.out.println(hello);
        Function<String, String> stringStringFunction = addheader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
        stringStringFunction.apply("123");
        System.out.println(stringStringFunction.apply("123"));
        System.out.println("+++++++++++++++++++++++++++++");
        List<Integer> integers = Arrays.asList(1, 4, 2, 5, 12, 2);
        //integers.sort(Comparator.naturalOrder());
        //integers.forEach(System.out::println);
        integers.sort(Comparator.comparingInt(Integer::intValue));
        integers.forEach(System.out::println);
    }
}
