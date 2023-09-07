package br.com.projetoapi.api.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projetoapi.api.model.Pessoa;
import br.com.projetoapi.api.repo.Repo;
import br.com.projetoapi.api.servico.Servico;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controle {

    @Autowired
    private Repo acao;

    @Autowired
    private Servico servico;

    @PostMapping("/api")
    public ResponseEntity<?> cadastrar(@RequestBody Pessoa obj) {
        return servico.cadastrar(obj);
    }

    @GetMapping("/api")
    public ResponseEntity<?> selecionar() {
        return servico.selecionar();
    }

    @GetMapping("/api/{codigo}")
    public ResponseEntity<?> selecionarPeloCodigo(@PathVariable int codigo) {
        return servico.selecionarPeloCodigo(codigo);
    }

    @PutMapping("/api")
    public ResponseEntity<?> editar(@RequestBody Pessoa obj) {
        return servico.editar(obj);
    }

    @DeleteMapping("/api/{codigo}")
    public ResponseEntity<?> remover(@PathVariable int codigo) {
        return servico.remover(codigo);
    }

    @GetMapping("/api/contador")
    public long contador() {
        return acao.count();
    }

    @GetMapping("/api/ordenarNomes")
    public List<Pessoa> ordenarNomes() {
        return acao.findByOrderByNome();
    }

    @GetMapping("/api/ordenarNomes2")
    public List<Pessoa> ordenarNomes2() {
        return acao.findByNomeOrderByIdade("wash");
    }

    @GetMapping("/api/nomeContem")
    public List<Pessoa> nomeContem() {
        return acao.findByNomeContaining("w");
    }

    @GetMapping("/api/iniciaCom")
    public List<Pessoa> iniciaCom() {
        return acao.findByNomeStartsWith("w");
    }

    @GetMapping("/api/terminaCom")
    public List<Pessoa> terminaCom() {
        return acao.findByNomeEndsWith("w");
    }

    @GetMapping("/api/somaIdades")
    public int somaIdades() {
        return acao.somaIdades();
    }

    @GetMapping("/api/idadeMaiorIugal")
    public List<Pessoa> idadeMaiorIgual() {
        return acao.idadeMaiorIgual(18);
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

    @GetMapping("/status")
    public ResponseEntity<?> status() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
