public class caixaeletronica {
  
  public static void main(String[] args) {
     double  saldo =  25.0;
     double valorSolicidado = 22.0;


     if (valorSolicidado <saldo) {
      saldo = saldo - valorSolicidado; /*condional simples*/
      System.out.println("Novo Saldo " + saldo);
    }else {
System.out.println("Saldo insuficiente");
  }
 
    
  }
  
}
