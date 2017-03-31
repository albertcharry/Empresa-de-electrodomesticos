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
public class Ejecutable  {// esta clase va ser la padre
    Electrodomestico lista[]=new Electrodomestico[10]; //se declara y se da el tamaño del array          
    double sumaElectrodomesticos=0;//se declaran las variables globales
    double sumaTelevisores=0;
    double sumaLavadoras=0;
    Scanner entrada =  new Scanner (System.in);//scanner para hacer el guardado
    
    public void Llenarlista(){   
        
    
    }
  
    public void guardarLista(){
        
       int i=0; 
       Electrodomestico electrodomestico =  new Electrodomestico(); 
       
       for(i=0;i<lista.length;i++){              

       lista[i]=electrodomestico;
       }
       if(i<=10){
       
       
       }
    }
    
    public void ResultadosMenu(){
        guardarLista();
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
    }
    public void Menu(){// menu principal para seleccionar el tipo electrodomestico que desee
        int desicion = -1;//se inicia el while el cual permite estar en el menu
        while(desicion !=0){
            System.out.println("....Bienvenido...\nElectrodimestico a Seleccionar");
            System.out.println("1. Electrodomestico General \n2. Lavadora \n3. Televisor \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){//un swicht para las opciones que desea entrar
                case 0://encaso de si desea salir del menu o terminar el programa
                    System.out.println("Garcias...");
                    break;
                case 1:
                    MenuElectrodomesticoGeneral();//se llama a la funcion del menu electrodomestico
                    break;
                case 2:
                     MenuLavadora();//se llama a la funcion menu del lavadora
                    break;
                case 3: 
                    MenuTelevisor();//se llama a la funcion menu del Televiso
                    break;
                default: // en caso de no ingresar un valor dentro de las opciones que estan 
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");
            }
        }
    }
    public void MenuElectrodomesticoGeneral(){// menu principal para seleccionar del electrodomestico que desee
        int desicion = -1;//se inicia el while el cual permite estar en el menu
        while(desicion !=0){
            System.out.println("Menu Electrodomestico Genral\n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){//un swicht para las opciones que desea entrar 
                case 0://encaso de si desea salir del menu electrodomestico para regresar al menu principal
                   break;
                case 1:
                    GeneralDefecto();//llama a la funcion del tipo de electrodomestico por defecto
                    break;
                case 2: 
                    PrecioCaseYPeso();// llama a la funcion 
                    break;
                case 3:
                    TodoGeneral(); //llama a la clase
                    break;
                default:////encaso de si desea salir del menu o terminar el programa
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");                    
            }
        }
    }
    public void GeneralDefecto(){//llama a la clase para que imprima el medoto 
        Electrodomestico electrodomestico =  new Electrodomestico(); 
        electrodomestico.ImprimirDefecto();
    }
    public void PrecioCaseYPeso(){//funcion en la que va pedir los valores
        double precioBase;//variables globales dentro d ela funcion
        double peso;
        System.out.println("Ingrese valor del Precio: ");// lo que va solicitar
        precioBase = entrada.nextDouble();//donde de va guardar el valor ingresado 
        System.out.println("Ingrese valor del Peso: ");// lo que va solicitar
        peso = entrada.nextDouble();//donde de va guardar el valor ingresado         
        Electrodomestico electrodomestico =  new Electrodomestico(precioBase,peso);//va enviar los valores a ala clase
        electrodomestico.ImprimirPrecioPeso();//llama al metodo de la clase llamda
    }
    public void TodoGeneral(){//clase que va solitar los valores
        double precioBase;// variables globales
        double peso;
        char consumoEnergetico;
        String color;
        System.out.println("Ingrese valor del Precio: ");// lo que va solicitar
        precioBase = entrada.nextDouble();//donde de va guardar el valor ingresado 
        System.out.println("Ingrese valor del Peso: ");// lo que va solicitar
        peso = entrada.nextDouble();  //donde de va guardar el valor ingresado 
        System.out.println("Ingrese la letra del Consumo: ");// lo que va solicitar
        consumoEnergetico = entrada.next().charAt(0);//donde de va guardar el valor ingresado 
        System.out.println("Ingrese el color:");// lo que va solicitar
        color = entrada.next();//donde de va guardar el valor ingresado 
        Electrodomestico electrodomestico =  new Electrodomestico(precioBase,peso,consumoEnergetico,color);//va enviar los valores a ala clase
        electrodomestico.ImprmirTodo();//llama al metodo de la clase llamda
    }
  
