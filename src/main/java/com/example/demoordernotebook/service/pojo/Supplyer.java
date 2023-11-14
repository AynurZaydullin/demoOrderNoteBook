package com.example.demoordernotebook.service.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "supplyer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Supplyer {

    // Идентификатор должности, генерируется автоматически
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Название должности
    private String name;

    // Геттеры, сеттеры, конструкторы
}

