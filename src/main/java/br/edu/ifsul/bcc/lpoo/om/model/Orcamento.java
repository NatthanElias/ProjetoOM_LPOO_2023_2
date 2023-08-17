package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_orcamento")
public class Orcamento {
    @Id
    @SequenceGenerator(name = "seq_orcamento", sequenceName = "seq_orcamento_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_orcamento", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = false, length = 200)
    private String obervacoes;
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObervacoes() {
        return obervacoes;
    }

    public void setObervacoes(String obervacoes) {
        this.obervacoes = obervacoes;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

}
