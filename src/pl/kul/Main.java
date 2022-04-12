package pl.kul;

import java.util.Scanner;

import static pl.kul.TabliceMetodyPomocnicze.*;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//	    int n;
//        do {
//            System.out.println("Podaj rozmiar tablicy:");
//            n = sc.nextInt();
//            if(n <= 0) System.out.println("Bledny rozmiar tablicy, sproboj jeszcze raz.");
//        } while(n <= 0);
//        Integer[] tablicaIntow = new Integer[n];
//
//        for (int i=0;i<n;i++){
//            System.out.println("Podaj " + i + " element tablicy: ");
//            tablicaIntow[i] = sc.nextInt();
//        }
//
//        for (int i=0;i<n;i++){
//            System.out.println("tab[" + i + "] = " + tablicaIntow[i]);
//        }
//
//        System.out.println(TabliceMetodyPomocnicze.obliczSrednia(tablicaIntow));
        Integer[] tablica = wygenerujLosowaTablice();
        double srednia = obliczSrednia(tablica);
        System.out.println("Srednia = " + srednia);

        for(int x : tablica){
            if(x < srednia) System.out.print(x + " ");
        }
        System.out.println();

        ElementIndeks minOrazIndeks = znajdzMinOrazIndeks(tablica);
        System.out.println("Min = " + minOrazIndeks.element);
        System.out.println("Indeks = " + minOrazIndeks.indeks);

        ElementIndeks maxOrazIndeks = znajdzMaksOrazIndeks(tablica);
        System.out.println("Max = " + maxOrazIndeks.element);
        System.out.println("Indeks = " + maxOrazIndeks.indeks);

        System.out.println("Szukam 8");
        int indeks = znajdzIndeksElementu(tablica, 8);
        if(indeks != -1) {
            System.out.println("Znaleziono 8 na indeksie: " + indeks);
        } else {
            System.out.println("Nie znaleziono 8");
        }

        PlusMinusZera plusMinusZera = obliczIlePlusMinusZer(tablica);
        System.out.println("Liczby dodatnie = " + plusMinusZera.plus);
        System.out.println("Liczby ujemne = " + plusMinusZera.minus);
        System.out.println("Zera = " + plusMinusZera.zera);
    }
}
