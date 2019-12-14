package com.sl.adapter.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuliangzhao
 * @Title: BMWFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 22:56
 */
public class BMWFactory implements IBMWFactoryInfo {
    @Override
    public Map getBMWCar() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("place","Germany");
        map.put("engine","v12");
        return map;
    }
}
