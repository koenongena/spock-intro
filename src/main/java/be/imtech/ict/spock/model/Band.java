package be.imtech.ict.spock.model;

import java.util.*;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:16
 */
public class Band {

    private Collection<String> members;
    private final Singer leadSinger;

    public Band(Singer leadSinger, List<String> additionalMembers) {
        this.members = new HashSet<String>(additionalMembers);
        this.leadSinger = leadSinger;
        this.members.add(leadSinger.getName());
    }

    public Singer getLeadSinger() {
        return leadSinger;
    }

    public Collection<String> getMembers() {
        return Collections.unmodifiableCollection(members);
    }
}
