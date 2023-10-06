package com.pesos.demo.entities;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Email")
    private String email;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Fecha Alta")
    private Date fechaAlta;
    @Column(name = "Fecha Baja")
    private Date fechaBaja;
    @Column(name = "Fecha Modificacion")
    private Date fechaModificacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Usuario")
    private Usuario usuario;

    public Cliente(){
    }


  /*  public void addDomicilio(Domicilio domicilio) {
        domicilios.add(domicilio);
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }*/
}
