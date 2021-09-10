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
public class ListLandingPagesOutput {

    /**
     * Retorna as páginas, por questões de performance, os papéis em páginas compartilhadas não será retornado
     */
    public java.util.List<BasicLandingPage> landingPages;
    /**
     * Informações sobre os resultados da listagem
     */
    public ListInformation listInformation;

}
