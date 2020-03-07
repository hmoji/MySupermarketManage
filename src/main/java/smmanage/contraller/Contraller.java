package smmanage.contraller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smmanage.entity.Goods;
import smmanage.service.Insert;
import smmanage.service.Select;
import smmanage.service.impl.InsertImpl;
import smmanage.service.impl.SelectImpl;

@Controller
public class Contraller {
	@RequestMapping("select")
	public ModelAndView select(String name) {
		Select select=new SelectImpl();
		System.out.println("转发成功！");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("SelectResult");
		Goods result = select.selectservice(name);
		if(result!=null) 
		mav.addObject("selectresult", result);
		else {
			mav.addObject("selectresult", "抱歉，该商品不存在！");
		}
		return mav;
	}
	
	@RequestMapping("add")
	public ModelAndView add(Goods goods) {
		Insert insert=new InsertImpl();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("InsertResult");
		boolean result=insert.InsertService(goods);
		if(result) 
			return mav.addObject("insertresult", "添加成功！");
		return mav.addObject("insertresult", "添加失败！");
	}
}
