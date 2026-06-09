package ud1.recuperacion;

import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constante para el sueldo base
        final double SUELDO_BASE = 1200.0;

        String cargo = "";
        int diasViaje = 0;
        char estadoCivil=' ';
        boolean valido=false;

        System.out.println("Introduce el cargo del empleado");
        System.out.println("Tester");
        System.out.println("Programador");
        System.out.println("Analista\n");
        cargo = sc.nextLine();

        // Validar días de viaje con bucle
        while (!valido) {
            System.out.print("Introduce los días de viaje visitando clientes (máx. 20): ");
            diasViaje = sc.nextInt();

            if (diasViaje < 0 || diasViaje > 20) {
                System.out.println("Error: los días de viaje deben estar entre 0 y 20.\n");
            } else
            	valido=true;
        }

        valido=false;
        // Validar estado civil con bucle
        while (!valido) {
            System.out.print("Introduce el estado civil (S - Soltero, C - Casado): ");
            estadoCivil = sc.next().toUpperCase().charAt(0);

            if (estadoCivil != 'S' && estadoCivil != 'C') {
                System.out.println("Error: estado civil no válido. Inténtalo de nuevo.\n");
            } else
            	valido=true;
        }

        // Sueldo según cargo
        double sueldoCargo = 0;
        String nombreCargo = "";
        switch (cargo) {
            case "Tester":
                sueldoCargo = SUELDO_BASE; // Junior
                nombreCargo = "Programador junior";
                break;
            case "Programador":
                sueldoCargo = SUELDO_BASE + 300; // Senior
                nombreCargo = "Programador senior";
                break;
            case "Analista":
                sueldoCargo = SUELDO_BASE * 2; // Jefe de proyecto
                nombreCargo = "Jefe de proyecto";
                break;
        }

        // Dietas
        double dietas = diasViaje * 30;

        // Sueldo bruto
        double sueldoBruto = sueldoCargo + dietas;

        // IRPF según estado civil
        double porcentajeIRPF = (estadoCivil == 'S') ? 0.25 : 0.20;
        double retencionIRPF = sueldoBruto * porcentajeIRPF;

        // Sueldo neto
        double sueldoNeto = sueldoBruto - retencionIRPF;

        // Nómina desglosada
        System.out.println("\n--- NÓMINA DEL EMPLEADO ---");
        System.out.println("Cargo: " + nombreCargo);
        System.out.println("Sueldo base: " + sueldoCargo + " euros");
        System.out.println("Dietas (" + diasViaje + " días): " + dietas + " euros");
        System.out.println("Sueldo bruto: " + sueldoBruto + " euros");
        System.out.println("Retención IRPF (" + (porcentajeIRPF * 100) + "%): -" + retencionIRPF + " euros");
        System.out.println("Sueldo neto: " + sueldoNeto + " euros");

        sc.close();
    }
}

