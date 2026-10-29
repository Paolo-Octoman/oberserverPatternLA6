public class NewsSubscriptionService {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsSubscriber alice = new NewsSubscriber("Alice");
        NewsSubscriber bob = new NewsSubscriber("Bob");
        NewsSubscriber charlie = new NewsSubscriber("Charlie");

        alice.setPreferences("TECHNOLOGY", "WORLD NEWS");
        bob.setPreferences("SPORTS");
        // Charlie receives all news (Default)

        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.subscribe(charlie);

        // Breaking news!!! We have some articles from...
        agency.publish(
            "TECHNOLOGY",
            "'Things may get ugly': Meta's new AI Muse is about to make the internet more annoying"
        );

        agency.publish(
            "SPORTS",
            "Brewers win first World Series in 57-year history"
        );

        // Removing Bob
        agency.unsub(bob);

        // Another news update
        agency.publish(
            "WORLD NEWS",
            "Luxury cruise passengers stranded in Cambodia due to soaring fuel costs"
        );

        agency.publish(
            "BUSINESS",
            "Elon Musk is a 'real genius', Putin says after satellite talks with SpaceX boss"
        );

        agency.publish(
            "ENTERTAINMENT",
            "'Like cutting up a Picasso': AI microdrama edit of Neighbours worries actors and crew"
        );
    }
}