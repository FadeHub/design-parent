package com.sl.chain;

/**
 * @author shuliangzhao
 * @Title: Manager
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/11 23:24
 */
public class Manager extends Handler {

    public Manager() {
        super(MANAGER_LEAVE);
    }

    @Override
    public void response(Employee employee) {
        System.out.println("员工找经理请假");
        System.out.println(employee.getRequest());
        System.out.println("经理同意批假" + MANAGER_LEAVE + "天");
    }
}
