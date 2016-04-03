package space.cyclic.reference;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TrainingBeanPostProcess implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object stringBean, String stringBeanName) throws BeansException {
        System.out.println("TrainingBeanPostProcess.postProcessBeforeInitialization: Before Init for bean : " + stringBeanName);
        return stringBean;
    }

    @Override
    public Object postProcessAfterInitialization(Object stringBean, String stringBeanName) throws BeansException {
        System.out.println("TrainingBeanPostProcess.postProcessBeforeInitialization: After Init for bean : " + stringBeanName);
        return stringBean;
    }
}
