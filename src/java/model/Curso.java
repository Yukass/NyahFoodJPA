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
public class Curso implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer cargaHorario;
    private String tipoCurso;
    private Integer totalPeriodos;
    @ManyToOne
    private Professor cordenador;
    
    public Curso(){
        
    }

    public Curso(String nome, Integer cargaHorario, String tipoCurso, Integer totalPeriodos, Professor cordenador) {
        
        this.nome = nome;
        this.cargaHorario = cargaHorario;
        this.tipoCurso = tipoCurso;
        this.totalPeriodos = totalPeriodos;
        this.cordenador = cordenador;
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

    public Integer getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(Integer cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Integer getTotalPeriodos() {
        return totalPeriodos;
    }

    public void setTotalPeriodos(Integer totalPeriodos) {
        this.totalPeriodos = totalPeriodos;
    }

    public Professor getCordenador() {
        return cordenador;
    }

    public void setCordenador(Professor cordenador) {
        this.cordenador = cordenador;
    }
    
    
    
}
