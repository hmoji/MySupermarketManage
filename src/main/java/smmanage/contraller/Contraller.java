package smmanage.contraller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smmanage.service.Select;
import smmanage.service.impl.SelectImpl;

@Controller
public class Contraller {
	Select select=new SelectImpl();
	@RequestMapping("welcome")
	public ModelAndView control(String name) {
		System.out.println("转发成功！");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("success");
		mav.addObject("result", select.selectservice(name));
		return mav;
	}
}
