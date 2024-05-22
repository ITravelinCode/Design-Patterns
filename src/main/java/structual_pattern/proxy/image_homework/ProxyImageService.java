package structual_pattern.proxy.image_homework;
/**
 * Proxy:
 * Duy trì một tham chiếu cho phép Proxy truy cập vào Service.
 * Proxy có thể tham chiếu đến ServiceInterface nếu Service và ServiceInterface giống nhau.*/
public class ProxyImageService implements IImageService{
    private final String fileName;
    private ImageService imageService;

    public ProxyImageService(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        if(imageService == null) imageService = new ImageService(fileName);
        imageService.display();
    }
}
