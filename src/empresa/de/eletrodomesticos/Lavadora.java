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
     private final static int CargaDefecto=5;//varible estatica
    private int carga;// variable global
    //se terno el valor
    public int getCarga() {
        return carga;
    }
    
    public double precioFinal(){// se calcula el precio total        
        double plus=super.precioFinal();  
        if (carga>30){// hace la comparacion y asignacion
            plus+=50;
        }  
        return plus;// se retorna el valor 
    }
    
    public Lavadora(){// por defecto
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
        
    }
    
    public Lavadora(double precioBase, double peso){//se envia los valores y los valores por defecto
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
       
    }
    
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){//se envia los valores
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
        
    }
    
   public void ImprimirDefectolavadora(){// se imprime por defecto
         System.out.println("Precio: "+PrecioBaseDefecto +"\nPeso: "+ PesoDefecto
                +"\nConsumo: "+ConsumoEnergeticoDefecto+"\nColor "
                +  ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    
    public void ImprimirPrecioPesolavadora(){//impreme
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                + ConsumoEnergeticoDefecto+"\nColor "+ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    
    public void ImprmirTodolavadora(){//imprime
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                +consumoEnergetico+"\nColor:"+color+"\n Carga:"+carga);
    }
}
