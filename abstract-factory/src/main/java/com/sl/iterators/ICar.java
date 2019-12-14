package com.sl.iterators;

/**
 * @author shuliangzhao
 * @Title: ICar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/16 23:30
 */
public interface ICar {

    //生产一辆车
    public void add(String name,Integer price);

    //获得一个可以被遍历的对象
    public ICarIterator iterator();

    public String getCarInfo();
}
