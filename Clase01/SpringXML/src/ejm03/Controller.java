package ejm03;

public class Controller {

  private Matematica matematica;

  /**
   * Constructor por defecto
   */
  public Controller() {
  }

  /**
   * Constructor adicional
   * @param matematica 
   */
  public Controller(Matematica matematica) {
    this.matematica = matematica;
  }
  
  public int calcSuma(int n1, int n2){
    return matematica.suma(n1, n2);
  }
  
}
