package exercicios.conta;

/*Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. A classe
deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. Os
métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional,
com valor default zero e os demais atributos são obrigatórios. */
public class Conta {
    private String nome;
    private String numeroCorrente;
    private double saldo;

    public void Setnome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        }
    }

    public String Getnome() {
        return nome;
    }
    public void SetnumeroCorrente(String numeroCorrente){
        this.numeroCorrente = numeroCorrente;
    }
    public String GetnumeroCorrente(){
        return numeroCorrente;
    }

    public void ContaCorrente(String numeroCorrente, String nome) {
        this.numeroCorrente = numeroCorrente;
        this.nome = nome;
        this.numeroCorrente = nome;
        this.saldo = 0;
    }
    
    public void Setsaldo(double valor) {
        this.saldo = valor;
    }
    public double Getsaldo(){
        return saldo;
    }

    public void Deposito(double valor){
       this.saldo = valor;
    }
    public void Saque(double valor){
        if (saldo >= valor) {
            this.saldo -= valor;
        }
    }

}
