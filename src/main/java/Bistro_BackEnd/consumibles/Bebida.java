package Bistro_BackEnd.consumibles;
import Bistro_BackEnd.Orden.Orden;

import javax.persistence.*;

@Entity
public class Bebida extends Consumible {
    
    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Orden orden;
    @Enumerated(EnumType.STRING)
    private TamanioBebida tamanio;

    public Bebida() {
    }

    // Constructor
    public Bebida(String nombre, TamanioBebida tamanio, double precio) {
        super(nombre, precio);
        this.tamanio = tamanio;
    }

    //Getters

    public Orden getOrden() {
        return orden;
    }

    public TamanioBebida getTamanio(){
        return tamanio;
    }

    //Setters

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public void setTamanio(TamanioBebida tamanio){
        this.tamanio = tamanio;
    }
}
