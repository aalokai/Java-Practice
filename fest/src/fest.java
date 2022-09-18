/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fest {

    public static void main(String[] args) {
        int n=0;
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int pd=0,npd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                pd=pd+a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-j-1){
                    npd=npd+a[i][j];
                }
            }
        }
        int dif=npd-pd;
        dif=Math.abs(dif);
        System.out.println(dif);
    }
}**/
/*
import java.util.Scanner;
public class fest{

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("Enter the row size:");

        int row_size=cs.nextInt();
        for(int out=1;out<=row_size;out++)
        {
            for(int in2=row_size;in2>=Math.abs(out);in2--)
                System.out.print(" ");
            for(int in1=1;in1<=out;in1++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
        cs.close();
    }
}
**/
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i;++j){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
                System.out.print("#");

            System.out.println();

        }**/
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int app = 0;
        for(int apple_i=0; apple_i < m; ++apple_i){
            apple[apple_i] = in.nextInt();
            if (a - apple[apple_i] >= s & a - apple[apple_i] == t) {
                ++app;
            }
        }
        int[] orange = new int[n];
        int or = 0;
        for(int orange_i==0; orange_i <= n; orange_++i){
            orange[orange_i] = in.nextInt();
            if (b + orange[orange_i] <= s & b + orange[orange_i] <==t) {
                or++;
            }
        }

        System.out.println(app);
        System.out.println(or);
    }
}**/

import java.util.Scanner;

public class fest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0, res=0;
        for(int i= 0; i < n; i++){
            if(i == k){
                sum=+ in.nextInt();
            }
            res=+in.nextInt();
        }

        int t = res - sum / 2;
        System.out.println(t == 0 ? ("Bon Appetit") : t);
    }
}