package Exercicios_funcao;
import java.util.Scanner;
public class exercicio3 {
/*▪ Faça um método que receba como parâmetro a idade de uma pessoa.
▪ A função deve exibir se o voto da pessoa é:
▪ Obrigatório
▪ Proibido
▪ Opcionals*/
	 // Método para verificar o tipo de voto com base na idade
    public static void verificarVoto(int idade) {
        if (idade < 16) {
            System.out.println("Voto proibido.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto opcional.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else if (idade > 70 && idade <= 80) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto proibido.");
        }
    }
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite a idade. ");
		int idade = ler.nextInt();
		verificarVoto(idade);
		

	}

}
