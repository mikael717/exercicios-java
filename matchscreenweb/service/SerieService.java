package br.com.alphaflix.matchscreenweb.service;

import br.com.alphaflix.matchscreenweb.dto.EpisodioDTO;
import br.com.alphaflix.matchscreenweb.dto.SerieDTO;
import br.com.alphaflix.matchscreenweb.model.Categoria;
import br.com.alphaflix.matchscreenweb.model.Serie;
import br.com.alphaflix.matchscreenweb.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repositorio;

    public List<SerieDTO> obterTodasAsSeries() {
        return converteDados(repositorio.findAll());
    }

    public List<SerieDTO> obterTop5Series(){
        return converteDados(repositorio.findTop5ByOrderByAvaliacaoDesc());
    }

    public List<SerieDTO> obterLancamentos(){
        return converteDados(repositorio.encontrarEpisodiosMaisRecentes());
    }

    public SerieDTO obterPorId(Long id){
        Optional<Serie> serie = repositorio.findById(id);

        if(serie.isPresent()){
            Serie s = serie.get();
            return new SerieDTO(s.getId(),s.getTitulo(),s.getTotalTemporadas(),s.getAvaliacao(),s.getGenero(),s.getAtores(),s.getPoster(),s.getSinopse());
        }
        return null;
    }

    private List<SerieDTO> converteDados(List<Serie> series){
        return repositorio.findAll()
                .stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(), s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse()))
                .collect(Collectors.toList());
    }

    public List<EpisodioDTO> obterTodasTemporadas(Long id) {
        Optional<Serie> serie = repositorio.findById(id);

        if(serie.isPresent()){
            Serie s = serie.get();
            return s.getEpisodios().stream()
                    .map(e -> new EpisodioDTO(e.getTemporada(), e.getNumeroEpisodio(), e.getTitulo()))
                    .collect(Collectors.toList());
        }
        return null;
    }

    public List<EpisodioDTO> obterTemporadasPorNumero(Long id, Long numero) {
        return repositorio.obterEpisodiosPorTemporada(id, numero)
                .stream()
                .map(e -> new EpisodioDTO(e.getTemporada(), e.getNumeroEpisodio(), e.getTitulo()))
                .collect(Collectors.toList());
    }

    public List<SerieDTO> obterSeriesPorCategoria(String nomeGenero) {
        Categoria categoria = Categoria.fromPortugues(nomeGenero);
        return converteDados(repositorio.findByGenero(categoria));
    }

    public List<EpisodioDTO> obterTopEpisodios(Long id) {
        var serie = repositorio.findById(id).get();
        return repositorio.topEpisodiosPorSerie(serie, PageRequest.of(0,5))
                .stream()
                .map(e -> new EpisodioDTO(e.getTemporada(),e.getNumeroEpisodio(), e.getTitulo()))
                .collect(Collectors.toUnmodifiableList());
    }
}
