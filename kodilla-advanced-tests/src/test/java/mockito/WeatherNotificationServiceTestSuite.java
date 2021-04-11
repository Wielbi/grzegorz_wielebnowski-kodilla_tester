package mockito;

import mockito.homework.WeatherNotificationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class WeatherNotificationServiceTestSuite {
    WeatherNotificationService weatherService = new WeatherNotificationService();
    Client client = Mockito.mock(Client.class);
    Client client1 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void testSendNotificationAboutNewRulesWithZeroClients() {
        weatherService.sendNotificationAboutNewRules(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void testSendNotificationAboutNewRules() {
        weatherService.addClientToNotification(client, List.of("london", "warsaw"));

        weatherService.sendNotificationAboutNewRules(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void testSendNotificationAboutWeatherInGivenTownWithZeroClients(){
        weatherService.sendNotificationAboutWeatherInGivenTown(notification,"london");
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void testSendNotificationAboutWeatherInGivenTown(){
        weatherService.addClientToNotification(client, List.of("london", "warsaw"));
        weatherService.sendNotificationAboutWeatherInGivenTown(notification,"london");
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void testRemoveClient(){
        weatherService.addClientToNotification(client, List.of("london", "warsaw"));
        weatherService.addClientToNotification(client1, List.of("london", "warsaw"));
        weatherService.removeClient(client);
        Assertions.assertEquals(1,weatherService.getMap().size());
    }

    @Test
    public void testDeleteLocalization(){
        weatherService.addClientToNotification(client, List.of("london", "warsaw"));
        weatherService.deleteLocalization("london");
        Assertions.assertEquals(1,weatherService.getMap().get(client).size());

    }

    @Test
    public void testRemoveLocalizationClientFromNotification(){
        weatherService.addClientToNotification(client, List.of("london", "warsaw"));
        weatherService.removeLocalizationClientFromNotification(client,"london");
        Assertions.assertEquals(1,weatherService.getMap().get(client).size());

    }
}
