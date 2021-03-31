package Set_1;
import java.util.*;
public class Discount{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     
     // Fill the code here
     int n=sc.nextInt();
     int arr[]=new int[n];
     int temp=0;
     String arr2[]=new String[n];
     for(int i=0;i<n;i++){
         sc.nextLine();
         String s=sc.nextLine();
         System.out.print(", ");
         int p=sc.nextInt();
         System.out.print(", ");
         int d=sc.nextInt();
         int dm=(d/100)*p;
         arr[i]=dm;
         arr2[i]=s;
     }
     for(int j=1;j<n;j++){
         int min=arr[0];
         if(arr[j]<min){
            min=arr[j];
            temp=j;
         }
     }
     System.out.println(arr2[temp]);
    }
}