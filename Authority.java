package Set_1;
import java.util.Scanner;
class Authority{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean flag1=true;
        boolean flag2=true;
        System.out.print("Inmate's name:");
        String Inmate=sc.nextLine();
        for(int i=0;i<Inmate.length();i++){
            char c=Inmate.charAt(i);
            if(Character.isDigit(c)){
                flag1=false;
                System.out.println("Invalid name");
                break;
            }
        }
        System.out.print("Inmate's father's name:");
        String father=sc.nextLine();
        for(int i=0;i<father.length();i++){
            char c=father.charAt(i);
            if(Character.isDigit(c)){
                flag2=false;
                System.out.println("Invalid name");
                break;
            }
        }
        System.out.println();
        String combine=Inmate+" "+father;
        
        if(flag1==true&&flag2==true){
            System.out.println(combine.toUpperCase());
        }
    }
}