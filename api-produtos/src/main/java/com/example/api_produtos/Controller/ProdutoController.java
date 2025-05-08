package com.example.api_produtos.Controller;

import com.example.api_produtos.Model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        produto.setId((long) (produtos.size() + 1));
        produtos.add(produto);
        return produto;
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtos;
    }
}