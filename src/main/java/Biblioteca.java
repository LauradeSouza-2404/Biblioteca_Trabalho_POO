import java.util.ArrayList;
/**
 *
 * @author User
 */
public final class Biblioteca {
    private final ArrayList<Livro> livros = new ArrayList<>();
    private final ArrayList<Usuario> usuarios = new ArrayList<>();
    private final ArrayList<Administrador> administradores = new ArrayList<>();

    //cadastro dos livros
    /**
     *
     * @param livro
     */
    public void cadastrarLivro(Livro livro) {
        if (buscarLivroPorIsbn(livro.getIsbn()) == null) {
            livros.add(livro);
            System.out.println("Livro cadastrado com sucesso!.");
        } else {
            System.out.println("Erro: ISBN já cadastrado!.");
        }
    }
     //cadastro dos adm
    public void cadastrarAdministradores(Administrador adm) {
        administradores.add(adm);
        System.out.println("Administrador cadastrado com sucesso!.");
    }
          //cadastro dos usuarios

    public void cadastrarUsuarios(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!.");
    }
    //emprestimos dos livros
    public void emprestarLivros(String isbn, int idUsuario) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario;
        usuario = buscarUsuarioPorId(idUsuario);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
        } else if (usuario == null) {
            System.out.println("Usuário não encontrado!.");
        } else if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível.");
        } else {
            livro.setDisponivel(false);
            livro.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso.");
        }
    }
     //devolução dos livros
    public void devolverLivro(String isbn) {
        Livro livro = buscarLivroPorIsbn(isbn);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
        } else if (livro.isDisponivel()) {
            System.out.println("Este livro já está disponível.");
        } else {
            livro.setDisponivel(true);
            livro.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso!");
        }
    }

    /**
     *
     */
    public void relatorioEmprestimos() {
        long totalEmprestados;
        totalEmprestados = livros.stream().filter(Livro ::isEmprestado).count();
        System.out.println("Total de livros emprestados: " + totalEmprestados);
    }
    //faz a busca dos libros por isbn
    private Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) return livro;
        }
        return null;
    }
    //busca por usuario por id
    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id);
            return usuario;
        }
        
        return null;
    }
     //listagens dos livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) System.out.println(livro);
        }
    }
     //listagens dos usuarios
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario u : usuarios) System.out.println(u);
        }
    }
     //lostagem dos adm
    public void listarAdministradores() {
        if (administradores.isEmpty()) {
            System.out.println("Nenhum administrador cadastrado.");
        } else {
            for (Administrador a : administradores) System.out.println(a);
        }
   
    }
        
}