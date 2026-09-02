package commandPattern;

public class IncreaseVolume implements Command{

    private MusicPlayer sound;

    public IncreaseVolume(MusicPlayer sound){
        this.sound = sound;
    }
    
    @Override
    public String execute() {
        return sound.IncreaseVolume();
    }
}