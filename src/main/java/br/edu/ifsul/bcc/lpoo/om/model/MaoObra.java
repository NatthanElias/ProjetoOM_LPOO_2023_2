package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "tb_maoobra")
public class MaoObra implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_maoobra", sequenceName = "seq_maoobra_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_maoobra", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String descricao;
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date tempo_estimado_execucao;
    @Column(nullable = false)
    private Float valor;

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

    public Date getTempo_estimado_execucao() {
        return tempo_estimado_execucao;
    }

    public void setTempo_estimado_execucao(Date tempo_estimado_execucao) {
        this.tempo_estimado_execucao = tempo_estimado_execucao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}