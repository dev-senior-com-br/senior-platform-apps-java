package br.com.senior.platform.cms.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Um conjunto de resource e ação
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Permission {

    /**
     * O URI do resource
     */
    public String resource;
    /**
     * O nome da ação
     */
    public String action;

}
