/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejm04;
 
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Controller {
    
    @Inject
    private Matematica matematica;
  
    public int calcSuma(int n1, int n2){     // esta es la clase que se va a llamar desde las pruebas
        return matematica.suma(n1, n2);
    }
    
}
