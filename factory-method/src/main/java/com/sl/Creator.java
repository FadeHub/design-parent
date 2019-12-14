package com.sl;

import com.sl.Car;

/**
 * @author shuliangzhao
 * @Title: Creator
 * @ProjectName maven-parent
 * @Description: 抽象工厂类
 * @date 2018/12/23 15:02
 */
public abstract class Creator {

    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * @param t
     * @param <T>
     * @return
     */
    public abstract <T extends Car> T creatorCar(Class<T> t);

}
