package org.example;


import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main() {


        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Podaj liczbe");

            if(!sc.hasNextInt()) {
                System.out.println("Podaj liczbe 1-10");
                sc.next();
            }
            else{
                int liczba = sc.nextInt();
                if(liczba>0 && liczba<11){
                    System.out.println("Wykonuje petle "+liczba + "krotnie");
                    for (int i = 1; i < liczba+1; i++) {
                        System.out.println("wykonanie nr: " + i);
                    }
                    while(true)
                    {
                        System.out.println("Czy chcesz powtorzyc wykonanie programu? [y/n]");
                        String odpowiedz = sc.next();
                        if(Objects.equals(odpowiedz, "n")){
                            System.exit(0);
                        }
                        if(Objects.equals(odpowiedz, "y")){

                            break;
                        }
                    }

                }
                else{
                    System.out.println("nie podales liczby z przedzialu, sprobuj ponownie");
                }
            }


            }




    }
}
