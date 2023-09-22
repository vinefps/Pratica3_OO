package br.com.questao1;

public class Camarote extends Ingresso{

    private double valorAdicional;
    private String localizacao;
    public Camarote(double valorAdicional, double valorIngresso, String localizacao){
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }
    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional(){
        return valorAdicional;
    }
    public String getLocalizacao(){
        return localizacao;
    }
    public void imprimeIngresso(){
        System.out.println("A localização e valor são: " +getLocalizacao() + getValorIngresso() + getValorAdicional())
        ;
    }
}
