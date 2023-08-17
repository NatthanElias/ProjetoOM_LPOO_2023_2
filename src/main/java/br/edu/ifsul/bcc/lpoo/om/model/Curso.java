package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = "tb_curso")
public class Curso {
    @SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_curso", strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    private String descricao;
    private Calendar dt_conclusao;
    private Integer cargahoraria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDt_conclusao() {
        return dt_conclusao;
    }

    public void setDt_conclusao(Calendar dt_conclusao) {
        this.dt_conclusao = dt_conclusao;
    }

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
}
