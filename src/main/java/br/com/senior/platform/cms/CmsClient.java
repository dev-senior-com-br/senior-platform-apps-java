package br.com.senior.platform.cms;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;

public class CmsClient extends BaseClient{

    private final String token;

    public CmsClient(String token) {
        this(token, null);
    }

    public CmsClient(String token, Environment env) {
        super("platform", "workflow", env);
        this.token = token;
    }

}
