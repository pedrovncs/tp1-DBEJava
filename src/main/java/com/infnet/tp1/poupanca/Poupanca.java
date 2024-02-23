package com.infnet.tp1.poupanca;

import com.infnet.tp1.rendafixa.RendaFixa;
import lombok.Getter;

@Getter
public class Poupanca extends RendaFixa{
    private final double taxaDeJuros;
    private double valorInvestido;
    private int meses;

    public Poupanca(double valorInvestido, int meses){
        if(RendaFixa.selic < 8.5) {
            this.taxaDeJuros = 0.005;
        } else {
            this.taxaDeJuros = 0.7 * RendaFixa.selic;
        }
        this.valorInvestido = valorInvestido;
        this.meses = meses;
    }

    public double calcularRendimento(){
        double rendimento = this.valorInvestido * Math.pow((1 + this.taxaDeJuros), this.meses);
        return rendimento;
    }

    public String getRendimento() {
        String rendFormat = String.format("%.2f", calcularRendimento());
        return "O rendimento da Poupança é de R$:" + rendFormat;
    }

}
