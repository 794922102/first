package cn.itcast.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	@Test
	public void testUser()
	{
		//1.加载sring的配置文件，根据配置创建对象
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置创建的对象
		Book book=(Book) context.getBean("book");
		
//		System.out.println(demo1);
		book.demobook();
	}
}
