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
public class ListWidgetsOutput {

    /**
     * Os widgets que o usuário possui permissão de visualizar
     */
    private java.util.List<Widget> widgets;
    /**
     * Informações sobre os resultados da listagem
     */
    private ListInformation listInformation;

}
