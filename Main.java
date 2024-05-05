import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main (String[] args){
        try{
            Person person = new Person ("Bob", 55);
            System.out.println("Name: " + person.getName());
            System.out.println("age:" + person.getAge());
        }
        catch (InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
