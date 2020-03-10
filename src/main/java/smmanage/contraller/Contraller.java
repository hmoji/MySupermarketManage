package smmanage.contraller;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.tomcat.util.descriptor.web.LoginConfig;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smmanage.entity.Goods;
import smmanage.entity.Staff;
import smmanage.service.Delete;
import smmanage.service.Insert;
import smmanage.service.Select;
import smmanage.service.StaffSelect;
import smmanage.service.Update;

@Controller
public class Contraller {
	@Resource
	private Select select;
	@Resource
	private Insert insert;
	@Resource
	private Update update;
	@Resource
	private Delete delete;
	@Resource
	private StaffSelect staffselect;
	
	@RequestMapping("login")
	public ModelAndView login(String name,String password) {
		System.out.println("登录请求已拦截");
		ModelAndView mav=new ModelAndView();
		if(staffselect.staffselectservice(name)!=null&&staffselect.staffselectservice(name).getPassword().equals(password)) {
			mav.setViewName("index");
			return mav;
		}else {
			mav.setViewName("Error");
			mav.addObject("result", "登陆失败，请检查您的账号或密码");
			return mav;
		}
	}
	
	@RequestMapping("select")
	public ModelAndView select(String name) {
		System.out.println("查询请求已拦截");
		System.out.println("拦截控制------方法Interceptor执行中");
		ModelAndView mav=new ModelAndView();
		Goods result = select.selectservice(name);
		if(result!=null) {
			mav.setViewName("SelectResult");
			mav.addObject("selectresult", result);
			mav.addObject("nameresult", result.getName());
			mav.addObject("priceresult", result.getPrice());
			mav.addObject("numberresult", result.getNumber());	
			System.out.println("即将返回");
			return mav;
		}
		else {
			mav.setViewName("SelectNullResult");
			mav.addObject("selectresult", "抱歉，该商品不存在！");
			return mav;
		}
	}
	
	@RequestMapping("add")
	public ModelAndView add(Goods goods) {
		System.out.println("添加请求已拦截");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("InsertResult");
		boolean result=insert.InsertService(goods);
		if(result) 
			return mav.addObject("insertresult", "添加成功！");
		return mav.addObject("insertresult", "添加失败！");
	}
	
	@RequestMapping("update")
	public ModelAndView update(Goods goods) {
		System.out.println("修改请求已拦截");
		boolean result=false;
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UpdateResult");
		result=update.update(goods);
		if(result)
			return mav.addObject("updateresult", "修改成功！");
		return mav.addObject("updateresult", "修改失败！");
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(String name) {
		System.out.println("删除请求已拦截");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("DeleteResult");
		boolean result=delete.DeleteSrevice(name);
		if(result)
			return mav.addObject("deleteresult", "删除成功");
		return mav.addObject("deleteresult", "删除失败");
	}
}
