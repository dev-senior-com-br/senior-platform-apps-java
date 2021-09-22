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
public class ListAnalyticsOutput {

    /**
     * Os registros retornados da listagem
     */
    private java.util.List<BasicAnalytic> analytics;
    /**
     * Informações sobre os resultados da listagem
     */
    private ListInformation listInformation;

}
