package ejm02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    String contexto = "/ejm02/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(contexto);
    
    Matematica bean = beanFactory.getBean(Matematica.class);
    
    System.out.println("SUMA: " + bean.suma(5, 8));
    
  }
  
}
