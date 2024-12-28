package Files;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the task number");
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();
        switch (task) {
            case 1:
                try {
                    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\NewFile.txt");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    int byteData;
                    int count = 10;
                    while (((byteData = bufferedInputStream.read()) != -1)
                            && count > 0) {
                        char c = (char) byteData;
                        if (Character.isDigit(c))
                            count--;
                        System.out.print(c);
                    }
                    bufferedInputStream.close();
                    fileInputStream.close();
                } catch (IOException io) {
                    System.out.println("File input exception");
                }
                break;
            case 2:
                try {
                    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\NewFile.txt");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    int byteData;
                    char[] arr = new char[10];
                    int i = 0;
                    while (((byteData = bufferedInputStream.read()) != -1)
                            && i < 10) {
                        char c = (char) byteData;
                        if (Character.isDigit(c)) {
                            arr[i] = c;
                            i++;
                        }
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\Output.txt");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    int sum = 0;
                    StringBuilder str = new StringBuilder();
                    str.append("Array: ");
                    for (char j : arr) {
                        str.append(j);
                        int num = Character.getNumericValue(j);
                        sum += num;
                        str.append(" ");
                    }
                    str.append('\n');
                    str.append("Value: ");
                    str.append(sum);
                    System.out.println(sum);
                    System.out.println(str);
                    bufferedOutputStream.write(str.toString().getBytes());
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                } catch (IOException io) {
                    System.out.println("File not Found");
                }
                break;
            case 3:
                try {
                    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\NewFile.txt");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    int byteData;
                    char[] arr = new char[10];
                    int i = 0;
                    while (((byteData = bufferedInputStream.read()) != -1)
                            && i < 10) {
                        char c = (char) byteData;
                        arr[i] = c;
                        i++;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\Output.txt");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    StringBuilder str = new StringBuilder();
                    str.append("Array:");
                    for (char j : arr) {
                        str.append(j);
                    }
                    System.out.println(str);
                    bufferedOutputStream.write(str.toString().getBytes());
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                } catch (IOException io) {
                    System.out.println("File not Found");
                }
                break;
            case 4:
                System.out.println("Enter how many numbers you want to write " +
                        "in file");
                int num = scanner.nextInt();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\Output.txt");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    bufferedOutputStream.write("The number count: ".getBytes());
                    String str = Integer.toString(num);
                    bufferedOutputStream.write(str.getBytes());
                    bufferedOutputStream.write('\n');
                    for (int i = 0; i < num; i++) {
                        Random rand = new Random();
                        int randInt = rand.nextInt(100);
                        String string = Integer.toString(randInt);
                        bufferedOutputStream.write(string.getBytes());
                        bufferedOutputStream.write(' ');
                    }
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                } catch (IOException io) {
                    System.out.println("Can't write in file");
                }
                break;
            case 5:
                try {
                    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\NewFile.txt");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    int byteData;
                    int positive = 0;
                    int negative = 0;
                    int zero = 0;
                    while (((byteData = bufferedInputStream.read()) != -1)) {
                        if (Character.isDigit((char) byteData)) {
                            int n = Character.getNumericValue((char) byteData);
                            if (n < 0) negative++;
                            else if (n > 0) positive++;
                            else zero++;
                        }
                    }
                    StringBuilder pos = new StringBuilder("Positive count: ");
                    pos.append(positive);
                    StringBuilder neg = new StringBuilder("Negative: ");
                    neg.append(negative);
                    StringBuilder zer = new StringBuilder("Zero count: ");
                    zer.append(zero);
                    FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\Output.txt");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    bufferedOutputStream.write(pos.toString().getBytes());
                    bufferedOutputStream.write('\n');
                    bufferedOutputStream.write(neg.toString().getBytes());
                    bufferedOutputStream.write('\n');
                    bufferedOutputStream.write(zer.toString().getBytes());
                    bufferedOutputStream.write('\n');
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                } catch (IOException io) {
                    System.out.println("File can't be found");
                }
            case 6:
                try {
                    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\NewFile.txt");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    int byteData;
                    int positive = 0;
                    int negative = 0;
                    int zero = 0;
                    while (((byteData = bufferedInputStream.read()) != -1)) {
                        if (Character.isDigit((char) byteData)) {
                            int n = Character.getNumericValue((char) byteData);
                            if (n < 0) negative++;
                            else if (n > 0) positive++;
                            else zero++;
                        }
                    }
                    System.out.println("Total number count: "+(positive+negative+zero));
                    System.out.println("Positive count: "+positive);
                    System.out.println("Negative count: "+negative);
                    System.out.println("Zero count: "+zero);

                }
                catch(IOException io){
                    System.out.println("Problem with files");
                }
        }
    }
}

