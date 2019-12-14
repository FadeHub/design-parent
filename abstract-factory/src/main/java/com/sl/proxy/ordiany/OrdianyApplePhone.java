package com.sl.proxy.ordiany;

import com.sl.proxy.Phone;

/**
 * @author shuliangzhao
 * @Title: ApplePhone
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/30 23:28
 */
public class OrdianyApplePhone implements Phone {

    private String name = "";

    public OrdianyApplePhone(Phone phone, String name) throws Exception {
        if (phone == null) {
            throw new Exception("不能生产手机");
        }else {
            this.name = name;
        }
    }

    @Override
    public void assemblyScreen() {
        System.out.println(this.name + "组装屏幕");
    }

    @Override
    public void battery() {
        System.out.println(this.name + "组装电池");
    }

    @Override
    public void software() {
        System.out.println(this.name + "调试软件");
    }
}
