package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author Yukas
 */
@Entity
public class Adm implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String senha;
    private String login;
    
    public Adm(){
        
    }

    public Adm(Long id, String login,String nome, String senha){
       this.id = id;
       this.nome = nome;
       this.senha = senha;
       this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /*public static Adm obterAdm(String login) throws SQLException{
        Adm adm = AdmDAO.obterAdm(login);
        return adm;
    }*/  
    
}
