package one.digital.gof.service.impl;

import one.digital.gof.model.produtos.InfoProduto;
import one.digital.gof.model.produtos.InfoProdutoRepositorio;
import one.digital.gof.model.produtos.Product;
import one.digital.gof.model.produtos.ProdutoRepositorio;
import one.digital.gof.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProdutoService {

    private final InfoProdutoRepositorio infoProdutoRepositorio;
    private final ProdutoRepositorio produtoRepositorio;

    public ProductServiceImpl(InfoProdutoRepositorio infoProdutoRepositorio, ProdutoRepositorio produtoRepositorio) {
        this.infoProdutoRepositorio = infoProdutoRepositorio;
        this.produtoRepositorio = produtoRepositorio;
    }


    @Override
    public Iterable<Product> buscarTodos() {
        return produtoRepositorio.findAll();
    }

    @Override
    public Product buscarPorId(Long id) {
        Optional<Product> produto = produtoRepositorio.findById(id);
        return produto.orElse(null);
    }

    @Override
    public void inserir(Product product) {
        Long id = product.getId();
        if(produtoRepositorio.findById(id).isEmpty()){
            produtoRepositorio.save(product);
        }
    }

    @Override
    public void inserir(Long productId, InfoProduto infoProduto){
        String id = infoProduto.getId();
        if(infoProdutoRepositorio.findById(id).isEmpty()){
            infoProdutoRepositorio.save(infoProduto);
        }
    }

    @Override
    public void atualizar(Long id, Product product) {
        Optional<Product> productById = produtoRepositorio.findById(id);
        if(productById.isEmpty()){
            produtoRepositorio.save(product);
        }
    }

    @Override
    public void deletar(Long id) {
        produtoRepositorio.deleteById(id);
    }

}


