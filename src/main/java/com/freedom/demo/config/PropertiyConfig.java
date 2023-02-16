package com.freedom.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description: Propertiy配置类
 *
 * @version 1.0
 * @author huzhibo
 *
 * @date 2023/2/15 15:37
 */
@Component
@ConfigurationProperties(prefix = "test.demo")
@Data
public class PropertiyConfig {

    public String name;

    public String code;

    public List<String> child;
}
