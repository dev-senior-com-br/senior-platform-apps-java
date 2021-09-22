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
public class GetUserLandingPagesOutput {

    /**
     * Retorna as informações das landing pages
     */
    private java.util.List<BasicLandingPage> landingPages;

}
