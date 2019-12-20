package club.kittypiggy.designpattern.prototype;

public class ProductCheck {

    public static Product check(Product product) throws CloneNotSupportedException {
        if (product.weight > 10) {
            Object o = product.clone();
            return (Product)o;
        }
        return new Product();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ProductA pa = new ProductA();
        System.out.println("origin:" + pa);
        ProductA cpa = (ProductA) check(pa);
        System.out.println("cloned:" + cpa);
        System.out.println(cpa.weight);
    }
}
