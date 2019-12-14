package com.sl.adapter.spec;

import java.util.Map;

/**
 * @author shuliangzhao
 * @Title: AllCarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 22:58
 */
public class AllCarFactory implements CarInfo {

    //源目标对象
    private IBMWFactoryInfo ibmwFactoryInfo = null;
    private IBenzFactoryInfo iBenzFactoryInfo = null;
    private IAudiFactoryInfo iAudiFactoryInfo = null;

    //数据处理
    private Map<String,String> bmwMap = null;
    private Map<String,String> benzMap = null;
    private Map<String,String> audiMap = null;

    public AllCarFactory(IBMWFactoryInfo ibmwFactoryInfo, IBenzFactoryInfo iBenzFactoryInfo,
                         IAudiFactoryInfo iAudiFactoryInfo) {
        this.ibmwFactoryInfo = ibmwFactoryInfo;
        this.iBenzFactoryInfo = iBenzFactoryInfo;
        this.iAudiFactoryInfo = iAudiFactoryInfo;
        this.audiMap = iAudiFactoryInfo.getAudiCar();
        this.benzMap = iBenzFactoryInfo.getBenzCar();
        this.bmwMap = ibmwFactoryInfo.getBMWCar();
    }

    @Override
    public String getCarName() {
        return audiMap.get("carname");
    }

    @Override
    public String getCarEngien() {
        return audiMap.get("engine");
    }
}
