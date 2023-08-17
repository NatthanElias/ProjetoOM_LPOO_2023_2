package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_peca")
public class Peca implements Serializable {
    @SequenceGenerator(name = "seq_peca", sequenceName = "seq_peca_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_peca", strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false)
    private Float valor;
    @Column(nullable = false, length = 100)
    private String fornecedor;

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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
