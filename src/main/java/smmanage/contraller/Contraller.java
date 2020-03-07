package smmanage.contraller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smmanage.entity.Goods;
import smmanage.service.Insert;
import smmanage.service.Select;
import smmanage.service.Update;
import smmanage.service.impl.InsertImpl;
import smmanage.service.impl.SelectImpl;
import smmanage.service.impl.UpdateImpl;

@Controller
public class Contraller {
	@RequestMapping("select")
	public ModelAndView select(String name) {
		Select select=new SelectImpl();
		System.out.println("转发成功！");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("SelectResult");
		Goods result = select.selectservice(name);
		if(result!=null) {
		mav.addObject("selectresult", result);
		mav.addObject("nameresult", result.getName());
		mav.addObject("priceresult", result.getPrice());
		mav.addObject("numberresult", result.getNumber());		
		}
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
	
	@RequestMapping("update")
	public ModelAndView update(Goods goods) {
		boolean result=false;
		System.out.println("修改请求已拦截");
		Update update=new UpdateImpl();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UpdateResult");
		result=update.update(goods);
		if(result)
			return mav.addObject("updateresult", "修改成功！");
		return mav.addObject("updateresult", "修改失败！");
	}
}
