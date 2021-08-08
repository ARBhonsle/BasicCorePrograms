package com.company;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class CheckVowel {
    static void checkVowel(String letter){
        String str=letter.toLowerCase(Locale.ROOT);
        if(Objects.equals(str, "a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
    public static void main(String[] args){
        System.out.println("Check for Vowel or Consonant");
        System.out.println("Give an alphabet");
        Scanner sc=new Scanner(System.in);
        String letter=sc.next();
        checkVowel(letter);
    }
}
