package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cydeo")
//@ComponentScan //PEKI FULLTIME MENTOR CLASS INA
// @COMPONEND EKLEDIGIMIZDE BEAN OLARAK ISARETLENMIS OLUYORSA BURADA NEDEN HATA ALIYORUZ.

public class ConfigCourse {
}
