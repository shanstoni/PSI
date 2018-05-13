package com.Shan;

import java.util.Scanner;

/**
 * Created by shan on 12.05.2018.
 */
public class Questions {

    ResultArray resultArray = new ResultArray();
    int count = 0;
    String answer = "";


    private String[] questionsArray = {"pieczarki", "salami", "boczek", "szynka", "papryka", "kurczak", "ananas", "kukurydza",
            "suszone pomidory", "szpinak", "chilli", "cebula", "oliwki"};

    private String doyoulike = "Czy lubisz ";

    private void scannerThings(int margeritha, int fungi, int salami, int primavera, int diego, int rimini, int capri, int amore,
                               int pomidoro, int roma, int pepperoni){
        System.out.println(doyoulike + questionsArray[count] + "? Wpisz TAK lub NIE" );
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        if(answer.equals("TAK")){
            resultArray.addValues(margeritha, fungi, salami, primavera, diego, rimini, capri, amore, pomidoro, roma, pepperoni);
            count += 1;
        } else if (answer.equals("NIE")){
            resultArray.deductValues(margeritha, fungi, salami, primavera, diego, rimini, capri, amore, pomidoro, roma, pepperoni);
            count += 1;
        } else {
            System.out.println("Udzieliłeś niepoprawnej odpowiedzi, spróbuj jeszcze raz");

        }

    }

    public void questions(){
        scannerThings(0, 3, 0, 2, 2, 1, 1, 0, 0, 1, 1);
        scannerThings(0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 1);
        scannerThings(0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0);
        scannerThings(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0);

    }


    public void finalAnswer(){
        for (int i = 0; i < resultArray.answers.size(); i++){
            System.out.println("Proponuje zamowic " + resultArray.answers.get(i) + "\n Czy odpowiada Ci ten wybor? Wpisz TAK lub NIE");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (answer.equals("TAK")){
                i = resultArray.answers.size();
            }
        }
    }

}
