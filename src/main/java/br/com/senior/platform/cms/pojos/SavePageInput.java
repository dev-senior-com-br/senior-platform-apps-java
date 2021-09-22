package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SavePageInput {

    /**
     * Identificador da página no padrão page://{domínio do tenant}/{identificador único da página}
     */
    private String id;
    /**
     * Nome da página
     */
    private String name;
    /**
     * Indica se devem ser enviadas as credenciais para os componentes da página
     */
    private Boolean credentials = false;
    /**
     * Indica se devem ser exibido a barra de ferramentas na página ou não
     */
    private Boolean includeToolbar = false;
    /**
     * Indica se os componentes possuirão tamanhos absolutos (fixos) ou relativos à tela
     */
    private PositionType positionType;
    /**
     * Os componentes da página
     */
    private java.util.List<BasicComponent> components;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param id - Identificador da página no padrão page://{domínio do tenant}/{identificador único da página}
     * @param name - Nome da página
     * @param components - Os componentes da página
     * 
     */
    public SavePageInput(String id, String name, java.util.List<BasicComponent> components) {
        this.id = id;
        this.name = name;
        this.components = components;
    }

}
