package de.diebayerische.vertragsservices.model.dto.vertrag;

import de.diebayerische.vertragsservices.model.dto.vertrag.BerufsunfaehigkeitsVertrag;
import de.diebayerische.vertragsservices.model.dto.vertrag.Vertrag;
import de.diebayerische.vertragsservices.model.dto.vertrag.ZahnzusatzVertrag;
import de.diebayerische.vertragsservices.model.json.VertragRequest;

public class VertragFactory {
    public static Vertrag createFromRequest(VertragRequest request){
        switch (request.getType()){
            case BU:
                return new BerufsunfaehigkeitsVertrag(request.getVertragsBeginn(), "B09", request.getIban(),2000,"VN");
            case KZV:
                return new ZahnzusatzVertrag(request.getVertragsBeginn(),"S",request.getIban(), "2000/100/2", "Prestige");
            default:
                return null;
        }
    }
}
