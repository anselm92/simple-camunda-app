package de.diebayerische.vertragsservices.controller;


import de.diebayerische.vertragsservices.exception.InternalException;
import de.diebayerische.vertragsservices.exception.VertragNotFound;
import de.diebayerische.vertragsservices.model.dto.vertrag.Vertrag;
import de.diebayerische.vertragsservices.model.json.PoliceDruckRequest;
import de.diebayerische.vertragsservices.model.json.VertragRequest;
import de.diebayerische.vertragsservices.service.VertragService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/api/v1/vertraege")
public class VertragController {

    private final
    VertragService vertragService;

    public VertragController(VertragService vertragService) {
        this.vertragService = vertragService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Collection<Vertrag> getVertraege() {
        return vertragService.getVertraege().values();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Vertrag createVertrag(@RequestBody VertragRequest request) {
        return vertragService.createVertrag(request);
    }

    @RequestMapping(value = "/druck/create", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation"),
            @ApiResponse(code = 404, message = "Police not found"),
            @ApiResponse(code = 500, message = "Internal error occurred") })
    public Boolean createPoliceDruckstueck(@RequestBody PoliceDruckRequest request) throws VertragNotFound, InternalException {
        return vertragService.createPoliceDruckstueck(request);
    }
}
