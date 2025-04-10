package br.com.alphaflix.matchscreenweb.dto;

import br.com.alphaflix.matchscreenweb.model.Categoria;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double avaliacao,
                       Categoria genero,
                       String atores,
                       String poster,
                       String sinopse) {
}
