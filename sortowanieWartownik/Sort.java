package org.example;

import java.util.Random;

public class Sort {


    public int[] wypelnianieTablicy(int liczbaElementow, int wartownik){
        Random random = new Random();
        int tablica[] = new int[liczbaElementow+1];
        for (int i = 0; i < liczbaElementow; i++) {
            int randomNumber = random.nextInt(50)+1;
            tablica[i] = randomNumber;
        }
        tablica[liczbaElementow] = wartownik;
        return tablica;
    }

    public int sortowanie(int wartownik, int liczbaElementow, int[] tablica) {
        int i=0;

        while(tablica[i]!=wartownik){
            i++;

        }
        if(i==liczbaElementow){
            return -1;
        }
        else {
            return i;
        }


    }



    public void wyczytywanieTablicy(int[] tablica){
        for(int i=0; i<tablica.length-1; i++){
            System.out.println("element "+i + " tablicy: " + tablica[i]);
        }
    }


}
