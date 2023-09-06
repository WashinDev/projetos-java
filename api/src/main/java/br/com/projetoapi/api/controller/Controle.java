package br.com.projetoapi.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projetoapi.api.model.Pessoa;
import br.com.projetoapi.api.repo.Repo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controle {

    @Autowired
    private Repo acao;

    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }

    @GetMapping("/api")
    public List<Pessoa> selecionar() {
        return acao.findAll();
    }

    @GetMapping("/api/{codigo}")
    public Pessoa selecionarPeloCodigo(@PathVariable int codigo) {
        return acao.findByCodigo(codigo);
    }

    @PutMapping("/api")
    public Pessoa editar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }

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
