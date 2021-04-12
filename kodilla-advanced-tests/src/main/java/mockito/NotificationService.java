package mockito;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void addSubscriber(Client client) {
        clients.add(client);
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
}