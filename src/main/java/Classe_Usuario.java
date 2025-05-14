public class Classe_Usuario {
    private static int proximoId= 1;
    private int id;
    private String nome;
    private String email;
    
    public Classe_Usuario(int id, String nome, String email){
        this.id = proximoId++;
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
    public void setId(int novoId){
        this.id = novoId;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }
    
   
}
