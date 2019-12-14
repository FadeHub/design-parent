package com.sl;

/**
 * @author shuliangzhao
 * @Title: ThreadLocalDemo
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 0:00
 */
public class ThreadLocalDemo {
    private static ThreadLocal<ThreadLocalDemo> t = new ThreadLocal<>();
    private ThreadLocalDemo() {}

    public static ThreadLocalDemo getInstance() {
        ThreadLocalDemo threadLocalDemo = ThreadLocalDemo.t.get();
        if (null == threadLocalDemo) {
            threadLocalDemo = new ThreadLocalDemo();
            t.set(threadLocalDemo);
        }
        return threadLocalDemo;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
      long i =  (1L << 32) - (long) ((1L << 31) * (Math.sqrt(5) - 1));
        System.out.println(i);
        int i1 = 55&(2^2-1);
        System.out.println(55%2^2);
        System.out.println(i1);
    }
}
