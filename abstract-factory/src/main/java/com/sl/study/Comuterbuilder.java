package com.sl.study;

/**
 * @author shuliangzhao
 * @Title: Comuterbuilder
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 15:37
 */
public class Comuterbuilder {

    private String cup;
    private String keybord;
    private String screen;
    private String mouse;
    private String hardDisk;
    private String ram;
    private String colour;

    public Comuterbuilder(String cup,String keybord) {
        this.cup = cup;
        this.keybord = keybord;
    }

    public Comuterbuilder screen(String screen) {
        this.screen = screen;
        return this;
    }

    public Comuterbuilder mouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public Comuterbuilder hardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public Comuterbuilder colour(String colour) {
        this.colour = colour;
        return this;
    }

    public Comuterbuilder ram(String ram) {
        this.ram = ram;
        return this;
    }

}
