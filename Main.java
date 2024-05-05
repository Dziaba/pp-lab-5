import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;

public class Main {
    public static void main (String[] args){
        try{
            Person person = new Person ("Bob", 55);
            System.out.println("Name: " + person.getName());
            System.out.println("age:" + person.getAge());
        }
        catch (InvalidAgeException msg){
            System.out.println("Error: " + msg.getMessage());
        }
        
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("it works ! ");
    }
}
