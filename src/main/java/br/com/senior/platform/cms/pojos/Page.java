package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informações completas de uma página e todos seus componentes
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Page {

    /**
     * Identificador da página no padrão page://{domínio do tenant}/{identificador único da página}
     */
    public String id;
    /**
     * Nome da página
     */
    public String name;
    /**
     * Indica se devem ser enviadas as credenciais para os componentes da página
     */
    public Boolean credentials = false;
    /**
     * Indica se os componentes possuirão tamanhos absolutos (fixos) ou relativos à tela
     */
    public PositionType positionType;
    /**
     * Permissão necessária para visualizar a página
     */
    public Permission permission;
    /**
     * Os componentes da página
     */
    public java.util.List<Component> components;
    /**
     * Mostrar o barra de ferramentas na página
     */
    public Boolean includeToolbar = false;

    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Page(String id, String name, Permission permission, java.util.List<Component> components) {
        this.id = id;
        this.name = name;
        this.permission = permission;
        this.components = components;
    }

}