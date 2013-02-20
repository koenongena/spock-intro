package be.imtech.ict.spock.service;

import be.imtech.ict.spock.model.Band;
import be.imtech.ict.spock.repository.BandRepository;

import java.util.Map;

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
        Band coldplay = getBand("coldplay");
        return coldplay.getMembers().contains("Justin Bieber");
    }

    @Override
    public boolean areAllTheseSingersLeadSingerOfTheBand(Map<String, String> singersOfBands) {
        for (Map.Entry<String, String> singerOfBand : singersOfBands.entrySet()) {
            Band band = getBand(singerOfBand.getValue());
            if (!singerOfBand.getKey().equals(band.getLeadSinger().getName())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getLeadSingerName(String bandName) {
        return getBand(bandName).getLeadSinger().getName();
    }

    private Band getBand(String bandName) {
        if (!isInitialized()) {
            throw new IllegalStateException("Bands not yet initialized");
        }

        Band band = bandRepository.getBand(bandName);

        if (band == null) {
            throw new IllegalStateException(String.format("No band found with name %s", bandName));
        }

        return band;
    }

    public void setBandRepository(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }
}
