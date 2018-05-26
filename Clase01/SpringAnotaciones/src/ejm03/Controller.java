package ejm03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

  @Autowired
  private Matematica matematica;

  public int calcSuma(int n1, int n2){
    return matematica.suma(n1, n2);
  }
  
}
