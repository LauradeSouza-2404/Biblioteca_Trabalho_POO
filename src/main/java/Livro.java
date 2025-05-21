/**
 *
 * @author User
 */
public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
    private boolean emprestado;

    /**
     *
     * @param isbn
     * @param titulo
     * @param autor
     * @param ano
     */
    public Livro (String isbn, String titulo, String autor, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
        this.emprestado = false;
    }
    //getters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
     //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     *
     * @return
     */
    public boolean isEmprestado() {
        return emprestado; 
    }
    
    public void setEmprestado(boolean emprestado) { 
        this.emprestado = emprestado; 
    }
     
    
    @Override//sobreescreve sobre o codigo
    public String toString() {
        return "ISBN: " + isbn + 
                ", Título: " + titulo + 
                ", Autor: " + autor + 
                ", Ano: " + ano + 
                ", Disponível: " + disponivel +
                ", Emprestado: " + emprestado;
    }
}