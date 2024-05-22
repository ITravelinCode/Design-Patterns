package structual_pattern.proxy.video_homework;

public class VideoService implements IVideoService{
    private final String _fileName;

    public VideoService(String fileName) {
        _fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + _fileName);
    }
}
