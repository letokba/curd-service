package com.letokba.curd.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Wait
 */
@Aspect
@Component
public class CurdServiceAspect {
    private static final Logger log = LoggerFactory.getLogger(CurdServiceAspect.class);

    /**
     * check all args.
     * if some arg is null, throw {@link CurdServiceException}
     *
     * @see CheckUtils
     */
    private boolean isCheckArgs = true;

    public void setCheckArgs(boolean isCheckArgs) {
        this.isCheckArgs = isCheckArgs;
    }


    @Pointcut("execution(* com.letokba.curd.core.*Service.*(..)) && !execution( * com.letokba.curd.core.*Service.getDao())")
    private void checkArgs() {

    }

    @Before(value = "checkArgs()")
    public void before(JoinPoint point) {
        System.out.println(point);
        if(isCheckArgs) {
            CheckUtils.checkArgs(point.getArgs());
        }
    }

    public void after() {

    }

    @AfterThrowing(throwing = "t", pointcut = "checkArgs()")
    public void afterThrowing(Throwable t) {
        if(t instanceof IllegalArgumentException) {
            log.error(t.getMessage());
            throw new CurdServiceException(t.getMessage());
        }
    }




}
