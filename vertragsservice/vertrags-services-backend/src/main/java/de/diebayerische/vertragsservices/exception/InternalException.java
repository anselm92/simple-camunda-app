package de.diebayerische.vertragsservices.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "This service occasionally throws errors because it's programmed poorly")
public class InternalException extends RuntimeException {

}