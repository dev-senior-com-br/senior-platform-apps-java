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
public class CountAnalyticsDatasetOutput {

    /**
     * Retorna a quantidade de analytics que utilizam o dataset
     */
    public Long size;

}
