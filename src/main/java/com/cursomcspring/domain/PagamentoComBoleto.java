package com.cursomcspring.domain;

import com.cursomcspring.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento{
    //Serializable na subclasse só necessita dá linha de versão abaixo
    private static final long serialVersionUID = 1L;


    private Date dataVencimento;
    private Date dataPagamento;

    public PagamentoComBoleto() {
    }

    //Como PagamentoComBoleto é uma subclasse -> gerar argumentos com super classe
    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    //Não precisa de hashcode e equals por ser uma subclasse, o mesmo se encontra na classe Pagamento
}
