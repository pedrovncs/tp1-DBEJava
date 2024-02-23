package com.infnet.tp1.rendafixa;

public abstract class RendaFixa {
    public static double selic;
    public static void setSelic(double selic) {
        RendaFixa.selic = selic / 100;
    }
    public abstract String getRendimento();

}
