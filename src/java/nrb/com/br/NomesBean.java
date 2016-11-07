
package nrb.com.br;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped//o tempo em que a sessao ficara em memória
@ManagedBean
public class NomesBean {
    private String nome;
    private String sobrenome;
    private String mensagem;
    
    public void dizerOla(){
        mensagem = "Bem vindo "+nome+" "+sobrenome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
