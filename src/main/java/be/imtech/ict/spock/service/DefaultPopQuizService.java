package be.imtech.ict.spock.service;

import be.imtech.ict.spock.model.Band;
import be.imtech.ict.spock.repository.BandRepository;

/**
 * User: ko
 * Date: 19/02/13
 * Time: 12:52
 */
public class DefaultPopQuizService implements PopQuizService {
    private BandRepository bandRepository;

    @Override
    public boolean isInitialized() {
        return bandRepository.containsBands();
    }

    @Override
    public boolean isJustinBieberAPartOfColdplay() {
        if (!isInitialized()) {
            throw new IllegalStateException("Bands not yet initialized");
        }
        Band coldplay = bandRepository.getBand("coldplay");
        return coldplay.getMembers().contains("Justin Bieder");
    }

    @Override
    public String getLeadSingerName(String bandName) {
        if (!isInitialized()) {
            throw new IllegalStateException("Bands not yet initialized");
        }
        return bandRepository.getBand(bandName).getLeadSinger().getName();
    }

    public void setBandRepository(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }
}
