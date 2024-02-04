package lk.ijse.gdse.aad;

import lk.ijse.gdse.aad.configs.AppConfig;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        var myComponent  =ctx.getBean("myComponents");
        System.out.println(myComponent);

        ConfigurableListableBeanFactory configurableListableBeanFactory =  ctx.getBeanFactory();
        boolean isSingleton = configurableListableBeanFactory.isSingleton("myComponents");
        System.out.println(isSingleton);

        ctx.close();
    }
}