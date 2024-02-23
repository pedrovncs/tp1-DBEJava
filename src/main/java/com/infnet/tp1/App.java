package com.infnet.tp1;

import com.infnet.tp1.cdb.CDB;
import com.infnet.tp1.poupanca.Poupanca;
import com.infnet.tp1.rendafixa.RendaFixa;

import java.util.Scanner;

import static com.infnet.tp1.utils.utils.lerDouble;
import static com.infnet.tp1.utils.utils.lerInt;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("VOCE ESTA NA BRANCH DE TESTES");
        System.out.println("Qual o valor da taxa Selic?");
        double selic = lerDouble(scanner);
        RendaFixa.setSelic(selic);

        while (true){
            System.out.println("Qual o valor inicial de investimento?");
            double valorInvestido = lerDouble(scanner);
            System.out.println("Qual o prazo do investimento em meses?");
            int meses = lerInt(scanner);
            System.out.println("Escolha o tipo de investimento: 1 - Poupança, 2 - CDB");
            int tipo = lerInt(scanner);
            switch (tipo){
                case 1:
                    RendaFixa poupanca = new Poupanca(valorInvestido, meses);
                    System.out.println(poupanca.getRendimento());
                    break;
                case 2:
                    RendaFixa cdb = new CDB(valorInvestido, meses);
                    System.out.println(cdb.getRendimento());
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Deseja realizar outro investimento? 1 - Sim, 2 - Não");
            int opcao = lerInt(scanner);
            if(opcao == 2){
                break;
            }
        }
    }
}
