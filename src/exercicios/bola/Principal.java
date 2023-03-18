package exercicios.bola;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        try {
            String novaCor = " ";
            while(!novaCor.equals("")){
                //Entrada de dados
                novaCor = JOptionPane.showInputDialog("Qual a cor?");
                if (!novaCor.equals("")){
                 //Criação Objeto
              Bola bolinha = new Bola();
              bolinha.trocaCor(novaCor);
              bolinha.trocarCircunferencia(Double.parseDouble(JOptionPane.showInputDialog("Qual a circunferência?")));
              bolinha.trocarMaterial(JOptionPane.showInputDialog("Qual a material"));

                 // Saida de dados
           JOptionPane.showMessageDialog(null, ""
           +"Cor: " + bolinha.mostrarCor()+"\n"
           +"Circunferência " + bolinha.mostrarCircunferencia() + "\n"
            + "Material: " + bolinha.mostrarMaterial() + "\n");
        }
    }
        
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
       }
    
    }
}