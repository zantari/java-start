package org.example;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() throws InterruptedException {
while(true) {
    System.out.println("Sortowanie z wartownikiem");



    System.out.println("podaj dlugosc tablicy: ");


    Scanner sc = new Scanner(System.in);

    while(!sc.hasNextInt()){
        System.out.println("dlugosc tablicy musi byc liczba");
        sc.next();
    }


    int liczbaElementow = sc.nextInt();

    if(liczbaElementow<0){
        System.out.println("Podano ujemna liczbe losowanie elementow tablicy...");
        Thread.sleep(500);
        Random random = new Random();
        int elementy = random.nextInt(100);
        liczbaElementow = elementy;
        System.out.println("wylosowano: " + elementy +" elementow tablicy");
    }

    System.out.println("Podaj szukana liczbe: ");

    while(!sc.hasNextInt()){
        System.out.println("szukana liczba musi byc liczba ");
        sc.next();
    }


    int wartownik = sc.nextInt();



    Sort sortowanie = new Sort();

    int[] tablica = sortowanie.wypelnianieTablicy(liczbaElementow, wartownik);


    int wynikSortowania = sortowanie.sortowanie(wartownik, liczbaElementow, tablica);




    if (wynikSortowania > -1) {
        System.out.println("Znaleziono szukana liczbe (" + tablica[wynikSortowania] + ") na " + wynikSortowania + " indeksie tablicy ");
    } else {
        System.out.println("Nie znaleziono " + wartownik + " w tablicy.");
    }


    System.out.println("Czy chcesz zobaczyc cala tablice? [y/n]");


    String yn = sc.next();
    while(!yn.equals("y") && !yn.equals("n")){
        System.out.println("Czy chcesz zobaczyc cala tablice? [y/n]");
        yn = sc.next();
    }

    if (Objects.equals(yn, "y")) {
        sortowanie.wyczytywanieTablicy(tablica);
    }


    System.out.println("Czy chcesz powtorzyc program? [y/n]");
    yn = sc.next();

    while(!yn.equals("y") && !yn.equals("n")){
        System.out.println("Czy chcesz powtorzyc program? [y/n]");
        yn = sc.next();
    }

    if (Objects.equals(yn, "n")) {
        System.exit(0);
    }

}



    }
}
