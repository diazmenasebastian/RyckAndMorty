package cl.prueba.api.ryckandmorty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO para representacion de origen en dto de respuesta de api
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OriginDTO {

    @Schema(description = "Nombre del planeta de origen")
    private String name;

    @Schema(description = "URL del planeta de origen")
    private String url;

    @Schema(description = "Nombre de la dimensión a la cual pertenece el planeta")
    private String dimension;

    @Schema(description = "URL de personajes que residen en el planeta")
    private List<String> residents;
}
