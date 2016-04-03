package space.cyclic.reference;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TrainingBeanPostProcess implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object stringBean, String stringBeanName) throws BeansException {
        System.out.println("TrainingBeanPostProcess.postProcessBeforeInitialization: Before Init for bean : " + stringBeanName);
        return stringBean;
    }

    @Override
    public Object postProcessAfterInitialization(Object stringBean, String stringBeanName) throws BeansException {
        for (Method method : stringBean.getClass().getDeclaredMethods()){
            if (Modifier.isPublic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE)){
                try {
                    System.out.println("TrainingBeanPostProcess.postProcessAfterInitialization: Bean \"" + stringBeanName +
                    "\" property " + method.getName().substring(3) + ": " + method.invoke(stringBean));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
        return stringBean;
    }
}
