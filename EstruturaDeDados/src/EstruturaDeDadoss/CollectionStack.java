package EstruturaDeDadoss;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

public class CollectionStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<String> pilhaLivros = new Stack<>();

        String mensagem = """
                -----------------------------
                1 - Adicionar Livro na Pilha
                2 - Listar todos os Livros
                3 - Retirar Livro da Pilha
                0 - Sair
                -----------------------------
                Escolha a opção desejada: 
                """;

        boolean ficarNoLoop = true;

        while(ficarNoLoop) {
            System.out.println(mensagem);
            int escolhaDoCliente = scan.nextInt();
            scan.nextLine();

            switch (escolhaDoCliente) {
                case 1:
                    System.out.println("Digite o Nome do Livro: ");
                    pilhaLivros.push(scan.nextLine());
                    System.out.println("Livro Adicionado!");
                    break;

                case 2:
                    System.out.println("Lista de Livros Cadastrados: ");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    break;

                case 3:
                    pilhaLivros.pop();
                    System.out.println("Pilha: ");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    System.out.println("Um Livro Foi Removido da Pilha!");
                    break;

                case 0:
                    System.out.println("Programa finalizado!");
                    ficarNoLoop = false;
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        scan.close();
    }
}
