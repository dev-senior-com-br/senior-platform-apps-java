package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da query getRankingProcesses.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetRankingProcessesOutput {

    /**
     * Lista de processos
     */
    private List<ProcessRanking> processes;

}
