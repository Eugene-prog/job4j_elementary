package oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case (1):
                System.out.println("Пусть бегут неуклюже");
                break;
            case (2):
                System.out.println("Спокойной ночи");
                break;
            default:
                System.out.println("Песня не найдена");
                break;
        }
    }

    public static void main(String[] args) {
        Jukebox musicBox = new Jukebox();
        musicBox.music(1);
        musicBox.music(2);
        musicBox.music(3);
    }
}
