package com.sl;

import java.util.Optional;

/**
 * @author shuliangzhao
 * @Title: Insurance
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/6 15:23
 */
public class Insurance {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknow");
    }*/
}
