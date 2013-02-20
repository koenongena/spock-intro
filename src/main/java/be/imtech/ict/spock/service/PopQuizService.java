package be.imtech.ict.spock.service;

/**
 * User: Koen Ongena
 * Date: 18/02/13
 * Time: 22:14
 */
public interface PopQuizService {

    boolean isInitialized();

    boolean isJustinBieberAPartOfColdplay();

    String getLeadSingerName(String bandName);
}
