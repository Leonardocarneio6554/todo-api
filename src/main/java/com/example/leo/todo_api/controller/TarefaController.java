package com.example.leo.todo_api.controller;

import com.example.leo.todo_api.model.Tarefa;
import com.example.leo.todo_api.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    public List<Tarefa> listarTodas(){
        return service.listartodas();
    }
    @PostMapping
    public Tarefa cria(@RequestBody Tarefa tarefa){
        return service.criar(tarefa);
    }
    @PutMapping("/{id}")
    public Tarefa atualizar (@PathVariable Long id, @RequestBody Tarefa tarefa){
        return service.atualizar(id, tarefa);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        service.deletar(id);
    }
}