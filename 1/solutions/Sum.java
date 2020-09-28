package solutions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers to sum: ");

        String input = sc.nextLine();
        
        String[] words = input.split(" ");
        
        int sum = 0;

        for (String s : words) {
            sum += Integer.parseInt(s);
        }
        
        System.out.println("Summed to: " + sum);

        sc.close();
        
    }
}
