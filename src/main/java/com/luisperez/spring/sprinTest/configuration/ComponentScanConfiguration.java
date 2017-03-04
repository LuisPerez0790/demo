package com.luisperez.spring.sprinTest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.luisperez.spring.springTest.beans")
public class ComponentScanConfiguration {

}
