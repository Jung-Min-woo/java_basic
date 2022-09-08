class Product{
    static int count = 0;
    int serialNo;
    
    {
        count++;
        serialNo = count;
    }
    public Product() {} //omittable
}
class ProductTest {
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1's serial number : "+p1.serialNo);
        System.out.println("p2's serial number : "+p2.serialNo);
        System.out.println("p3's serial number : "+p3.serialNo);
        System.out.println("nProduct : "+Product.count);
        // p1's serial number : 1
        // p2's serial number : 2
        // p3's serial number : 3
        // nProduct : 3
    }
}