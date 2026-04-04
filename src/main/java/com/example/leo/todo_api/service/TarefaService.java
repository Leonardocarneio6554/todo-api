package com.example.leo.todo_api.service;
import com.example.leo.todo_api.model.Tarefa;
import com.example.leo.todo_api.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> listartodas(){
        return repository.findAll();
    }
    public Tarefa criar(Tarefa tarefa) {
        return repository.save(tarefa);
    }
    public Tarefa atualizar(Long id, Tarefa tarefaAtualizada){
        Tarefa tarefa = repository.findById(id).orElseThrow();
        tarefa.setTitulo(tarefaAtualizada.getTitulo());
        tarefa.setDescricao(tarefaAtualizada.getDescricao());
        tarefa.setConcluida(tarefaAtualizada.getConcluida());
        return  repository.save(tarefa);
    }
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
