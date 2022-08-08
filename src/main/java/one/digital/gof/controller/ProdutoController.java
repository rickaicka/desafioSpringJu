package one.digital.gof.controller;

import one.digital.gof.model.produtos.Product;
import one.digital.gof.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Product>> buscarTodos(){return ResponseEntity.ok(produtoService.buscarTodos());}

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable String id){
        return ResponseEntity.ok(produtoService.buscarPorId(Long.valueOf(id)));
    }

    @PostMapping
    public ResponseEntity<Product> inserir(@RequestBody Product product){
        produtoService.inserir(product);
        return ResponseEntity.ok(product);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Product> atualizar(@RequestBody Long id, Product product){
        produtoService.atualizar(id, product);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletar(Long id){
        produtoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
