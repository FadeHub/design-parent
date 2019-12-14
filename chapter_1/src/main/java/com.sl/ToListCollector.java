package com.sl;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collector<T,A,R>
 * T是流中要收集项目的泛型
 * A是累加器的类型，累加器是在收集过程中用于累加部分结果对象
 * R是收集操作得到的对象的类型
 * @author shuliangzhao
 * @Title: ToListCollector
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/13 19:02
 */
public class ToListCollector<T> implements Collector<T, List<T>, List<T>> {

    //建立结果构造器
    @Override
    public Supplier<List<T>> supplier() {
        return ArrayList::new;
    }

    //将元素添加到结果构造器中
    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return List::add;
    }

    //对结果应用构造器结果转换
    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list1,list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(
                Characteristics.IDENTITY_FINISH, Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("word");

        //将words数组中的元素再按照字符拆分，然后字符去重，最终达到["h", "e", "l", "o", "w", "r", "d"] flatmap
        //如果使用map，是达不到直接转化成List<String>的结果
        List<String> stringList = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
        List<Stream<String>> collect = words.stream().map(word -> word.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
        collect.stream().forEach(stringStream -> stringStream.forEach(System.out::println));
    }
}
