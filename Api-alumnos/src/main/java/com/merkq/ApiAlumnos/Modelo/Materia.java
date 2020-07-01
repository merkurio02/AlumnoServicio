package com.merkq.ApiAlumnos.Modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Materia {

	private Long id;
	private String nombre;
	private Alumno alumno;
}
