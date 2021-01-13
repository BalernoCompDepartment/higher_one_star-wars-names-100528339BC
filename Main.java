import javax.swing.JOptionPane;
import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter first name");
    String forename = scan.next();

    System.out.println("Enter surname");
    String surname = scan.next();

    System.out.println("Enter your mother's maiden name");
    String mother = scan.next();

    System.out.println("Enter the Name of the city you were born");
    String city = scan.next();

    String starwarsName = surname.substring(0,3).toLowerCase() + forename.substring(0,2).toLowerCase().toLowerCase() + " " + mother.substring(0,3).toLowerCase() + city.substring(0,2).toLowerCase();

    System.out.println("your starwars name is "+ starwarsName);

  }
} 