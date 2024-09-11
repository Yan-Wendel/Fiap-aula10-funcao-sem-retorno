package Exercicios_funcaoRetorno;

public class exercicio3 {
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
		

	}

}
