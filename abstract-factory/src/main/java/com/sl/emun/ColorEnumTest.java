package com.sl.emun;

/**
 * @author shuliangzhao
 * @Title: ColorEnumTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/12 22:37
 */
public class ColorEnumTest {

    public static void main(String[] args) {
        Color color = Color.BLUE;
        switch (color) {
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case PURPLE:
                System.out.println("紫色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;
             default:
                 System.out.println("蓝色");
                 break;
        }
    }

}
