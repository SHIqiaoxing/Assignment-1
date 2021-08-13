import java.util.*;

public class Program {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the temperature: ");

        float degree = sc.nextFloat();
        String unit = sc.next();

        if(unit.equals("C")){
            degree = degree * 9 / 5 + 32;
            System.out.printf("The converted temperature is %.2f F",degree);
        }
        else if (unit.equals("F")){
            degree = (degree - 32) * 5 / 9;
            System.out.printf("The converted temperature is %.2f C",degree);
        }
        else{
            System.out.println("Please enter the correct temperature.");
        }
    }
}
