package ejm02;

public class Controller {

  private Matematica matematica;

  public void setMatematica(Matematica matematica) {
    this.matematica = matematica;
  }
  
  public int calcSuma(int n1, int n2){
    return matematica.suma(n1, n2);
  }
  
}
