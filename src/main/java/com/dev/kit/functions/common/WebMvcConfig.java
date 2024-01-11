package com.dev.kit.functions.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/static/**")
				.addResourceLocations("/resources/static/");
		registry.addResourceHandler("/*.ico")
				.addResourceLocations("/");
		registry.addResourceHandler("/robots.txt")
				.addResourceLocations("/robots.txt");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
}
