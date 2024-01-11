import java.util.Scanner;

class ClimbSteps {
    static int noofWays(int num){
        int a=0,b=1,c=0;

        for(int i=0;i<num;i++){
            c=a+b;
            a=b;
            b=c;
        }

        return c;

    }
   
}
class Ways{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int No=sc.nextInt();

        int value=ClimbSteps.noofWays(No);
        System.out.println("Number of ways to climb :"+ value);

        sc.close();
       
    }
}
