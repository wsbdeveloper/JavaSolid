package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {
    private List<ValidacaoReajuste> validacoes;
    public ReajusteService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }

    public void reajustarSalarioFuncionario(Funcionario fun, BigDecimal aumento){
        this.validacoes.forEach(v -> v.validar(fun, aumento));

        BigDecimal salarioReajustado = fun.getSalario().add(aumento);
        fun.atualizarSalario(salarioReajustado);
    }
}
