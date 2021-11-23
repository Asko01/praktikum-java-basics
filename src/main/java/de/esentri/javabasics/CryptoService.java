package de.esentri.javabasics;

import org.springframework.stereotype.Service;
// Import Java libraries
import java.util.Scanner;

@Service
public class CryptoService {

  /*
   * Diese Methode soll den Input-Parameter encrypten, also verschlüsseln.
   * Und zwar soll jeder Buchstabe um 5 Zeichen im Alphabet nach vorne gesetzt werden.
   * Beispiel: Für den Input "Praktikum" soll der Wert "Uwfpynpzr" zurückgegeben werden.
   */
  public String encrypt(String input) {

    String message = "Praktikum";
    int key = 5;
    char[] chars = message.toCharArray();

    for (char i : chars) {
      i += key;
      System.out.print(i);
    }
    return message;
  }

  /*
   * Diese Methode soll den Input-Parameter decrypten, also entschlüsseln.
   * Und zwar so, dass die aus der encrypt()-Methode verschlüsselten codes wieder lesbar werden.
   * * Beispiel: Für den Input "Uwfpynpzr" soll der Wert "Praktikum" zurückgegeben werden.
   */
  public String decrypt(String input) {
  String a;
    return input;
  }
}
