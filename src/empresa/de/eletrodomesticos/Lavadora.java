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
public class Lavadora extends Electrodomestico {//clase hija
    private final static int CargaDefecto=5; // varible estatica
    private int carga;// variable pedida
    
    
    public int getCarga() {//para retonar
        return carga;
    }
   
    public double precioFinal(){        
        double plus=super.precioFinal();  // se llama el precio final del padre
        if (carga>30){// siempre y cunado caragga cumpla con la condicion
            plus+=50;
        }  
        return plus;// se retorna
    }
    public Lavadora(){    // contructor 

        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
        
    }
    // contructor por defecto con varibles pedidas 
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
       
    }
    // contructor
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
        
    }
    // imprime los datos por defecto
    public void ImprimirDefectolavadora(){
        System.out.println("Precio: "+PrecioBaseDefecto +"\nPeso: "+ PesoDefecto
                +"\nConsumo: "+ConsumoEnergeticoDefecto+"\nColor "
                +  ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    // imprime 
    public void ImprimirPrecioPesolavadora(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                + ConsumoEnergeticoDefecto+"\nColor "+ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    // imprime todo 
    public void ImprmirTodolavadora(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                +consumoEnergetico+"\nColor:"+color+"\n Carga:"+carga);
    }
    
}
