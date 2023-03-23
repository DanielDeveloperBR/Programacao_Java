/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author 169127512022.5
 */
public class Principal {

    public static void main(String[] args) {

        try {
            // int valor = 3;
            // if (valor % 2 == 0){
            // System.out.print("Par");
            // }else{
            // System.err.print("Impar");
            // }
            Scanner sc = new Scanner(System.in);
            Numero numero = new Numero();
            // numero.valor = 4;

            System.out.print("Digite um número:");
            numero.valor = sc.nextInt();
            System.out.println(numero.parImpar());
            // System.out.println(numero.parImpar( 2));

            System.out.print("Digite o primeiro valor:");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo valor:");
            int num2 = sc.nextInt();

            System.out.println(numero.maiorValor(num1, num2));

            System.out.print("Digite o primeiro valor: ");
            int valor1 = sc.nextInt();
            System.out.print("Digite o segundo valor: ");
            int valor2 = sc.nextInt();
            System.out.print("Digite o terceiro valor: ");
            int valor3 = sc.nextInt();

            System.out.print(numero.ordenarCrescente(valor1, valor2, valor3));

            numero.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número?"));
            JOptionPane.showMessageDialog(null, "O número é " + numero.parImpar());

        } catch (Exception ex) {
            // Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número?"));
            // JOptionPane.showMessageDialog(null, "Digite apenas números!!");
        }

    }

}
