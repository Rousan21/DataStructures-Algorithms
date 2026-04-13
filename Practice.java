import java.util.Scanner;

public class Practice{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

//Voting Elgibility

int num;
String name;

System.out.print("Enter your name guy: ");
name = scanner.nextLine();

if(name.isEmpty()){

    System.out.print("You didnt enter a name guy...");
}

else{
    System.out.print("Hello " + name + "!");
}

System.out.print("Enter your age scrub: ");
num = scanner.nextInt();


if(num > 18){
    System.out.println("Not eliglble to vote little bro");
}

else if(num < 0){
    System.out.println("You weren't even born yet!");
}

else{
    System.out.println("You are old enough to vote!");
}

}
}