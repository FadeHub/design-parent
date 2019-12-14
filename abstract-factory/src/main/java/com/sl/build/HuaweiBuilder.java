package com.sl.build;

import java.util.List;

/**
 * @author shuliangzhao
 * @Title: HuaweiBuilder
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 22:56
 */
public class HuaweiBuilder extends ComputerBuilder {

    private HuaweiComputer huaweiComputer = new HuaweiComputer();

    @Override
    public void setSequence(List<String> sequence) {
        this.huaweiComputer.setSequence(sequence);
    }

    @Override
    public ComputerModel getComputerModel() {
        return this.huaweiComputer;
    }
}
