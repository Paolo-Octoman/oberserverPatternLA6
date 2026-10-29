import java.util.*;

public class NewsSubscriber implements Subscriber {
    private String name;
    private Set<String> preferences;

    public NewsSubscriber(String name) {
        this.name = name;
        this.preferences = new HashSet<>();
        this.preferences.add("ALL");
    }

    public void setPreferences(String... categories) {
        preferences.clear();

        for (String category : categories) {
            preferences.add(category.toUpperCase());
        }
    }

    @Override
    public void update(String category, String news) {
        if (preferences.contains("ALL") || preferences.contains(category.toUpperCase())) {
            System.out.println("Notification for " + name);
            System.out.println("Category: " + category);
            System.out.println("Breaking News: " + news);
            System.out.println();
        }
    }
}