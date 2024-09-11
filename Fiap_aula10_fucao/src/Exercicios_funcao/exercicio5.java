package Exercicios_funcao;

public class exercicio5 {
/*▪ Escreva um método para conversão de temperatura.
▪ Ela deve receber 2 argumentos:
▪ um número
▪ um caractere 'C', 'F' ou 'K', indicando que a temperatura está em Celsius, Fahrenheit ou Kelvin.
▪ A função deve exibir a temperatura nas 3 escalas.*/
	// Método para converter e exibir a temperatura nas 3 escalas
    public static void converterTemperatura(double temperatura, char escala) {
        double celsius, fahrenheit, kelvin;

        switch (escala) {
            case 'C':
                celsius = temperatura;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
                System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
                System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
                break;

            case 'F':
                fahrenheit = temperatura;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
                System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
                System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
                break;

            case 'K':
                kelvin = temperatura;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
                System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
                System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
                break;

            default:
                System.out.println("Escala inválida. Use 'C' para Celsius, 'F' para Fahrenheit ou 'K' para Kelvin.");
                break;
        }
    }
	public static void main(String[] args) {
		// Exemplos de conversão
        converterTemperatura(25, 'C');  // Temperatura em Celsius
        converterTemperatura(77, 'F');  // Temperatura em Fahrenheit
        converterTemperatura(298.15, 'K');  // Temperatura em Kelvin
        converterTemperatura(100, 'X');  // Escala inválida

	}

}
