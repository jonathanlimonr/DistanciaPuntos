package TRABAJOS;

public class DistanciaPuntos {

	package TRABAJOS;

	import java.util.Scanner;

	public class Practica2TPOA {

	    public static void main(String[] args) {
	        DistanciaPuntos dp = new DistanciaPuntos();
	        dp.calcularTriangulo();
	    }
	}

	
	class DistanciaPuntos {

	    public void calcularTriangulo() {
	        Scanner entrada = new Scanner(System.in);

	        System.out.println("Ingrese x1 y y1 (punto A): ");
	        double x1 = entrada.nextDouble();
	        double y1 = entrada.nextDouble();

	        System.out.println("Ingrese x2 y y2 (punto B): ");
	        double x2 = entrada.nextDouble();
	        double y2 = entrada.nextDouble();

	        System.out.println("Ingrese x3 y y3 (punto C): ");
	        double x3 = entrada.nextDouble();
	        double y3 = entrada.nextDouble();

	        double ladoAB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	        double ladoBC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	        double ladoCA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

	        System.out.printf("AB = %.2f\n", ladoAB);
	        System.out.printf("BC = %.2f\n", ladoBC);
	        System.out.printf("CA = %.2f\n", ladoCA);

	      
	         if (ladoAB == ladoBC && ladoBC == ladoCA) {
	            System.out.println("El triángulo es equilátero.");
	        } else if (ladoAB == ladoBC || ladoBC == ladoCA || ladoCA == ladoAB) {
	            System.out.println("El triángulo es isósceles.");
	        } else {
	            System.out.println("El triángulo es escaleno.");
	        }

	        entrada.close();
	    }
	}

	
}
