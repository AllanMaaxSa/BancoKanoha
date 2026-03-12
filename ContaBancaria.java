package NivelIntermediario.ExercicioBancoKanoha;

public abstract class ContaBancaria implements Conta{
    double saldo;
    TipoConta tipo;


    public ContaBancaria(double saldo,TipoConta tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Salto da conta: "+tipo+": R$ "+this.saldo);
    }

    @Override
    public abstract void depositar(double valor);




}
