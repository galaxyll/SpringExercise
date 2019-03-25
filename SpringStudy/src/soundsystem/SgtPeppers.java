package soundsystem;


import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "披头士";

    @Override
    public void play() {
        System.out.println("正在播放"+artist+"的"+title);
    }
}
