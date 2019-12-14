package com.sl;

import java.util.Collections;
import java.util.Optional;
import java.util.Properties;

/**
 * @author shuliangzhao
 * @Title: Person
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/6 15:16
 */
public class Person {

    private Optional<Car> car;

    public void setCar(Optional<Car> car) {
        this.car = car;
    }

    public  Optional<Car>  getCar() {
        return car;
    }

    public int readDuration(Properties props, String name) {
        return Optional.ofNullable(props.getProperty(name))
                .flatMap(OptionalUtility::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }
}
