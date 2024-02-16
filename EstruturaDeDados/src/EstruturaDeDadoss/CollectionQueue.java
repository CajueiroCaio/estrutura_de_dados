package EstruturaDeDadoss;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue<String> filaDeEspera = new LinkedList<>();

        boolean entradaLoop = true;

        String mensagem = """
                ------------------------------
                1 - Adicionar Cliente na Fila
                2 - Listar todos os Clientes
                3 - Retirar Cliente da Fila
                0 - Sair
                ------------------------------
                Entre com a opção desejada:
                """;

        while(entradaLoop) {
            System.out.println(mensagem);
            int escolhaCliente = scan.nextInt();
            scan.nextLine();

            switch (escolhaCliente) {
                case 1:
                    System.out.println("Digite o nome: ");
                    filaDeEspera.add(scan.nextLine());
                    System.out.println("Cliente Adicionado!");
                    break;

                case 2:
                    System.out.println("Lista de clientes na fila: ");
                    for (String lista : filaDeEspera) {
                        System.out.println(lista);
                    }
                    break;

                case 3:
                    System.out.println("Fila: ");
                    filaDeEspera.poll();
                    for (String lista : filaDeEspera) {
                        System.out.println(lista);
                    }
                    System.out.println("O cliente foi chamado!");
                    break;

                case 0:
                    System.out.println("Programa finalizado!");
                    entradaLoop = false;
                    break;

                default:
                    System.out.println("Opção Inválida");

            }
        }
        scan.close();
    }
}