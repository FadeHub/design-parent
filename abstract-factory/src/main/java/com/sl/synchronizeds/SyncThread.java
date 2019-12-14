package com.sl.synchronizeds;

/**
 * @author shuliangzhao
 * @Title: SyncThread
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/17 23:25
 */
public class SyncThread implements Runnable {

    private static int count;

    public SyncThread() {
        count = 0;
    }

    public static void testSync() {
        synchronized (SyncThread.class) {
            try {
                for (int i = 0;i<5;i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                }
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public synchronized void run() {
        testSync();
    }

    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
        Thread thread = new Thread(new SyncThread(),"Thread1");
        Thread thread1 = new Thread(new SyncThread(),"Thread2");
        thread.start();
        thread1.start();
    }
}
