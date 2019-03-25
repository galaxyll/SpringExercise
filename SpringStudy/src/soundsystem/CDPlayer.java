package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soundsystem.CompactDisc;
import soundsystem.MediaPalyer;

@Component
public class CDPlayer implements MediaPalyer {


    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd)
    {
        this.cd = cd;
    }

    public void play()
    {
        cd.play();
    }
}
