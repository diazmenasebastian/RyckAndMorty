package cl.prueba.api.ryckandmorty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Entidad extra de abstract para respuesta de personajes de api externa
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Character extends AbstractRyckAndMorty{

    @Schema(description = "Estado del personaje (Alive, Dead, Unknown, etc.)")
    private String status;

    @Schema(description = "Especie del personaje (Human, Zombie, Mythological Creature, etc.)")
    private String species;

    @Schema(description = "Género del personaje ('Femenino', 'Masculino', 'Sin género' o 'Desconocido').")
    private String gender;

    @Schema(description = "Nombre y url a la ubicación de origen del personaje.")
    private Ubiety origin;

    @Schema(description = "Nombre y url a la última ubicación conocido del personaje.")
    private Ubiety location;

    @Schema(description = "Url de la imagen del personaje.")
    private String image;

    @Schema(description = "Lista de episodios en los que apareció este personaje.")
    private List<String> episode;


}
