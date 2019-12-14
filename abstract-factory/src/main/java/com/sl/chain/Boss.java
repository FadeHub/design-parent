package com.sl.chain;

/**
 * @author shuliangzhao
 * @Title: Boss
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/11 23:21
 */
public class Boss extends Handler {

    public Boss() {
        super(BOSS_LEAVE);
    }

    @Override
    public void response(Employee employee) {
        System.out.println("员工找老板请假");
        System.out.println(employee.getRequest());
        System.out.println("老板同意批假" + BOSS_LEAVE + "天");
    }
}
