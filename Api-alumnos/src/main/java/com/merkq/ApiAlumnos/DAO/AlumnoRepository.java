package com.merkq.ApiAlumnos.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.merkq.ApiAlumnos.Modelo.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long>,Repository<Alumno, Long>{

}
