package interview;


import java.util.ArrayList;
import java.util.List;

interface Subscriber {
    void update(String videoDetails);
}

class User implements Subscriber {

    String name;

    public User(String name){
        this.name=name;
    }

    @Override
    public void update(String videoDetails) {
        System.out.println(name + " notification for new video:" + videoDetails);
    }
}

class Channel {
    List<User> subscribers = new ArrayList<>();

    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    public void upload(String videoDetails) {
        System.out.println("uploaded video for:" + videoDetails);
        for (User user : subscribers) {
            user.update(videoDetails);
        }
    }
}


public class YouTubeNotification {
    public static void main(String[] args) {
        Channel channel=new Channel();
        channel.addSubscriber(new User("Raj"));
        channel.addSubscriber(new User("Mohan"));

        channel.upload("java design pattern");
    }
}
