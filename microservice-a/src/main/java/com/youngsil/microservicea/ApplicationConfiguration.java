package com.youngsil.microservicea;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
@Data
public class ApplicationConfiguration {

    private String message;
}
