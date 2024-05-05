import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main (String[] args){
        int number1= 2;
        int number2= 3;
        int sum = MathUtils.add(number1, number2);
        System.out.println("sum : " + sum);

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("sum oif those numbers is:" + sum);
       emailMessenger.sendMessage("Email sent"); 

    }
}
