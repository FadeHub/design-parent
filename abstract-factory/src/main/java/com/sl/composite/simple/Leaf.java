package com.sl.composite.simple;

/**
 * @author shuliangzhao
 * @Title: Leaf
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/18 22:45
 */
public class Leaf implements ILeaf {

    //根节点的名称
    private String name = "";
    //根节点的职位
    private String position = "";
    //根节点的薪水
    private int salary = 0;

    public Leaf(String name,String position,int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称："+ this.name;;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水： " + this.salary;
        return info;
    }
}
