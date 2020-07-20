package DayDayTest;

import java.util.Scanner;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-15
 * Time: 12:27
 */
public class Day0715 {



        public  static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            FindIndex(arr,n);
        }
        public static void FindIndex(int[]arr,int n) {
            int[] A=new int[2];
            for(int i= 0;i<n;i++) {
                if(i==0) {
                    A[0]=-1;
                }
                if(i==n-1) {
                    A[1]=-1;
                }
                int j=i;
                while(j>=0&&j<=n-1){
                    j-=1;
                    if(j>=0) {
                        if(arr[i]>arr[j]){
                            A[0] =j;
                            break;
                        }
                    }else{
                        A[0]=-1;
                    }
                }
                j=i;
                while(j>=0&& j<=n-1) {
                    j+=1;
                    if(j<=n-1){
                        if(arr[i]>arr[j]){
                            A[1]=j;
                            break;
                        }
                    }else{
                        A[1]=-1;
                    }
                }
                System.out.println(A[0] +" "+A[1]);
            }
        }


    }

