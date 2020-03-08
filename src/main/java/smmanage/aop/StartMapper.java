package smmanage.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class StartMapper {
	@Pointcut("execution(* smmanage.contraller..*.*(..))")
	public void pointcut() {
	}
	@Before("pointcut()")
	public void startmapperbefore() {
		System.out.println("前置通知");
	}
}
