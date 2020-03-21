package smmanage.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import smmanage.entity.Staff;
/**
 * 
 * @Title: Interceptor
 * @Description:拦截器 
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午10:11:18
 */
public class Interceptor implements HandlerInterceptor {
	/*
	 * 前置拦截，检查session中是否有当前用户，
	 * 有则放行，
	 * 无则重定向到<code>OutTime.jsp</code>
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception 
	{
		System.out.println("拦截器1:FistInterceptor------前置增强方法：preHandle执行中");
		Staff session = (Staff) request.getSession().getAttribute("STAFF_SESSION");
		if (session == null)
			response.sendRedirect(request.getContextPath() + "/OutTime.jsp");
		return true;
	}
	/*
	 *后置拦截，仅测试 
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mav)
			throws Exception {
		System.out.println("拦截器1:FirstInterceptor-----后置增强方法：postHandle执行中");
		mav.addObject("message", "拦截器postHandle");
	}
	/*
	 * 最终拦截，仅测试
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("拦截器1:FirstInterceptor---------后置增强方法：afterCompletion执行中");
	}
}
