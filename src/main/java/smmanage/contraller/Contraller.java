package smmanage.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import smmanage.service.Select;
import smmanage.service.impl.SelectImpl;

@Controller
public class Contraller {
	@RequestMapping("welcome")
	public String control() {
		System.out.println("转发成功！");
		Select select =new SelectImpl();
		select.selectservice();
		return "success";
	}
}
