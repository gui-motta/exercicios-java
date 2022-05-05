/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class teste2 {
    public static void main (String[]args){
        int op;
        double n1, n2;
        Scanner entrada = new Scanner(System.in);
        while(true){
           System.out.println("Digite a opção:");
           op = entrada.nextInt();
            if(op==5){
                break;
            }
            if(op<1 || op>4){
                System.out.println("OPÇÃO INVALIDA");
                continue;
            }
        
            System.out.println("Digite dois Números:");
            n1 = entrada.nextFloat();
            n2 = entrada.nextFloat();
            switch(op){
            
            case 1:
                double media;
                media = (n1+n2)/2;
                System.out.println("Média:"+media);
                break;
                
            case 2:
                double difere;
                difere = n1-n2;
                if (difere<0){
                    difere = difere*(-1);
                }
                System.out.println("Diferença do Maior pelo Menor:"+difere);
                break;
                
            case 3:
                System.out.println("Multiplicação:"+(n1*n2));
                break;
            
            case 4:
                if(n2==0){
                    System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                    break;
                }
                System.out.println(n1/n2);
                break;
                
        }
      }
    }
}
