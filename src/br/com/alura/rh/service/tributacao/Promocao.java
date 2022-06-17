package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste, ReajusteTributavel {
    private BigDecimal valor;
    private LocalDate data;

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

    @Override
    public BigDecimal valorImpostoRenda() {
        // Não cobrança de imposto
        return BigDecimal.ZERO;
    }
}
