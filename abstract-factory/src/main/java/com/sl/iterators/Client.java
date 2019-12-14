package com.sl.iterators;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/16 23:43
 */
public class Client {

    public static void main(String[] args) {
        ICar car = new Car();
        car.add("宝马X1",200000);
        car.add("宝马X2",300000);
        car.add("宝马X3",400000);
        car.add("宝马X4",500000);
        car.add("宝马X5",600000);
        car.add("宝马X6",700000);
        ICarIterator iterator = car.iterator();
        while (iterator.hasNext()) {
            Car car1 = (Car)iterator.next();
            System.out.println(car1.getCarInfo());
        }
    }
}
