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
public class SaveLandingPageInput {

    /**
     * Identificador da landing page no formato landing://{domínio do tenant}/{identificador único da página}
     */
    private String id;
    /**
     * Identificador da página
     */
    private String pageId;
    /**
     * Título da página
     */
    private String title;
    /**
     * Se inclui o header da página com o título
     */
    private Boolean includeHeader = false;
    /**
     * Tipo da landing page
     */
    private LandingPageType landingPageType;
    /**
     * Papéis da landing page se for compartilhada, se omitido, não realiza alterações
     */
    private java.util.List<String> roles;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param id - Identificador da landing page no formato landing://{domínio do tenant}/{identificador único da página}
     * @param pageId - Identificador da página
     * @param title - Título da página
     * @param landingPageType - Papéis da landing page se for compartilhada, se omitido, não realiza alterações
     * 
     */
    public SaveLandingPageInput(String id, String pageId, String title, LandingPageType landingPageType) {
        this.id = id;
        this.pageId = pageId;
        this.title = title;
        this.landingPageType = landingPageType;
    }

}
