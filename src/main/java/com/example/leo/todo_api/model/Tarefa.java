package com.example.leo.todo_api.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private Boolean concluida = false;

}
