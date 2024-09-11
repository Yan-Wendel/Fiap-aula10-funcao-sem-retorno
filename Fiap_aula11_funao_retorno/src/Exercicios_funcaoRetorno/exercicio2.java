package Exercicios_funcaoRetorno;

public class exercicio2 {
/*▪ Faça um método que receba como parâmetro a idade de uma pessoa.
▪ A função deve retornar a string se o voto da pessoa é:
▪ Obrigatório
▪ Proibido
▪ Opcional*/
	 // Método para determinar o tipo de voto com base na idade
    public static String verificarVoto(int idade) {
        if (idade < 16) {
            return "Voto proibido";
        } else if (idade >= 16 && idade < 18) {
            return "Voto opcional";
        } else if (idade >= 18 && idade <= 70) {
            return "Voto obrigatório";
        } else if (idade > 70) {
            return "Voto opcional";
        } else {
            return "Idade inválida";
        }
    }
	public static void main(String[] args) {
		

	}

}
