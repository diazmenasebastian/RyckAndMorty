package cl.prueba.api.ryckandmorty.client;

import cl.prueba.api.ryckandmorty.dto.Character;
import cl.prueba.api.ryckandmorty.dto.Location;
import cl.prueba.api.ryckandmorty.error.ResourceNotFoundException;
import cl.prueba.api.ryckandmorty.error.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Cliente para Api externa de ryck and morty
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Component
@Slf4j
public class RyckAndMortyClient {

    private final RestTemplate restTemplate;

    public RyckAndMortyClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Character getCharacterById(Integer id){
        log.info("Se solicita personaje por id [{}]", id);
        String url = String.format("https://rickandmortyapi.com/api/character/%d", id);
        try {
            return restTemplate.getForObject(url, Character.class);
        } catch (HttpClientErrorException.NotFound x){
            log.error("error, personaje no encontrado");
            throw new ResourceNotFoundException("personaje no encontrado");
        } catch (Exception e){
            log.error("Error al consultar personaje");
            throw new ServiceException("Error al consultar personaje");

        }
    }

    public Location getLocationByUrl(String url){
        log.info("Se solicita locacion por url [{}]", url);
        try {
            return restTemplate.getForObject(url, Location.class);
        } catch (HttpClientErrorException.NotFound x){
            log.error("error, locacion no encontrada");
            throw new ResourceNotFoundException("locacion no encontrada");
        } catch (Exception e){
            log.error("Error al consultar locacion");
            throw new ServiceException("Error al consultar locacion");
        }
    }
}
