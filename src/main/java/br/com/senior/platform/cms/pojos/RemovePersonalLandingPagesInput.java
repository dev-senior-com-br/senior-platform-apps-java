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
public class RemovePersonalLandingPagesInput {

    /**
     * Nome do usuário com domínio, ex: admin@senior.com.br.
     * Se não informado será considerado o usuário corrente.
     * Usuários com somente permissão de personalizar só podem remover suas próprias páginas
     */
    public String user;

}
