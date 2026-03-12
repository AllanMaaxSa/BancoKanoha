package NivelIntermediario.ExercicioBancoKanoha;

public class ContaPoupanca extends ContaBancaria{


    //TODO CONSTRUTOR BASE DA SUPERCLASS = ContaBancaria
    public ContaPoupanca(double saldo){
        super(saldo,TipoConta.POUPANCA);
    }




    public void depositar(double valor) {
        double taxa = valor * 0.01;
        double valorFinal = valor - taxa;
        this.saldo = saldo + valorFinal;

        System.out.println("Depósito: " + valor+ " taxa: R$ \"+taxa+\" deposito realizado na poupança");


    }
}
