package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor extends Base{
    @Column(name = "nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name = "biografia", length = 3500)
    private String biografia;


}
