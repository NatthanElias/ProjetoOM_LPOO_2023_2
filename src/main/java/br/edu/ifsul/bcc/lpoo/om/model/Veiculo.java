package br.edu.ifsul.bcc.lpoo.om.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {
    @Id
    private String placa;
    @Column(nullable = false, length = 50)
    private String modelo;
    @Column(nullable = false)
    private Integer ano;
    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_ultimo_servico;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Calendar getData_ultimo_servico() {
        return data_ultimo_servico;
    }

    public void setData_ultimo_servico(Calendar data_ultimo_servico) {
        this.data_ultimo_servico = data_ultimo_servico;
    }
}
