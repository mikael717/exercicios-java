package br.com.alura.adopet.api.service;

import br.com.alura.adopet.api.dto.PetDto;
import br.com.alura.adopet.api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    PetRepository repository;

    public List<PetDto> listarPetsDisponiveis(){
        //mapeamente de entidade Pet -> objeto PetDto; Repository devolve uma entidade Pet de modo que se faz necessário a conversão
        return repository
                .findAllByAdotadoFalse()
                .stream()
                .map(PetDto::new)
                .toList();
    }
}
