package commandPattern;

public class MusicPlayer {

    private int volumeOfMusic = 45;

    public Integer getVolumeOfMusic() {
        return volumeOfMusic;
    }

    public void setVolumeOfMusic(Integer volumeOfMusic) {
        this.volumeOfMusic = volumeOfMusic;
    }

    public String DecreaseVolume(){
        volumeOfMusic -= 10;
        return "The volume is now: " + volumeOfMusic;
    }

    public String IncreaseVolume(){
        volumeOfMusic += 10;
        return "The volume is now: " + volumeOfMusic;
    }
}