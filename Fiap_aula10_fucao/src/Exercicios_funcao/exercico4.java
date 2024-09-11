package Exercicios_funcao;
import java.util.Scanner;
public class exercico4 {
/*▪ Faça um programa, com um método que necessite de três argumentos:
▪ dois números e um sinal de operador matemático (+, -, * ou /).
▪ Ela deve fazer o cálculo indicado pelo operador usando os dois número passados.*/
	 // Método para realizar a operação matemática com base no operador fornecido
	// Método para realizar a operação matemática com base no operador fornecido
    public static void executarOperacao(double num1, double num2, char operador) {
        double resultado;

        // Realiza a operação matemática com base no operador
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Erro: Operador inválido. Use +, -, * ou /.");
                break;
        }
    }

	public static void main(String[] args) {
		// Exemplos de cálculos
        executarOperacao(10, 5, '+');  // Deve exibir "Resultado: 15.0"
        executarOperacao(10, 5, '-');  // Deve exibir "Resultado: 5.0"
        executarOperacao(10, 5, '*');  // Deve exibir "Resultado: 50.0"
        executarOperacao(10, 5, '/');  // Deve exibir "Resultado: 2.0"
        executarOperacao(10, 0, '/');  // Deve exibir "Erro: Divisão por zero."
        executarOperacao(10, 5, '^');  // Deve exibir "Erro: Operador inválido. Use +, -, * ou /."
	}

}
