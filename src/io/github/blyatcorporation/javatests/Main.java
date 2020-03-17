package io.github.blyatcorporation.javatests;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int nombreAnnees=0, i=0;
        double tauxInteret=0., capitalInitial=0., capitalFinal=0.;
        
        System.out.println("Quel est le montant du capital à placer (en €) ?");
        Scanner clavier = new Scanner(System.in);
        capitalInitial = clavier.nextDouble();
        System.out.println("Combien d'années le capital va-t-il être placé ?");
        nombreAnnees = clavier.nextInt();
        System.out.println("Quel est le taux d'intérêt du placement ?");
        tauxInteret = clavier.nextDouble();
        capitalFinal = capitalInitial;
        
        double tabInterets[] = new double [nombreAnnees]; //Déclaration du tableau
        
        for (i = 0; i < tabInterets.length; i++) {
            capitalFinal =(1+ tauxInteret/100)*capitalFinal;
            tabInterets[i] = capitalFinal - capitalInitial;
            System.out.print("Les intérêts acquis au bout de " + (i+1) + " an(s) sont de ");
            System.out.printf("%6.2f", tabInterets[i]);
            System.out.println(" €");
        }
        
        clavier.close();
    }

}