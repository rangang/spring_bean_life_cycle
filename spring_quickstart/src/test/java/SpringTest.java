import com.rg.dao.UserDao;
import com.rg.domain.Person;
import com.rg.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @BelongsProject: spring_quickstart
 * @Author: RG
 * @CreateTime: 2022/10/11 1:57 下午
 * @Description:
 */
public class SpringTest {

    @Test
    public void personTest() {

        System.out.println("开始初始化容器");
        // 获取到了spring上下文对象，借助上下文对象可以获取到IOC容器中bean对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("xml加载完毕");
        // 使用上下文对象从IOC容器中获取到了bean对象
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        System.out.println("关闭容器");
        applicationContext.close();

    }

}
