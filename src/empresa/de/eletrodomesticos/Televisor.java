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
public class Televisor extends Electrodomestico {// clase 
     private final static int ResolucionDefecto=20;//las varibles que son estaticas y variables globales
    private int resolucion;// variables
    private boolean sintonizadorTDT;
    
    public double precioFinal(){// para definir el precio total
        double plus=super.precioFinal();
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
        return plus;
    }
    public Televisor(){//variables por defecto
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
    
    public Televisor(double precioBase, double peso){//envia las varibles que pide y las variables por defcto
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
    
    public Televisor(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);//envia las variables padre
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
       
    }
    public void imprimir(){// imprime por defecto
        System.out.println("Precio: "+PrecioBaseDefecto+"\nPeso: "+PesoDefecto+"\nConsumo"
            +ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+"\nResolucion: "+
                ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    public void imprimir2(){//impreime 
        System.out.println("Precio: "+precioBase+"\nPeso: "+peso+
                "\nConsumo"+ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+
                "\nResolucion: "+ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    public void imprimir3(){//imprime
        System.out.println("Precio: "+precioBase+"\nPeso:"+peso+"\nConsumo:"
                +consumoEnergetico+"\nColor: "+color+"\nResolucion: "
                +resolucion+"\nSintonizador TDT: "+sintonizadorTDT);
    }
}
