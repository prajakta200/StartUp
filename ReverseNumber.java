import java.io.*;


class Solution{
    static int reverseNo(int num){
        if(num<-2147483648 || num>2147483647)
            return 0;

        int rev=0;
        while(num!=0){
            int remainder=num%10;
            rev=rev*10+remainder;
            num=num/10;
        }
        return rev;

    }
}
class ReverseNumber{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Number : ");
        int num=Integer.parseInt(br.readLine());

        int value=Solution.reverseNo(num);

        System.out.println(value);

    }
}
/* 
class day17 {

    static int reverseNum(int x){
        if(x > 2147483647 || x < -2147483648)
            return 0;
        
    
        int temp = Math.abs(x);
        int rev = 0;
       
        while(temp>0){
            int n = temp%10;
            rev = rev*10 + n;
            temp = temp/10;
        }

        if(x<0){
            rev = rev*(-1);
        }

        return rev;
    }
    public static void main(String[] args){
        int x1 = 123;
        int x2 = -321;
        int x3 = 120;

        System.out.println(reverseNum(x1));
        System.out.println(reverseNum(x2));
        System.out.println(reverseNum(x3));
    }
}
*/