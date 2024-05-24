package com.gcprojects.buscadefilmes.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
