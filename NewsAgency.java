import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NewsAgency {
    private List<Subscriber> subscribers;
    private String theLatest;

    public NewsAgency() {
        subscribers = new CopyOnWriteArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        if(!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("Subscriber added.");
        }
    }

    public void unsub(Subscriber subscriber) {
        if(subscribers.remove(subscriber)) {
            System.out.println("Subscriber removed.");
        }
    }

    public void publish(String category, String news) {
        theLatest = news;

        System.out.println("\nBREAKING");
        notifySubscribers(category, news);
    }

    private void notifySubscribers(String category, String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(category, news);
        }
    }

    public String getTheLatest() {
        return theLatest;
    }
}