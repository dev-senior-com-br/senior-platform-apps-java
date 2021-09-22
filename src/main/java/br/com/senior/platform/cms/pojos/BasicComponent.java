package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informações de um componente em uma página.
 * Pode ser do tipo: basicTabsComponent, basicWidgetComponent, basicUrlComponent, basicAnalyticComponent
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BasicComponent {

    /**
     * Altura
     */
    private Long height;
    /**
     * Largura
     */
    private Long width;
    /**
     * Posição onde inicia a exibição do componente
     */
    private Position position;

}
