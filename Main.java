package NivelIntermediario.ExercicioBancoKanoha;

import java.sql.SQLOutput;

public  class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(1000);


        cc.depositar(100);
        cc.consultarSaldo();

        System.out.println("========== Kanoha Conta Poupança ==========");
        cc.depositar(100);
        cp.consultarSaldo();
        System.out.println("...");
        System.out.println("Banco de Konoha Agradece!");


    }
}
