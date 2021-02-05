package com.pukasoft.springdata.dao;

import com.pukasoft.springdata.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona,Long> {
}
