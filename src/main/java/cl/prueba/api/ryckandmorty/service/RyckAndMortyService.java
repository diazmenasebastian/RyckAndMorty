package cl.prueba.api.ryckandmorty.service;

import cl.prueba.api.ryckandmorty.dto.CharacterResponse;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Interfaz RyckAndMortyService
 *
 * @author sdiaz
 * @since 20-03-2021
 */
public interface RyckAndMortyService {

    CharacterResponse getCharacterById(@PathVariable("id") Integer id);
}
