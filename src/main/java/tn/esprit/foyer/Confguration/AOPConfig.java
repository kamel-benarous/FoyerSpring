package tn.esprit.foyer.Confguration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AOPConfig {
    private final static Logger logger = LogManager.getLogger(AOPConfig.class);

    @Before("execution(* tn.esprit.foyer.Service.FoyerServiceImpl.retrieveAllFoyers(..))")
    public void logEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        logger.info("executing method : " + name);
    }

    @Around("execution(* tn.esprit.foyer.Service.FoyerServiceImpl.retrieveAllFoyers(..)))")
    public Object benchmark(ProceedingJoinPoint joinPoint) throws Throwable{
        long t = System.currentTimeMillis();
        Object o = joinPoint.proceed();
        long t1 = System.currentTimeMillis() - t ;
        logger.info("execution in " + t1 + "ms;");
        return o;
    }
}
