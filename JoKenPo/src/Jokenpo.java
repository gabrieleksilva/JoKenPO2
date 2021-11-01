import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {
        System.out.println("(1) pedra, (2) papel ou  (3) tesoura?");

        int pontuacaoUser = 0;
        int pontuacaoMaquina = 0;

        int cont = 0;
        while (cont < 5){
            cont++;

            System.out.println(pontuacaoUser);
            System.out.println(pontuacaoMaquina);

            System.out.println("Partida "+ (cont));
            Scanner scan = new Scanner(System.in);
            System.out.println("Sua escolha: \n ");
            int inputUser = scan.nextInt();

            if(inputUser > 3 || inputUser < 1){
                System.out.println("Faça a escolha correta! 1, 2, 3. Ponto para a Máquina.");
                pontuacaoMaquina++;
                continue;
            }
            String escolhaUsuario = "";
            switch (inputUser){
                case (1):
                    escolhaUsuario = "pedra";
                    break;
                case (2):
                    escolhaUsuario = "papel";
                    break;
                case (3):
                    escolhaUsuario = "tesoura";
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
            Random random = new Random();
            int inputMaquina = random.nextInt(3) + 1; // soma mais um para incluir o 3.
            String escolhaMaquina = ""; // reservar um espaço na memória

            switch (inputMaquina){
                case (1):
                    escolhaMaquina = "pedra";
                    break;
                case (2):
                    escolhaMaquina = "papel";
                    break;
                case (3):
                    escolhaMaquina = "tesoura";
                    break;
                default:
                    System.out.println("Valor inválido!");
            }

            int game = inputUser - inputMaquina;

            if (game == 0){
                System.out.println(escolhaUsuario + " vs " + escolhaMaquina + ": Empate");
            } else if(game == -1 || game == 2){
                System.out.println(escolhaUsuario + " vs " + escolhaMaquina + ": Maquina");
                pontuacaoMaquina++;
            } else{
                System.out.println(escolhaUsuario + " vs " + escolhaMaquina + ": Usuario");
                pontuacaoUser++;
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Pontuacao Total: User "+ pontuacaoUser+ " vs maquina = "+ pontuacaoMaquina);

        if (pontuacaoMaquina > pontuacaoUser) System.out.println("Vencedor = Maquina ");
        else if (pontuacaoMaquina < pontuacaoUser) System.out.println("Vencedor: Usuario ");
        else System.out.println("Empate");
    }
}
