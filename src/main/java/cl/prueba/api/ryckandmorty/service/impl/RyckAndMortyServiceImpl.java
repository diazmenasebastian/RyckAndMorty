package cl.prueba.api.ryckandmorty.service.impl;

import cl.prueba.api.ryckandmorty.client.RyckAndMortyClient;
import cl.prueba.api.ryckandmorty.dto.Character;
import cl.prueba.api.ryckandmorty.dto.CharacterResponse;
import cl.prueba.api.ryckandmorty.dto.Location;
import cl.prueba.api.ryckandmorty.dto.OriginDTO;
import cl.prueba.api.ryckandmorty.service.RyckAndMortyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Implementacion RyckAndMortyService
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Service
@Slf4j
public class RyckAndMortyServiceImpl implements RyckAndMortyService {

    private final RyckAndMortyClient ryckAndMortyClient;

    public RyckAndMortyServiceImpl(RyckAndMortyClient ryckAndMortyClient) {
        this.ryckAndMortyClient = ryckAndMortyClient;
    }

    @Override
    public CharacterResponse getCharacterById(Integer id) {
        log.info("Se solicita personaje por id [{}]", id);
        Character character = ryckAndMortyClient.getCharacterById(id);

        String urlOrigin = character.getOrigin().getUrl();
        Location location;
        if(StringUtils.isNotEmpty(urlOrigin)) {
            location = ryckAndMortyClient.getLocationByUrl(urlOrigin);
        } else {
            location = new Location();
            location.setName(character.getOrigin().getName());
        }
        return CharacterResponse.builder()
                .id(character.getId())
                .name(character.getName())
                .status(character.getStatus())
                .species(character.getSpecies())
                .type(character.getType())
                .episode_count(character.getEpisode().size())
                .origin(OriginDTO.builder()
                        .name(location.getName())
                        .url(location.getUrl())
                        .dimension(location.getDimension())
                        .residents(location.getResidents())
                        .build())
                .build();
    }
}
