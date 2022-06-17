package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {
    private BigDecimal valor;
    private LocalDate data;

    public  Anuenio(BigDecimal valor){
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public  BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

    @Override
    public BigDecimal valorImpostoRenda() {
        // 10% de reajuste
        return valor.multiply(new BigDecimal("0.1"));
    }


}
