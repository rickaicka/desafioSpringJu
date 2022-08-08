package one.digital.gof.model.produtos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoProdutoRepositorio extends CrudRepository<InfoProduto, String>{

}
