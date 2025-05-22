import java.util.Scanner;

public class ProjetoBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Cadastrar administrador");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Listar livros");
            System.out.println("7 - Listar usuários");
            System.out.println("8 - Listar administradores");
            System.out.println("9 - Relatório de Livros Emprestados");
            System.out.println("0 - Sair");
            System.out.print("O que deseja?: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = Integer.parseInt(scanner.nextLine());
                    biblioteca.cadastrarLivro(new Livro(isbn, titulo, autor, ano));
                }
                case 2 -> {
                    System.out.print("Nome: ");
                    String nomeU = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailU = scanner.nextLine();
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    biblioteca.cadastrarUsuarios(new Usuario(nomeU, emailU, id));
                }
                case 3 -> {
                    System.out.print("Nome: ");
                    String nomeA = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailA = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    biblioteca.cadastrarAdministradores(new Administrador(nomeA, emailA, cargo, id));
                }
                case 4 -> {
                    System.out.print("ISBN do livro: ");
                    String isbnEmp = scanner.nextLine();
                    System.out.print("ID do usuário: ");
                    int idEmp = Integer.parseInt(scanner.nextLine());
                    biblioteca.emprestarLivros(isbnEmp, idEmp);
                }
                case 5 -> {
                    System.out.print("ISBN do livro a ser devolvido: ");
                    String isbnDevolucao = scanner.nextLine();
                    biblioteca.devolverLivro(isbnDevolucao);
                }
                case 6 -> biblioteca.listarLivros();
                case 7 -> biblioteca.listarUsuarios();
                case 8 -> biblioteca.listarAdministradores();
                case 9 -> biblioteca.relatorioEmprestimos();
                case 0 -> {
                    System.out.println("Saindo...");
                    break;
                }
                default -> System.out.println("Opção inválida!");
            }

            if (opcao == 0) break;
        }

        scanner.close();
    }
}
