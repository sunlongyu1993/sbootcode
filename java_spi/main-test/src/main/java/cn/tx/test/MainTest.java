package cn.tx.test;

import cn.tx.service.PayService;

import java.util.ServiceLoader;

/**
 * @author 孙珑瑜
 */
public class MainTest {
    public static void main(String[] args) {
        //将maintest模块中引入的依赖的具体的实现进行返回
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService : load) {
//            System.out.println(payService);
            payService.Pay();
        }
    }
}
