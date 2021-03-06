package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da query getProcessInstance.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetProcessInstanceOutput {

    /**
     * Objeto que representa uma instância de processo
     */
    private ProcessInstance processInstance;

}
