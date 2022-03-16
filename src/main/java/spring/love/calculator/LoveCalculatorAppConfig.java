package spring.love.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import spring.love.formatter.PhoneFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "spring.love.controller")
public class LoveCalculatorAppConfig implements WebMvcConfigurer{

	//configure view resolver to append prefix and suffix to returned string
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolverobj = new InternalResourceViewResolver();
		viewResolverobj.setPrefix("/WEB-INF/view/");
		viewResolverobj.setSuffix(".jsp");
		return viewResolverobj;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new PhoneFormatter());
	}
}
