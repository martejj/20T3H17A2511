package src.example;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        
        String line = scanner.nextLine();

        String[] words = line.split(" ");
        
        // c style for loop
        //for (int i = 0; i < words.length; i++) {
        //    System.out.println(words[i]);
        //}
        
        int sum = 0;

        for (String s : words) {
            sum += Integer.parseInt(s);
        }

        System.out.println("The sum is: " +  sum);

        scanner.close();

    }

}