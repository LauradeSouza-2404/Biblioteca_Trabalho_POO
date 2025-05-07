public class Classe_Administrador {
    //(ID, nome, email, cargo)
    private int id;
    private String nome;
    private String email;
    private String cargo;
    
    public Classe_Administrador(int id, String nome, String email, String cargo){
        this.id = id;
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
}
