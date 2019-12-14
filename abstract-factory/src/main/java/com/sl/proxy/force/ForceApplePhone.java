package com.sl.proxy.force;

/**
 * @author shuliangzhao
 * @Title: ForceApplePhone
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:51
 */
public class ForceApplePhone implements ForcePhone{

    private String name = "";

    private ForcePhone forcePhone = null;

    public ForceApplePhone(String name) {
        this.name = name;
    }

    @Override
    public void assemblyScreen() {
        if (this.isProxy()) {
            System.out.println(name + "组装电脑");
        }else {
            System.out.println("请使用代理指定服务！");
        }
    }

    @Override
    public void battery() {
        if (this.isProxy()) {
            System.out.println(name + "组装电池");
        }else {
            System.out.println("请使用代理指定服务！");
        }
    }

    @Override
    public void software() {
        if (this.isProxy()) {
            System.out.println(name + "调试软件");
        }else {
            System.out.println("请使用代理指定服务！");
        }
    }

    //找到自己代理
    @Override
    public ForcePhone getPorxy() {
        this.forcePhone = new ForceProxyPhoneFactory(this);
        return this;
    }

    //增加了一个私有方法，检查是否是自己指定的代理，是指定的代理则允许访问，否则不
    //允许访问。
    private boolean isProxy(){
        if(this.forcePhone == null){
            return false;
        }else{
            return true;
        }
    }
}
