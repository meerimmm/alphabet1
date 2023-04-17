package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        method(scanner.nextLine());

    }
    static void method(String word){
Random random=new Random();
String[]alphabet={
        "1","2","3","4","5","6","7","8","9","0",
        "A", "B", "C", "D", "E", "F",
        "G"," H", "I", "J", "K", "L", "M", "N", "O", "P",
        " Q", "R", "S"," T", "U", "V"," W", "X", "Y ", "Z",
        "a","b"," c", "d"," e","f"," g ","h"," i ",
        "j"," k", "l", "m", "n", "o", "p"," q",
        "r,","s", "t", "u", "v" ,"w"," x", "y", "z"};
String[]array=word.split("");
String[]newArray=new String[array.length];

int counter=0;
boolean isTrue=true;
while (isTrue){
    for (int i = 0; i < array.length ; i++) {
        String someChar=alphabet[random.nextInt(alphabet.length)];
        newArray[i]=someChar;
        counter++;
        System.out.println(Arrays.toString(Arrays.stream(newArray).toArray()));
        if (Arrays.equals(array,newArray)){
            System.out.println("FIND IT!!!!!!!!!!!");
            System.out.println(Arrays.toString(newArray));
            System.out.println("количество попыток : "+counter);
            isTrue=false;
        }

    }
}
    }
}
