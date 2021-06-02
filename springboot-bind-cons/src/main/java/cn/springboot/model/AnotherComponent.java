package cn.springboot.model;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.net.InetAddress;

/**
 * @author 孙珑瑜
 */
@Data
public class AnotherComponent {
    private boolean enabled;
    private InetAddress remoteAddress;


//    public boolean isEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    public InetAddress getRemoteAddress() {
//        return remoteAddress;
//    }
//
//    public void setRemoteAddress(InetAddress remoteAddress) {
//        this.remoteAddress = remoteAddress;
//    }

}
