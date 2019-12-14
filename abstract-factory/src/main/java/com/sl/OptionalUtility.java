package com.sl;

import java.util.Optional;

/**
 * @author shuliangzhao
 * @Title: OptionalUtility
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/1/6 17:01
 */
public class OptionalUtility<T> {

    public static <T> Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
