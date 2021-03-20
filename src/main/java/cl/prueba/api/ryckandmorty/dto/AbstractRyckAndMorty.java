package cl.prueba.api.ryckandmorty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Abstract para entidades de respuesta de apit externa
 *
 * @author sdiaz
 * @since 20-03-2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractRyckAndMorty {

    @Schema(description = "Identificador de la entidad")
    private Integer id;

    @Schema(description = "Nombre de la entidad")
    private String name;

    @Schema(description = "Tipo de la entidad")
    private String type;

    @Schema(description = "URL de la entidad")
    private String url;

    @Schema(description = "Fecha de creacion en base de datos")
    private Date created;
}
