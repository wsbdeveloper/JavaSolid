package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario fun, boolean metaBatida){
        Cargo cargoAtual = fun.getCargo();

        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Funcionário não pode ser promovido cago de gerencia!");
        }

        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            fun.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta!");
        }
    }
}
