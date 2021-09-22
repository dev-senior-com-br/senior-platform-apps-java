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
public class SaveLandingPagesOrderInput {

    /**
     * Os identificadores das landing pages na ordem que elas devem ser apresentadas
     */
    private java.util.List<String> landingPageId;

}
