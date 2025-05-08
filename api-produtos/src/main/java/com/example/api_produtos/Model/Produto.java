package com.example.api_produtos.Model;

import lombok.Data;

@Data
public class Produto {
    private Long id;
    private String nome;
    private double valor;
    private int quantidade;
}