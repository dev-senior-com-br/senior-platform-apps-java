package br.com.senior.platform.cms;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.platform.cms.pojos.CopyAnalyticInput;
import br.com.senior.platform.cms.pojos.CopyAnalyticOutput;
import br.com.senior.platform.cms.pojos.CopyPageInput;
import br.com.senior.platform.cms.pojos.CopyPageOutput;
import br.com.senior.platform.cms.pojos.CountAnalyticsDatasetInput;
import br.com.senior.platform.cms.pojos.CountAnalyticsDatasetOutput;
import br.com.senior.platform.cms.pojos.GetAnalyticInput;
import br.com.senior.platform.cms.pojos.GetAnalyticOutput;
import br.com.senior.platform.cms.pojos.GetAnalyticsInput;
import br.com.senior.platform.cms.pojos.GetAnalyticsOutput;
import br.com.senior.platform.cms.pojos.GetLandingPageInput;
import br.com.senior.platform.cms.pojos.GetLandingPageOutput;
import br.com.senior.platform.cms.pojos.GetPageInput;
import br.com.senior.platform.cms.pojos.GetPageOutput;
import br.com.senior.platform.cms.pojos.GetPageResourcesInput;
import br.com.senior.platform.cms.pojos.GetPageResourcesOutput;
import br.com.senior.platform.cms.pojos.GetUserLandingPagesOutput;
import br.com.senior.platform.cms.pojos.GetWidgetInput;
import br.com.senior.platform.cms.pojos.ListAnalyticsInput;
import br.com.senior.platform.cms.pojos.ListAnalyticsOutput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultAnalyticsInput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultAnalyticsOutput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultLandingPagesInput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultLandingPagesOutput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultPagesInput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultPagesOutput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultWidgetsInput;
import br.com.senior.platform.cms.pojos.ListFactoryDefaultWidgetsOutput;
import br.com.senior.platform.cms.pojos.ListLandingPagesInput;
import br.com.senior.platform.cms.pojos.ListLandingPagesOutput;
import br.com.senior.platform.cms.pojos.ListPagesInput;
import br.com.senior.platform.cms.pojos.ListPagesOutput;
import br.com.senior.platform.cms.pojos.ListWidgetsInput;
import br.com.senior.platform.cms.pojos.ListWidgetsOutput;
import br.com.senior.platform.cms.pojos.RegisterAnalyticInput;
import br.com.senior.platform.cms.pojos.RegisterAnalyticOutput;
import br.com.senior.platform.cms.pojos.RemoveLandingPageInput;
import br.com.senior.platform.cms.pojos.RemoveLandingPageOutput;
import br.com.senior.platform.cms.pojos.RemovePageInput;
import br.com.senior.platform.cms.pojos.RemovePageOutput;
import br.com.senior.platform.cms.pojos.RemovePersonalLandingPagesInput;
import br.com.senior.platform.cms.pojos.SaveLandingPageInput;
import br.com.senior.platform.cms.pojos.SaveLandingPageOutput;
import br.com.senior.platform.cms.pojos.SaveLandingPagesOrderInput;
import br.com.senior.platform.cms.pojos.SavePageInput;
import br.com.senior.platform.cms.pojos.SavePageOutput;
import br.com.senior.platform.cms.pojos.SetPageAnalyticFilterInput;
import br.com.senior.platform.cms.pojos.UnregisterAnalyticInput;
import br.com.senior.platform.cms.pojos.UnregisterAnalyticOutput;
import br.com.senior.platform.cms.pojos.Widget;
import br.com.senior.platform.utils.ApiPath;

/**
 * Client responsável pela comunicação com o serviço de CMS.
 */
public class CmsClient extends BaseClient {

    private final String token;

    public CmsClient(String token) {
        this(token, null);
    }

    public CmsClient(String token, Environment env) {
        super("platform", "cms", env);
        this.token = token;
    }

