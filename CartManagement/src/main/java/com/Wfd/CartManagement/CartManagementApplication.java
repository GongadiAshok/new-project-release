package com.Wfd.CartManagement;

import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.schema.AlternateTypeRules.newRule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class CartManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartManagementApplication.class, args);
	}
	@Autowired
	 private TypeResolver typeResolver;
	 
	 @Bean
	 public Docket pcfgradleApi() {
	  return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
	    .paths(PathSelectors.any()).build().pathMapping("/").genericModelSubstitutes(ResponseEntity.class)
	    .alternateTypeRules(newRule(
	      typeResolver.resolve(DeferredResult.class,
	        typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
	      typeResolver.resolve(WildcardType.class)))
	    .useDefaultResponseMessages(false)
	    .globalResponseMessage(RequestMethod.GET, newArrayList(new ResponseMessageBuilder().code(500)
	      .message("500 message").responseModel(new ModelRef("Error")).build()));
	 }

}
