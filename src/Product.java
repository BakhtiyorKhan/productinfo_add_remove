public class Product {

    private int productId;
    private String productName;
    private int productPrice;

    public Product(int productId, String productName,int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice=productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Poduct Id: "+productId+"\nProduct Name: "+productName+"\nProduct price: $"+productPrice+"\n";
    }
}
