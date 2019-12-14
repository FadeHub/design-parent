package com.sl.study;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;

/**
 * @author shuliangzhao
 * @Title: ProduceComputer
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 15:51
 */
public class ProduceComputer implements Serializable {
    private String cup;
    private String keybord;
    private String screen;
    private String mouse;
    private String hardDisk;
    private String ram;
    private String colour;

    public static class Comuterbuilder implements Serializable{
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

        public ProduceComputer build() {
            return new ProduceComputer(this);
        }
    }

    private ProduceComputer(Comuterbuilder comuterbuilder) {
        cup = comuterbuilder.cup;
        keybord = comuterbuilder.keybord;
        screen = comuterbuilder.screen;
        mouse = comuterbuilder.mouse;
        hardDisk = comuterbuilder.hardDisk;
        ram = comuterbuilder.ram;
        colour = comuterbuilder.colour;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public String getKeybord() {
        return keybord;
    }

    public void setKeybord(String keybord) {
        this.keybord = keybord;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void main(String[] args) {
       ProduceComputer produceComputer =
               new ProduceComputer.Comuterbuilder("I7", "三星").colour("yellow").hardDisk("1G").build();
       System.out.println(JSON.toJSONString(produceComputer));
    }
}
