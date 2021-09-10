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
public class CopyPageInput {

    /**
     * Identificador da página a ser copiada no padrão page://{domínio do tenant}/{identificador único da página}
     */
    public String pageId;
    /**
     * Nome da nova página
     */
    public String name;

}
