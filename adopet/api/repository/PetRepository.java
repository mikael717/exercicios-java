package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    //Spring DATA -> consulta otimizada buscando apenas os pets disponíveis
    List<Pet> findAllByAdotadoFalse();
}
