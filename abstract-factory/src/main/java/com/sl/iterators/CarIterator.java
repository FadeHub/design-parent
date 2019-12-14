package com.sl.iterators;

import java.util.ArrayList;

/**
 * @author shuliangzhao
 * @Title: CarIterator
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/16 23:38
 */
public class CarIterator implements ICarIterator {

    private ArrayList<ICar> carList = new ArrayList<ICar>();

    private int currentItem = 0;

    public CarIterator(ArrayList<ICar> carList) {
        this.carList = carList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if(this.currentItem>=carList.size()||this.carList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public ICar next() {
        return (ICar) this.carList.get(this.currentItem++);
    }
}
