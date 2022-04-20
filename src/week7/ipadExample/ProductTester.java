package week7.ipadExample;

public class ProductTester {
    public static void main(String[] args)  {
//        Product bigPro = new Product(iPad);
//        Product pro = new Product("iPad Pro 11", 64, "not cellular");
//        Product iPad = new Product("iPad", 32, "cellular");


        Product iPad = new Product(new iPad(32, true));
        Product iPadPro11 = new Product(new iPadPro11(64, true));
        Product iPadPro129 = new Product(new iPadPro129(256, true ));

        System.out.println(iPad + "\n");
        System.out.println(iPadPro11 + "\n");
        System.out.println(iPadPro129 + "\n");


    }

}
