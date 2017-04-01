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
public class Televisor extends Electrodomestico {// clase hija
   
    private final static int ResolucionDefecto=20;//variables globales
    private int resolucion;
    private boolean sintonizadorTDT;
    
    
    public double precioFinal(){
        double plus=super.precioFinal();// se llama la variable del  padre
        if (resolucion>40){//condcion
            plus+=precioBase*0.3;//operacion
        }
        if (sintonizadorTDT){
            plus+=50;
        }
        return plus;// se retorna
    }
    //por defceto
    public Televisor(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
    // contructor 
    public Televisor(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
        // contructor
    public Televisor(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
       
    }
        // imprime por defecto 
    public void imprimir(){
        System.out.println("Precio: "+PrecioBaseDefecto+"\nPeso: "+PesoDefecto+"\nConsumo"
            +ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+"\nResolucion: "+
                ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    // imprime los datos 
    public void imprimir2(){
        System.out.println("Precio: "+precioBase+"\nPeso: "+peso+
                "\nConsumo"+ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+
                "\nResolucion: "+ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    // imprime todo los dados
    public void imprimir3(){
        System.out.println("Precio: "+precioBase+"\nPeso:"+peso+"\nConsumo:"
                +consumoEnergetico+"\nColor: "+color+"\nResolucion: "
                +resolucion+"\nSintonizador TDT: "+sintonizadorTDT);
    }
}
