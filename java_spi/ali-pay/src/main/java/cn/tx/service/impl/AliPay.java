package cn.tx.service.impl;

import cn.tx.service.PayService;

/**
 * @author 孙珑瑜
 */
public class AliPay implements PayService {

    @Override
    public void Pay() {
        System.out.println("支付宝支付");
    }
}
