package model;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class FitnessRegistrator {

    private Set<Client> clientsInPool;
    private Set<Client> clientsInGym;
    private Set<Client> clientsInGroup;

    public FitnessRegistrator() {
        clientsInPool = new TreeSet<Client>(new CampareClients());
        clientsInGym = new TreeSet<Client>(new CampareClients());
        clientsInGroup = new TreeSet<Client>(new CampareClients());

    }

    public void addToCollection(Client client, FitnessServiceEnumeration enumeration) throws NoAccessException, QueueException {
        if (!client.getClientStatus().equals(enumeration)) {
            throw new NoAccessException("error");
        }
        if (client.getClientStatus() == (FitnessServiceEnumeration.GROUP)) {
            if (clientsInGroup.size() < 20) {
                clientsInGroup.add(client);
                client.setAddTime(LocalDateTime.now());
            } else {
                throw new QueueException("error");
            }
        } else {
            if (client.getClientStatus() == (FitnessServiceEnumeration.GYM)) {
                if (clientsInGym.size() < 20) {
                    clientsInGym.add(client);
                    client.setAddTime(LocalDateTime.now());
                } else {
                    throw new QueueException("error");
                }
            } else {
                if (client.getClientStatus() == (FitnessServiceEnumeration.POOL)) {
                    clientsInPool.add(client);
                    client.setAddTime(LocalDateTime.now());
                } else {
                    throw new QueueException("error");
                }

            }
        }
    }

    public void removeInAllCollections(Client client) {
        clientsInPool.remove(client);
        clientsInGym.remove(client);
        clientsInGroup.remove(client);
    }

    public void printAll() throws IOException {
        FitnessLogger fitnessLogger = new FitnessLogger();

        for (Client client : clientsInGym) {
            // System.out.println(client.toString());
            fitnessLogger.writeVisits(client.toStringForFile());
        }

        for (Client client : clientsInPool) {
            // System.out.println(client.toString());
            fitnessLogger.writeVisits(client.toStringForFile());
        }

        for (Client client : clientsInGroup) {
            //  System.out.println(client.toString());
            fitnessLogger.writeVisits(client.toStringForFile());
        }
        fitnessLogger.close();
    }

}

class CampareClients implements Comparator<Client> {

    @Override
    public int compare(Client firstClient, Client secondClient) {
        return String.CASE_INSENSITIVE_ORDER.compare(firstClient.getfName() + firstClient.getsName(), secondClient.getfName() + secondClient.getsName());
    }
}
