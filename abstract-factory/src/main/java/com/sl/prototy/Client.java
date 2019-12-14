package com.sl.prototy;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/31 22:30
 */
public class Client {

    public static void main(String[] args) {
        //浅拷贝
        /*ShallowThing thing = new ShallowThing();
        thing.setList("张三");
        ShallowThing clone = thing.clone();
        clone.setList("李四");
        System.out.println(thing.getList());*/
        //深拷贝
        DeepThing deepThing = new DeepThing();
        deepThing.setList("王五");
        DeepThing clone1 = deepThing.clone();
        clone1.setList("张柳");
        System.out.println(deepThing.getList());
        System.out.println(clone1.getList());
    }
}
