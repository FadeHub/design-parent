package com.sl.commond.modify;

/**
 * @author shuliangzhao
 * @Title: Invoker
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 22:01
 */
public class Invoker {

    private Commond commond;

    public Invoker(Commond commond) {
        this.commond = commond;
    }

    public void action() {
        commond.execute();
    }
}
