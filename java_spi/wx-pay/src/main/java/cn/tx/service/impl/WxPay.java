package cn.tx.service.impl;

import cn.tx.service.PayService;

/**
 * @author 孙珑瑜
 */
public class WxPay implements PayService {
    @Override
    public void Pay() {
        System.out.println("微信支付");
    }
}
