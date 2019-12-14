package com.sl.emun;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * @author shuliangzhao
 * @Title: EnumSetTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/12 23:24
 */
public class EnumSetTest {

    public static void main(String[] args) {
        /*EnumSet<Color> enumSet = EnumSet.noneOf(Color.class);
        System.out.println(enumSet);
        enumSet.add(Color.BLUE);
        enumSet.add(Color.PURPLE);
        System.out.println(enumSet);
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        System.out.println(enumSet);
        EnumSet<Color> enumSet = EnumSet.range(Color.YELLOW,Color.BLUE);
        System.out.println(enumSet);
        EnumSet<Color> enumSet1 = EnumSet.complementOf(enumSet);
        System.out.println(enumSet1);
        EnumSet<Color> enumSet = EnumSet.range(Color.YELLOW,Color.BLUE);
        System.out.println(enumSet);
        EnumSet<Color> enumSet1 = EnumSet.copyOf(enumSet);
        System.out.println(enumSet1);*/
        List<Color> colors = new ArrayList<>();
        colors.add(Color.PURPLE);
        colors.add(Color.BLUE);
        colors.add(Color.BLUE);
        System.out.println(colors);
        EnumSet<Color> enumSet = EnumSet.copyOf(colors);
        System.out.println(enumSet);
    }
}
