package structual_pattern.proxy.image_homework;
/**
 * Service: Định nghĩa ServiceInterface mà Proxy đại diện.*/
public class ImageService implements IImageService{
    private final String _fileName;

    public ImageService(String fileName) {
        _fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + _fileName);
    }
}
