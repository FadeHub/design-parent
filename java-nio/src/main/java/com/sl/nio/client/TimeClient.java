package com.sl.nio.client;

/**
 * @author shuliangzhao
 * @Title: TimeClient
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/11 17:14
 */
public class TimeClient {

    public static void main(String[] args) {

        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                // 采用默认值
            }
        }
        new Thread(new TimeClientHandle("127.0.0.1", port), "TimeClient-001").start();
    }
}
