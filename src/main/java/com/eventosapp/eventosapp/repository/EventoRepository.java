package com.eventosapp.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventoapp.eventoapp.models.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String>{

}
