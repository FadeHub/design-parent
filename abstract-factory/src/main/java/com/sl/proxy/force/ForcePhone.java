package com.sl.proxy.force;

/**
 * @author shuliangzhao
 * @Title: ForcePhone
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:50
 */
public interface ForcePhone {
    //安装屏幕
    void assemblyScreen();
    //安装电池
    void battery();
    //软件测试
    void software();
    //每个工厂都可以找自己代理
    ForcePhone getPorxy();
}
