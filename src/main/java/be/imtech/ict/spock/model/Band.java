package be.imtech.ict.spock.model;

import java.util.*;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:16
 */
public class Band {

    private Collection<String> members;
    private final Singer singer;

    public Band(Singer singer, List<String> additionalMembers) {
        this.members = new HashSet<String>(additionalMembers);
        this.singer = singer;
        this.members.add(singer.getName());
    }

    public Collection<String> getMembers() {
        return Collections.unmodifiableCollection(members);
    }
}
