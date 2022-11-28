/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teste.testeanimais;

import java.util.Scanner;

public class TesteAnimais {

    public static void main(String[] args) {
        Scanner ler = new Scanner ( System.in);
       
        int distBob, distRex;

        System.out.print("Informe onde esta o gato, Oli: ");
        int oli = ler.nextInt();
        System.out.print("Onde está o cão Rex? ");
        int rex = ler.nextInt();
        System.out.print("Onde está o cão Bob? ");
        int bob = ler.nextInt();
       
        if (oli<0 || rex<0 || bob<0) {
            System.out.print("Por favor, digite apenas números positivos\n");
        }else{

            distBob = oli-bob;
            distRex = oli-rex;

           /*
            System.out.println("oli " +oli);
            System.out.println("rex " +rex);
            System.out.println("bob " +bob);
            System.out.println("dist bob " +distBob);
            System.out.println("dist rex " +distRex);
            */

            if (distBob<0) {
                distBob = distBob*(-1);
            }
            if (distRex<0) {
                distRex = distRex*(-1);
            }

            if (distBob==distRex) {
                System.out.print("Rex e Bob chegaram ao mesmo tempo, Oli conseguiu fugir\n");
            }else if (distBob>distRex) {
                System.out.print("Rex chegou primeiro\n");

            }else  {
                System.out.println("Bob chegou primeiro\n");
            }
        }

    }
}
