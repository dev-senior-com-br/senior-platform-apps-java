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
    public String name;
    /**
     * Tipo do componente
     */
    public ComponentType type;
    /**
     * URI do recurso
     */
    public String uri;
    /**
     * Ação do recurso
     */
    public String actionUri;

}
