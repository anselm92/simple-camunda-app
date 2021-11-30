package de.diebayerische.vertragsservices.service;


import de.diebayerische.vertragsservices.exception.VertragNotFound;
import de.diebayerische.vertragsservices.model.dto.vertrag.VertragFactory;
import de.diebayerische.vertragsservices.model.dto.vertrag.Vertrag;
import de.diebayerische.vertragsservices.model.json.PoliceDruckRequest;
import de.diebayerische.vertragsservices.model.json.VertragRequest;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VertragService {

    private final Map<String, Vertrag> vertraege;

    public VertragService() {
        vertraege = new HashMap<>();
    }

    /**
     * Queries all vertraege in our system.
     *
     * @return Readonly list of all vertraege
     */
    public Map<String, Vertrag> getVertraege() {
        return Collections.unmodifiableMap(vertraege);
    }

    public Vertrag createVertrag(VertragRequest vertragRequest) {
        Vertrag newVertrag = VertragFactory.createFromRequest(vertragRequest);
        vertraege.put(newVertrag.getVersicherungsscheinNummer(), newVertrag);
        return newVertrag;
    }

    public Boolean createPoliceDruckstueck(PoliceDruckRequest request) throws VertragNotFound {
        Vertrag vertrag = vertraege.get(request.getVersicherungsscheinNummer());
        if(vertrag==null){
            throw new VertragNotFound();
        }
        int integer = new Random().nextInt(10);
        if(integer >= 9)
            throw new RuntimeException("An error occured when trying to create druckstueck, please try again later");
        return true;
    }
}
