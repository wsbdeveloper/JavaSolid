package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReajusteService {
    public void reajustarSalarioFuncionario(Funcionario fun, BigDecimal aumento){




        BigDecimal salarioReajustado = salarioAtual.add(salarioAtual);
        fun.atualizarSalario(salarioReajustado);
    }
}
