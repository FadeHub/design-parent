package com.sl.chain;

/**
 * @author shuliangzhao
 * @Title: Employee
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/11 23:05
 */
public class Employee {

    //请假
    private int leave;

    private String request;

    public Employee(int leave,String request) {
        this.leave = leave;
        this.request = request;
    }


    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public String getRequest() {
        return request;
    }
}
