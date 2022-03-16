package spring.love.calculator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Approach 1
public class LoveCalculatorApplicationInitializer { // implements WebApplicationInitializer {

	/*
	 * @Override public void onStartup(ServletContext servletContext) throws
	 * ServletException {
	 * System.out.println("**********Web Application Initializer******************"
	 * );
	 * 
	 * // create the instance of webapplicationcontext
	 * AnnotationConfigWebApplicationContext webApplicationContext = new
	 * AnnotationConfigWebApplicationContext(); // register your configuration class
	 * in webapplicationcontext
	 * webApplicationContext.register(LoveCalculatorAppConfig.class); // create the
	 * instance of dispatcher servlet DispatcherServlet dispatcherServlet = new
	 * DispatcherServlet(webApplicationContext); // ServletRegistration is outher
	 * interface and dynamic is inner interface // add your servlet
	 * servlet.context.addservlet("name can be anything",instance // of dispatcher
	 * servlet) ServletRegistration.Dynamic dynamic =
	 * servletContext.addServlet("myDispatchServlet", dispatcherServlet); //by using
	 * dynamic dynamic.setLoadOnStartup(1); dynamic.addMapping("/");
	 * 
	 * 
	 * 
	 * }
	 */

}
