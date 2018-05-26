/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejm04;
  
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Alumno
 */

public class Prueba01 {
    public static void main(String[] args) {
        String contexto="/ejm04/contexto.xml";
        BeanFactory beanFactory;
        beanFactory= new ClassPathXmlApplicationContext(contexto);
        Controller bean = beanFactory.getBean(Controller.class);
        System.out.println("SUMA: " + bean.calcSuma(25,33) );
        //El problema con esta forma es que si se declaran distintos ID de la misma clase creará conflictos
        //para ejemplo agregar al contexto : <bean id="matematica2" class="ejm01.Matematica"/>
    }
    
}
