package org.example;
import org.example.observer.Observer;
import org.example.observer.User;
import org.example.subject.Channel;

public class Main {
    public static void main(String[] args) {
        // TODO:
        // 1. Create some Channels
        Channel programming = new Channel("It world");
        Channel travelling = new Channel("around the world");
        ChannelService service = new ChannelService();
        service.createNewChannel(programming);
        service.createNewChannel(travelling);


        // 2. Create some Users
        Observer user1 = new User("Sadeen");
        Observer user2 = new User("Talia");
        // 3. Subscribe Users to Channels
        service.subscribeToChannel(programming,user1);
        service.subscribeToChannel(travelling, user2);
        // 4. Upload videos and see notifications propagate
        service.newContentNotification(programming, "SE training");
        service.newContentNotification(travelling, "new country");
    }
}


