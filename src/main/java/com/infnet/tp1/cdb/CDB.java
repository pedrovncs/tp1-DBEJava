package com.infnet.tp1.cdb;

import com.infnet.tp1.rendafixa.RendaFixa;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CDB extends RendaFixa {
    private final double taxaDeJuros = 1.2;
    private double valorInvestido;
    private int meses;

    public double aliquotaIR(int meses) {
        switch (meses) {
            case 6:
                return 0.225;
            case 12:
                return 0.2;
            case 24:
                return 0.175;
            case 36:
                return 0.15;
            default:
                return 0;
        }
    }

    public double calculaRendimento() {
        double aliquota = aliquotaIR(meses);
        double juros = taxaDeJuros * RendaFixa.selic;
        double rendimentoBruto = valorInvestido * Math.pow(1 + juros, this.meses);
        double rendimentoLiquido = rendimentoBruto - (rendimentoBruto * aliquota);
        return rendimentoLiquido;
    }


    public String getRendimento() {
        String rendFormat = String.format("%.2f", calculaRendimento());
        return "O rendimento do CDB é de R$:" + rendFormat;
    }
}
