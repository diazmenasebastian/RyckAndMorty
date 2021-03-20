package cl.prueba.api.ryckandmorty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad para manejo de ubicaciones (origen y locacion)
 * en respuesta de api externa
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ubiety {

    @Schema(description = "Nombre de la ubicación")
    private String name;

    @Schema(description = "Url de la ubicación")
    private String url;
}