package structual_pattern.proxy.video_homework;

public class VideoMain {
    public static void main(String[] args) {
        IVideoService proxyVideo = new ProxyVideoService("MrBeast.mp4");
        //video will load first time
        proxyVideo.display();
        System.out.println("After loading first time");
        //video will not load at second time
        proxyVideo.display();
    }
}
