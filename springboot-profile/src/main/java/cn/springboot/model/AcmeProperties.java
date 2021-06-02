package cn.springboot.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 孙珑瑜
 * @version 20210519
 */
@Data
@Component
@ConfigurationProperties(prefix = "acme")
public class AcmeProperties {
    private boolean enabled;
    private InetAddress remoteAddress;
    private String host;
}
