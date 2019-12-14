package com.sl.prototy;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝
 * @author shuliangzhao
 * @Title: Thing
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/31 22:26
 */
public class ShallowThing implements Cloneable {

    private List<String> list = new ArrayList<String>();

    @Override
    public ShallowThing clone() {
        ShallowThing thing = null;
        try {
            thing = (ShallowThing) super.clone();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setList(String s) {
        this.list.add(s);
    }

    public List<String> getList() {
        return this.list;
    }


}
