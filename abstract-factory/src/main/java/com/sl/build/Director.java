package com.sl.build;

import java.util.ArrayList;
import java.util.List;

/**
 * 场景类可以根据不同场景组装电脑
 * @author shuliangzhao
 * @Title: Director
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 22:57
 */
public class Director {
    private List<String> sequence = new ArrayList<>();
    private HuaweiBuilder huaweiBuilder = new HuaweiBuilder();
    private LenovoBuilder lenovoBuilder = new LenovoBuilder();

    //组装华为A系列先屏幕、鼠标、键盘、硬盘
    public HuaweiComputer getAHuaweiComputer() {
        this.sequence.clear();
        sequence.add("screen");
        sequence.add("mouse");
        sequence.add("keyboard");
        sequence.add("hardDisk");
        this.huaweiBuilder.setSequence(sequence);
        return (HuaweiComputer) this.huaweiBuilder.getComputerModel();
    }

    //组装华为B系列先鼠标、屏幕、硬盘、键盘
    public HuaweiComputer getBHuaweiComputer() {
        this.sequence.clear();
        sequence.add("mouse");
        sequence.add("screen");
        sequence.add("hardDisk");
        sequence.add("keyboard");
        this.huaweiBuilder.setSequence(sequence);
        return (HuaweiComputer) this.huaweiBuilder.getComputerModel();
    }

    //组装联想A系列先硬盘、键盘、鼠标、屏幕
    public LenovoComputer getALenovoComputer() {
        this.sequence.clear();
        sequence.add("hardDisk");
        sequence.add("keyboard");
        sequence.add("mouse");
        sequence.add("screen");
        this.lenovoBuilder.setSequence(sequence);
        return (LenovoComputer) this.lenovoBuilder.getComputerModel();
    }

    //组装联想B系列先键盘、鼠标、硬盘屏幕
    public LenovoComputer getBLenovoComputer() {
        this.sequence.clear();
        sequence.add("keyboard");
        sequence.add("mouse");
        sequence.add("hardDisk");
        sequence.add("screen");
        this.lenovoBuilder.setSequence(sequence);
        return (LenovoComputer) this.lenovoBuilder.getComputerModel();
    }
}
