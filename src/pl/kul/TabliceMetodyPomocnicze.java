package pl.kul;

import java.util.Arrays;
import java.util.Random;

public class TabliceMetodyPomocnicze {
    public static Integer[] wygenerujLosowaTablice(){
        System.out.println("Generuje tablice o 10 elementach.");
        Random rand = new Random(System.currentTimeMillis());
        Integer[] tab = new Integer[10];
        for(int i=0; i<tab.length;i++) {
            tab[i] = (rand.nextInt(21) - 10);
        }
        System.out.println("Wygenerowana tablica:");
        System.out.println(Arrays.toString(tab));
        return tab;
    }

    public static double obliczSrednia(Integer[] tablicaInt) {
        double suma = 0;
        for(int x : tablicaInt) {
            suma += x;
        }
        return (suma / tablicaInt.length);
    }

    public static ElementIndeks znajdzMinOrazIndeks(Integer[] tablicaInt) {
        ElementIndeks wynik = new ElementIndeks(tablicaInt[0],0);
        for(int i=1;i<tablicaInt.length;i++) {
            if(tablicaInt[i] < wynik.element) {
                wynik.element = tablicaInt[i];
                wynik.indeks = i;
            }
        }
        return wynik;
    }

    public static ElementIndeks znajdzMaksOrazIndeks(Integer[] tablicaInt) {
        ElementIndeks wynik = new ElementIndeks(tablicaInt[0],0);
        for(int i=1; i<tablicaInt.length;i++) {
            if(tablicaInt[i] > wynik.element) {
                wynik.element = tablicaInt[i];
                wynik.indeks = i;
            }
        }
        return wynik;
    }

    public static int znajdzIndeksElementu(Integer[] tablicaInt, int x) {
        for(int i=0; i<tablicaInt.length; i++) {
            if(tablicaInt[i] == x) return i;
        }
        return -1;
    }

    public static PlusMinusZera obliczIlePlusMinusZer(Integer[] tablicaInt) {
        PlusMinusZera wynik = new PlusMinusZera(0,0,0);
        for(int x : tablicaInt) {
            if(x > 0) wynik.plus++;
            else if (x < 0) wynik.minus++;
            else wynik.zera++;
        }
        return wynik;
    }
}

class ElementIndeks {
    int element, indeks;
    public ElementIndeks(int element, int indeks) {
        this.element = element;
        this.indeks = indeks;
    }
}

class PlusMinusZera {
    int plus;
    int minus;
    int zera;
    public PlusMinusZera(int plus,int minus,int zera){
        this.plus = plus;
        this.minus = minus;
        this.zera = zera;
    }
}
