package com.sl.commond.modify;

import com.sl.commond.AdminDepartGroup;
import com.sl.commond.PlanDepartGroup;
import com.sl.commond.TechDepartGroup;

/**
 * @author shuliangzhao
 * @Title: Commond
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/4 21:57
 */
public abstract class Commond {

    protected AdminDepartGroup adminDepartGroup = new AdminDepartGroup();

    protected PlanDepartGroup planDepartGroup = new PlanDepartGroup();

    protected TechDepartGroup techDepartGroup = new TechDepartGroup();

    //要告诉我做什么
    public abstract  void execute();
}

