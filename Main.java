package Atividade3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        
        int nmr1, nmr2;

        System.out.println("Digite o primeiro número: ");
        nmr1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        nmr2 = sc.nextInt();
        
        int soma = nmr1 + nmr2;

        System.out.println(nmr1 + "+"  + nmr2 + "=" + soma);

        sc.close();

    }

}