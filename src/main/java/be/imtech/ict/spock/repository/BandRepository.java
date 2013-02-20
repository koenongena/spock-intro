package be.imtech.ict.spock.repository;

import be.imtech.ict.spock.model.Band;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:19
 */
public interface BandRepository {

    boolean containsBands();

    Band getBand(String name);
}
