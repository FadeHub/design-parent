package com.sl;

import java.util.Collection;
import java.util.Set;

/**
 * @author shuliangzhao
 * @Title: InstrumentedSet
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/1 18:07
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public InstrumentedSet(Set e) {
        super(e);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
