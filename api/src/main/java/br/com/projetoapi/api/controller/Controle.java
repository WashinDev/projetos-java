package br.com.projetoapi.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controle {

    @GetMapping("")
    public String mensagem() {
        return "Hello World";
    }

    @GetMapping("/boasVindas")
    public String boasVinda() {
        return "Seja Bem Vindo(a)";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVinda(@PathVariable String nome) {
        return "Seja Bem Vindo(a) " + nome;
    }

}
