package com.sl.build;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuliangzhao
 * @Title: ComputerModel
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 22:40
 */
public abstract class ComputerModel {
    //sequence控制组装顺序
    private List<String> sequence = new ArrayList<>();

    protected abstract void productScreen();
    protected abstract void productMouse();
    protected abstract void productKeyboard();
    protected abstract void productHardDisk();

    public void assemble() {
        for (String str:sequence) {
            if (StringUtils.equals(str,"screen")) {
                this.productScreen();
            }else if (StringUtils.equals(str,"mouse")) {
                this.productMouse();
            }else if (StringUtils.equals(str,"keyboard")) {
                this.productKeyboard();
            }else if (StringUtils.equals(str,"hardDisk")) {
                this.productHardDisk();
            }
        }
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
