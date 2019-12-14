package com.sl.composite.simple;

import java.util.ArrayList;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/18 22:49
 */
public class Client {

    public static void main(String[] args) {
        //首先产生了一个根节点
        IRoot ceo = new Root("Jon","总经理",100000);
        //产生三个部门经理，也就是树枝节点
        IBranch developDep = new Branch("张三","研发部门经理",10000);
        IBranch salesDep = new Branch("李四","销售部门经理",20000);
        IBranch financeDep = new Branch("王五","财务部经理",30000);
        //再把三个小组长产生出来
        IBranch firstDevGroup = new Branch("赵六","开发一组组长",5000);
        IBranch secondDevGroup = new Branch("张飞","开发二组组长",6000);
        //剩下的就是我们这些小兵了,就是路人甲、路人乙
        ILeaf a = new Leaf("a","开发人员",2000);
        ILeaf b = new Leaf("b","开发人员",2000);
        ILeaf c = new Leaf("c","开发人员",2000);
        ILeaf d = new Leaf("d","开发人员",2000);
        ILeaf e = new Leaf("e","开发人员",2000);
        ILeaf f = new Leaf("f","开发人员",2000);
        ILeaf g = new Leaf("g","开发人员",2000);
        ILeaf h = new Leaf("h","销售人员",5000);
        ILeaf i = new Leaf("i","销售人员",4000);
        ILeaf j = new Leaf("j","财务人员",5000);
        ILeaf k = new Leaf("k","CEO秘书",8000);
        ILeaf zhengLaoLiu = new Leaf("唐三","研发部副总",20000);
        //ceo下属员工
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        ceo.add(k);
        //定义研发部门下的结构
        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        //研发部经理下还有一个副总
        developDep.add(zhengLaoLiu);
        //看看开发两个开发小组下有什么
        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        //再看销售部下的人员情况
        salesDep.add(h);
        salesDep.add(i);
        //最后一个财务
        financeDep.add(j);
        System.out.println(ceo.getInfo());
        getAllsubordinateList(ceo.getSubordinateInfo());
    }

    private static void getAllsubordinateList(ArrayList subordinateInfo) {
        for (int i = 0;i<subordinateInfo.size();i++) {
            Object o = subordinateInfo.get(i);
            if (o instanceof Leaf) {
                Leaf leaf = (Leaf) o;
                System.out.println(leaf.getInfo());
            }else {
                IBranch iBranch = (IBranch) o;
                System.out.println(iBranch.getInfo());
                getAllsubordinateList(iBranch.getSubordinateInfo());
            }
        }
    }
}
