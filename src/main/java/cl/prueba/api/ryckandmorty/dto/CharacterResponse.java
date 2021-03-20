package cl.prueba.api.ryckandmorty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para respuesta de la api
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterResponse {

    @Schema(description = "Id del personaje consultado")
    private Integer id;

    @Schema(description = "Nombre del personaje")
    private String name;

    @Schema(description = "Estado del personaje (Alive, Dead, Unknown, etc.)")
    private String status;

    @Schema(description = "Especie del personaje (Human, Zombie, Mythological Creature, etc.)")
    private String species;

    @Schema(description = "Tipo de sub especie del personaje (God, Devil, Monster, etc)")
    private String type;

    @Schema(description = "La cantidad de episodios donde el personaje aparece")
    private Integer episode_count;

    @Schema(description = "Objeto con datos acerca del origen del personaje")
    private OriginDTO origin;
}
