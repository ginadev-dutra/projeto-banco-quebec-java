package main;

import models.*;

public class Main {

    public static void main(String[] args) {
        Cliente gina = new Cliente();
        gina.setNome("Gina");

        InterfaceConta cc = new ContaCorrente(gina);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(gina);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }


}
