package br.com.projetoapi.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projetoapi.api.model.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }

}
