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
    public String id;
    /**
     * Identificador da página
     */
    public String pageId;
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
     * Papéis da landing page se for compartilhada, se omitido, não realiza alterações
     */
    public java.util.List<String> roles;

    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public SaveLandingPageInput(String id, String pageId, String title, LandingPageType landingPageType) {
        this.id = id;
        this.pageId = pageId;
        this.title = title;
        this.landingPageType = landingPageType;
    }

}
