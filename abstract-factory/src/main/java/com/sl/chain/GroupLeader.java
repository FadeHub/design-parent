package com.sl.chain;

/**
 * @author shuliangzhao
 * @Title: GroupLeader
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/11 23:26
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(GROUP_LEADER_LEAVE);
    }

    @Override
    public void response(Employee employee) {
        System.out.println("员工找组长请假");
        System.out.println(employee.getRequest());
        System.out.println("组长同意批假" + GROUP_LEADER_LEAVE + "天");
    }
}
