package Exercicios_funcaoRetorno;
import java.util.Scanner;
public class exercico4 {
	// Método para converter a temperatura e exibir as opções de escala
    public static void converterTemperatura(double temperatura, char escala) {
        double celsius, fahrenheit, kelvin;

        // Converte a temperatura para todas as escalas
        switch (escala) {
            case 'C':
                celsius = temperatura;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                break;
            case 'F':
                fahrenheit = temperatura;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                break;
            case 'K':
                kelvin = temperatura;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                break;
            default:
                System.out.println("Escala inválida. Use 'C' para Celsius, 'F' para Fahrenheit ou 'K' para Kelvin.");
                return;
        }

        // Pergunta ao usuário qual valor deseja retornar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a escala para exibir a temperatura (C para Celsius, F para Fahrenheit, K para Kelvin): ");
        char escolha = scanner.next().toUpperCase().charAt(0);

        // Exibe a temperatura na escala escolhida
        switch (escolha) {
            case 'C':
                System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
                break;
            case 'F':
                System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
                break;
            case 'K':
                System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
                break;
            default:
                System.out.println("Escala inválida. Use 'C', 'F' ou 'K'.");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
	public static void main(String[] args) {
		// Exemplo de uso do método
        converterTemperatura(25, 'C');  // Converte 25°C e pergunta ao usuário qual valor exibir

	}

}
