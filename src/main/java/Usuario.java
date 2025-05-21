/**
 *
 * @author User
 */
public class Usuario {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private String email;

    /**
     *
     * @param nome
     * @param email
     * @param id
     */
    public Usuario(String nome, String email, String id) {
        this.id = proximoId++;
        this.nome = nome;
        this.email = email;
       
    }
        //getters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
         //setters

   public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override//sobreescreve sobre o codigo
    public String toString() {
        return "ID: " + id +
                ", Nome: " + nome +
                ", Email: " + email;
    }
}