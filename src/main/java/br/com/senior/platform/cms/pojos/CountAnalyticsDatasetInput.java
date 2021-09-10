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
public class CountAnalyticsDatasetInput {

    /**
     * Identificador do dataset seguindo o padrão: dataset://tenantDomain/identificadorUnico
     */
    public String datasetId;

}
