package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informações básicas de uma página para listagem
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BasicPage {

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
     * This convenience constructor allows initialization of all required fields.
     */
    public BasicPage(String id, String name, Permission permission) {
        this.id = id;
        this.name = name;
        this.permission = permission;
    }

}
