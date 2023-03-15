/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basejava;

/**
 *
 * @author 169127512022.5
 */
public class Principal {

    
    public static void main(String[] args) {
       
    //   int valor = 3;
     //  if (valor % 2 == 0){
    //       System.out.print("Par");
    //  }else{
   //        System.err.print("Impar");
  //     }
       Numero numero = new Numero();
        numero.valor = 4;
        System.out.println(numero.parImpar( 2));

        System.out.println(numero.maiorValor(6, 8));
        System.out.print(numero.ordenarCrescente(3,2,1));
        
    }
    

    
}
   