package lk.ijse.gdse.aad.lifecycle;

import lk.ijse.gdse.aad.di.GoodFood;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleExplain implements BeanNameAware ,
        BeanFactoryAware ,
        ApplicationContextAware ,
        InitializingBean ,
        DisposableBean {

    @Autowired
    GoodFood goodFood;

    public void myMethod01(){
        System.out.println("My Method 01");
    }

    public void myMethod02(){
        System.out.println("My Method 02");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SetBeanFactory : "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SetBeanName : "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("end");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties Set");
        System.out.println(goodFood.eat());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Set Application Context");
    }
}