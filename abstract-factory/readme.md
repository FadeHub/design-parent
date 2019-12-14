1、并行流
    1)将顺序流转换为并行流 (从1到所有给定参数求和)
        Stream.iterate(1L,i -> i+1).limit(n).parallel().reduce(0L,Long::sum);
    2)将并行流转换为顺序流
        Stream.parallel