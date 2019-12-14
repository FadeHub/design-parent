package com.sl.chain;

/**
 * @author shuliangzhao
 * @Title: Handler
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/11 23:01
 */
public abstract class Handler {

    public final static int BOSS_LEAVE = 5;

    public final static int MANAGER_LEAVE = 3;

    public final static int GROUP_LEADER_LEAVE = 1;

    private int level;

    public Handler(int level) {
        this.level = level;
    }

    //责任传递，下一责任人
    private Handler nextHandler;

    public final void handlerMessage(Employee employee) {
        if (employee.getLeave() == level) {
            this.response(employee);
        }else {
            if (this.nextHandler != null) {
                if (this.nextHandler.level == employee.getLeave()) {
                    this.nextHandler.response(employee);
                }else {
                    System.out.println("没人批准了，请准确提假期天数");
                }
            }else {
                System.out.println("没人批准了，请准确提假期天数");
            }
        }
    }

    public void setHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void response(Employee employee);
}
