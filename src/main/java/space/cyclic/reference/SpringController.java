package space.cyclic.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SpringController {
    WordBean bean;
    public SpringController(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        bean = (WordBean) context.getBean("wordBean");
    }

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("word", bean.getWord());
		return "index";
	}
}