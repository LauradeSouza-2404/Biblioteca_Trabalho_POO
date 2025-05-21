import java.io.Serializable;
/*import java.io.Serializable;
*
 *
 * @author User
 */
public class Administrador implements Serializable {
    private static int proximoId = 1;
    private final int id;
    private String nome;
    private String email;
    private String cargo;
    
    
    /**
     *
     * @param nome
     * @param email
     * @param cargo
     * @param id
     * 
     */
    public Administrador(String nome, String email, String cargo, String id) {
        this.id = proximoId++;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        
    }
    
        //getters

    public String getId(String id) {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
         //setters

    public void setId(String id) {
        int idl;
        idl = this.id;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override//sobreescreve sobre o codigo
    public String toString() {
        return nome + " ID: " + id +
                ", Email: " + email + 
                ", Cargo: " + cargo;
    }
}