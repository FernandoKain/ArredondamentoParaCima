//Jogo High or Low - Mais alto ou mais baixo.
// Adivinhar um n�mero entre 0 a 100.
// Para alterar a dificuldade do jogo basta alterar a multiplica��o *100 na linha 13. Have Fun!!!
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = ""; 
		
		do {
		
		int theNumber = (int)(Math.random()*100+1); // Criar um N�MERO ALEAT�RIO para o usu�rio tentar adivinhar.
		System.out.println(theNumber); // Imprime na tela o n�mero criado.
		
		int guess = 0; // Cria uma vari�vel para o palpite do usu�rio e atribui o valor 0.

		while (guess != theNumber) { // Enquanto o palpite for diferente no N�MERO ALEAT�RIO criado.
			System.out.println("Palpite um n�mero entre 1 e 100:"); // Imprima a mensagem 
			guess = scan.nextInt(); // Solicita uma entrada do usu�rio
			
			if (guess < theNumber) // Se a entrada do palpite do usu�rio for menor do que o N�MERO ALEAT�RIO CRIADO.
				System.out.println("Voc� palpitou " + guess + ". E foi muito baixo. Tente de novo!");
			else if (guess > theNumber) // Caso contr�rio, se o palpite do usu�rio for maior que N�MERO ALEAT�RIO CRIADO.
				System.out.println("Voc� palpitou " + guess + ". E foi muito alto. Tente de novo!");	
			else //Caso contr�rio imprime na tela que o jogador venceu.
				System.out.println("Correto!!! Seu palpite de " + guess + " foi correto! Voc� venceu!!!");	
		}
		
		System.out.println("Gostaria de jogar novamente (y/n)?"); // Imprime uma solicita��o de decis�o do usu�rio 
		playAgain = scan.next(); // Colhe a resposta do usu�rio.
		
		} while (playAgain.equalsIgnoreCase("y")); // Verifica se o usu�rio quer continuar jogando se o usu�rio digitar "y".
		
		System.out.println("Obrigado por jogar!!! At� mais!"); // Caso n�o presione "y", despede-se do usu�rio.
		scan.close(); // Fecha o scan para parar de consumir mem�ria.
		// Fim do programa

	}

}
