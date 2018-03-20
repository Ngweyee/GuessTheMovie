package com.company;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        ArrayList<String> movieTitleList = new ArrayList<>();
       File file = new File("movietitles.txt");
       if(file.exists()){
           Scanner scanner = new Scanner(file);
          while (scanner.hasNextLine()){
             String line = scanner.nextLine();
             movieTitleList.add(line);
          }

       }
       // System.out.println(movieTitleList.toString());
       int randomNumer = (int) (Math.random() * movieTitleList.size());
       String title  = movieTitleList.get(randomNumer);
        System.out.println(randomNumer + title);
        String trimString = title.replaceAll("\\s","");
        int count = 0;
        String underscoreString = trimString.replaceAll("\\w","_");
        char[] charr=underscoreString.toCharArray();
        //System.out.println(trimString);
        System.out.println("You are guessing :" + underscoreString);

        System.out.println("You have guess " + count + " wrong letters ");

        System.out.println("Guess the Letter:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println("Letter is " + string);
        char temp = string.toCharArray()[0];
        if(trimString.contains(string)){
           System.out.println(string + " contains in " + trimString);
           int pos = trimString.indexOf(string);

            System.out.println(underscoreString.charAt(pos));
         //  underscoreString.replace(underscoreString.charAt(pos),string.charAt(0));
           System.out.println(pos);
           System.out.println(underscoreString);
           charr[pos]=temp;
            System.out.println(charr);
        }else {
            System.out.println("Not contain " );
        }
        System.out.println("You are guessing " + underscoreString.length());
    }
}
