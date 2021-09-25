package pl.artimerek.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	//	any class in this package and any method and any numbers of arguments
	@Pointcut("execution(* pl.artimerek.controller.*.*(..))")
	private void pointcutControllerPackage() {
		
	}
	
	@Pointcut("execution(* pl.artimerek.service.*.*(..))")
	private void pointcutServicePackage() {
		
	}
	
	@Pointcut("execution(* pl.artimerek.dao.*.*(..))")
	private void pointcutDaoPackage() {
		
	}
	
	//	combining pointcuts for getting pointcuts only for 3 packages
	
	@Pointcut("pointcutControllerPackage() || pointcutServicePackage() || pointcutDaoPackage()")
	private void pointcutCSD() {
		
	}

	//	simply for displaying called methods and arguments 
	@Before("pointcutCSD()")
	public void before(JoinPoint joinPoint) {
		
		String method = joinPoint.getSignature().toShortString();
		logger.info("In @Before calling: "+ method);
		
		Object[] args = joinPoint.getArgs();
		
		for(Object arg: args) {
			logger.info("Argument : " + arg);
		}
		
	}
	
	//	simply for displaying method  and data returned 
	@AfterReturning(pointcut = "pointcutCSD()",
					returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		 
		String method = joinPoint.getSignature().toShortString();
		logger.info("In @AfterReturning : "+ method);
		
		logger.info("Result: " + result);
	}
}
