package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the task num");
        int num = scanner.nextInt();
        switch(num){
            case 1:
                try{
                    System.out.println("Enter the size of the array");
                    int n = scanner.nextInt();
                    int sum = 0;
                    int[] arr = new int[n];
                    System.out.println("Enter elements");
                    for(int i=0; i<n; i++){
                        System.out.println("Element N"+(i+1));
                         arr[i] =scanner.nextInt();
                    }
                    int index = scanner.nextInt();
                    for(int i=0; i<index; i++){
                       sum+=arr[i];
                    }
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Index incorrectly assigned, out of bounds");
                }
                break;
            case 2:
                try{
                    System.out.println("Enter the size of the first array");
                    int n1 = scanner.nextInt();
                    System.out.println("Enter the size of the second array");
                    int n2 = scanner.nextInt();
                    int[] arr1 = new int[n1];
                    int[] arr2 = new int[n2];
                    System.out.println("Enter elements for the first array");
                    for(int i=0; i<n1; i++){
                        System.out.println("Element N"+(i+1));
                        arr1[i] =scanner.nextInt();
                    }
                    System.out.println("Enter elements for the second array");
                    for(int i=0; i<n2; i++){
                        System.out.println("Element N"+(i+1));
                        arr2[i] =scanner.nextInt();
                    }
                    int min = Math.min(n1,n2);
                    for(int i=0; i<min; i++){
                        System.out.println("Division of elements from index N"+(i));
                       int res =  arr1[i] /arr2[i];
                        System.out.println(res);
                    }

                     /*
                    for(int i=0; i<n1; i++){
                        for(int j=0; j<n2; j++){
                            System.out.println("Indexes: "+i+" and "+j);
                                    int res = arr1[i]/arr2[j];
                            System.out.println(res);
                        }
                    }

                      */
                }


                catch(ArithmeticException e){
                    System.out.println("A division with zero occurred, error");
                }
        }
    }
}