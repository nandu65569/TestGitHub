import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {

	public static void main(String[] args) {

		//Resource resource = new ClassPathResource("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		//Student stu = (Student)factory.getBean("studentbean");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student stu = (Student)context.getBean("studentbean");
		Student stu1 = (Student)context.getBean("studentbean1");
		stu.display();
		stu1.display();
	}

}
