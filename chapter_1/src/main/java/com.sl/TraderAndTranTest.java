package com.sl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shuliangzhao
 * @Title: TraderAndTranTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/13 11:37
 */
public class TraderAndTranTest {

    public static void main(String[] args) {
        //准备数据
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //找出2011所有交易并按交易顺序排序
        List<Transaction> sortedList = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        //交易员在哪些城市工作过
        List<String> citys = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(citys);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        //如果不用distinct() 可以用toSet()
        Set<String> citys1 = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println(citys1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        //找出剑桥交易员并按顺序排序
        List<String> cambridges = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getTrader().getName())
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println(cambridges);
        List<Trader> cambridge = transactions.stream().map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(cambridge);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        //返回所有交易员姓名的字符串，按字母顺序排序
        String cambridge1 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getTrader().getName())
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(cambridge1);
        //也可以这样用
        String cambridge2 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getTrader().getName())
                .sorted()
                .collect(Collectors.joining());
        System.out.println(cambridge2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        //有没有交易员在米兰工作的
        boolean milan = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(milan);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        //打印生活在剑桥的交易员的所有交易额
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        Optional<Integer> reduce = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        //找到交易额中最小的交易
        Optional<Integer> reduce1 = transactions.stream().map(Transaction::getValue).reduce(Integer::min);
        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .reduce((t1, t2) ->
                                t1.getValue() < t2.getValue() ? t1 : t2);
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
    }
}
