package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Registro com as informações de uma landingPage.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BasicLandingPage {

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
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param id - Identificador da landing page no formato landing://{domínio do tenant}/{identificador único da página}
     * @param pageId - Identificador da página
     * @param title - Se inclui o header da página com o título
     * @param landingPageType - Tipo da landing page
     * 
     */
    public BasicLandingPage(String id, String pageId, String title, LandingPageType landingPageType) {
        this.id = id;
        this.pageId = pageId;
        this.title = title;
        this.landingPageType = landingPageType;
    }

}
