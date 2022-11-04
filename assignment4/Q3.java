package assignment4;
import java.util.*;
class Number{
    private double x;
    Number(double t)
    {
    	x=t;
    }
    public boolean isZero(){
        return (x == 0) ? true: false;
    }
    public boolean isPositive(){
        return (x > 0) ? true : false;
    }
    public boolean isNegative(){
        return (x < 0) ? true : false;
    }
    public boolean isEven(){
        return (x % 2 == 0) ? true : false;
    }
    public boolean isOdd(){
        return (x % 2 == 1) ? true : false;
    }
    public boolean isPrime(){
        for(int i = 2;i<=x/2;i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong(){
        double n = x;
        double sum = 0;
        while(n>0){
            double r;
            r=n%10;    
            sum=sum+(r*r*r);    
            n=n/10;    
        }
        if(sum == x){
            return true;
        }
        return false;
    }
    public double getFactorial(){
        double fact = 1;
        for(int i = 2;i<=x;i++){
            fact *= i;
        }
        return fact;
    }
    public double getSqrt(){
        double ans = 1;
        int i = 1;
        while (ans <= x) {
            i++;
            ans = i * i;
        }
        return i - 1;
    }
    public double sumDigits(){
        int temp = (int)x;
        double ans = 0;
        while(temp > 0){
            ans += temp % 10;
            temp /= 10;
        }
        return ans;
    }
    public double getReverse(){
        int number = (int)x;
        int reverse = 0;
        while(number != 0){  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }
        return reverse;
    }
    public void dispBinary(){
        int flag = 0;
        System.out.print("Binary of " + x + " is : ");
        int temp = (int) x;
        for(int i = 31;i>=0;i--){
            if((temp & (1<<i)) > 0){
                flag = 1;
                System.out.print("1");
            }else{
                if(flag==1){
                    System.out.print("0");
                }
            }
        }
        System.out.println("");
    }
    public void listFactor(){
        System.out.print("Factors of " + x + " are: ");
        for (int i = 1; i <= x; ++i) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
public class Q3 {
    public static void main(String args[]) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter a double number:");
    	Number num = new Number(scan.nextDouble());
    	System.out.println("Number is Zero: " + num.isZero());
        System.out.println("Number is Positive: " + num.isPositive());
        System.out.println("Number is Negative: " + num.isNegative());
        System.out.println("Number is Odd: " + num.isOdd());
        System.out.println("Number is Even: " + num.isEven());
        System.out.println("Number is Prime: " + num.isPrime());
        System.out.println("Number is Armstrong: " + num.isArmstrong());
        System.out.println("Factorial is: " + num.getFactorial());
        System.out.println("Square root is: " + num.getSqrt());
        System.out.println("Sum of digits is: " + num.sumDigits());
        System.out.println("Reverse is: " + num.getReverse());
        num.dispBinary();
        num.listFactor();
    }
}