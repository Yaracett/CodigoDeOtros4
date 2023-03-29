package com.generation;
// El código representa el juego de piedra papel o tijera con dos jugadores
//no se estaba importando la clase Scanner
import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
  
//Se agregó el parámetro System.in a la creación del objeto Scanner s para que sepa que la entrada de datos será por consola
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
     // Se cambia al turno jugador 2
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
     //En la línea donde se crea el objeto Scanner s2, se eliminó la creación del nuevo objeto y se usó el objeto s existente
        String j2 = s.nextLine();

        //Se agregó un break statement al final del caso "papel" para evitar que se ejecuten las instrucciones del siguiente caso
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}
