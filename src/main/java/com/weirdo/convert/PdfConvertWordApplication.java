package com.weirdo.convert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PdfConvertWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdfConvertWordApplication.class, args);
    }

}
