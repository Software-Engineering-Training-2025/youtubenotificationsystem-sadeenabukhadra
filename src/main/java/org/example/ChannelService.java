package org.example;
import org.example.observer.Observer;
import org.example.observer.User;
import org.example.subject.Channel;
import org.example.subject.Subject;



public class ChannelService {

    public void createNewChannel(Channel channel) {
        // TODO: implement
        System.out.println( " new channel created : " + channel.getName());
    }
    public void subscribeToChannel(Channel channel, Observer observer){
        // TODO: implement
             channel.subscribe(observer);
             System.out.println("subscribed to channel " + channel.getName());

    }

    public void newContentNotification(Channel channel, String message) {
        // TODO: implement
        channel.notifyObservers(message);
    }
}
