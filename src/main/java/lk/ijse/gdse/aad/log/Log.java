package lk.ijse.gdse.aad.log;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Log {
    @Before("execution(public void dataProcessStarted())")
    public void startLog(){
        System.out.println("Log - Data process Started");
    }
    @After("execution(public void dataProcessEnd())")
    public void endLog(){
        System.out.println("Log - End Data Process");
    }


}
