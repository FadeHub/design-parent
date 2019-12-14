package com.sl.prototy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuliangzhao
 * @Title: DeepThing
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/31 22:32
 */
public class DeepThing implements Cloneable{

    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public DeepThing clone() {
        DeepThing thing = null;
        try {
            thing = (DeepThing) super.clone();
            this.list = (ArrayList<String>)this.list.clone();
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
