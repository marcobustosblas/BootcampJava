import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //imc = weight in kg/ height in m2;

        double weight;
        double height;

        Scanner sc = new Scanner(System.in);
        System.out.print("Type your weight: ");
        weight = sc.nextFloat();
        System.out.print("Type your height: ");
        height = sc.nextFloat();

        double IMC = weight / (height*height);
        System.out.println("Your IMC is: " + IMC);

        if(IMC < 18){
            System.out.println("You are under weight");
        }

        if(IMC >= 18.6 && IMC <= 24.9){
            System.out.println("You are healthy");
        }

        if(IMC >= 25 && IMC <= 29.9){
            System.out.println("You are overweight");
        }

        if(IMC >= 30){
            System.out.println("You are obese");
        }

        /*
         under weight < 18
         healthy 18.6 to 24.9
         overweight 25 to 29.9
         obese 30 and up
        */

    }
}
