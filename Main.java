import company.implementations.EmailMessenger;
import company.utils.MathUtils;
import company.beans.Person;

public class Main {
    public static void main (String[] args){
        Person[] people = new Person[5];
        int b = 21;

        try{
            people[0] = new Person("Bob", 45);
            people[1] = new Person("Marek", 23);
            people[2] = new Person("Jan Nowak", 19);
            people[3] = new Person("Kowalski", 37);
            people[4] = new Person("Rico", 55);

            EmailMessenger emailMessenger = new EmailMessenger();

            for(int i = 0; i< people.length; i++){
                int value = MathUtils.add(people[i].getAge(), b);
                String message = "Value of person:" + people[i].getName() + " is " + value;
                emailMessenger.sendMessage(message);
            }
        }
        catch (Exception err){
            System.err.println("Error:" + err.getMessage());
        }
    }
}
