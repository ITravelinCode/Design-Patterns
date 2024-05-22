package structual_pattern.proxy.video_homework;

public class ProxyVideoService implements IVideoService{
    private final String fileName;
    private VideoService videoService;
    public ProxyVideoService(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(videoService == null ) {
            videoService = new VideoService(fileName);
        }
        videoService.display();
    }
}
