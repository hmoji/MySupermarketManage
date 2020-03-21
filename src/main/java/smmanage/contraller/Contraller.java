package smmanage.contraller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smmanage.entity.Goods;
import smmanage.entity.Staff;
import smmanage.service.Delete;
import smmanage.service.Insert;
import smmanage.service.QueryAllGoods;
import smmanage.service.Select;
import smmanage.service.StaffSelect;
import smmanage.service.Update;
import smmanage.util.MultipleAdd;
import smmanage.util.ToGood;
/**
 * 
 * @Title: Contraller
 * @Description:控制器模块
 * @author Hmoji
 * @date 2020年3月21日
 * @time 下午9:48:36
 */
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
	@Resource
	private QueryAllGoods queryall;
	/**
	 * 
	 * @return_type: String
	 * @Description:带session返回到index，帮助权限管理
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午9:50:30
	 */
	@RequestMapping("LoginWithSession")
	public String LoginWithSession() {
		return "index";
	}
	/**
	 * 返回ArrayList，若成功转发到allGoods
	 * 
	 * @return_type: ModelAndView
	 * @Description:查询所有商品 
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午9:51:17
	 */
	@RequestMapping("queryAll")
	public ModelAndView queryAll() {
		System.out.println("查询所有商品");
		ArrayList<Goods> result= queryall.queryAllGoods();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("allGoods");
		mav.addObject("result", result);
		return mav;
	}
	/**
	 * 创建并保存session，若成功转发到到index，否则转发到到Error
	 * 
	 * @return_type: ModelAndView
	 * @Description:接受登陆（login）请求
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午9:52:08
	 */
	@RequestMapping("login")
	public ModelAndView login(String name,String password,HttpSession session) {
		System.out.println("登录请求已拦截");
		ModelAndView mav=new ModelAndView();
		Staff staff=staffselect.staffselectservice(name);
		if(staff!=null&&staff.getPassword().equals(password)) {
			session.setAttribute("STAFF_SESSION", staff);
			session.setMaxInactiveInterval(60*30);
			System.out.println(session.getAttribute("STAFF_SESSION"));
			mav.setViewName("index");
			return mav;
		}else {
			mav.setViewName("Error");
			mav.addObject("result", "登陆失败，请检查您的账号或密码");
			return mav;
		}
	}
	/**
	 * 返回商品的各个元素，
	 * 
	 * @return_type: ModelAndView
	 * @Description:查询单个商品请求 
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午9:54:00
	 */
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
	/**
	 * 使用“，”分割（split）商品，使用“-”分割商品内的各个属性
	 * 添加结果转发到insertresult
	 * 
	 * @return_type: ModelAndView
	 * @Description:批量增加商品 
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午10:05:05
	 */
	@RequestMapping("multipleAdd")
	public ModelAndView multipleAdd(String param) {
		String[] temp=param.split("，");
		ToGood toGood=new ToGood();
		Goods[] goods=toGood.toGood(temp);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("InsertResult");
		boolean result=MultipleAdd.multipleAdd(goods);
		if(result) 
			return mav.addObject("insertresult", "添加成功！");
		return mav.addObject("insertresult", "添加失败！");
	}
	/**
	 * 结果转发到insertresult
	 * 
	 * @return_type: ModelAndView
	 * @Description:增加单个商品 
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午10:07:14
	 */
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
	/**
	 * 修改结果转发到updateresult
	 * 
	 * @return_type: ModelAndView
	 * @Description:修改单个商品信息 
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午10:07:50
	 */
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
	/**
	 * 删除结果转发到deleteresult
	 * 
	 * @return_type: ModelAndView
	 * @Description:删除单个商品 
	 * @author Hmoji
	 * @date 2020年3月21日
	 * @time 下午10:08:26
	 */
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
