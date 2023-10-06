package com.pesos.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Rubro Articulo ")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RubroArticulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;
    private Date fecha_Alta;
    private Date fecha_Baja;
    private Date fecha_modificacion;

}
