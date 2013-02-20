package be.imtech.ict.spock.service;

import java.util.Map;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:14
 */
public interface PopQuizService {

    boolean isInitialized();

    boolean isJustinBieberAPartOfColdplay();

    /**
     *
     * @param singersOfBands key is the lead singer name, value is the band name
     * @return true if all singer names are the lead singers
     */
    boolean areAllTheseSingersLeadSingerOfTheBand(Map<String, String> singersOfBands);

    String getLeadSingerName(String bandName);
}
