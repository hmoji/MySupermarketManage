package generator;
/**
 * 
 * @Title: MpGenerator
 * @Description:mybatis-plus代码生成器 
 * @author Hmoji
 * @date 2020年3月27日
 * @time 下午5:43:39
 */

import org.junit.Test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MpGenerator  {
	@Test
	public void Generator() {
		//全局配置
	GlobalConfig config=new GlobalConfig();
	config.setAuthor("Hmoji")
	.setOutputDir("E:\\git_repo\\MySupermarketManage2\\src\\main\\java")
	.setFileOverride(true)
	.setIdType(IdType.UUID)
	.setServiceImplName("%sService")
	.setBaseResultMap(true)
	.setBaseColumnList(true);
	
	//数据源配置
	DataSourceConfig dsconfig=new DataSourceConfig();
	dsconfig.setDbType(DbType.MYSQL)
	.setDriverName("com.mysql.jdbc.Driver")
	.setUrl("jdbc:mysql://127.0.0.1:3306/supermarketmanage?useSSL=false&characterEncoding=UTF-8")
	.setUsername("root")
	.setPassword("123456");
	
	//策略配置
	StrategyConfig stconfig=new StrategyConfig();
	stconfig.setCapitalMode(true)
	.setDbColumnUnderline(true)
	.setNaming(NamingStrategy.underline_to_camel)
	.setTablePrefix("tbl_")
	.setInclude("staff");
	
	//包名策略配置
	PackageConfig pkconfig=new PackageConfig();
	pkconfig.setParent("com.smmanage")
	.setMapper("mapper")
	.setService("service")
	.setController("controller")
	.setEntity("bean")
	.setXml("mapper")
	.setServiceImpl("serviceImpl");
	//整合配置
	AutoGenerator ag=new AutoGenerator();
	ag.setGlobalConfig(config)
	.setDataSource(dsconfig)
	.setStrategy(stconfig)
	.setPackageInfo(pkconfig);
	
	//执行
	ag.execute();
	}
	
}