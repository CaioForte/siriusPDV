package br.com.sirius.bean;

import br.com.sirius.object.Login;
import br.com.sirius.dao.LoginDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Caio Forte
 */
@SessionScoped
@ManagedBean
public class LoginBean {
    private static Login entrar = new Login();
    private String usuario;
    private String senha;
    
    public void logar(){
      entrar.setUsuario(usuario);
      entrar.setSenha(senha);
      
      
    } 

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
 
    public Login getEntrar() {
        return entrar;
    }
    public void setEntrar(Login entrar) {
        this.entrar = entrar;
    }
}
