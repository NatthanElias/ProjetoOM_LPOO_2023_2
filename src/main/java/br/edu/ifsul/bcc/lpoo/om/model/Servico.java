package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Calendar;

/**
 *
 * @author 20221PF.CC0015
 */
public class Servico {

    private Integer  id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public Servico() {
        
    }

}
