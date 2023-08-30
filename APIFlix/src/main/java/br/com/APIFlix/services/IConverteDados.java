package br.com.APIFlix.services;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);
}
