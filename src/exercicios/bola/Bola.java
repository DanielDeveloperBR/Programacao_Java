package exercicios.bola;

public class Bola {
    public String cor;
    public double circunferencia;
    public String material;

    public void trocaCor(String cor){
        if (!cor.equals("")){
            this.cor = cor;
        }
      
    }
    public String mostrarCor(){
        return cor;
    }
    public void trocarCircunferencia(double circunferencia){
       if (circunferencia >= 0){
           this.circunferencia = circunferencia;
    }
    
    }
    public double mostrarCircunferencia(){
        return circunferencia;
    }

    public void trocarMaterial(String material){
    this.material = material;
    }
    public String mostrarMaterial(){
    return material;
    }
}

