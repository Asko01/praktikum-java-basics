package de.esentri.javabasics;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.Scanner;

@Service
public class CalculatorService {

    // Berechne die Summe zweier Zahlen!
    public int sumUp(int a, int b) {

        return a + b;
    }

    // Berechne das Ergebnis zweier Zahlen mit gegebenem Operator!
    // Beispiel: a = 5, b = 3, Operator "*", Lösung : 15
    // Beispiel: a = 4 b = 2, Operator "/", Lösung : 2
    // Operatoren: "+", "-", "*", "/"
    public double calculateByOperator(double a, double b, String operator) {


        switch (operator) {

            // performs addition between numbers
            case "+":

                System.out.println(a + " + " + b + " = " + (a + b));
                return a + b;

            // performs subtraction between numbers
            case "-":

                System.out.println(a + " - " + b + " = " + (a - b));
                return a - b;

            // performs multiplication between numbers
            case "*":

                System.out.println(a + " * " + b + " = " + (a * b));
                return a * b;

            // performs division between numbers
            case "/":

                System.out.println(a + " / " + b + " = " + (a / b));

                return a / b;

            default:
                System.out.println("Invalid operator!");
                break;

        }
        return 0;
    }

    // Erstelle ein Mathe-Trainer Programm!
    // Die Aufgabe ist für die Schnellen unter euch, bitte erst zum Schluss erledigen.
    // Sie besteht daraus, zwei zufällige Zahlen zwischen 0 und 10 zu berechnen und
    // mit einem zufälligen Operator zu verrechnen. Die Aufgabe die aus den berechneten Zahlen
    // und dem zufälligen Operator resultiert, soll in die Konsole ausgegeben werden.
    // Dann muss der Nutzer die Lösung in die Konsole eingeben und es wird geprüft.
    // Bei richtiger Eingabe true zurückgeben, sonst false.
    // Operatoren: "+", "-", "*", "/"
    public void mathsTrainer() {
        Scanner sc = new Scanner(System.in);

        String a;
        do {
            String operatorSwitch = null;
            int b = 0;
            int c = 0;

            Random number = new Random();
            int d = number.nextInt(10) + 1;
            int e = number.nextInt(10) + 1;


            Random operatorChoice = new Random();
            int operator = operatorChoice.nextInt(4);


            switch (operator) {

                case 0:
                    operatorSwitch = "+";
                    c = d + e;
                    break;
                case 1:
                    operatorSwitch = "-";
                    c = d - e;
                    break;
                case 2:
                    operatorSwitch = "*";
                    c = d * e;
                    break;
                case 3:
                    operatorSwitch = "/";
                    c = d / e;
                    break;
                default:
                    operatorSwitch = "";
            }
            System.out.println("What is: " + d + operatorSwitch + e + "?");
            b = sc.nextInt();
            if (b != c)
                System.out.println("Wrong answer! Right answer is: " + c);
            else {
                if (b == c)
                    System.out.println("Right answer!" + c);
            }
            System.out.println("Continue? y/n");
            a = sc.next();

        } while (a.equals("y"));


    }
}



