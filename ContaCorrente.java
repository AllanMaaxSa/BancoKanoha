package NivelIntermediario.ExercicioBancoKanoha;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo){
        super(saldo,TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
        System.out.println("Você depositou: R$ " + valor+ " na sua conta");
    }



}
