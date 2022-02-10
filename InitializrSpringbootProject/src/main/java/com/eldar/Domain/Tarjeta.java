
package com.Eldar.Domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data //gracias a lombok, no tenemos que agregar GETTERS Y SETTER. @Data ya se encarga de eso ;)
public class Tarjeta {
    
    private String nombreCardHolder;
    private String apellidoCardHolder;
    private int numeroTarjeta;
    private String marcaTarjeta;
    private Date fechaVencimiento;
    private float saldoTarjeta;
    //en el navegador (NetBeans --> Ctrl + 7) podemos ver los miembros (Get,Set, etc) de los atributos 
}


