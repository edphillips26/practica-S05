
package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")

    public class Estado implements Serializable{
    private static final long serialVersionUID=1L;//numero en el que inicia el incremental
    //llave primaria de la base de datos:
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)//java no genera el numero, lo genera mysql
    private long idEstado;//automaticamente sabe que en mysql es id_cliente
    private String nombre;
    private String capital;
    private int poblacion;
    private int costas;    

    public Estado() {
    }

    public Estado(String nombre, String capital, int poblacion, int costas) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
}
    
    
    
    

