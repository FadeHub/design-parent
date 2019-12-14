package com.sl.adapter.spec;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 23:08
 */
    public class Client {

        public static void main(String[] args) {
            IAudiFactoryInfo iAudiFactoryInfo = new AudiFactory();
            IBenzFactoryInfo iBenzFactoryInfo = new BenzFactory();
            IBMWFactoryInfo ibmwFactoryInfo = new BMWFactory();
            AllCarFactory allCarFactory = new AllCarFactory(ibmwFactoryInfo,iBenzFactoryInfo,iAudiFactoryInfo);
            System.out.println(allCarFactory.getCarEngien());
            System.out.println(allCarFactory.getCarName());
        }
    }
