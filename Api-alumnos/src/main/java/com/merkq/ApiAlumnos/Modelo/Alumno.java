package com.merkq.ApiAlumnos.Modelo;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alumno {
	private Long id;
	private String rut;
	private String nombre;
	private String direccion;
	private Set<Materia> materiaList;

}
