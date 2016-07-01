package br.com.sirius.bean;

import br.com.sirius.object.Login;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Caio Forte
 */
@SessionScoped
@ManagedBean
public class LoginBean {
    private  Login entrar = new Login();
 
    
    public void logar(){
  
      
      
    } 
    public Login getEntrar() {
        return entrar;
    }
    public void setEntrar(Login entrar) {
        this.entrar = entrar;
    }
}
