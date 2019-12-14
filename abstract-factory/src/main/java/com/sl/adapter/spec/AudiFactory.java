package com.sl.adapter.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuliangzhao
 * @Title: AudiFactoryInfo
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 22:53
 */
public class AudiFactory implements IAudiFactoryInfo {
    @Override
    public Map getAudiCar() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("carname","Audi");
        map.put("engine","v12");
        return map;
    }
}
