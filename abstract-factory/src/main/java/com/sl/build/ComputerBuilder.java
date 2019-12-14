package com.sl.build;

import java.util.List;

/**
 * @author shuliangzhao
 * @Title: ComputerBuilder
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 22:51
 */
public abstract class ComputerBuilder {
    //建造一个模型，你要给我一个顺序要求，就是组装顺序
    public abstract void setSequence(List<String> sequence);
    //设置完毕顺序后，就可以直接拿到这个电脑组装顺序
    public abstract ComputerModel getComputerModel();
}
