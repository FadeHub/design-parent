package com.sl.commond.modify;

/**
 * @author shuliangzhao
 * @Title: DelTechDepartGroup
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 22:00
 */
public class DelTechDepartGroup extends Commond {
    @Override
    public void execute() {
        super.techDepartGroup.del();
        super.techDepartGroup.plan();
    }
}
