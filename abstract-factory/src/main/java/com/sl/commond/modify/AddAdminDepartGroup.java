package com.sl.commond.modify;

/**
 * @author shuliangzhao
 * @Title: AddAdminDepartGroup
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 22:00
 */
public class AddAdminDepartGroup extends Commond {
    @Override
    public void execute() {
        super.adminDepartGroup.add();
        super.adminDepartGroup.plan();
    }
}
