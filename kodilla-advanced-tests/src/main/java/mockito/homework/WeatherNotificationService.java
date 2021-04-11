package mockito.homework;

import mockito.Client;
import mockito.Notification;

import java.util.*;

public class WeatherNotificationService {

    private Map<Client, Set<String>> map = new HashMap<>();

    public void sendNotificationAboutNewRules(Notification notification) {
        this.map.forEach((client, s) -> client.receive(notification));
    }

    public void sendNotificationAboutWeatherInGivenTown(Notification notification, String town) {
        this.map.forEach((client, s) -> {
            if (s.contains(town)) {
                client.receive(notification);
            }
        });
    }

    public void removeClient(Client client) {
        map.remove(client);
    }

    public void removeLocalizationClientFromNotification(Client client,String localization) {
        map.forEach((client1, strings) -> {
            if(client1.equals(client)){
                strings.remove(localization);
            }
        });
    }

    public void addClientToNotification(Client client, List<String> town) {
        Set<String> towns = new HashSet<>(town);
        map.put(client, towns);
    }

    public void deleteLocalization(String town){
        map.forEach((client, strings) -> {
            if(strings.contains(town)){
                strings.remove(town);
            }
        });
    }

    public Map<Client, Set<String>> getMap() {
        return map;
    }
}
