package com.sl.stream;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author shuliangzhao
 * @Title: ParallelStreams
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/31 14:21
 */
public class ParallelStreams {

    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + sum);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(0L, Long::sum);
    }

    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static void main(String[] args) {
  //      System.out.println("Sequential sum done in:" +
//                measureSumPerf(ParallelStreams::sequentialSum, 10_000_000) + " msecs");

//        System.out.println("Iterative sum done in:" +
//                measureSumPerf(ParallelStreams::iterativeSum, 10_000_000) + " msecs");

//        System.out.println("Parallel sum done in: " +
//                measureSumPerf(ParallelStreams::parallelSum, 10_000_000) + " msecs" );

        System.out.println("Parallel sum done in: " +
                measureSumPerf(ParallelStreams::rangedSum, 10_000_000) + " msecs" );

        System.out.println("Parallel sum done in: " +
                measureSumPerf(ParallelStreams::parallelRangedSum, 10_000_000) + " msecs" );
    }
}