    /**
     * Registra um componente do tipo analytic.
     *
     * @param payload - Payload de entrada com informações necessárias para registrar um componente do tipo analytic.
     * @return - Payload de saída com o identificador do analytic criado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public RegisterAnalyticOutput registerAnalytic(RegisterAnalyticInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.REGISTER_ANALYTIC), payload, token, RegisterAnalyticOutput.class);
    }

    /**
     * Retorna uma lista de todos os componentes do tipo analytics.
     *
     * @param payload - Payload de entrada com informações necessárias para listar todos os componentes do tipo analytics.
     * @return - Payload de saída com a lista de todos os componentes do tipo analytics.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListAnalyticsOutput listAnalytics(ListAnalyticsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_ANALYTICS), payload, token, ListAnalyticsOutput.class);
    }

    /**
     * Consulta informações de um componente do tipo analytic.
     *
     * @param analyticId - Payload de entrada com informações necessárias para consultar um componente do tipo analytic.
     * @return - Payload de saída com o analytic recuperado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetAnalyticOutput getAnalytic(String analyticId) throws ServiceException {
        GetAnalyticInput payload = new GetAnalyticInput(analyticId);
        return execute(getActionsUrl(ApiPath.Cms.GET_ANALYTIC), payload, token, GetAnalyticOutput.class);
    }

    /**
     * Retorna uma lista de componentes do tipo analytics filtrando por ids.
     *
     * @param payload - Payload de entrada com informações necessárias para consultar uma lista de componentes do tipo analytic.
     * @return - Payload de saída com a lista de analytics recuperados.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetAnalyticsOutput getAnalytics(GetAnalyticsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_ANALYTICS), payload, token, GetAnalyticsOutput.class);
    }

    /**
     * Cria uma copia identica de um analytic com seu conteúdo e gera um novo recurso com o usuário que efetuou a copia como owner.
     *
     * @param payload - Payload de entrada com informações necessárias para copiar um analytic e seu conteúdo.
     * @return - Payload de saída com o identificador do analytic criado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public CopyAnalyticOutput copyAnalytic(CopyAnalyticInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.COPY_ANALYTIC), payload, token, CopyAnalyticOutput.class);
    }

    /**
     * Cancela o registro de um componente do tipo analytic.
     *
     * @param analyticId - Payload de entrada com informações necessárias para cancelar o registro de um componente do tipo analytic.
     * @return - Payload de saída com o identificador do analytic com o registro cancelado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public UnregisterAnalyticOutput unregisterAnalytic(String analyticId) throws ServiceException {
        UnregisterAnalyticInput payload = new UnregisterAnalyticInput(analyticId);
        return execute(getActionsUrl(ApiPath.Cms.UNREGISTERAN_ALYTIC), payload, token, UnregisterAnalyticOutput.class);
    }

    /**
     * Retorna a quantidade de analytics que estão utilizando o dataset.
     *
     * @param datasetId - Payload de entrada com informações necessárias para retornar a quantidade de analytics que utilizam o dataset.
     * @return - Payload de saída com a quantidade de analytics que utilizam o dataset.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public CountAnalyticsDatasetOutput countAnalyticsDataset(String datasetId) throws ServiceException {
        CountAnalyticsDatasetInput payload = new CountAnalyticsDatasetInput(datasetId);
        return execute(getActionsUrl(ApiPath.Cms.COUNT_ANALYTICS_DATASET), payload, token, CountAnalyticsDatasetOutput.class);
    }

    /**
     * Lista os componentes do tipo analytics padrões de fábrica.
     *
     * @param payload - Payload de entrada com informações necessárias para listar os componentes do tipo analytics padrões de fábrica.
     * @return - Payload de saída com a lista de componentes do tipo analytics padrões de fábrica.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListFactoryDefaultAnalyticsOutput listFactoryDefaultAnalytics(ListFactoryDefaultAnalyticsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_ANALYTICS), payload, token, ListFactoryDefaultAnalyticsOutput.class);
    }

    /**
     * Salva os filtros alterados do analytic na página para o usuário do contexto.
     *
     * @param payload - Payload de entrada com informações necessárias para salvar os filtros alterados do analytic na página para o usuário do contexto.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void setPageAnalyticFilter(SetPageAnalyticFilterInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Cms.SET_PAGE_ANALYTIC_FILTER), payload, token, Object.class);
    }

    /**
     * Cria ou atualiza uma página.
     *
     * @param payload - Payload de entrada com informações necessárias criar ou atualizar uma página.
     * @return - Payload de saída com o identificador da página.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public SavePageOutput savePage(SavePageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.SAVE_PAGE), payload, token, SavePageOutput.class);
    }

    /**
     * Lista as páginas que o usuário tem acesso para visualizar.
     *
     * @param payload - Payload de entrada com informações necessárias para listar as páginas que o usuário tem acesso para visualizar.
     * @return - Payload de saída com as páginas que o usuário tem acesso para visualizar.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListPagesOutput listPages(ListPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_PAGES), payload, token, ListPagesOutput.class);
    }

    /**
     * Permite buscar as informações de uma página.
     *
     * @param pageId - Payload de entrada com informações necessárias para buscar as informações de uma página.
     * @return - Payload de saída com as informações de uma página.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetPageOutput getPage(String pageId) throws ServiceException {
        GetPageInput payload = new GetPageInput(pageId);
        return execute(getActionsUrl(ApiPath.Cms.GET_PAGE), payload, token, GetPageOutput.class);
    }

    /**
     * Retorna todos os recursos utilizados para a exibição de uma página.
     *
     * @param pageId - Payload de entrada com informações necessárias para consultar os recursos utilizados para a exibição de uma página.
     * @return - Payload de saída com os recursos utilizados para a exibição de uma página.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetPageResourcesOutput getPageResources(String pageId) throws ServiceException {
        GetPageResourcesInput payload = new GetPageResourcesInput(pageId);
        return execute(getActionsUrl(ApiPath.Cms.GET_PAGE_RESOURCES), payload, token, GetPageResourcesOutput.class);
    }

    /**
     * Cria uma copia idêntica de uma página com seu conteúdo e gera um novo recurso com o usuário que efetuou a copia como owner.
     *
     * @param payload - Payload de entrada com informações necessárias para copiar uma página.
     * @return - Payload de saída com o identificador da página criada.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public CopyPageOutput copyPage(CopyPageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.COPY_PAGE), payload, token, CopyPageOutput.class);
    }

    /**
     * Permite remover uma página existente. 
     * É necessário possuir permissão o recurso customizado na ação Excluir. 
     * Se remover uma página em uso por uma landing page, a mesma também é removida.
     *
     * @param pageId - Payload de entrada com informações necessárias para excluir uma página.
     * @return - Payload de saída com o identificador da página excluída.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public RemovePageOutput removePage(String pageId) throws ServiceException {
        RemovePageInput payload = new RemovePageInput(pageId);
        return execute(getActionsUrl(ApiPath.Cms.REMOVE_PAGE), payload, token, RemovePageOutput.class);
    }

    /**
     * Lista as páginas padrões de fábrica.
     *
     * @param payload - Payload de entrada com informações necessárias para listar as páginas padrões de fábrica.
     * @return - Payload de saída com a lista de páginas padrões de fábrica.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListFactoryDefaultPagesOutput listFactoryDefaultPages(ListFactoryDefaultPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_PAGES), payload, token, ListFactoryDefaultPagesOutput.class);
    }

    /**
     * Permite adicionar uma página à landing page. 
     * Para vincular a página, será necessário ter permissão de visualização para a mesma. 
     * Se possuir somente a ação Personalizar, então só poderá criar páginas do tipo PERSONAL.
     *
     * @param payload - Payload de entrada com informações necessárias para adicionar uma página à landing page.
     * @return - Payload de saída com o identificador da landing page.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public SaveLandingPageOutput saveLandingPage(SaveLandingPageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.SAVE_LANDING_PAGE), payload, token, SaveLandingPageOutput.class);
    }

    /**
     * Altera a ordem das landing pages.
     *
     * @param payload - Payload de entrada com informações necessárias para alterar a ordem das landing pages.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void saveLandingPagesOrder(SaveLandingPagesOrderInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Cms.SAVE_LANDING_PAGES_ORDER), payload, token, Object.class);
    }

    /**
     * Lista as landing pages para administração. 
     * Se não possuir permissão na ação Visualizar, então o usuário só poderá consultar as suas landing pages.
     *
     * @param payload - Payload de entrada com informações necessárias para listar as landing pages para administração.
     * @return - Payload de saída com a lista de landing pages.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListLandingPagesOutput listLandingPages(ListLandingPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_LANDING_PAGES), payload, token, ListLandingPagesOutput.class);
    }

    /**
     * Permite buscar as informações de uma landing page com as informações da página vinculada.
     *
     * @param landingPageId - Payload de entrada com informações necessárias para buscar uma landing page.
     * @return - Payload de saída com a landing page recuperada.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetLandingPageOutput getLandingPage(String landingPageId) throws ServiceException {
        GetLandingPageInput payload = new GetLandingPageInput(landingPageId);
        return execute(getActionsUrl(ApiPath.Cms.GET_LANDING_PAGE), payload, token, GetLandingPageOutput.class);
    }

    /**
     * Lista as landing pages para visualização pelo usuário.
     *
     * @return - Payload de saída com a lista de landing pages
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetUserLandingPagesOutput getUserLandingPages() throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_USER_LANDING_PAGES), new Object(), token, GetUserLandingPagesOutput.class);
    }

    /**
     * Permite remover uma landing page existente. 
     * Se possuir permissão somente na ação Personalizar, então só poderá excluir as landing pages pessoais.
     *
     * @param landingPageId - Payload de entrada com informações necessárias para remover uma landing page.
     * @return - Payload de saída com o identificador da landing page excluída.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public RemoveLandingPageOutput removeLandingPage(String landingPageId) throws ServiceException {
        RemoveLandingPageInput payload = new RemoveLandingPageInput(landingPageId);
        return execute(getActionsUrl(ApiPath.Cms.REMOVE_LANDING_PAGE), payload, token, RemoveLandingPageOutput.class);
    }

    /**
     * Apaga todas as landing pages personalizadas do usuário corrente ou do usuário informado.
     *
     * @param user - Payload de entrada com informações necessárias para apagar todas as landing pages personalizadas do usuário.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void removePersonalLandingPages(String user) throws ServiceException {
        RemovePersonalLandingPagesInput payload = new RemovePersonalLandingPagesInput(user);
        execute(getActionsUrl(ApiPath.Cms.REMOVE_PERSONAL_LANDING_PAGES), payload, token, Object.class);
    }

    /**
     * Apaga todas as landing pages personalizadas de todos os usuários.
     *
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void removeAllPersonalLandingPages() throws ServiceException {
        execute(getActionsUrl(ApiPath.Cms.REMOVE_ALL_PERSONAL_LANDING_PAGES), new Object(), token, Object.class);
    }

    /**
     * Lista as landing pages padrões de fábrica.
     *
     * @param payload - Payload de entrada com informações necessárias para listar as landing pages padrões de fábrica.
     * @return - Payload de saída com a lista das landing pages padrões de fábrica.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListFactoryDefaultLandingPagesOutput listFactoryDefaultLandingPages(ListFactoryDefaultLandingPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_LANDING_PAGES), payload, token, ListFactoryDefaultLandingPagesOutput.class);
    }

    /**
     * Lista todos os widgets do tenant que o usuário possui permissão para utilizar.
     *
     * @param payload - Payload de entrada com informações necessárias para listar todos os widgets do tenant que o usuário possui permissão para utilizar.
     * @return - Payload de saída com a lista de todos os widgets do tenant que o usuário possui permissão para utilizar.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListWidgetsOutput listWidgets(ListWidgetsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_WIDGETS), payload, token, ListWidgetsOutput.class);
    }

    /**
     * Exibe as informações do widget buscando através do seu identificador.
     *
     * @param widgetId - Payload de entrada com informações necessárias para exibir as informações do widget.
     * @return - Payload de saída com o widget recuperado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public Widget getWidget(String widgetId) throws ServiceException {
        GetWidgetInput payload = new GetWidgetInput(widgetId);
        return execute(getActionsUrl(ApiPath.Cms.GET_WIDGET), payload, token, Widget.class);
    }

    /**
     * Lista os componentes do tipo widgets padrões de fábrica.
     *
     * @param payload - Payload de entrada com informações necessárias para listar os componentes do tipo widgets padrões de fábrica.
     * @return - Payload de saída com a lista de componentes do tipo widgets padrões de fábrica.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public ListFactoryDefaultWidgetsOutput listFactoryDefaultWidgets(ListFactoryDefaultWidgetsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_WIDGETS), payload, token, ListFactoryDefaultWidgetsOutput.class);
    }

}
