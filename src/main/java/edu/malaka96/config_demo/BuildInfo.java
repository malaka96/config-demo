package edu.malaka96.config_demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "build")
@Setter
@Getter
public class BuildInfo {
    private String id;
    private String version;
    private String name;
    private String type;
}
