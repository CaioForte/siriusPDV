package br.com.sirius.object;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Caio Forte
 */
public class Login  implements java.io.Serializable {


     private Integer id;
     private String usuario;
     private String senha;

    public Login() {
    }

    public Login(String usuario, String senha) {
       this.usuario = usuario;
       this.senha = senha;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}


