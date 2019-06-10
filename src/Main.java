import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import model.Client;
import model.DayClient;
import model.FitnessRegistrator;
import model.FitnessServiceEnumeration;
import model.FullDayClient;

public class Main {

    public static void main(String[] arg) throws IOException {
        Client client = new Client("Ivan", "Ivanov", LocalDate.of(1998, Month.SEPTEMBER, 1));
        client.setClientStatus(FitnessServiceEnumeration.POOL);

           DayClient dayClient = new DayClient("i", "i", LocalDate.of(1997, Month.MARCH, 5), LocalDateTime.now().plusDays(5), 11);
        dayClient.setDayClientStatus(FitnessServiceEnumeration.GROUP);
        FullDayClient fullDayClient = new FullDayClient("I", "i", LocalDate.of(1966, Month.SEPTEMBER, 15));
        fullDayClient.setFullDayClientStatus(FitnessServiceEnumeration.POOL);

        Client client1 = new Client("ads", "yth", LocalDate.of(1998, Month.SEPTEMBER, 1));
        client1.setClientStatus(FitnessServiceEnumeration.POOL);

        Client client2 = new Client("asd", "nt", LocalDate.of(1998, Month.SEPTEMBER, 1));
        client2.setClientStatus(FitnessServiceEnumeration.GYM);

        Client client3 = new Client("Ivan", "ngf", LocalDate.of(1998, Month.SEPTEMBER, 1));
        client3.setClientStatus(FitnessServiceEnumeration.POOL);

        Client client4 = new Client("czx", "gf", LocalDate.of(1998, Month.SEPTEMBER, 1));
        client4.setClientStatus(FitnessServiceEnumeration.GYM);

        Client client5 = new Client("bghb", "gb", LocalDate.of(1998, Month.SEPTEMBER, 1));
        client5.setClientStatus(FitnessServiceEnumeration.POOL);

        Client client6 = new Client("ou", "gf", LocalDate.of(1998, Month.SEPTEMBER, 1));
        client6.setClientStatus(FitnessServiceEnumeration.GYM);

        DayClient dayClient1 = new DayClient("are", "i", LocalDate.of(1997, Month.MARCH, 5), LocalDateTime.now().plusDays(5), 11);
        dayClient1.setDayClientStatus(FitnessServiceEnumeration.GROUP);
        DayClient dayClient2 = new DayClient("fae", "i", LocalDate.of(1997, Month.MARCH, 5), LocalDateTime.now().plusDays(5), 11);
        dayClient2.setDayClientStatus(FitnessServiceEnumeration.GYM);
        DayClient dayClient3 = new DayClient("efwa", "i", LocalDate.of(1997, Month.MARCH, 5), LocalDateTime.now().plusDays(5), 11);
        dayClient3.setDayClientStatus(FitnessServiceEnumeration.GYM);
        DayClient dayClient4 = new DayClient("ferfaei", "i", LocalDate.of(1997, Month.MARCH, 5), LocalDateTime.now().plusDays(5), 11);
        dayClient4.setDayClientStatus(FitnessServiceEnumeration.GYM);
        DayClient dayClient5 = new DayClient("ifawefw", "i", LocalDate.of(1997, Month.MARCH, 5), LocalDateTime.now().plusDays(5), 11);
        dayClient5.setDayClientStatus(FitnessServiceEnumeration.GYM);
        DayClient dayClient6 = new DayClient("i", "wefai", LocalDate.of(1997, Month.MARCH, 5), LocalDateTime.now().plusDays(5), 11);
        dayClient6.setDayClientStatus(FitnessServiceEnumeration.GROUP);

        FullDayClient fullDayClient1 = new FullDayClient("Itg", "hyi", LocalDate.of(1966, Month.SEPTEMBER, 15));
        fullDayClient1.setFullDayClientStatus(FitnessServiceEnumeration.GYM);

        FullDayClient fullDayClient2 = new FullDayClient("gtgI", "yhi", LocalDate.of(1966, Month.SEPTEMBER, 15));
        fullDayClient2.setFullDayClientStatus(FitnessServiceEnumeration.POOL);

        FullDayClient fullDayClient3 = new FullDayClient("Izz", "hyi", LocalDate.of(1966, Month.SEPTEMBER, 15));
        fullDayClient3.setFullDayClientStatus(FitnessServiceEnumeration.GROUP);

        FullDayClient fullDayClient4 = new FullDayClient("Icc", "igt", LocalDate.of(1966, Month.SEPTEMBER, 15));
        fullDayClient4.setFullDayClientStatus(FitnessServiceEnumeration.GYM);

        FullDayClient fullDayClient5 = new FullDayClient("gI", "sdi", LocalDate.of(1966, Month.SEPTEMBER, 15));
        fullDayClient5.setFullDayClientStatus(FitnessServiceEnumeration.POOL);
        FullDayClient fullDayClient6 = new FullDayClient("Iyh", "ig", LocalDate.of(1966, Month.SEPTEMBER, 15));
        fullDayClient6.setFullDayClientStatus(FitnessServiceEnumeration.GYM);

        FitnessRegistrator fitnessRegistrator = new FitnessRegistrator();
        fitnessRegistrator.addToCollection(client, client.getClientStatus());
        fitnessRegistrator.addToCollection(client1, client1.getClientStatus());
        fitnessRegistrator.addToCollection(client2, client2.getClientStatus());
        fitnessRegistrator.addToCollection(client3, client3.getClientStatus());
        fitnessRegistrator.addToCollection(client4, client4.getClientStatus());
        fitnessRegistrator.addToCollection(client5, client5.getClientStatus());
        fitnessRegistrator.addToCollection(client6, client6.getClientStatus());
        fitnessRegistrator.addToCollection(dayClient, dayClient.getClientStatus());
        fitnessRegistrator.addToCollection(dayClient1, dayClient1.getClientStatus());
        fitnessRegistrator.addToCollection(dayClient2, dayClient2.getClientStatus());
        fitnessRegistrator.addToCollection(dayClient3, dayClient3.getClientStatus());
        fitnessRegistrator.addToCollection(dayClient4, dayClient4.getClientStatus());
        fitnessRegistrator.addToCollection(dayClient5, dayClient5.getClientStatus());
        fitnessRegistrator.addToCollection(dayClient6, dayClient6.getClientStatus());
        fitnessRegistrator.addToCollection(fullDayClient, fullDayClient.getClientStatus());
        fitnessRegistrator.addToCollection(fullDayClient1, fullDayClient1.getClientStatus());
        fitnessRegistrator.addToCollection(fullDayClient2, fullDayClient2.getClientStatus());
        fitnessRegistrator.addToCollection(fullDayClient3, fullDayClient3.getClientStatus());
        fitnessRegistrator.addToCollection(fullDayClient4, fullDayClient4.getClientStatus());
        fitnessRegistrator.addToCollection(fullDayClient5, fullDayClient5.getClientStatus());
        fitnessRegistrator.addToCollection(fullDayClient6, fullDayClient6.getClientStatus());
        fitnessRegistrator.printAll();
    }
}
