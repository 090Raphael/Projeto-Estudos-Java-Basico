public class ResultadoEscolar1 {
  
	// Cenário 1
public static void main(String[] args) {
	int nota = 4;
	
	String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
	
	System.out.println(resultado);
}
}


//Explicação:
//Primeira condição (nota >= 7):

//Se a nota for maior ou igual a 7, o aluno é considerado "Aprovado".
//Segunda condição (nota >= 5 && nota < 7):

//Se a nota for maior ou igual a 5 e menor que 7, o aluno está em "Recuperação".
//Caso contrário:

//Se nenhuma das condições anteriores for atendida, o aluno é "Reprovado".
//Funcionamento no cenário dado:
//Com nota = 6, o programa verifica:
//nota >= 7? Não (6 não é maior ou igual a 7).
//nota >= 5 && nota < 7? Sim (6 é maior ou igual a 5 e menor que 7).
//Portanto, o resultado será "Recuperação".
//Esse código é funcional e claro, aplicando corretamente as condições para determinar o resultado escolar.