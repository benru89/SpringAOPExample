package com.sopra.spring.aspect;
 
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
 
@Aspect
public class EmployeeAnnotationAspect {
 
    @Before("@annotation(com.sopra.spring.aspect.Loggable)")
    public void myAdvice(){
        System.out.println("Executing myAdvice!!");
    }
}
