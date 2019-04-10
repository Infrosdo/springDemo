package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before(value="execution(* *..*.*ServiceImpl.*(..))")
	public void before() {
		System.out.println("这是注解方式的前置通知");
	}
}
