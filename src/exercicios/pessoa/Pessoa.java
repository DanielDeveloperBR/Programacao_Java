package exercicios.pessoa;
/*Classe Pessoa: Crie uma classe que modele uma pessoa:
a. Atributos: nome, idade, peso e altura
b. Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que
nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5
cm. */

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa(){};

    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    //nome
    public void Setnome(String nome){
        this.nome = nome;
    }
    public String Getnome(){
        return nome;
    }
    //peso
    public void Setpeso(double peso){
        this.peso = peso;
    }
    public double Getpeso(){
        return peso;
    }
    //idade
    public void Getidade(int idade){
        this.idade = idade;
    }
    public int Setidade(){
        return idade;
    }
    //altura
    public void Setaltura(double altura){
        this.altura = altura;
    }
    public double Getaltura(){
        return altura;
    }

    public void Envelhercer(){
        idade++;
        if (idade < 21){
            Crescer(0.5);
        }
    }
    
    public void Engordar(double peso) {
      this.peso += peso;
    }
    public void Emagrecer(double peso) {
     this.peso += peso;
    }
    public void Crescer(double altura) {
       this.altura += altura;
    }

}

