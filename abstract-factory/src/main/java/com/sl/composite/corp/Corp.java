package com.sl.composite.corp;

/**
 * @author shuliangzhao
 * @Title: Corp
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/18 23:23
 */
public abstract class Corp {

    //公司每个人都有名称
    private String name = "";
    //公司每个人都职位
    private String position = "";
    //公司每个人都有薪水
    private int salary =0;

    private Corp parent;

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public Corp(String _name, String _position, int _salary){
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }
    //获得员工信息
    public String getInfo(){
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位："+ this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

}
