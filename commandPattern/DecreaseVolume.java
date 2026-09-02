package commandPattern;

public class DecreaseVolume implements Command{

    private MusicPlayer sound;

    public DecreaseVolume(MusicPlayer sound){
        this.sound = sound;
    }
    
    @Override
    public String execute() {
        return sound.DecreaseVolume();
    }
}