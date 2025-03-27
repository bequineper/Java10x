package Level_Genin.Challenges;

import java.util.Queue;
import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {


        Scanner Input = new Scanner(System.in);

        int Opcao;

        int quantidade = 0;

        int Cadastros = 0;

        // Painel do serviço
        System.out.println("Qual serviço deseja?");
        System.out.println("[01] Cadastrar Ninja");
        System.out.println("[02] Ver Ninjas cadastrados");
        System.out.println("[03] Encerrar programa");

        int Painel = Input.nextInt();
        Opcao = Painel;

        if (Opcao == 1) {  // Condição para somente perguntar a quantidade se a opção for igual a 1
            System.out.print("Quantos ninjas quer cadastrar? ");
            quantidade = Input.nextInt();
        }

        String[] Nomes = new String[quantidade];
        int[] Idades = new int[quantidade];

        while (Opcao != 3) { // Loop para que o painel sempre apareça no final de cada ação


            switch (Opcao) {
                case 1:  // Caso 1 para cadastrar os ninjas
                    if (Cadastros == 0) {
                        while (Cadastros != quantidade) {
                            System.out.println("___________________");

                            System.out.print("Nome Do Ninja: ");
                            Nomes[Cadastros] = Input.next();

                            System.out.print("Idade Do Ninja " + Nomes[Cadastros] + ": ");
                            Idades[Cadastros] = Input.nextInt();

                            System.out.println("Ninja " + Nomes[Cadastros] + " Cadastrado com sucesso :)");
                            System.out.println("___________________");
                            Cadastros++;
                        }
                    }

                    // Repetindo o painel para pode selecionar novamente
                    System.out.println("Qual serviço deseja?");
                    System.out.println("[01] Cadastrar Ninja");
                    System.out.println("[02] Ver Ninjas cadastrados");
                    System.out.println("[03] Encerrar programa");

                    int Painel2 = Input.nextInt();
                    Opcao = Painel2;

                case 2:  // Caso 2 para mostrar a lista dos ninjas
                    if (Cadastros < 1) {  // Se caso não ouver cadastros essa mensagem será exibida
                        System.out.println("Nenhum Ninja Cadastrado");

                    } else { // Se ouver pelo menos um cadastro o loop ira iterar os itens e mostrá los
                        System.out.println("NINJAS CADASTRADOS");
                        System.out.println("_______________________________________________");
                        System.out.println("NOME     |     IDADE");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println(Nomes[i] + "         " +  Idades[i]);
                        }
                        System.out.println("_______________________________________________");
                    }
                    break;
            }

        }
        Input.close();
    }

}

