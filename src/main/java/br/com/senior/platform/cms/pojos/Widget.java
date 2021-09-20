package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Um componente, plugável a uma página, que provê uma funcionalidade
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Widget {

    /**
     * Identificador URI desse widget. 
     */
    public String id;
    /**
     * A chave de internacionalização do nome desse widget. Chave associada ao bundle do platform.cms
     */
    public String name;
    /**
     * A chave de internacionalização da descrição desse widget. Chave associada ao bundle do platform.cms
     */
    public String description;
    /**
     * O recurso necessário para acessar esse widget
     */
    public Permission permission;
    /**
     * A URL onde esse widget se encontra
     */
    public String url;
    /**
     * A URL onde pode ser obtido o thumbnail desse widget
     */
    public String thumbnailURL;
    /**
     * As tags associadas a esse widget
     */
    public java.util.List<String> tags;
    /**
     * O tamanho preferido para melhor visualização
     */
    public PreferredSize preferredSize;

    /**
     * This convenience constructor allows initialization of all required fields.
     * 
     * @param id - Identificador URI desse widget.
     * @param name - A chave de internacionalização do nome desse widget. Chave associada ao bundle do platform.cms
     * @param url - A URL onde esse widget se encontra
     * 
     */
    public Widget(String id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

}
