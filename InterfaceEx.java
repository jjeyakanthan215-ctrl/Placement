interface  Camera {
    void clickPic();
}
interface MusicPlayer{
    void playMusic();
}
class phone implements Camera, MusicPlayer{
    @Override
    public void clickPic(){
        System.out.println("picture clicked");

    }
    @Override
    public void playMusic(){
        System.out.println("Music playing");

    }
}

public class InterfaceEx {
    public static void main(String[] a){
        phone p = new phone();
        p.clickPic();
        p.playMusic();
    }
}
