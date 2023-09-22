package br.com.questao1;

import br.com.questao1.Ingresso;

public class Normal extends Ingresso {
    public Normal(double valorIngresso){
        super(valorIngresso);
    }
    public void imprimeIngresso(){
        System.out.println("Valor é :" + getValorIngresso());
    }
}
