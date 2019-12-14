package com.sl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shuliangzhao
 * @Title: Test
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/6 15:18
 */
public class Test {

    public static void main(String[] args) {
        //声明一个空的Optional
        Optional<Car> empty = Optional.empty();

        //依据一个非空值创建一个Optional,如果car是一个null时，会抛出NullPointerExcepton,而不是等到访问car属性
        Optional<Car> car = Optional.of(new Car());

        //可接受null的Optional,如果car为null，那么得到的Optional对象为空对象
        Optional<Car> car1 = Optional.ofNullable(new Car());

        //使用map从Optional对象中提取和转换值
        Optional<Insurance> insurance = Optional.ofNullable(new Insurance());
        Optional<String> name = insurance.map(Insurance::getName);

        List<String> list = Arrays.asList("beijing changcheng", "beijing gugong", "beijing tiantan",
                "gugong tiananmen");

        Stream<Stream<String>> streamStream = list.stream().map(str -> Arrays.stream(str.split(" ")));


        list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(System.out::println);
        System.out.println("###################################");
        list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(n->{
            n.forEach(System.out::println);
        });

        System.out.println("+++++++++++++++++++++++++++++++++++");
        list.stream().flatMap(item -> Arrays.stream(item.split(" "))).collect(Collectors.toList()).forEach(System.out::println);
        Stream<String> stringStream = list.stream().flatMap(item -> Arrays.stream(item.split(" ")));
        stringStream.forEach(System.out::println);
    }
}
