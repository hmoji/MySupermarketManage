package smmanage.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor implements HandlerInterceptor {
/*	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("拦截器1:FistInterceptor------前置增强方法：preHandle执行中");
		String uri = request.getRequestURI();
		if (uri.endsWith("/login") || uri.endsWith("/login/")) {
			if (request.getSession() != null && request.getSession().getAttribute("loginUser") != null) {
				response.sendRedirect(request.getContextPath() + "/index");
			} else {
				return true;
			}
		}
		response.sendRedirect(request.getContextPath() + "/login");
		return true;
	}
*/
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mav)
			throws Exception {
		System.out.println("拦截器1:FirstInterceptor-----后置增强方法：postHandle执行中");
		mav.addObject("message", "拦截器postHandle");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("拦截器1:FirstInterceptor---------后置增强方法：afterCompletion执行中");
	}
}
