package Exercicios_funcaoRetorno;

public class exercicio1 {
	// Método para calcular a área do terreno
    public static double calcularArea(double largura, double comprimento) {
        // Calcula a área multiplicando largura e comprimento
        return largura * comprimento;
    }
	public static void main(String[] args) {
		 // Exemplos de dimensões do terreno
        double largura = 12.0;
        double comprimento = 8.0;
        
        // Calcula a área usando o método calcularArea
        double area = calcularArea(largura, comprimento);
        
        // Exibe a área do terreno
        System.out.printf("A área do terreno é: %.2f metros quadrados.\n", area);

	}

}
