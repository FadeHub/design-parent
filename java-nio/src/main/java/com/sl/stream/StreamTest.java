package com.sl.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

/**
 * @author shuliangzhao
 * @Title: StreamTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/28 20:33
 */
public class StreamTest {

   private static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 120, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH));

    public static void main(String[] args) {
        //testFilter();
        //testDistinct();
        //testLimit();
        //testSkip();
        //testMap();
        //testFlatMap();
        //testReduceMax();
        //testReduceSum();
        //testRangeClosed();
        mapAndFlatMap();
    }

    public static void testFilter(){
        List<Dish> collect = menu.stream().filter(dish -> dish.isVegetarian()).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void testDistinct() {
        List<String> strings = Arrays.asList("A", "B", "B", "C", "D", "D", "E");
        strings.stream().distinct().forEach(System.out::println);
    }

    public static void testLimit() {
        List<String> strings = Arrays.asList("A", "B", "B", "C", "D", "D", "E");
        List<String> collect = strings.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void testSkip() {
        List<String> strings = Arrays.asList("A", "B", "B", "C", "D", "D", "E");
        List<String> collect = strings.stream().skip(3).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void testMap() {
        List<String> collect = menu.stream().map(Dish::getName).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void testFlatMap() {
        String[] array = {"HELLO","WORLD"};
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);
        List<String> strings = Arrays.asList("hello", "world");
        List<String[]> collect = strings.stream().map(w -> w.split("")).collect(Collectors.toList());
        System.out.println(collect);
        Stream<Stream<String>> streamStream = collect.stream().map(array1 -> Arrays.stream(array1));
        List<Stream<String>> collect1 = collect.stream().map(array1 -> Arrays.stream(array1)).collect(Collectors.toList());
        collect1.stream().forEach(d -> {
            d.forEach(System.out::println);
        });
        System.out.println(collect1);
        Stream<String> stringStream = strings.stream().map(w -> w.split("")).flatMap(Arrays::stream);
        List<String> collect2 = strings.stream().map(w -> w.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(collect2);

        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> integers1 = Arrays.asList(3, 4);
        List<int[]> collect3 = integers.stream().flatMap(i -> integers1.stream()
                .map(j -> new int[]{i, j})).collect(Collectors.toList());
        System.out.println(collect3);
        if (menu.stream().anyMatch(Dish::isVegetarian))  {
            System.out.println("");
        }
    }

    public static void testFindAny() {
        Optional<Dish> collect = menu.stream().filter(dish -> dish.getCalories() > 1000).findAny();
        System.out.println(collect);
    }

    public static void testReduce() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 45, 6);
        Integer reduce = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }

    public static void testReduceMax() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 45, 6);
        Optional<Integer> reduce = integers.stream().reduce(Integer::max);
        System.out.println(reduce.get());
        Optional<Integer> reduce1 = integers.stream().reduce(Integer::min);
        System.out.println(reduce1.get());
    }

    public static void testReduceSum() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 45, 6);
        int sum = integers.stream().mapToInt(d -> d.intValue()).sum();
        OptionalInt max = integers.stream().mapToInt(d -> d.intValue()).max();
        OptionalInt min = integers.stream().mapToInt(d -> d.intValue()).min();
        OptionalDouble average = integers.stream().mapToInt(d -> d.intValue()).average();
        System.out.println(sum);
    }

    public static void testReduceObj() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 45, 6);
        IntStream intStream = integers.stream().mapToInt(d -> d.intValue());
        Stream<Integer> boxed = intStream.boxed();

    }

    public static void testRangeClosed() {
        IntStream intStream = IntStream.rangeClosed(0, 100).filter(d -> d % 2 == 0);
        long count = intStream.count();
        System.out.println(count);
    }
        
    public static void testStreamof() {
        Stream<String> java8 = Stream.of("java8", "lambda", "in action");
        int[] i = new int[]{1,3,34};
        IntStream stream = Arrays.stream(i);
        try {
            Stream<String> lines = Files.lines(Paths.get("xx.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testiterate() {
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 2);
        Stream<Double> generate = Stream.generate(Math::random);
    }

    public static void testCounting() {
        Long collect = menu.stream().collect(counting());
    }

    public static void testMaxby() {
        Comparator<Dish> dishComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> collect = menu.stream().collect(maxBy(dishComparator));
    }

    public static void testSummingInt() {
        Integer collect = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println(collect);
    }

    public static void testJoining() {
        String collect = menu.stream().map(Dish::getName).collect(joining(","));
        System.out.println(collect);
    }

    
    public static void testCollectReduing() {
        Integer collect = menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
    }

    public static void testCollecGroupBying() {
        Map<Type, Map<CaloricLevel, List<Dish>>> collect = menu.stream().collect(groupingBy(Dish::getType, groupingBy(dish ->
                {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NOMAL;
                    else return CaloricLevel.FAT;
                }
        )));
        System.out.println(collect);


        Map<Type, Optional<Dish>> collect1 = menu.stream()
                .collect(groupingBy(Dish::getType,
                        maxBy(Comparator.comparingInt(Dish::getCalories))));
    }

    public static void testCollectAndThen() {
        Map<Type, Dish> collect = menu.stream().collect(groupingBy(Dish::getType,
                collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
    }

    public static void testPartitioningBy() {
        Map<Boolean, Map<Type, List<Dish>>> collect = menu.stream().
                collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
    }

    public static long parallelSum(long n) {
      return Stream.iterate(1L,i -> i+1)
              .limit(n)
              .parallel()
              .reduce(0L,Long::sum);
    }

    public static void mapAndFlatMap() {
        String[] array = {"HELLO","WORLD"};
        Stream<String> stream = Arrays.stream(array);
        List<String> collect = stream.map(s -> s.split("")).flatMap(Arrays::stream).collect(toList());
        System.out.println(collect);
        stream = Arrays.stream(array);
        List<Stream<String>> collect1 = stream.map(s -> s.split("")).map(Arrays::stream).collect(toList());
        System.out.println(collect1);
    }
}
