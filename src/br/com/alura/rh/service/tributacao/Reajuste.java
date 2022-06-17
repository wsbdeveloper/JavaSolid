package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

interface Reajuste {
    BigDecimal valor();
    LocalDate data();
}