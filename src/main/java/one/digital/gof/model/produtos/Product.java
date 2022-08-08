package one.digital.gof.model.produtos;


import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id = 0L;
    private String nome = "Seu Nome";

    @OneToOne(fetch = FetchType.LAZY)
    private InfoProduto infoProduto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public InfoProduto getInfoProduto(){return this.infoProduto;}

    public void setInfoProduto(InfoProduto infoProduto) {
        this.infoProduto = infoProduto;
    }
}
