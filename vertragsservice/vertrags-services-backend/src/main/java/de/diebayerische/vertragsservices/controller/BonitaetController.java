package de.diebayerische.vertragsservices.controller;


import de.diebayerische.vertragsservices.model.dto.kunde.Bonitaet;
import de.diebayerische.vertragsservices.model.json.BonitaetRequest;
import de.diebayerische.vertragsservices.service.BonitaetsService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/bonitaet")
public class BonitaetController {

    private final
    BonitaetsService bonitaetsService;

    public BonitaetController(BonitaetsService bonitaetsService) {
        this.bonitaetsService = bonitaetsService;
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Bonitaet calculateBonitaet(@RequestBody BonitaetRequest request) {
        return bonitaetsService.getBonitaet(request);
    }




}
