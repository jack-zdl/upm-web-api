package com.api.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.api.constant.SysConstants;
import com.api.util.RespJsonFactory;

/**
 * 登录验证切面类
 * 
 * @author HCK
 *
 */
@Aspect
@Component
public class LoginAspect {

	@Pointcut("execution(public * com.api.controller.*.*(..)) && !execution(public * com.api.controller.LoginController.*(..))")
	public void pointcut() {

	}

	@Around("pointcut()")
	public Object loginCheck(ProceedingJoinPoint pjp) throws Throwable {
		Object[] args = pjp.getArgs();
		HttpServletRequest request = null;
		for (int i = 0; i < args.length; i++) {
			if (args[i] instanceof HttpServletRequest) {
				request = (HttpServletRequest) args[i];
				break;
			}
		}
		if (request != null && request.getSession().getAttribute(SysConstants.SESSION_USER) == null) {
			return RespJsonFactory.buildNotLogin();
		} else {
			return pjp.proceed();
		}
	}
}
