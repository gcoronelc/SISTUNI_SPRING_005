package ejm01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba03 {
  
  public static void main(String[] args) {
    
    String contexto = "/ejm01/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(contexto);
    
    Matematica bean = beanFactory.getBean(Matematica.class);
    
    System.out.println("SUMA: " + bean.suma(5, 8));
    
  }
  
}
