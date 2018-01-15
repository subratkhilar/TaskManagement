package com.pi.ms.config.service;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

//import net.atos.coei4.multitenacylib.TenantResolver;

/**
 * @author A662144
 *
 */
@Component
@Aspect
public class ServiceInterceptor implements Ordered {
	
	private static final Logger logger = Logger.getLogger(ServiceInterceptor.class);
	
	private int order;

	/**
	 * @param order
	 */
	@Value("1")
	public void setOrder(int order) {
		this.order = order;

	}

	@Override
	public int getOrder() {
		return order;
	}

	/**
	 * 
	 */
	@Pointcut("within(net.atos.coei4.rule.engine.service.service..*)")
	public void serviceMethods() {
	}

	/**
	 * @param jp
	 */
	@Before("serviceMethods()")
	public void beforeService(JoinPoint jp) {

		String Id = jp.getArgs()[0].toString();
		logger.info("Before Service call : Customer.................. = " + Id);
		//TenantResolver.setTenantDb(Id);

	}

	/**
	 * @param jp
	 */
	@After("serviceMethods()")
	public void afterService(JoinPoint jp) {
		String Id = jp.getArgs()[0].toString();
		logger.info("After Service call : Customer.................... = " + Id);
		//TenantResolver.clearTenantDb();
	}

}
