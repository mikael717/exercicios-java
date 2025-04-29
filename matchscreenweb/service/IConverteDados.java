package br.com.alphaflix.matchscreenweb.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
