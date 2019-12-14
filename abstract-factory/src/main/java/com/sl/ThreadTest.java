package com.sl;

/**
 * @author shuliangzhao
 * @Title: ThreadTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/2 10:06
 */
public class ThreadTest implements Runnable{

    public static void main(String[] args) {
        for (int i = 0;i<2;i++) {
            Thread thread = new Thread(new ThreadTest());
            thread.start();
        }
        System.out.println("主线程执行");
    }

    @Override
    public void run() {
        Double d = Math.random()*10;
        ThreadLocalDemo.getInstance().setName("name "+d);
        new ThreadLocalTest.A().get();
        new ThreadLocalTest.B().get();
    }
}
