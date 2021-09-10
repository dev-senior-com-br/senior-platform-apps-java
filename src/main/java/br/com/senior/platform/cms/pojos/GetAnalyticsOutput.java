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
public class GetAnalyticsOutput {

    /**
     * Analytics ordenados pelo nome
     */
    public java.util.List<BasicAnalytic> analytics;

}
