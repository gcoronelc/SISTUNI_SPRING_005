package ejm03;

import ejm02.*;
import javax.inject.Named;

@Named
public class Matematica {
  
  public int suma( int n1, int n2 ){
    return (n1 + n2);
  }
    
}
