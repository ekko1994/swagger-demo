package com.zh.swagger.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ListVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

/**
 * @author zhanghao
 * @date 2020/7/4 - 11:11
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * new ApiInfo("Api Documentation", "Api Documentation", "1.0", "urn:tos",
     *           DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
     */
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("alex")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zh.swagger"))
                .paths(PathSelectors.any())
                .build();
    }

    ApiInfo apiInfo(){
        return new ApiInfo("helloworld的api文档", "helloworld的api文档", "v1.0"
                , "www.baidu.com", ApiInfo.DEFAULT_CONTACT, "Apache 2.0", "www.baidu.com", Arrays.asList(new ListVendorExtension("a", Arrays.asList("a"))));
    }
}
