package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class LinkAttachmentsInput {

    /**
     * Identificadores de anexo
     */
    public List<String> ids;
    /**
     * Identificador da instância de processo a qual o arquivo pertence.
     */
    public Long processInstance;

}
