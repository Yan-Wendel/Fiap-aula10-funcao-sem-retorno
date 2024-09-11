package Exercicios_funcao;

public class exercicio2 {
/*▪ Faça um programa que tenha um método chamado calcularArea(), que receba as
dimensões de um terreno retangular como argumento (largura e comprimento) e
mostre a área do terreno.*/
	//criar função.
	static double calcularArea(double larg, double comp) {
		return larg * comp;
	}
	public static void main(String[] args) {
		double larg = 10.0;
        double comp = 20.0;
        
        // Calcula a área usando o método calcularArea
        double area = calcularArea(larg, comp);
        
        // Exibe a área do terreno
        System.out.println("A área do terreno é: " + area + " metros quadrados.");
	}

}
