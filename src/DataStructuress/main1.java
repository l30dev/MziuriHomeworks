package DataStructuress;

import java.util.*;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task num");
        int n = scanner.nextInt();
        if (n == 1) {
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Enter 10 integers");
            for (int j = 0; j < 10; j++) {
                int x = scanner.nextInt();
                int c = 0;
                for (Integer integer : arr) {
                    if (integer == x) c++;
                }
                if (c == 0)
                    arr.add(x);
                for (Integer integer : arr) {
                    System.out.println(integer);
                }

            }
        }
        if(n==2){
            int count=0;
            System.out.println("Enter string");
            String s=scanner.next();
            for(int i=0;i<s.length()-1; i++){
                for(int j=i+1;j<s.length(); j++){
                    Character x=s.charAt(i);
                    Character y=s.charAt(j);
                    if(x.equals(y)) count++;
                }
                if(count==0){
                    System.out.println(s.charAt(i));
                    break;
                }
                else{
                    count=0;
                }
            }
        }
        if(n==3){
            LinkedList<Integer>integers1=new LinkedList<>();
            LinkedList<Integer>integers2=new LinkedList<>();
            integers1.add(1);
            integers1.add(2);
            integers1.add(3);
            integers1.add(4);
            integers2.add(3);
            integers2.add(4);
            integers2.add(5);
            integers2.add(6);
LinkedList<Integer>integers3=fun1(integers1,integers2);
            System.out.println(integers3);
            //zustad ar mushaobs
        }
        if(n==4){
            System.out.println("Enter 10 strings");
            for(int i=0; i<10; i++){
                HashMap<String,Integer>hm=new HashMap<>();
                HashSet<String> hs=new HashSet<>();
                String s=scanner.next();
                int x1=hs.size();
                hs.add(s);
                int x2=hs.size();
                //1 amoxsna
               //x2-s shevadareb x1-s rom gavigo iko tu ara
                //es stringi ukve chawerili. tu chawerili aris
                //hashmapshi vezeb mas keyti da values vcvli 1-it metze
                //shemdeg ubralod 10 zomian mapshi vnaxav vis aqvs kvelaze
                //didi integer value da davprintav mis keys
                //2 amoxsna
                //araris sawiro seti pirdapir mapshi movzebni da davamateb
                //im metodit romelic amatebs tu ar moizebna es key
                //tu moizebna mis values gavzrdi ertit da igive principit
                //vipovi romeli gameorda yvelaze metjer
            }
        }
        if(n==5){
            int count=0;
            System.out.println("Input string:");
            String s= scanner.next();
            for(int i=0;i<s.length(); i++){
                Character x=s.charAt(i);
                for(int j=0;j<s.length(); j++){
                    Character y=s.charAt(j);
                    if(x.equals(y)) count++;
                }
                System.out.println(x+" "+(count));
                count=0;
        }
        }
        if(n==7){
            String s= "Wow i can fly to the moon";
            int r=getSize(s);
            System.out.println(r);
        }
    }
    public static LinkedList<Integer> fun1(LinkedList<Integer>in1,LinkedList<Integer>in2) {
        LinkedList<Integer> in3 = new LinkedList<>();
        in3.addAll(in1);
        in3.addAll(in2); //1 2 3 4 3 4 5 6
        //in1.retainAll(in2);// 3 4
        //in3.removeAll(in1);// 1 2 5 6
        return in3;
    }
    public static int getSize(String s){
        String[] sentences= s.trim().split(" ");
        return sentences[sentences.length-1].length();
    }
}
