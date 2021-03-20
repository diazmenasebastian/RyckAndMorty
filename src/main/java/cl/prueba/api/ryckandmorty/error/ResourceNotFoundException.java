package cl.prueba.api.ryckandmorty.error;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

/**
 * NOT FOUND custom exception
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@ResponseStatus(NOT_FOUND)
public class ResourceNotFoundException extends ResponseStatusException {

    public ResourceNotFoundException(String message){
        super(NOT_FOUND, message);
    }
}
