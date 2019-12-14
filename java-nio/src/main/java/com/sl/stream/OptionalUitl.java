package com.sl.stream;

import java.util.Optional;

/**
 * @author shuliangzhao
 * @Title: OptionalUitl
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/9/1 12:44
 */
public class OptionalUitl {

    public void test(Dish dish) {
        Optional<Dish> dish1 = Optional.of(dish);
        Optional<Dish> dish2 = Optional.ofNullable(dish);

    }
}
