package space.cyclic.reference.pojo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class WordBean implements InitializingBean, DisposableBean{
    private String word;

    public WordBean(){}

    public WordBean(String word){
        this.word =  word;
    }

    public String getWord() {
        return "Word : " + word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("WordBean.destroy: Alas poor " + word + " I new him well.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("WordBean.afterPropertiesSet: What is up " + word + "? I am ALIVE!!");
    }
}
