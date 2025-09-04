package distanciapuntos;

import java.util.Scanner;

public class Distanciapuntos {
	
	
	public static void main(String[] args) {
		
		double x1,x2,y1,y2,x3,y3;
		double ladoa, ladob, ladoc;
		
		double distancia1, distancia2, distancia3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese las coordenadas de x1");
		x1 = sc.nextDouble();
		System.out.println("Ingrese las coordenadas de y1");
		y1 = sc.nextDouble();		

		System.out.println("Ingrese las coordenadas de x2");
		x2 = sc.nextDouble();
		System.out.println("Ingrese las coordenadas de y2");
		y2 = sc.nextDouble();
		
		System.out.println("Ingrese las coordenadas del punto x3");
		x3 = sc.nextDouble();
		System.out.println("Ingrese las coordenadas del punto y3");
		y3 = sc.nextDouble();
		
	
		distancia1 = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
		ladoa = Math.sqrt(distancia1);
		
		distancia2 = Math.pow(x3-x2,2) + Math.pow(y3-y2,2);
		ladob = Math.sqrt(distancia2);
		
		distancia3= Math.pow(x1-x3,2) + Math.pow(y1-y3,2);
		ladoc = Math.sqrt(distancia3);
		
		if (ladoa == ladob && ladob == ladoc && ladoc == ladoa) {
			System.out.println("Es un triangulo equilatero");
		}
		else if (ladoa == ladob || ladob == ladoc || ladoc == ladoa) {
			System.out.println("El triangulo es isoceles");
		}
		else {
			System.out.println("Tu triangulo es escaleno");
		}
	        }

	}


