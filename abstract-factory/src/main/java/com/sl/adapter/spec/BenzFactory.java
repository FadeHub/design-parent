package com.sl.adapter.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuliangzhao
 * @Title: BenzFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 22:55
 */
public class BenzFactory implements IBenzFactoryInfo {
    @Override
    public Map getBenzCar() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("model","S600");
        map.put("engine","w12");
        return map;
    }
}
