package com.sl.emun;

import java.util.EnumMap;

/**
 * @author shuliangzhao
 * @Title: EnumMapTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/12 22:49
 */
public class EnumMapTest {

    public static void main(String[] args) {
        EnumMap<Color,String> enumMap = new EnumMap(Color.class);
        enumMap.put(Color.BLACK,"黑色");
        enumMap.put(Color.BLUE,"蓝色");
        System.out.println(enumMap);
        System.out.println(enumMap.get(Color.BLUE));
    }
}
