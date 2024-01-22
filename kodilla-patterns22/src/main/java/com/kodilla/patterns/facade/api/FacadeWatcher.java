package com.kodilla.patterns.facade.api;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Pointcut("execution(* com.kodilla.patterns.facade.api.OrderFacade.processOrder(..))")
    public void logPointCut() {
    }

    @Before("logPointCut()")
    public void logBeforeMethod(JoinPoint joinPoint) {
        LOGGER.info("Logging an event :: " + joinPoint.getThis());
    }

    @After("logPointCut()")
    public void logAfterMethod(JoinPoint joinPoint) {
        LOGGER.info("After method is invoked :: " + joinPoint.getSignature());
    }

    @Around("logPointCut()")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
