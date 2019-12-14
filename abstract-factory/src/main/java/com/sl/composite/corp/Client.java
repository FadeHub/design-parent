package com.sl.composite.corp;

import java.util.ArrayList;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/18 23:27
 */
public class Client {

    public static void main(String[] args) {
        //首先产生了一个根节点
        Branch ceo = new Branch("Jon","总经理",100000);
        //产生三个部门经理，也就是树枝节点
        Branch developDep = new Branch("张三","研发部门经理",10000);
        Branch salesDep = new Branch("李四","销售部门经理",20000);
        Branch financeDep = new Branch("王五","财务部经理",30000);
        //再把三个小组长产生出来
        Branch firstDevGroup = new Branch("赵六","开发一组组长",5000);
        Branch secondDevGroup = new Branch("张飞","开发二组组长",6000);
        //剩下的就是我们这些小兵了,就是路人甲、路人乙
        Leaf a = new Leaf("a","开发人员",2000);
        Leaf b = new Leaf("b","开发人员",2000);
        Leaf c = new Leaf("c","开发人员",2000);
        Leaf d = new Leaf("d","开发人员",2000);
        Leaf e = new Leaf("e","开发人员",2000);
        Leaf f = new Leaf("f","开发人员",2000);
        Leaf g = new Leaf("g","开发人员",2000);
        Leaf h = new Leaf("h","销售人员",5000);
        Leaf i = new Leaf("i","销售人员",4000);
        Leaf j = new Leaf("j","财务人员",5000);
        Leaf k = new Leaf("k","CEO秘书",8000);
        Leaf zhengLaoLiu = new Leaf("唐三","研发部副总",20000);
        //ceo下属员工
        ceo.addSubordinate(developDep);
        ceo.addSubordinate(salesDep);
        ceo.addSubordinate(financeDep);
        ceo.addSubordinate(k);
        //定义研发部门下的结构
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        Corp parent = developDep.getParent();
        System.out.println("++++"+parent.getInfo());
        //研发部经理下还有一个副总
        developDep.addSubordinate(zhengLaoLiu);
        //看看开发两个开发小组下有什么
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        //再看销售部下的人员情况
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        //最后一个财务
        financeDep.addSubordinate(j);
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    private static String  getTreeInfo(Branch ceo) {
        ArrayList<Corp> subordinate = ceo.getSubordinate();
        String info = "";
        for (Corp s:subordinate) {
            if (s instanceof Leaf) {
                info = info+s.getInfo()+"\n";
            }else {
                info = info+s.getInfo()+"\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }


}
