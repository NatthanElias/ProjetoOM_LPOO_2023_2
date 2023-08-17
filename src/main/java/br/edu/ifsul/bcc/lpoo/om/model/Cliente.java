package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@DiscriminatorValue("C")
public class Cliente extends Pessoa{
    @Column(nullable = false, length = 200)
    private String observacoes;

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
