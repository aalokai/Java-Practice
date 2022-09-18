import java.util.*;

public class Solution {

    public static void main(String[] args) {
        long i, j, k, l, m;
        Scanner sc = new Scanner(System.in);
        long n = 0;
        n = sc.nextInt();
       /*String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Sub= str.substring(0,n-1);
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.print(str.charAt(j));
            }
            if(i==0)
                continue;
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        int p=10;
        for(i=n;i>=0;i--){
            for(k=0;k<=n-i;k++){
                for(l=1;l<=k;l++){
                    System.out.print(" ");
                }
            }
            for(j=0;j<i;j++){
                System.out.print(" "+p--);
            }

            System.out.println();
        }**/

        //codacharya
        /*long sum1=0;
        for(i=1;i<=n; i++){
            sum1=sum1+i;
        }
        long sum2=0;
        for(i=1;i<=n; i++){
            sum2=sum2+i*i;
        }
        System.out.println((sum1*sum1)-sum2);**/

      /* long multi=0;
        long sum=0;
        for(i=1;i<=n;i++){
            if(i%4==0||i%9==0){
                sum=sum+i;
            }
        }

        System.out.println(sum);
    }**/

      /*  long sum = 0;
        for (long i = 0; i <= n; i++) {
            boolean f = isPalindrome(i);
            if (isPalindrome(i)) {
                sum = sum + i;
            }



        }
        System.out.println(sum);

    }




    public static boolean isPalindrome(long number) {

        long num = number;
        long reverse = 0;
        long lastDigit = 0;
        while (num > 0) {
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }

        if (number == reverse)
            return true;
        else
            return false;
    }
**/
        /*
        long arm=0;
        long sum=0;
        for(k=1;k<=n;k++){
            long num=k;

        while(num>0){
            j=num%10;
            sum= sum+j*j*j;
            num=num/10;
        }
        if(sum==k){
            arm=arm+sum;
        }
sum=0;
        }
        System.out.println(arm);
        **/
//11384387280
        for(i=0;i<=n;i++){
            

        }


    }
}
