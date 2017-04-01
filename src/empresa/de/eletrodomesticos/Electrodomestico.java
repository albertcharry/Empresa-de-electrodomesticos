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
public class Electrodomestico {//clase padre
    protected final static String ColorDefecto="blanco";//varaibles globales
    protected final static char ConsumoEnergeticoDefecto='F';
    protected final static double PrecioBaseDefecto=100; 
    protected final static double PesoDefecto=5; 
    protected double precioBase; 
    protected String color; 
    protected char consumoEnergetico;
    protected double peso;
    
    
    private void comprobarColor(String color){       // se compara el color con el ingresado
        String colores[]={"blanco", "negro", "rojo", "azul", "gris","BLANCO","NEGRO","ROJO","AZUL","GRIS"};//opcion que se recorre con un array
        boolean encontrado=false;// boolean para encontrar el color 
        for(int i=0;i<colores.length && !encontrado;i++){    
            if(colores[i].equals(color)){ 
                encontrado=true; 
            }              
        }          
        if(encontrado){//si el color fue encontrado
            this.color=color; // se hace la asignacion
        }else{
            this.color=ColorDefecto;// color por defecto BLANCo
        } 
    }
    // metodo comparar consummo energetico
   public void comprobarConsumoEnergetico(char consumoEnergetico){   // recibe el consumo       
        if(consumoEnergetico>=65 && consumoEnergetico<=70){//si se cumple la condion
            this.consumoEnergetico=consumoEnergetico;//asignacion
        }else{// si no 
            this.consumoEnergetico=ConsumoEnergeticoDefecto;
        }          
    }
   
    public double getPrecioBase() {// gets para retornar
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
    
    public double precioFinal(){
        double plus=0; //para que haga la operacion dependiendo del tipo de consumo
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
        if(peso>=0 && peso<19){// depende del peso
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }   
        return precioBase+plus;// se retorna
    }
    
    public Electrodomestico(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto);                        
    }
    
        public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto);
        
    }   
    
      public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        
    }
   
}
