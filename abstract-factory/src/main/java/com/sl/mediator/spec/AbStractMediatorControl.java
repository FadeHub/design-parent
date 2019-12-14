package com.sl.mediator.spec;

/**
 * 控制类
 * @author shuliangzhao
 * @Title: AbStractMediatorControl
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/3 21:55
 */
public abstract class AbStractMediatorControl {

    protected  AbstractMediator abstractMediator;

    public AbStractMediatorControl(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
}
