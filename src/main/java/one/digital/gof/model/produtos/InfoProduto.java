package one.digital.gof.model.produtos;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InfoProduto {

    @Id
    private String id = "0";
    private String productName = "Nome do seu Produto";
    private String productType = "Tipo do seu Produto";
    private Integer productPrice = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

}

