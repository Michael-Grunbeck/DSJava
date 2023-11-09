import java.nio.channels.Channel;
import java.util.Scanner;

class TV {
    public static Object changeVolume;
    final int MAX_VOLUME = 25;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 300;
    final int MIN_CHANNEL = 0;
    int Volume = 10;
    int Channel = 0;
    

    public int getChannel() {
        return Channel;
    }

    public int getVolume() {
        return Volume;
    }

    public void changeChannel() {
        if (Channel <= MAX_CHANNEL && Channel >= MIN_CHANNEL) {
            Scanner a = new Scanner(System.in);
            System.out.print("Enter a channel number between 0 and 300:");
            Channel = a.nextInt();
        }

    }

    public void changeVolume() {
        if (Volume >= MIN_VOLUME && Volume <= MAX_VOLUME) {
            Scanner b = new Scanner(System.in);
            System.out.print("Enter your volume level between 0 and 25:");
            Volume = b.nextInt();

        }
    }

    public void raiseVolume(){
       if (Volume<=(MAX_VOLUME-1)){
       Volume=Volume+1;
    }
}
    
    public void lowerVolume(){
        if (Volume>=(MIN_VOLUME+1)){
            Volume=Volume-1;
        }
    }
    public void lowerChannel(){
        if (Channel>=(MIN_CHANNEL+1)){
            Channel=Channel-1;
        }
    }
    public void raiseChannel(){
       if (Channel<=(MAX_CHANNEL-1)){
       Channel=Channel+1;
    }
    }
}

    public class OODemo {
        public static void main(String[] args) {
            TV television = new TV();
        System.out.println(String.format("Channel = %d, Volume = %d", television.getChannel(), television.getVolume()));
        for (int i =0; i<=5; i++){
            System.out.println("Raising the volume");
            System.out.println(String.format("Channel = %d, Volume = %d", television.getChannel(), television.getVolume()));
            television.raiseVolume();
        }

        }
    }


