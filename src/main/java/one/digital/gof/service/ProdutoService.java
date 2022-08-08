package one.digital.gof.service;

import one.digital.gof.model.produtos.InfoProduto;
import one.digital.gof.model.produtos.Product;

public interface ProdutoService {

    Iterable<Product> buscarTodos();

    Object buscarPorId(Long id);

    void inserir(Product product);

    void inserir(Long id, InfoProduto infoProduto);

    void atualizar(Long id, Product product);

    void deletar(Long id);

}
