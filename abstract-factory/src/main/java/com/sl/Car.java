package com.sl;

import java.util.Optional;

/**
 * @author shuliangzhao
 * @Title: Car
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/6 15:15
 */
public class Car {

    private String name;

    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
