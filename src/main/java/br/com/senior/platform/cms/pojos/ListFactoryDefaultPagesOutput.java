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
public class ListFactoryDefaultPagesOutput {

    /**
     * Os registros retornados da listagem
     */
    public java.util.List<BasicPage> pages;
    /**
     * Informações sobre os resultados da listagem
     */
    public ListInformation listInformation;

}