package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Registro com as informações da landing page e as informações da página.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LandingPage {

    /**
     * Identificador da landing page no formato landing://{domínio do tenant}/{identificador único da página}
     */
    public String id;
    /**
     * Informações da página
     */
    public Page page;
    /**
     * Título da página
     */
    public String title;
    /**
     * Se inclui o header da página com o título
     */
    public Boolean includeHeader = false;
    /**
     * Tipo da landing page
     */
    public LandingPageType landingPageType;
    /**
     * Papéis da landing page se for compartilhada
     */
    public java.util.List<String> roles;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param id - Identificador da landing page no formato landing://{domínio do tenant}/{identificador único da página}
     * @param page - Informações da página
     * @param title - Título da página
     * @param landingPageType - Tipo da landing page
     * 
     */
    public LandingPage(String id, Page page, String title, LandingPageType landingPageType) {
        this.id = id;
        this.page = page;
        this.title = title;
        this.landingPageType = landingPageType;
    }

}