    public void MenuLavadora(){// menu principal para seleccionar del lavadora que desee
        int desicion = -1;//se inicia el while el cual permite estar en el menu
        while(desicion !=0){
            System.out.println("Menu Lavadora \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){//un swicht para las opciones que desea entrar
                case 0://opcion para salir
                   break;
                case 1://opcion para llamar a la funcion
                    lavadoraDefecto();
                    break;
                case 2: //opcion para llamar a la funcion
                    lavadorapesoyprecio();
                    break;
                case 3://opcion para llamar a la funcion
                    lavadoratodo();                            
                    break;
                default://en caso de no ingrasar un opcion de las que pedi
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");                    
            }
        }
    }
    public void lavadoraDefecto(){//se llama a la clase para que llame al metodo imprimir
        Lavadora lavadora = new Lavadora();
        lavadora.ImprimirDefectolavadora();
    }
    public void lavadorapesoyprecio(){//valores que pide
        double precioBase;//varibles globales de esta funcion
        double peso;
        System.out.println("Ingrese valor del Precio: ");//lo que va pedir 
        precioBase = entrada.nextDouble();//donde se va a guardar
        System.out.println("Ingrese valor del Peso: ");//lo que va pedir 
        peso = entrada.nextDouble();  //donde se va a guardar
        Lavadora lavadora = new Lavadora(precioBase, peso);//envia los valores a la clase 
        lavadora.ImprimirPrecioPesolavadora();//llama al metodo de la clase llamada
    }
    public void lavadoratodo(){//donde va pedir todo los valores
        double precioBase;// variables
        double peso;
        char consumoEnergetico;
        String color;
        int carga;
        System.out.println("Ingrese valor del Precio: ");//lo que va pedir 
        precioBase = entrada.nextDouble();//donde se va a guardar
        System.out.println("Ingrese valor del Peso: ");//lo que va pedir 
        peso = entrada.nextDouble();  //donde se va a guardar
        System.out.println("Ingrese la letra del Consumo: ");//lo que va pedir 
        consumoEnergetico = entrada.next().charAt(0);//donde se va a guardar
        System.out.println("Ingrese el color:");//lo que va pedir 
        color = entrada.next();//donde se va a guardar
        System.out.println("Ingrese Valor carga: ");//lo que va pedir 
        carga = entrada.nextInt();//donde se va a guardar
        Lavadora lavadora = new Lavadora(precioBase,peso,consumoEnergetico,color,carga);//envia los valores a la clase 
        lavadora.ImprmirTodolavadora();//llama al metodo de la clase llamada
    }
    
    public void MenuTelevisor(){// menu principal para seleccionar del televisor que desee
        int desicion = -1;//se inicia el while el cual permite estar en el menu
        while(desicion !=0){
            System.out.println("Menu Televisor \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){//un swicht para las opciones que desea entrar
                case 0://opcion para salir
                   break;
                case 1://opcion para llamar a la funcion
                    televisorGeneral();
                    break;
                case 2: //opcion para llamar a la funcion
                    televsorpesoyprecio();
                    break;
                case 3: //opcion para llamar a la funcion
                    televisortodo();                                            
                    break;
                default://opcion no valida
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");                    
            }
        }
    }
    public void televisorGeneral(){// menu principal para seleccionar del televisor que desee
        Televisor televisor = new Televisor();// llamada de  laclase
        televisor.imprimir();//llamado del metodo de se calse
    }
    public void televsorpesoyprecio(){//valores que va pedir 
        double precioBase;//variables
        double peso;
        System.out.println("Ingrese valor del Precio: ");//lo que va pedir 
        precioBase = entrada.nextDouble();//donde se va a guardar
        System.out.println("Ingrese valor del Peso: ");//lo que va pedir 
        peso = entrada.nextDouble();//donde se va a guardar
        Televisor televisor = new Televisor(precioBase, peso);  //envia los valores a la clase 
        televisor.imprimir2();// llama al metodo de la clase 
    }
    public void televisortodo(){// va pedir todos lo valores que va enviar a la clase
        double precioBase;// variables
        double peso;
        char consumoEnergetico;
        String color;
        int resolucion;
        boolean sintonizadorTDT;
        System.out.println("Ingrese valor del Precio: ");// lo que va pedir
        precioBase = entrada.nextDouble();//donde se va a guardar
        System.out.println("Ingrese valor del Peso: ");// lo que va pedir
        peso = entrada.nextDouble();//donde se va a guardar  
        System.out.println("Ingrese la letra del Consumo: ");// lo que va pedir
        consumoEnergetico = entrada.next().charAt(0);//donde se va a guardar
        System.out.println("Ingrese el color:");// lo que va pedir
        color = entrada.next();//donde se va a guardar
        System.out.println("Ingrese El valor de la Resolucion: ");// lo que va pedir
        resolucion = entrada.nextInt();//donde se va a guardar
        System.out.println("Sintonizador TDT:");// lo que va pedir
        sintonizadorTDT = entrada.nextBoolean();//donde se va a guardar
        Televisor televisor = new Televisor(precioBase, peso,consumoEnergetico,color,resolucion,sintonizadorTDT);//envia los valores a la clase 
        televisor.imprimir3();//llama al metodo de la clase 
        
    }
    
    
}
