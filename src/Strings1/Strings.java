package Strings1;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a task to execute (1-7)");
            System.out.print("Enter task number: ");
            int taskChoice = scanner.nextInt();
            scanner.nextLine();
            switch (taskChoice) {
                case 1:
                    System.out.print("Enter a string for Task 1: ");
                    String input1 = scanner.nextLine();
                    int digitCount = 0;
                    for (int i = 0; i < input1.length(); i++) {
                        if (input1.charAt(i)>='0' && input1.charAt(i)<='9') {
                            digitCount++;
                        }
                    }
                    System.out.println("Digits count: " + digitCount);
                    break;

                case 2:
                    System.out.print("Enter a string for Task 2: ");
                    String input2 = scanner.nextLine();
                    int sentenceCount = 0;
                    char[] punctuation = {'.', '?', ';', '!'};
                    for (int i = 0; i < input2.length(); i++) {
                        for (char punct : punctuation) {
                            if (input2.charAt(i) == punct) {
                                sentenceCount++;
                            }
                        }
                    }
                    System.out.println("Sentences count: " + sentenceCount);
                    break;

                case 3:
                    System.out.print("Enter a string for Task 3 (lowercase): ");
                    String input3 = scanner.nextLine();
                    boolean isPalindrome = true;
                    int left = 0;
                    int right = input3.length() - 1;
                    while (left < right) {
                        if (input3.charAt(left) != input3.charAt(right)) {
                            isPalindrome = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                    System.out.println("Palindrome check: " + isPalindrome);
                    break;

                case 4:
                    System.out.print("Enter string s1 for Task 4: ");
                    String s1 = scanner.nextLine();
                    System.out.print("Enter string s2 for Task 4: ");
                    String s2 = scanner.nextLine();
                    boolean isSubstring = s1.contains(s2);
                    System.out.println("Substring check: " + isSubstring);
                    break;

                case 5:
                    System.out.print("Enter a string for Task 5: ");
                    String input5 = scanner.nextLine();
                    String vowels = "aeiou";
                    input5=input5.toLowerCase();
                    char lastChar = input5.charAt(input5.length() - 1);
                    if (vowels.indexOf(lastChar) != -1) {
                        System.out.println("Ends with vowel");
                    }
                    else if((lastChar>='a' && lastChar<='z')
                    || (lastChar>='A' && lastChar<='Z')){
                        System.out.println("Ends with consonant");
                    }
                    else {
                        System.out.println("Not a letter");
                    }
                    break;

                case 6:
                    System.out.print("Enter a string for Task 6: ");
                    String input6 = scanner.nextLine();
                    StringBuilder sb= new StringBuilder(input6);
                    for(int i=0; i<sb.length()-1; i++){
                      if(sb.charAt(i)==sb.charAt(i+1)){
                          sb.delete(i,i+1);
                          i--;
                      }
                    }
                    System.out.println("Original String: "+(sb.toString()));

                case 7:
                    System.out.print("Enter a word for Task 7: ");
                    String input7 = scanner.nextLine();
                    if (input7.length() > 10) {
                        String abbreviation = String.valueOf(input7.charAt(0) + (input7.length() - 2) + input7.charAt(input7.length() - 1));
                        System.out.println("Abbreviation: " + abbreviation);
                    } else {
                        System.out.println("Not huge: " + input7);
                    }
                    break;

                default:
                    System.out.println("Invalid task number. Please choose a number between 1 and 7.");
                    break;
            }
        }
    }
}

