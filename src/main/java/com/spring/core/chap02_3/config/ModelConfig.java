package com.spring.core.chap02_3.config;

import com.spring.core.chap02_3.controller.MyController;
import com.spring.core.chap02_3.repository.MyRepository;
import com.spring.core.chap02_3.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.spring.core.chap02_3")
public class ModelConfig {

}
