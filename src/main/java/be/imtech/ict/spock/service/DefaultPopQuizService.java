package be.imtech.ict.spock.service;

import be.imtech.ict.spock.repository.BandRepository;

/**
 * User: ko
 * Date: 19/02/13
 * Time: 12:52
 */
public class DefaultPopQuizService implements PopQuizService {
    private BandRepository bandRepository;

    @Override
    public boolean isJustinBieberAPartOfColdplay() {
        return true;
    }

    @Override
    public String getSinger(String bandName) {
        return null;
    }

    public void setBandRepository(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }
}
