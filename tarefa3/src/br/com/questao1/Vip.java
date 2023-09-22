package br.com.questao1;

public class Vip extends Normal {

    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional){
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional(){
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }
    public void showValorInicial(){
        System.out.println("Ingresso Vip valor: " + getValorIngresso() + getValorAdicional());
    }
}
