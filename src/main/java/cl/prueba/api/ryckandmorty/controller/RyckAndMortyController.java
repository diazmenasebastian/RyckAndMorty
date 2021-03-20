package cl.prueba.api.ryckandmorty.controller;

import cl.prueba.api.ryckandmorty.dto.CharacterResponse;
import cl.prueba.api.ryckandmorty.service.RyckAndMortyService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * Controller para manejo de ryck and morty api
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Tag(name = "Ryck And Morty", description = "Ryck And Morty Api")
@RestController
@RequestMapping("/v1")
@Slf4j
public class RyckAndMortyController {

    private static final String[] DISALLOWED_FIELDS = {};

    private final RyckAndMortyService ryckAndMortyService;

    public RyckAndMortyController(RyckAndMortyService ryckAndMortyService) {
        this.ryckAndMortyService = ryckAndMortyService;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setDisallowedFields(DISALLOWED_FIELDS);
    }

    @Operation(description = "Obtener personajes por identificador")
    @ApiResponse(responseCode = "200", description = "Personaje obtenido correctamente")
    @ApiResponse(responseCode = "404", description = "Personaje no encontrado")
    @ApiResponse(responseCode = "500", description = "Error al obtener personaje")
    @GetMapping("/{id}")
    public CharacterResponse getCharacterById(@PathVariable("id") Integer id){
        log.info("Se solicita personaje por id [{}]", id);
        return ryckAndMortyService.getCharacterById(id);
    }
}