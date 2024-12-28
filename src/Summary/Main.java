package Summary;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the task you want to execute");
        int a = scanner.nextInt();
        switch(a){
            case 18:
                System.out.println("Enter the length of an array");
                int size = scanner.nextInt();
                System.out.println("Enter the target");
                int target = scanner.nextInt();
                int[] arr= new int[size];
                for(int i=0; i<size; i++){
                    System.out.println("Enter array element "+(i+1));
                    int num = scanner.nextInt();
                    arr[i]=num;
                }
                int count=0;
                for(int i=0; i<size-1; i++){
                    for(int j=i+1; j<size; j++){
                        if(arr[i]+arr[j]==target){
                            System.out.println("indexes:" +i+
                            " and "+j);
                            count++;
                            break;
                        }
                    }
                }
if(count==0) System.out.println("Not Found");
break;
            case 17:
                System.out.println("Selection sort");
                System.out.println("Enter the length of an array");
                int size1 = scanner.nextInt();
                int[] arr1= new int[size1];
                for(int i=0; i<size1; i++){
                    System.out.println("Enter array element "+(i+1));
                    int num = scanner.nextInt();
                    arr1[i]=num;
                }
                for(int i=0; i<size1-1; i++){
                    int min=i;
                    for(int j=i+1; j<size1; j++){
                      if(arr1[j]<arr1[min])
                          min=j;
                        }
                    if(min!=i){
                        int swp = arr1[min];
                        arr1[min] = arr1[i];
                        arr1[i] = swp;
                    }
                    }
                System.out.println("Sorted array");
                for(int i=0; i<size1; i++){
                    System.out.print(arr1[i]+" ");
                }
                break;
            case 16:
                System.out.println("Enter the string");
                String input=scanner.next();
             int start = 0;
             int end = input.length() -1;
           char[] arrch = input.toCharArray();
           while(start<end){
             char swp = arrch[start];
                arrch[start] = arrch[end];
               arrch[end] = swp;
               start++;
               end--;
           }
           String newString = new String(arrch);
                System.out.println(newString);
                break;
            case 15:
                System.out.println("Easy calculator");
                System.out.println("Enter two numbers");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                System.out.println("Choose an operation");
                char op = scanner.next().charAt(0);
                double result =0.0;
                switch(op){
                    case '+':
                        result = num1+num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result=num1*num2;
                        break;
                    case '/':
                        if(num2!=0) result= num1/num2;
                        else System.out.println("Error, cant divide" +
                                "by zero");
                    break;
                    default:
                        System.out.println("Dont have that operation");
                        return;
                }
                System.out.println("Result: "+result);
                break;
            case 14:
                System.out.println("A) Final klasi zgudavs inheritances");
                break;
            case 13:
         Implementer imp = new Implementer();
         imp.sayHello();
         imp.Jump();
         imp.sayBye();
         imp.Run();
         break;
            case 12:
                System.out.println("Absract class perks");
                System.out.println("sheizeba hqondes abstraqtuli" +
                        "da araabstraqtuli metodebi");
                System.out.println("interfacesgan gansxvavebit" +
                        "sheizleba hqdes nonstatic nonfinal variablebi");
                System.out.println("aqvs extend keyword");
                System.out.println("sheizleba hqondes private protected" +
                        "etc..");
                System.out.println("Interface perks");
                System.out.println("sufta implementirebis meqanizmia");
                System.out.println("public members aqv defaultad");
                System.out.println("Sheicavs mxolod abstract methodebs");
                break;
            case 11:
                System.out.println("Method overload");
                System.out.println("roca 2 an meti methodi gvaqvs " +
                        "igive saxelit tumca gansxvavebuli argumentebit " +
                        "an signaturit, parametrebis gadacemuli ricxvit etc");
                System.out.println("Method override");
                System.out.println("Roca subclass aimplementirebs misi " +
                        "uzenaisi klasis ragac methods  umetesad xdeba" +
                        "abstract classebshi da interfacebshi aseve xdeba" +
                        "toString methodebzec roca shvileuli klasia da sxva " +
                        "msgavs methodebze");
                break;
            case 10:
                System.out.println("Final aqcevs cvlads konstantad");
                break;
            case 9:
                System.out.println("d), own package + derived in another" +
                        "package");
            case 8:
                System.out.println("Encapsulation: ");
                System.out.println("Uzrunvelyofs damalos obieqtis" +
                        "detalebi ( variables,methods) ,anu martivad" +
                        "rom vtqvad titoeuli obieqtis variablebi da" +
                        "methodebi sheizleba ikos damaluli im momushave klashi" +
                        "tu sxvas ar mivecit ufleba");
                System.out.println("Inheritance: ");
                System.out.println("Parent klasebidan sheizleba shevqmnat" +
                        "misi shvilobili ( derived) classebi), romlebsac" +
                        "eqnebat mshobeli klassis methodebi variablebi" +
                        "tu protecteded gadavcemt ratqmaunda, amit izogeba" +
                        "bevri energia da meti wvaleba ar giwevs ra");
                System.out.println("Polymorphism: ");
                System.out.println("Polimorphismit saxelidanac mivxvdebodit" +
                        "rom sheuzlia sxvadaxva klasebs misces neba rom" +
                        "gamoitanon methodebi an sheqmnan methodebi sxva klasit" +
                        "magalitad tu gaq raime methodi information, sheizleba" +
                        "am methodma dabewdos informacia ert 4 klasze ra( shen irchev" +
                        "romelidan ginda dabewdos ubralod mas sheuzlia nebismieridan), " +
                        "mokled rom vtqvad gvexmareba rom ufro flexible gavxadot" +
                        "kodi");
                System.out.println("Abstraction: ");
                System.out.println("cotati gavs inkapsulacias, anu abstraqciit" +
                        "shegizlia drois dazogva martivad rom vtqvad, tu ert shvid" +
                        "klashi gimeordeba ramdenime 3 methodi ( vtqvad description)," +
                        "abstraqciit shegizlia sheqmna erti klasi romelhic eseni ewereba" +
                        "mnishvnelovani informaciebi da abstraqciit sheuzliat sxvebma gadaiweron" +
                        "es methodi, anu abstraqcia gexmareba fokusirde ufro mnishvnelovan" +
                        "partebze shen kodshi");
                break;
            case 7:
                System.out.println("Recursion: ");
                System.out.println("enter the number");
                int n= scanner.nextInt();
                System.out.println(factorial(n));
            case 6:
                System.out.println("Recursion: ");
                System.out.println("Rekursia is movlenaa rodesac" +
                        "funqcia tavis tavs izaxebs, anu cikli" +
                        "savitaa ogond aqvs base case da recursive case" +
                        "anu igive biji romlitac for cikls rom shevadarot " +
                        "zalian gavs ubralod funqciis saxitaa da bevrad" +
                        "ufro mosaxerxebelia ( da logikurad zogjer rtulic)");
                break;
            case 5:
                System.out.println("g) misi mtavari purpose aris rom" +
                        "anicilazicios obieqtis velebi roca iqmneba");
                break;
            case 4:
                System.out.println("Method signature");
                System.out.println("method signature egred wodebuli identifieria" +
                        "anu is shedgeba saxelisgen da listisgan ar sheicavs" +
                        "return types an tans magalitad println(String s)");
                break;
            case 3:
                System.out.println("A) magalitad: ");
                System.out.println("int Mymethod( int n){" +
                        "return n+10;");
                break;
            case 2:
                System.out.println("A)");
                break;
            case 1:
                System.out.println("A)");
                break;
            default:
                System.out.println("Not available");
        }

    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
