package br.com.alphaflix.matchscreenweb.service.traducao;

import br.com.alphaflix.matchscreenweb.service.ConsumoAPI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URLEncoder;

//após a criação das classes de consumo (records)
//nova classe para consultar a API do MyMemory

public class ConsultaMyMemory {
    public static String obterTraducao(String text){
        ObjectMapper mapper = new ObjectMapper();

        ConsumoAPI consumo = new ConsumoAPI();

        String texto = URLEncoder.encode(text);
        String langpair = URLEncoder.encode("en|pt-br");

        String url = "https://api.mymemory.translated.net/get?q=" + texto + "&langpair=" + langpair;

        String json = consumo.obterDados(url);

        DadosTraducao traducao;

        try {
            traducao = mapper.readValue(json, DadosTraducao.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return traducao.dadosResposta().textoTraduzido();
    }
}
