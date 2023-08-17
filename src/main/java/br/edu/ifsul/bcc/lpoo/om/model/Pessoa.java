package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
public abstract class Pessoa {

    @Id
    private String cpf;
    @Column(nullable = false, length = 11)
    private String nome;
    @Column(nullable = false, length = 6)
    private String senha;
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_nascimento;
    @Column(nullable = true, length = 8)
    private String cep;
    @Column(nullable = false,  length = 100)
    private String complemento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
