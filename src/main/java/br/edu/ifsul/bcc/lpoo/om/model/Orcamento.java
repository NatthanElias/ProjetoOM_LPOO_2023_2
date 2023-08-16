package br.edu.ifsul.bcc.lpoo.om.model;

import java.util.Calendar;

public class Orcamento {

    private Integer id;
    private String obervacoes;
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
