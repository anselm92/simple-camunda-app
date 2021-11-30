package de.diebayerische.vertragsservices.service;

import de.diebayerische.vertragsservices.model.json.BonitaetRequest;
import org.springframework.stereotype.Component;
import de.diebayerische.vertragsservices.model.dto.kunde.Bonitaet;

@Component
public class BonitaetsService {
    public Bonitaet getBonitaet(BonitaetRequest request) {
       return new Bonitaet(Math.random()*100);
    }
}
