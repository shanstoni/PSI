package com.Shan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shan on 12.05.2018.
 */
public  class ResultArray implements iResultArray{

    int maxvalue = 0;

    public static List<String> answers = new ArrayList<String>();

    private static int[] results = new int[11];
    private static String[] pizzaNames = {"Margherita", "Funghi", "Salami", "Primavera", "Diego", "Rimini", "Capri", "Amore",
            "Pomidoro", "Roma", "Pepperoni"};

    public ResultArray(){};

    public void addValues(int margeritha, int fungi, int salami, int primavera, int diego, int rimini, int capri, int amore,
                       int pomidoro, int roma, int pepperoni){
        results[0] += margeritha;
        results[1] += fungi;
        results[2] += salami;
        results[3] += primavera;
        results[4] += diego;
        results[5] += rimini;
        results[6] += capri;
        results[7] += amore;
        results[8] += pomidoro;
        results[9] += roma;
        results[10] += pepperoni;
    }

    public void deductValues(int margeritha, int fungi, int salami, int primavera, int diego, int rimini, int capri, int amore,
                             int pomidoro, int roma, int pepperoni){
        results[0] -= margeritha;
        results[1] -= fungi;
        results[2] -= salami;
        results[3] -= primavera;
        results[4] -= diego;
        results[5] -= rimini;
        results[6] -= capri;
        results[7] -= amore;
        results[8] -= pomidoro;
        results[9] -= roma;
        results[10] -= pepperoni;
    }

    public void showArray(){
        for(int i = 0; i < results.length; i++){
            System.out.print("ARRAY " + results[i] + "\t");
        }
    }
    public void showList(){
        for(int i = 0; i < answers.size(); i++){
            System.out.print("LIST " + answers.get(i) + "\t");
        }
    }

    @Override
    public void findMaxValue() {
        for(int i =0; i < results.length; i++){
            if(results[i] > maxvalue) {
                maxvalue = results[i];
            }
        }
    }

    public void collectAnswers(){
        for(int i = 0; i < results.length; i++){
            if(maxvalue == results[i]){
                answers.add(pizzaNames[i]);
            }
        }
    }






}
//        1. Margherita
//        sos, ser, oregano
//        2. Funghi
//        pieczarki
//        3. Salami
//        salami
//        4. Primavera
//        salami, pieczarki
//        5. Diego
//        boczek, pieczarki
//        6. Rimini
//        boczek, pieczarki, sos czosnkowy
//        7. Capri
//        szynka, pieczarki, papryka
//        8. Amore
//        kurczak, ananas, kukurydza
//        9. Pomidoro
//        kurczak, suszone pomidory, szpinak
//        10. Roma
//        cebula, pieczarki, papryka, oliwki
//        11. Pepperoni
//        salami, pieczarki, papryka, chilli