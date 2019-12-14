package com.sl;

/**
 * @author shuliangzhao
 * @Title: Trader
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/13 11:33
 */
public class Trader {

    private final String name;

    private final String city;

    public Trader(String name,String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }
}
