package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetRequestHistoryTimelineInput {

    /**
     * Identificador da instância de Processo
     */
    @NonNull
    private Integer processInstanceID;

}
