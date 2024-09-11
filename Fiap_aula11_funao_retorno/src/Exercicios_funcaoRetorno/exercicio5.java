package Exercicios_funcaoRetorno;

public class exercicio5 {
	 // Método público que determina qual operação executar
    public double realizarOperacao(char operacao, double num1, double num2) {
        switch (operacao) {
            case '+':
                return somar(num1, num2);
            case '-':
                return subtrair(num1, num2);
            case '*':
                return multiplicar(num1, num2);
            case '/':
                return dividir(num1, num2);
            default:
                throw new IllegalArgumentException("Operação inválida. Use +, -, * ou /.");
        }
    }

    // Método privado para soma
    private double somar(double a, double b) {
        return a + b;
    }

    // Método privado para subtração
    private double subtrair(double a, double b) {
        return a - b;
    }

    // Método privado para multiplicação
    private double multiplicar(double a, double b) {
        return a * b;
    }

    // Método privado para divisão
    private double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }

	public static void main(String[] args) {
		

       
      

	}

}
