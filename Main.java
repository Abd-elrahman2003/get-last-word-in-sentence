package lenght;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner console = new Scanner(System.in);
System.out.print("enter the syntax: ");
String s = console.nextLine();
String words[] = s.split(" ");
System.out.println("the last word is "+words[words.length-1]);

System.out.println("the length is "+words[words.length-1].length());

}
}