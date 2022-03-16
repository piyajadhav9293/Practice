package spring.love.calculator;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Approach 2 for setting up dipacher servlet/ web.xml.
//in this approach spring is going to do set up on behalf of us

public class LoveAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = { LoveCalculatorAppConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {

		String[] arr = { "/" };
		return arr;
	}

}
