import java.util.Scanner;

interface TV {
    public int getVolume();

    public int getChannel();

    public void changeChannel();

    public void changeVolume();

    public void raiseChannel();

    public void lowerChannel();

    public void raiseVolume();

    public void lowerVolume();
}

class NewTelevision implements TV {
    int volume = 10;
    int channel = 0;

    final int MAX_VOLUME = 50;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 450;
    final int MIN_CHANNEL = 0;

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public void changeChannel() {
        if (channel <= MAX_CHANNEL && channel >= MIN_CHANNEL) {
            Scanner a = new Scanner(System.in);
            System.out.print("Enter a channel number between 0 and 450:");
            channel = a.nextInt();
        }

    }

    public void changeVolume() {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            Scanner b = new Scanner(System.in);
            System.out.print("Enter your volume level between 0 and 50:");
            volume = b.nextInt();

        }
    }

    public void raiseVolume() {
        if (volume <= (MAX_VOLUME - 1)) {
            volume = volume + 5;
        }
    }

    public void lowerVolume() {
        if (volume >= (MIN_VOLUME + 1)) {
            volume = volume - 5;
        }
    }

    public void lowerChannel() {
        if (channel >= (MIN_CHANNEL + 1)) {
            channel = channel - 1;
        }
    }

    public void raiseChannel() {
        if (channel <= (MAX_CHANNEL - 1)) {
            channel = channel + 1;
        }
    }
}

public class TVInterface {
    public static void main(String[] args) {
        NewTelevision flatscreen = new NewTelevision();
        System.out.println(String.format("Channel = %d, Volume = %d", flatscreen.getChannel(), flatscreen.getVolume()));
        flatscreen.raiseChannel();
        flatscreen.raiseChannel();
        System.out.println(String.format("Channel = %d, Volume = %d", flatscreen.getChannel(), flatscreen.getVolume()));
    }
}