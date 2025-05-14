public class Classe_Livro {
    private static int proximoIsbn =1;
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean isdisponivel;
    
    public Classe_Livro(int isbn, String titulo, String autor, int ano){
        this.isbn = proximoIsbn++;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isdisponivel = true;
    }
    //Getter e Setter
    //public int getIsbn(){return this.isbn;}
    public int getIsbn(){
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
    public boolean getisDisponivel(){
        return isdisponivel;
    }
    //Setter
    
    //public void set
//    public void setIsbn(int isbn){
        //this.isbn = isbn;
   // }
    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }
    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
    public void setAno(int novoAno){
        this.ano = novoAno;
    }
    public void setDisponivel(boolean disponivel){
        this.isdisponivel = disponivel;
    }
    
   public void Classe_Livro(){
       System.out.println("Nome do livro" + this.titulo +  "ISBN" + this.isbn + "Autor" + this.autor +"Ano" + this.ano);
   }
}



