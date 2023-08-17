package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_cargo")
public class Cargo implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_cargo", sequenceName = "seq_cargo_id", allocationSize = 1)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String descricao;

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
}
