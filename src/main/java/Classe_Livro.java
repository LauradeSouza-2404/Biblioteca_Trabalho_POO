public class Classe_Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
    
    public Classe_Livro(String isbn, String titulo, String autor, int ano){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }
    //Getter e Setter
    public String getIsbn(){
        return isbn;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    //Setter
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    
    
}



