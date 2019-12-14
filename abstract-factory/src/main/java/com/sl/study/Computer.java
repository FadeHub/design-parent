package com.sl.study;

/**
 * @author shuliangzhao
 * @Title: Computer
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 15:10
 */
public class Computer {

    private String cup;
    private String keybord;
    private String screen;
    private String mouse;
    private String hardDisk;
    private String ram;
    private String colour;

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

    public Computer(String cup, String keybord) {
        this(cup,keybord,"");
    }

    public Computer(String cup,String keybord,String screen) {
        this(cup,keybord,screen,"");
    }

    public Computer(String cup,String keybord,String screen,String mouse) {
        this(cup,keybord,screen,mouse,"");
    }

    public Computer(String cup,String keybord,String screen,String mouse,String hardDisk) {
        this(cup,keybord,screen,mouse,hardDisk,"");
    }

    public Computer(String cup,String keybord,String screen,String mouse,String hardDisk,String ram) {
        this(cup,keybord,screen,mouse,hardDisk,ram,"");
    }

    public Computer(String cup,String keybord,String screen,String mouse,String hardDisk,
                    String ram,String colour) {
        this.cup = cup;
        this.keybord = keybord;
        this.screen = screen;
        this.mouse = mouse;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Computer computer = new Computer("I7","三星");
    }
}
