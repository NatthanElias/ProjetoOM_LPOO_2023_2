package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_equipe")
public class Equipe implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_equipe", sequenceName = "seq_equipe_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_equipe", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 100)
    private String especialidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
