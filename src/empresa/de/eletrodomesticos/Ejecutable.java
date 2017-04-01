/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.de.eletrodomesticos;

import java.util.Scanner;

/**
 *
 * @author Albert Charry, Jorge Andres Duran
 */
public class Ejecutable  {// clase padre
    
        Electrodomestico lista[]= new Electrodomestico[10]; //donde se van guardara cada electrodomesticos       
    double sumaElectrodomesticos=0; // un contador para la suma de electrodomesticos
    double sumaTelevisores=0; // contador para el televisores en total
    double sumaLavadoras=0; // contador para los lavadoras en total
    Scanner entrada =  new Scanner (System.in);// para hacer el guardado de variables
    
    private Electrodomestico eletro;
    
    

    public void recorerLiista(){//donde se hace el guardado de los eletrodomesticos
        for(int i=0;i<lista.length;i++){
            if(lista[i] instanceof Electrodomestico){//operador instanceof para comprobar si el objeto es una clase concreta
                sumaElectrodomesticos+=lista[i].precioFinal();
            }if(lista[i] instanceof Lavadora){//operador instanceof para comprobar si el objeto es una clase concreta
                sumaLavadoras+=lista[i].precioFinal();
            }if(lista[i] instanceof Televisor){//operador instanceof para comprobar si el objeto es una clase concreta
                sumaTelevisores+=lista[i].precioFinal();
            }
       
        }
    }
 //
    public void ResultadosMenu(){//resultadp tolales
        recorerLiista(); // llama el metodo para imprimir
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
    }
   
    public void Menu(){// metodo del menu principal
        int desicion;
        for(int i=0; i<=10;i++){
            System.out.println("....Bienvenido...\nElectrodimestico a Seleccionar");
            System.out.println("1. Lavadora \n2. Televisor \n3. Resutados");
            desicion = entrada.nextInt();// guarda la la opcion
            if(desicion==1){// dependiendo de la opcion hace el llamado y el guardado de la posicion
                MenuLavadora();
                lista[i]= eletro;                
            }if(desicion==2){
                MenuTelevisor();
                lista[i]=  eletro;
            }if(desicion==3){
                ResultadosMenu();
                System.out.println("Gracias....");
                break;
            }if(desicion>3){
                System.out.println("No esta dentro de las opciones...");
            }           
         
         
        }
        
     }
        
    
 
    public void MenuLavadora(){//este es el menu de lavadore que hace el llamado a eso metodos
        char seguir;
        do{
            int desicion;//opciones
            System.out.println("Menu Lavadora \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color");
            desicion = entrada.nextInt();
            if(desicion==1){// dependiendo del tipo de opcion que escoja
                lavadoraDefecto();
            }if(desicion==2){
                lavadorapesoyprecio();
            }if(desicion==3){
                lavadoratodo(); 
            }if(desicion>3){//en caso de no ingresar una opcion correcta
                eletro = null;
                System.out.println("No esta dentro de las opciones...");
            }
        System.out.println("Desea Contuniar en el Menu Lavadora Si (S) o No (N): ");//do while para saber si desea continuar en la opciones
            seguir = entrada.next().charAt(0);// donde se guarda la opcion de si o no
        }while((seguir == 'S'|| seguir == 's'));//si desea continuar vuelve al menu de nuevo de lavadora
    }
    
    public void lavadoraDefecto(){//valores por defecto
        eletro = new Lavadora();
        ((Lavadora) eletro).ImprimirDefectolavadora();// imprime los datos
       
    }
    
    public void lavadorapesoyprecio(){//valores que pide y que tan ya por defecto
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee el precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  // lee el peso
        eletro = new Lavadora(precioBase, peso);
       ((Lavadora) eletro).ImprimirPrecioPesolavadora();// imrpime los datos       
    }
    
    public void lavadoratodo(){//pide todos los valores
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        int carga;
        System.out.println("Ingrese valor del Precio: ");//lo que se pide por pantalla
        precioBase = entrada.nextDouble();// guarda
        System.out.println("Ingrese valor del Peso: ");//lo que se pide por pantalla
        peso = entrada.nextDouble();  // guarda
        System.out.println("Ingrese la letra del Consumo: ");
        consumoEnergetico = entrada.next().charAt(0);// guarda
        System.out.println("Ingrese el color:");//lo que se pide por pantalla
        color = entrada.next();// guarda
        System.out.println("Ingrese Valor carga: ");//lo que se pide por pantalla
        carga = entrada.nextInt();//guarda
        eletro = new Lavadora(precioBase,peso,consumoEnergetico,color,carga);//envia los valores a la clase
        ((Lavadora) eletro).ImprmirTodolavadora();// imrpime los datos   
       
    }
    
   
    public void MenuTelevisor(){
        char seguir;
        do{
            int desicion;
            System.out.println("Menu Televisor \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n");
            desicion = entrada.nextInt();
            if( desicion == 1){
                televisorGeneral();//llama al metodo defecto del televisor
            }if(desicion ==2){
                televsorpesoyprecio();// llama metodo del televisor
            }if (desicion==3){
                televisortodo(); // llama metodo del televisor
            }if(desicion>3){
                eletro=null;
                System.out.println("No esta dentro de las opciones...");
            }
        System.out.println("Desea Contuniar en el Menu Televisor Si (S) o No (N): ");
            seguir = entrada.next().charAt(0);
        }while((seguir == 'S'|| seguir == 's'));
    }
    
    public void televisorGeneral(){
        eletro = new Televisor();
        ((Televisor)eletro).imprimir();// imprime los datos
       
    }
    
    public void televsorpesoyprecio(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");//lo que se pide por pantalla
        precioBase = entrada.nextDouble();// guarda
        System.out.println("Ingrese valor del Peso: ");//lo que se pide por pantalla
        peso = entrada.nextDouble();//guarda
        eletro= new Televisor(precioBase, peso);  //envia los datos a la clase
        ((Televisor)eletro).imprimir2();// imprime      
    }
    
    public void televisortodo(){
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        int resolucion;
        boolean sintonizadorTDT;
        System.out.println("Ingrese valor del Precio: ");//lo que se pide por pantalla
        precioBase = entrada.nextDouble();//guarda
        System.out.println("Ingrese valor del Peso: ");//lo que se pide por pantalla
        peso = entrada.nextDouble();  // guarda
        System.out.println("Ingrese la letra del Consumo: ");//lo que se pide por pantalla
        consumoEnergetico = entrada.next().charAt(0);// guarda
        System.out.println("Ingrese el color:");//lo que se pide por pantalla
        color = entrada.next();//guarda
        System.out.println("Ingrese El valor de la Resolucion: ");//lo que se pide por pantalla
        resolucion = entrada.nextInt();// guardar
        System.out.println("Sintonizador TDT:");//lo que se pide por pantalla
        sintonizadorTDT = entrada.nextBoolean();//guarda
        eletro = new Televisor(precioBase, peso,consumoEnergetico,color,resolucion,sintonizadorTDT);
        ((Televisor)eletro).imprimir3();// imprime 
   
        
    }
    
}
