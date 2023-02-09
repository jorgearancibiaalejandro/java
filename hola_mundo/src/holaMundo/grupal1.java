package holaMundo;

import java.util.Scanner;

public class grupal1 {
	public static void main(String[] args) {

		/*Scanner pr=new Scanner(System.in)*/
				;
		/*string rut;
		string nombres ;
		string apellidos;
		int telefono;
		string afp;
        int sistemasalud;
	    string direccion;
		string comuna ;
		int edad;*/
		
		Scanner pr =new Scanner(System.in);
		
		System.out.println("Ingresar Rut");
        int Rut = pr.nextInt();
        
        pr.nextLine();
        
    	System.out.println("Ingresar nombres");
        String nombres =pr.nextLine();
        
        System.out.println("Ingresar apellidos");
        String Apellidos =pr.nextLine();
        
        System.out.println("Ingresar telefono");
        int Telefono =pr.nextInt();
        
        pr.nextLine();
        
        System.out.println("Ingresar afp");
	    String afp =pr.nextLine();
	       
        System.out.println("Ingresar sistema de salud(1 para fonasa, 2 para Isapre):");
        int SistemaSalud = pr.nextInt();
        if (SistemaSalud != 1&& SistemaSalud !=2) {
        	System.out.println("Error:  sistema de salud invalido.Solo puede ser 1 (fonasa) o 2(isapre).");
        	return;
        }
        
        System.out.println("Ingresar direccion");
        String direccion=sc.nextLine();
        
        pr.nextLine();
        
        System.out.println("Ingresar comuna");
        String comuna = pr.nextLine();
        
        System.out.println("Ingresar edad");
        int edad = pr.nextLine();
        
        pr.nextLine();
        
        if (edad>=18) {
        	System.out.println("usted es mayor de edad.");
        } else  {System.out.println("usted es  menor de edad");}
        
        
       
		
		System.out.println("hola," + nombres + ".+ tu rut es " + rut + " y tu  telefono es " + telefono + ".");
	    System.out.println("vives en la direccion "+direccion+" en la comuna "+comuna );
		System.out.println("tu afp es "+afp+" + " y tu sistema de salud es  "+SistemaSalud);
	}

}
