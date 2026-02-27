import java.util.*;
class plindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number ");
        int num=sc.nextInt();
        int rev=0,tem=num,rem;
        while(num!=0)
        {
        rem= num%10;
        rev=rev*10+rem;
        num=num/10;
        }
        System.out.println("REVS "+ rev);
        if(rev==tem){
                System.out.println("NOt palindrome " + rev);}


    }
