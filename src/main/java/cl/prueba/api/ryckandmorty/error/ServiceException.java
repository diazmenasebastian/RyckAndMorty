package cl.prueba.api.ryckandmorty.error;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * INTERNAL_SERVER_ERROR custom exception
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@ResponseStatus(INTERNAL_SERVER_ERROR)
public class ServiceException extends ResponseStatusException {

    public ServiceException(String message){
        super(INTERNAL_SERVER_ERROR, message);
    }
}
