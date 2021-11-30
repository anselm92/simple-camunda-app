package de.diebayerische.vertragsservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The queried versicherungsscheinNummer does not exist")
public class VertragNotFound extends RuntimeException {

}
