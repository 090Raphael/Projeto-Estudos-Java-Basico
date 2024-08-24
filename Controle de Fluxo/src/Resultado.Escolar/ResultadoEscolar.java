 public class ResultadoEscolar {

    public static void main(String[] args) {

       int nota = 9;
       
       // if primeira instrução
       if(nota >= 6) 
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7 )
        System.out.println("Prova de Recuperação");       
        
        // else sera segunda instrução
       else 
        System.out.println("Reprovado");
    }
}

