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
public class CopyAnalyticInput {

    /**
     * Identificador do analytic a ser copiado no padrão analytics://{domínio do tenant}/{identificador único do analytic}
     * ou analytics://factory/{domínio do tenant}/{identificador único do analytic}
     */
    private String analyticId;
    /**
     * Nome do novo analytics
     */
    private String name;

}
