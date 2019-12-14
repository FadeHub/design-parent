package com.sl;

/**
 * @author shuliangzhao
 * @Title: ThreadLocalTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 0:03
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        for(int i=0; i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Double d = Math.random()*10;
                    ThreadLocalDemo.getInstance().setName("name "+d);
                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }
    static class A{
        public void get(){
            System.out.println(ThreadLocalDemo.getInstance().getName());
        }
    }
    static class B{
        public void get(){
            System.out.println(ThreadLocalDemo.getInstance().getName());
        }
    }

}

