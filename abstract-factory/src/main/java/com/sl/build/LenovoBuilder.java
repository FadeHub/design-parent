package com.sl.build;

import java.util.List;

/**
 * @author shuliangzhao
 * @Title: LenovoBuilder
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 22:54
 */
public class LenovoBuilder extends ComputerBuilder {

    private LenovoComputer lenovoComputer = new LenovoComputer();

    @Override
    public void setSequence(List<String> sequence) {
        lenovoComputer.setSequence(sequence);
    }

    @Override
    public ComputerModel getComputerModel() {
        return this.lenovoComputer;
    }
}
