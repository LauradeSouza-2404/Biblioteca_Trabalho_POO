public class Classe_Administrador {
    //(ID, nome, email, cargo)
    private static int proximoId= 1;
    private int id;
    private String nome;
    private String email;
    private String cargo;
    
    public Classe_Administrador(int id, String nome, String email, String cargo){
        this.id = proximoId++;
        this.nome  = nome;
        this.email = email;
        this.cargo = cargo;
    }
    public int getID(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
   public String getCargo(){
       return cargo;
   }
   public void setId(int novoId){
       this.id = novoId;
   }
   public void setNome(String novoNome){
       this.nome = novoNome;
    }
   public void setCargo(String novoCargo){
       this.cargo = novoCargo;
   }
}
