public class Classe_Usuario {
    private int id;
    private String nome;
    private String email;
    
    public Classe_Usuario(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    //Getter
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    //Setter
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
}
