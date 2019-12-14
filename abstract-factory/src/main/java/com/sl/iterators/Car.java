package com.sl.iterators;

import java.util.ArrayList;

/**
 * @author shuliangzhao
 * @Title: Car
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/16 23:36
 */
public class Car implements ICar {

    //定义一个车的集合
    private ArrayList<ICar> projectList = new ArrayList<ICar>();

    private String name;

    private Integer price;

    public Car() {

    }

    private Car(String name,Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void add(String name, Integer price) {
        this.projectList.add(new Car(name,price));
    }

    @Override
    public ICarIterator iterator() {
        return new CarIterator(projectList);
    }

    @Override
    public String getCarInfo() {
        return name + "价格是" + price;
    }
}
