package NBA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> Roster = new ArrayList<Player>();
        Scanner scanner = new Scanner(System.in);
        boolean b=true;
        while (b) {
            Player player = new Player();
            System.out.println("Enter the player's information");
            System.out.println("Name:");
            String name= scanner.next();
            player.setName(name);
            System.out.println("surname:");
            String surname= scanner.next();
            player.setSurname(surname);
            System.out.println("points:");
            int points= scanner.nextInt();
            player.setPoints(points);
            System.out.println("rebounds:");
            int rebounds= scanner.nextInt();
            player.setRebounds(rebounds);
            System.out.println("blocks:");
            int blocks= scanner.nextInt();
            player.setBlocks(blocks);
            System.out.println("passes:");
            int passes= scanner.nextInt();
            player.setPasses(passes);
            System.out.println("turnovers:");
            int turnovers= scanner.nextInt();
            player.setTurnovers(turnovers);
            Roster.add(player);
            System.out.println("Enter 2 if you want to exit:");
            System.out.println("Enter 3 if you want to print sorted players");
            System.out.println("Enter 4 if you want to print reverse sorted players");
            System.out.println("Enter any other integer to continue");
            int e=scanner.nextInt();
            if(e==2) b=false;
            else if(e==3){
                ArrayList<Player> p = new ArrayList<Player>();
                p=sort(Roster);
                for (Player value : p) {
                    System.out.println(value);
                }
            }
            else if(e==4){
                ArrayList<Player> p = new ArrayList<Player>();
                p=reverseSort(Roster);
                for (Player value : p) {
                    System.out.println(value);
                }
            }
        }
    }
    public static ArrayList<Player> sort(ArrayList<Player>arr){
        int n=arr.size();
        boolean swapped;
        for(int i=0; i<n; i++){ // 5 4 3
            swapped=false;
            for(int j=0;j<n-i-1; j++){
                if(arr.get(j).rating()>arr.get(j+1).rating()){
                    Player temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1, temp);
                    swapped = true;
                }
                if(!swapped) break;
            }
        }
        return arr;
    }
    public static ArrayList<Player>  reverseSort(ArrayList<Player>arr){
      int n=arr.size();
      sort(arr);
      for(int i=0; i<n/2; i++){
          Player temp = arr.get(i);
          arr.set(i, arr.get(n-i-1));
          arr.set(n-i-1, temp);
      }
      return arr;
    }
}
