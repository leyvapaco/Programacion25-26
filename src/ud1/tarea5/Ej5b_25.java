package ud1.tarea5;

import java.util.Scanner;

public class Ej5b_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioComida = 0.0f;
        float precioBebida = 0.0f;

        System.out.println("¿Qué has tomado de comer? (palmera, donut, pitufo)");
        String comida = sc.nextLine().toLowerCase();

        switch (comida) {
            case "palmera":
                precioComida = 1.40f;
                break;
            case "donut":
                precioComida = 1.00f;
                break;
            case "pitufo":
                System.out.println("¿Con qué era el pitufo? (aceite, tortilla)");
                String tipoPitufo = sc.nextLine().toLowerCase();
                if (tipoPitufo.equals("aceite")) {
                    precioComida = 1.20f;
                } else	if (tipoPitufo.equals("tortilla")) {
                		precioComida = 1.60f;
                		}else {
                				System.out.println("Opción de pitufo no válida.");
                				return;
                		}
                break;
            default:
                System.out.println("Opción de comida no válida.");
                return;
        }

        System.out.println("¿Qué has tomado de bebida? (zumo, café)");
        String bebida = sc.nextLine().toLowerCase();

        if (bebida.equals("zumo")) {
            precioBebida = 1.50f;
        } else if (bebida.equals("café")) {
            precioBebida = 1.20f;
        } else {
            System.out.println("Opción de bebida no válida.");
            return;
        }

        float total = precioComida + precioBebida;
        System.out.printf("El precio total del desayuno es: "+ total +" euros");
    }
}
