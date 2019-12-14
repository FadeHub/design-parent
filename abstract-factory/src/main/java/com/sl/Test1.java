package com.sl;

import com.sl.service.PayService;

import java.math.BigInteger;
import java.util.Random;
import java.util.ServiceLoader;

/**
 * @author shuliangzhao
 * @Title: Test1
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 13:38
 */
public class Test1 {

    public static void main(String[] args) {
        //System.out.println(BigInteger.probablePrime(10,new Random()));
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService:load) {
            payService.pay();
        }
    }
}
