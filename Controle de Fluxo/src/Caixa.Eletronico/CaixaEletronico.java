package Caixa.Eletronico;
public class CaixaEletronico {
    
    // CaixaEletronico.java
    public static void main(String[] args) throws Exception {
       double saldo = 25.0;
       double valorSolicidado = 24.0;

       if (valorSolicidado < saldo)
       saldo = saldo - valorSolicidado;

       System.out.println(saldo);

        
       
    }
}

    