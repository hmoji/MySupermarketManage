package smmanage.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
/**
 * 
 * @Title: StartMapper
 * @Description:通知，现仅用来测试
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午9:42:06
 */
public class StartMapper {
	/**
	 * 
	 * @return_type: void
	 * @Description:前置通知，用来测试
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午9:45:21
	 */
	@Before("execution(* smmanage.contraller..*.*(..))")
	public void startmapperbefore() {
		System.out.println("前置通知");
	}
}
