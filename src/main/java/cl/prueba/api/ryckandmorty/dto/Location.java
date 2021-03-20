package cl.prueba.api.ryckandmorty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Entidad extra de abstract para respuesta de locacion de api externa
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Location extends AbstractRyckAndMorty{

    @Schema(description = "Dimensión en la que se encuentra la ubicación. ")
    private String dimension;

    @Schema(description = "Lista de personajes que han sido vistos por última vez en la ubicación.")
    private List<String> residents;

}
