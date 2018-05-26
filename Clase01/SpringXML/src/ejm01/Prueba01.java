package ejm01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    String contexto = "/ejm01/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(contexto);
    
    Matematica bean = (Matematica) beanFactory.getBean("matematica");
    
    System.out.println("SUMA: " + bean.suma(5, 8));
    
  }
  
}
