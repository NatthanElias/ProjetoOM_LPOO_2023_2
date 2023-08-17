package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.util.Calendar;

@DiscriminatorValue("F")
public class Funcionario extends Pessoa{
    @Column(nullable = false, length = 10)
    private String numero_ctps;
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_admissao;
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_demissao;

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Calendar data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Calendar getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Calendar data_demissao) {
        this.data_demissao = data_demissao;
    }
}
