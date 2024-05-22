package structual_pattern.proxy.image_homework;

public class ImageMain {
    public static void main(String[] args) {
        IImageService proxyImage = new ProxyImageService("hot-dog.jpg");
        proxyImage.display();
        System.out.println("After first time");
        proxyImage.display();
    }
}
