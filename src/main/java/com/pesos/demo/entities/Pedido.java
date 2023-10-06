package com.pesos.demo.entities;

import com.pesos.demo.enumeration.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Pedido  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Estado")
    private int estado;
    @Column(name = "Fecha Alta")
    private Date fechaAlta;
    @Column(name = "Fecha Baja")
    private Date fechaBaja;
    @Column(name = "Fecha Modificacion")
    private Date fechaModificacion;
    @Column(name = "Fecha Pedido")
    private Date fechaPedido;
    @Enumerated(EnumType.STRING)
    private int formaPago;
    @Column(name = "Hora Estimada")
    private Date horaEstimadaFinalizacion;

    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;
    @Column(name = "Total")
    private BigDecimal total;
    @Column(name = "Total Costo")
    private BigDecimal totalCosto;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn( name = "fk_cliente")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn( name = "fk_Domicilio")
    private Domicilio domicilio;


   /* public void agregarDetallePedido (detallePedido deta){
        detallePedido.add(deta);
    }
*/


}
