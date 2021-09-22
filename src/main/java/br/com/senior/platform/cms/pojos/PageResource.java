package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Recurso de uma página por tipo
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResource {

    /**
     * Nome do componente
     */
    private String name;
    /**
     * Tipo do componente
     */
    private ComponentType type;
    /**
     * URI do recurso
     */
    private String uri;
    /**
     * Ação do recurso
     */
    private String actionUri;

}
