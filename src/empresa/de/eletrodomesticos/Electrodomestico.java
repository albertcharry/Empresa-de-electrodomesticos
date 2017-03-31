/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.de.eletrodomesticos;

/**
 *
 * @author Albert Charry, Jorge Andres Duran
 */
public class Electrodomestico {//clase 
    protected final static String ColorDefecto="blanco";//las varibles que son estaticas y variables globales
    protected final static char ConsumoEnergeticoDefecto='F';
    protected final static double PrecioBaseDefecto=100;
    protected final static double PesoDefecto=5;
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    
    private void comprobarColor(String color){//para los colores       
        String colores[]={"blanco", "negro", "rojo", "azul", "gris","BLANCO","NEGRO","ROJO","AZUL","GRIS"};
        boolean encontrado=false;  //boolean para saber si true false
        for(int i=0;i<colores.length && !encontrado;i++){ // un for para moverse por el arreglo de los colores             
            if(colores[i].equals(color)){//un if para validar si es true
                encontrado=true;
            }              
        }          
        if(encontrado){//en caso de escojer el color
            this.color=color;
        }else{// encaso de que sea por defecto
            this.color=ColorDefecto;
        } 
    }
   public void comprobarConsumoEnergetico(char consumoEnergetico){//para comparar el cosumo energetico          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=ConsumoEnergeticoDefecto;
        }          
    }
   // los gets y los seters para el guardado y el retornar los valores
   public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
     public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public double precioFinal(){//para definir el precio dependiendo del consumo
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }   
        return precioBase+plus;
    }
    public Electrodomestico(){// las variables por defeto
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto);
        
                
    }
     public Electrodomestico(double precioBase, double peso){// variable enviadas y las variables por defectos
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto);
        
    }   
    
      public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){//variables enviadas
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        
    }
    public void ImprimirDefecto(){//imprime 
        System.out.println("Precio: "+PrecioBaseDefecto +"\nPeso: "
                + PesoDefecto+"\nConsumo: "+ ConsumoEnergeticoDefecto+"\nColor "
                +  ColorDefecto);
    }
    public void ImprimirPrecioPeso(){//imprime
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                + ConsumoEnergeticoDefecto+"\nColor "+  ColorDefecto);
    }
    public void ImprmirTodo(){//imprime
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                +consumoEnergetico+"\nColor:"+color);
    }
   
}
