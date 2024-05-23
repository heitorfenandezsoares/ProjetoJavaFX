package com.example.projetojavafx;

import java.util.HashMap;
import java.util.Map;

public class pontuacao {
    private static Map<String, Integer> contadores;

    public pontuacao() {
        contadores = new HashMap<>();
    }

    // Incrementa o contador para um botão específico

    public static void incrementar(String botaoId) {
        contadores.put(botaoId, contadores.getOrDefault(botaoId, 0) + 1);
    }

    // Obtém o valor do contador para um botão específico

    public static int getContador(String botaoId) {
        return contadores.getOrDefault(botaoId, 0);
    }
}
