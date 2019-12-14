package com.sl;

import com.sl.Type;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author shuliangzhao
 * @Title: Dish
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/12 13:45
 */
public class Dish {

    private final String name;

    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300,Type.FISH),
                new Dish("salmon", false, 450,Type.FISH) );

        //流操作 map
        List<Object> collect = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).limit(3).collect(Collectors.toList());
        collect.forEach(System.out::println);
        Stream<String> stringStream = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName);

        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("word");

        //将words数组中的元素再按照字符拆分，然后字符去重，最终达到["h", "e", "l", "o", "w", "r", "d"] flatmap
        //如果使用map，是达不到直接转化成List<String>的结果
        List<String> stringList = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
        //flatmap
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        List<Integer> b=new ArrayList<>();
        b.add(3);
        b.add(4);
        List<Integer> figures=Stream.of(a,b).flatMap(u->u.stream()).collect(Collectors.toList());

        //
        List<String> list = menu.stream().filter(dish -> {
            System.out.println("filtering：" + dish.getName());
            return dish.getCalories() > 300;
        }).map(dish -> {
            System.out.println("flatmaping：" + dish.getName());
            return dish.getName();
        }).limit(3).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //compator
        List<Integer> strings = Arrays.asList(1, 23, 4, 2, 52, 3);
        Collections.sort(strings);
        Collections.sort(menu,Comparator.comparing(Dish::getName));
        strings.stream().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int compare = Integer.compare(1, 2);
        System.out.println(compare);
        String str = "1";
        System.out.println( str.compareToIgnoreCase("2"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //limit 和 skip
        List<String> collect1 = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName).limit(3)
                .collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<String> collect2 = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName).skip(2).collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //筛选前两道荤菜
        List<Dish> collect3 = menu.stream().filter(dish -> dish.getType() == Type.MEAT).collect(Collectors.toList());
        collect3.stream().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //map使用
        List<String> strings1 = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> collect4 = strings1.stream().map(String::length).collect(Collectors.toList());
        collect4.stream().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<Integer> collect5 = menu.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
        collect5.stream().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //Arrays.stream 可以将数组转换为流
        //flatmap 和map 使用
        String[] arr = {"hello","word"};
        Stream<String> stream = Arrays.stream(arr);
        List<Stream<String>> collect6 = stream.map(w -> w.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
        collect6.stream().forEach(s -> s.forEach(System.out::println));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Stream<String> stream1 = Arrays.stream(arr);
        List<String> collect7 = stream1.map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        collect7.stream().forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Stream<String> stream2 = Arrays.stream(arr);
        Stream<String[]> stream3 = stream2.map(w -> w.split(""));

        System.out.println("======================================================");
        //给定列表[1,2,3]  [3,4] 返回[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> collect8 = numbers1.stream().
                flatMap(i -> numbers2.stream().map(j -> new int[]{i, j})).collect(Collectors.toList());
        //扩展collect8这个例子 返回只能被3整除
        List<Integer> numbers3 = Arrays.asList(1, 2, 3);
        List<Integer> numbers4 = Arrays.asList(3, 4);
        List<int[]> collect9 = numbers3.stream().
                flatMap(i -> numbers4.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).collect(Collectors.toList());
        //查找和匹配 Stream API allMatch、anyMatch、noneMatch、findFirst、findAny
        //anyMatch 流中是否有一个元素匹配
        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friendly!!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        //allMatch 匹配所有元素
        boolean b1 = menu.stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(b1);
        //noneMatch流中没有一个匹配
        boolean b2 = menu.stream().noneMatch(dish -> dish.getCalories() < 1000);
        System.out.println(b2);
        //findAny  查找元素

        menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(dish -> {
            System.out.println(dish.getName());
        });
        //findFirst查找第一个元素
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(x -> x * x)
                        .filter(x -> x % 3 == 0)
                        .findFirst(); // 9
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        //元素求和 reduce 接受两个参数 一个是0 另一个BinaryOperator<T> 将两个元素结合起来产生一个新值
        //用的是lambda(a,b) -> a + b
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce = numbers.stream().reduce(0, (c, d) -> c + d);
        System.out.println(reduce);
        //使用方法引用 Inter::sum
        //Integer reduce1 = numbers.stream().reduce(0, Integer::max);
        //System.out.println(reduce1);
        //reduce 还有一个重载变体 不接受初始值 返回Optional<T>
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> reduce2 = numbers5.stream().reduce(Integer::sum);
        if (reduce2.isPresent()) {
            System.out.println(reduce2.get());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        //最大值和最小值
        List<Integer> numbers6 = Arrays.asList(1, 23, 2, 34, 5);
        Optional<Integer> reduce3 = numbers6.stream().reduce(Integer::max);//最大值
        if (reduce3.isPresent()) {
            System.out.println("最大值：" + reduce3.get());
        }
        Optional<Integer> reduce4 = numbers6.stream().reduce(Integer::min);//最小值
        if (reduce4.isPresent()) {
            System.out.println("最小值：" + reduce4.get());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++数一数menu中有多少个菜+++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //解决这个问题将流中每个元素映射为1 然后用reduce求和
        Integer reduce5 = menu.stream().map(dish -> 1).reduce(0, Integer::sum);
        System.out.println(reduce5);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++数值流+++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //IntStream DoubleStream LongStream对应的方法mapToInt mapToDouble mapToLong
        //你可以像下面这样用mapToInt对menu中的卡路里求和 IntStream 还有其他方法max min average
        int sum = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println(sum);

        //转换为对象流boxed
        Stream<Integer> boxed = menu.stream().mapToInt(Dish::getCalories).boxed();
        //OptionalInt OptionalDouble OptionalLong
        //要找到IntStream中最大元素为
        OptionalInt max = menu.stream().mapToInt(Dish::getCalories).max();
        //如果没有最大值返回1
        int i = max.orElse(1);
        System.out.println(i);

        //数值范围生成IntStream LongStream 中的range 和rangeClosed range不包含结束值
        IntStream intStream = IntStream.range(1, 100).filter(n -> n % 2 == 0);
        intStream.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        //数值流应用 勾股数 见书125页


        //创建流
        //由值创建流 Stream.of
        Stream<String> stringStream1 = Stream.of("Java 8", "Lambda", "In", "Action");
        stringStream1.map(String::toUpperCase).forEach(System.out::println);
        //也可以创建一个空流
        Stream<Object> empty = Stream.empty();
        //由数组创建流 Arrays.stream
        int[] numbers7 = {2, 3, 5, 7, 11, 13};
        IntStream stream4 = Arrays.stream(numbers7);
        int sum1 = stream4.sum();
        System.out.println(sum1);
        //由文件生成流
        //Files.lines
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        //由函数创建无限流 Stream.iterate  Stream.generate
        //裴波纳契元组序列0, 1, 1,
        //2, 3, 5, 8, 13, 21, 34, 55...开始的两个数字0和1，后续每两个数字是前两个数字之和
        Stream.iterate(new int[]{0,1},t -> new int[]{t[1],t[0] + t[1]}).limit(20).forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
        //  Stream.generate 接受Supplier
          Stream.generate(Math::random)
        .limit(5)
        .forEach(System.out::println);

        //高级规约collect
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++流收集规约和汇总+++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        long howManyDishes = menu.stream().collect(Collectors.counting());
        long count = menu.stream().count();
        System.out.println(howManyDishes + " " + count);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //查找流中的最大值和最小值Collectors.minBy Collectors.maxBy
        //找出菜单中最高热量的菜
        Comparator<Dish> dishComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> collect10 = menu.stream().collect(Collectors.maxBy(dishComparator));
        collect10.ifPresent(Dish::getCalories);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        //求出菜单列表总热量 Collectors.summingLong Collectors.summingDouble
        int collect11 = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(collect11);

        //求平均数Collectors.averagingInt
        Double collect12 = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(collect12);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //summarizingInt 可以求平均数 最大值 最小值 总和
        IntSummaryStatistics collect13 = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(collect13);

        //链接字符串
        String collect14 = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
        System.out.println(collect14);
        //如果Dish有一个返回toString方法返回菜肴名称
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //广义的规约汇总Collectors.reducing()
        Integer collect15 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (x, y) -> x + y));
        IntStream intStream1 = menu.stream().mapToInt(Dish::getCalories);
        int sum2 = intStream1.sum();
        System.out.println(sum2 + " " +collect15);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //可以用单参数形式的reducing来找热量最高的菜
        Optional<Dish> collect16 = menu.stream().collect(Collectors.reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        if (collect16.isPresent()) {
            System.out.println(collect16.get());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //分组 gorupingBy
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++流分组+++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Map<Type, List<Dish>> collect17 = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(collect17);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //不到400的低热量 大于400低于700普通 高于700高热量
        Map<CaloricLevel, List<Dish>> collect18 = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return CaloricLevel.DIET;
            } else if (dish.getCalories() <= 700) {
                return CaloricLevel.NORMAL;
            } else {
                return CaloricLevel.FAT;
            }
        }));
        System.out.println(collect18);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        //多级分组
        Map<Type, Map<CaloricLevel, List<Dish>>> collect19 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return CaloricLevel.DIET;
            } else if (dish.getCalories() <= 700) {
                return CaloricLevel.NORMAL;
            } else {
                return CaloricLevel.FAT;
            }
        })));
        System.out.println(collect19);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        //按子组收集数据 传递给第一个groupingBy的第二个收集器可以是任何类型而不一定是一个groupingBy
        //统计菜单每类菜有多少个
        Map<Type, Long> collect20 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(collect20);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        //热量最高的菜肴按类型分
        Map<Type, Optional<Dish>> collect21 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
        System.out.println(collect21);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        //把收集器结果转换为另一种类型 Collectors.collectingAndThen
        Map<Type, Dish> collect22 = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(collect22);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        //与groupingBy联合使用的其他收集器例子
        Map<Type, Integer> collect23 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)));
        System.out.println("collect23："+collect23);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        //mapping  对于每种类型的Dish 菜单中有哪些CaloricLevel
        Map<Type, Set<CaloricLevel>> collect24 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(
                dish -> {
                    if (dish.getCalories() <= 400) {
                        return CaloricLevel.DIET;
                    } else if (dish.getCalories() <= 700) {
                        return CaloricLevel.NORMAL;
                    } else {
                        return CaloricLevel.FAT;
                    }
                }, Collectors.toSet()
        )));
        System.out.println(collect24);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        //toCollection可以传构造函数
        Map<Type, Set<CaloricLevel>> collect25 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(
                dish -> {
                    if (dish.getCalories() <= 400) {
                        return CaloricLevel.DIET;
                    } else if (dish.getCalories() <= 700) {
                        return CaloricLevel.NORMAL;
                    } else {
                        return CaloricLevel.FAT;
                    }
                }, Collectors.toCollection(HashSet::new))
        ));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //分区 由谓词作为分类函数
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++流分区+++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //把素食和非素食分开
        Map<Boolean, List<Dish>> collect26 = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(collect26);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //分区优势
        //素食和非素食子流 分别按类型对菜肴进行分组
        Map<Boolean, Map<Type, List<Dish>>> collect27 = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.groupingBy(
                Dish::getType
        )));
        System.out.println(collect27);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //按素食和非素食分类 找出热量最高的
        Map<Boolean, Dish> collect28 = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(collect28);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //partitioningBy 需要的是谓词

        //收集器接口
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++收集器接口+++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
