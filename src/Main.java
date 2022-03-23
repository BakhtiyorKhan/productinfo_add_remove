import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        initList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Add product");
        System.out.println("2-Show all product");
        System.out.println("3-Remove product");
        System.out.println("4-Found product");
        System.out.println("5-Exit");
        System.out.print("Select: ");
        switch (scanner.nextInt()){
            case 1:
                Scanner scanner1 =new Scanner(System.in);
                System.out.print("Product name:");
                String name= scanner1.nextLine();
                System.out.print("Id:");
                int id =scanner1.nextInt();
                System.out.print("Price:");
                int price= scanner1.nextInt();
                addProduct(id,name,price);
                break;
            case 2:
                showAllProduct();
                break;
            case 3:
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Product name search:");
                String query = scanner2.nextLine();
                deleteProduct(query);
                break;
            case 4:
                Scanner scanner3 = new Scanner(System.in);
                System.out.print(" Found name: ");
                String foundQuery = scanner3.nextLine();
                foundProduct(foundQuery);
                break;
            case 5:
                break;
        }



    }

    static void addProduct(int indexId,String strName,int Price){
        productList.add(new Product(indexId,strName,Price));
        for (Product product:productList){
            System.out.println(product.toString());
        }
    }
    static void showAllProduct(){
        for (Product product:productList){
            System.out.println(product.toString());
        }
    }
    static void deleteProduct(String deleteProduct){
        boolean isFound = false;
        Product deletProduct=null;
        for (Product product:productList){
            if (product.getProductName().toLowerCase().equals(deleteProduct.toLowerCase())){
                isFound =true;
                deletProduct=product;
            }
        }
        if (!isFound)
            System.out.println("Product not found...");
        else {
            productList.remove(deletProduct);
            System.out.println(deletProduct.getProductName()+" deleted...");
        }


    }
    static void foundProduct(String query){
        boolean isFound = false;
        Product fProduct = null;
        for (Product product:productList){
            if (product.getProductName().toLowerCase().contains(query.toLowerCase())){
                fProduct =product;
                isFound=true;
            }
        }
        if (!isFound)
            System.out.println(" Not Found!");
        else {
            System.out.println(fProduct.toString());
        }

    }
    static void  initList(){
        productList.add(new Product(1,"Apple",1200));
        productList.add(new Product(2,"Samsung",800));
        productList.add(new Product(3,"Nokia",200));
    }
}
