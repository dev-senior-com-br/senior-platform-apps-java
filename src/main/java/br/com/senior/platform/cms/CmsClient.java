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

public class CmsClient extends BaseClient {

    private final String token;

    public CmsClient(String token) {
        this(token, null);
    }

    public CmsClient(String token, Environment env) {
        super("platform", "cms", env);
        this.token = token;
    }

    public RegisterAnalyticOutput registerAnalytic(RegisterAnalyticInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.REGISTER_ANALYTIC), payload, token, RegisterAnalyticOutput.class);
    }

    public ListAnalyticsOutput listAnalytics(ListAnalyticsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_ANALYTICS), payload, token, ListAnalyticsOutput.class);
    }

    public GetAnalyticOutput getAnalytic(GetAnalyticInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_ANALYTIC), payload, token, GetAnalyticOutput.class);
    }

    public GetAnalyticsOutput getAnalytics(GetAnalyticsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_ANALYTICS), payload, token, GetAnalyticsOutput.class);
    }

    public CopyAnalyticOutput copyAnalytic(CopyAnalyticInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.COPY_ANALYTIC), payload, token, CopyAnalyticOutput.class);
    }

    public UnregisterAnalyticOutput unregisterAnalytic(UnregisterAnalyticInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.UNREGISTERAN_ALYTIC), payload, token, UnregisterAnalyticOutput.class);
    }

    public CountAnalyticsDatasetOutput countAnalyticsDataset(CountAnalyticsDatasetInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.COUNT_ANALYTICS_DATASET), payload, token, CountAnalyticsDatasetOutput.class);
    }

    public ListFactoryDefaultAnalyticsOutput listFactoryDefaultAnalytics(ListFactoryDefaultAnalyticsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_ANALYTICS), payload, token, ListFactoryDefaultAnalyticsOutput.class);
    }

    public void setPageAnalyticFilter(SetPageAnalyticFilterInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Cms.SET_PAGE_ANALYTIC_FILTER), payload, token, Object.class);
    }

    public SavePageOutput savePage(SavePageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.SAVE_PAGE), payload, token, SavePageOutput.class);
    }

    public ListPagesOutput listPages(ListPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_PAGES), payload, token, ListPagesOutput.class);
    }

    public GetPageOutput getPage(GetPageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_PAGE), payload, token, GetPageOutput.class);
    }

    public GetPageResourcesOutput getPageResources(GetPageResourcesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_PAGE_RESOURCES), payload, token, GetPageResourcesOutput.class);
    }

    public CopyPageOutput copyPage(CopyPageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.COPY_PAGE), payload, token, CopyPageOutput.class);
    }

    public RemovePageOutput removePage(RemovePageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.REMOVE_PAGE), payload, token, RemovePageOutput.class);
    }

    public ListFactoryDefaultPagesOutput listFactoryDefaultPages(ListFactoryDefaultPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_PAGES), payload, token, ListFactoryDefaultPagesOutput.class);
    }

    public SaveLandingPageOutput saveLandingPage(SaveLandingPageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.SAVE_LANDING_PAGE), payload, token, SaveLandingPageOutput.class);
    }

    public void saveLandingPagesOrder(SaveLandingPagesOrderInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Cms.SAVE_LANDING_PAGES_ORDER), payload, token, Object.class);
    }

    public ListLandingPagesOutput listLandingPages(ListLandingPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_LANDING_PAGES), payload, token, ListLandingPagesOutput.class);
    }

    public GetLandingPageOutput getLandingPage(GetLandingPageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_LANDING_PAGE), payload, token, GetLandingPageOutput.class);
    }

    public GetUserLandingPagesOutput getUserLandingPages() throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_USER_LANDING_PAGES), new Object(), token, GetUserLandingPagesOutput.class);
    }

    public RemoveLandingPageOutput removeLandingPage(RemoveLandingPageInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.REMOVE_LANDING_PAGE), payload, token, RemoveLandingPageOutput.class);
    }

    public void removePersonalLandingPages(RemovePersonalLandingPagesInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Cms.REMOVE_PERSONAL_LANDING_PAGES), payload, token, Object.class);
    }

    public void removeAllPersonalLandingPages() throws ServiceException {
        execute(getActionsUrl(ApiPath.Cms.REMOVE_ALL_PERSONAL_LANDING_PAGES), new Object(), token, Object.class);
    }

    public ListFactoryDefaultLandingPagesOutput listFactoryDefaultLandingPages(ListFactoryDefaultLandingPagesInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_LANDING_PAGES), payload, token, ListFactoryDefaultLandingPagesOutput.class);
    }

    public ListWidgetsOutput listWidgets(ListWidgetsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_WIDGETS), payload, token, ListWidgetsOutput.class);
    }

    public Widget getWidget(GetWidgetInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.GET_WIDGET), payload, token, Widget.class);
    }

    public ListFactoryDefaultWidgetsOutput listFactoryDefaultWidgets(ListFactoryDefaultWidgetsInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Cms.LIST_FACTORY_DEFAULT_WIDGETS), payload, token, ListFactoryDefaultWidgetsOutput.class);
    }

}
