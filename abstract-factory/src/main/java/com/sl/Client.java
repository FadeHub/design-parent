package com.sl;

import com.sl.InstrumentedHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 17:59
 */
public class Client {

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());

        InstrumentedSet<String> s1 = new InstrumentedSet<String>(
                new HashSet());
        s1.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s1.getAddCount());
    }
}
