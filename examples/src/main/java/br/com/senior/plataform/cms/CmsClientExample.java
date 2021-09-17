import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.platform.cms.pojos.BasicComponent;
import br.com.senior.platform.cms.pojos.Chart;
import br.com.senior.platform.cms.pojos.ChartType;
import br.com.senior.platform.cms.CmsClient;
import br.com.senior.platform.cms.pojos.Order;
import br.com.senior.platform.cms.pojos.OrderType;
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
import br.com.senior.platform.cms.pojos.LandingPageType;
import br.com.senior.platform.cms.pojos.Column;
import br.com.senior.platform.cms.pojos.CopyAnalyticInput;
import br.com.senior.platform.cms.pojos.CopyAnalyticOutput;
import br.com.senior.platform.cms.pojos.CopyPageInput;
import br.com.senior.platform.cms.pojos.CopyPageOutput;
import br.com.senior.platform.cms.pojos.CountAnalyticsDatasetInput;
import br.com.senior.platform.cms.pojos.CountAnalyticsDatasetOutput;
import br.com.senior.platform.cms.pojos.FunctionType;
import br.com.senior.platform.cms.pojos.PreferredSize;
import br.com.senior.platform.cms.pojos.Property;
import br.com.senior.platform.cms.pojos.Series;
import br.com.senior.platform.cms.pojos.SetPageAnalyticFilterInput;
import br.com.senior.platform.cms.pojos.UnregisterAnalyticInput;
import br.com.senior.platform.cms.pojos.UnregisterAnalyticOutput;
import br.com.senior.platform.cms.pojos.Widget;
import br.com.senior.platform.cms.pojos.GetAnalyticInput;
import br.com.senior.platform.cms.pojos.GetAnalyticOutput;
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
import br.com.senior.platform.cms.pojos.Pagination;
import br.com.senior.platform.cms.pojos.Position;
import br.com.senior.platform.cms.pojos.PositionType;
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
import br.com.senior.platform.cms.pojos.ChartType;

import java.io.IOException;
import java.util.List;

import br.com.senior.core.authentication.AuthenticationClient;
import br.com.senior.core.authentication.pojos.LoginInput;
import br.com.senior.core.authentication.pojos.LoginOutput;

public class CmsClientExample {

    private static String accessToken;
    private static CmsClient cmsClient;

    public static void main(String[] args) throws ServiceException, IOException {

        accessToken = authenticate();
        cmsClient = new CmsClient(accessToken, Environment.HOMOLOG);

        // registerAnalytic();

        // copyAnalytic();

        // getAnalytic();

        // getAnalytics();

        // unregisterAnalytic();

        // listAnalytics();

        // countAnalyticsDataset();

        // listFactoryDefaultAnalytics();

        // savePage();

        // copyPage();

        // removePage();

        // listPages();

        // listFactoryDefaultPages();

        // getPage();

        // getPageResources();

        // setPageAnalyticFilter();

        // saveLandingPage();

        // saveLandingPagesOrder();

        // removeLandingPage();

        // getLandingPage();

        // getUserLandingPages();

        // removePersonalLandingPages();

        // removeAllPersonalLandingPages();

        // listLandingPages();

        // listFactoryDefaultLandingPages();

        // listWidgets();

        // getWidget();

        // listFactoryDefaultWidgets();
    }

    private static void registerAnalytic() throws ServiceException {
        printMessage("\nregisterAnalytic...");

        RegisterAnalyticInput payload = new RegisterAnalyticInput();
        payload.setId("analytic://senior.com.br/analytic_1");
        payload.setName("Analytic 1");
        payload.setTitle("Title 1");
        payload.setChart(new Chart());
        payload.getChart().setType(ChartType.MAP);
        payload.getChart().setDatasetId("dataset://dataset");
        payload.setTags(List.of("one", "two"));
        payload.setPreferredSize(new PreferredSize(3L, 2L));

        Column latitude = new Column();
        latitude.setSchema("schema");
        latitude.setTable("table");
        latitude.setColumn("column");
        latitude.setFunction(FunctionType.AVG);

        Column longitude = new Column();
        longitude.setSchema("schema");
        longitude.setTable("table");
        longitude.setColumn("column");
        longitude.setPrecision(2L);

        payload.getChart().setCategory(new Column("schema", "table", "column", null, FunctionType.COUNT_DISTINCT, 3L, "R$", "-", null, latitude, longitude));
        payload.getChart().setSeries(List.of(new Series(new Column("schema_1", "table_1", "column_1"), "series-1"), new Series(new Column("schema_1", "table_1", "column_2", null, FunctionType.SUM, 4L, "R$", "-", null, null, null), "series-2")));
        payload.setProperties(List.of(new Property("color", "red")));

        RegisterAnalyticOutput output = cmsClient.registerAnalytic(payload);

        printMessage(String.format("Identificador do analytic criado: %s", output.getId()));
    }

    private static void listAnalytics() throws ServiceException {
        printMessage("\nlistAnalytic...");

        ListAnalyticsInput payload = new ListAnalyticsInput();
        payload.setSearchValue("Analytic 1");
        payload.setPagination(new Pagination(0L, 10L));

        ListAnalyticsOutput output = cmsClient.listAnalytics(payload);

        output.getAnalytics().stream().forEach(o -> printMessage(String.format("Id: %s \nNome: %s \nTítulo: %s", o.getId(), o.getName(), o.getTitle())));
    }

    private static void getAnalytic() throws ServiceException {
        printMessage("\ngetAnalytic...");

        String analyticId = "analytic://senior.com.br/analytic_1";

        GetAnalyticOutput output = cmsClient.getAnalytic(analyticId);

        printMessage(String.format("Id: %s \nNome: %s \nTítulo: %s", output.getAnalytic().getId(), output.getAnalytic().getName(), output.getAnalytic().getTitle()));
    }

    private static void getAnalytics() throws ServiceException {
        printMessage("\ngetAnalytics...");

        GetAnalyticsInput payload = new GetAnalyticsInput(List.of("analytic://senior.com.br/analytic_1", "analytic://senior.com.br/analytic_2"));

        GetAnalyticsOutput output = cmsClient.getAnalytics(payload);

        output.getAnalytics().stream().forEach(o -> printMessage(String.format("Id: %s \nNome: %s \nTítulo: %s", o.getId(), o.getName(), o.getTitle())));
    }

    private static void copyAnalytic() throws ServiceException {
        printMessage("\ncopyAnalytic...");

        CopyAnalyticInput payload = new CopyAnalyticInput();
        payload.setAnalyticId("analytic://senior.com.br/analytic_1");
        payload.setName("Analytic 1 - Cópia Teste");

        CopyAnalyticOutput output = cmsClient.copyAnalytic(payload);

        printMessage(String.format("Identificador do analytic criado: %s", output.getAnalyticId()));
    }

    private static void unregisterAnalytic() throws ServiceException {
        printMessage("\nunregisterAnalytic...");

        String analyticId = "analytic://senior.com.br/analytic_1";

        UnregisterAnalyticOutput output = cmsClient.unregisterAnalytic(analyticId);

        printMessage(String.format("Identificador do analytic desregistrado: %s", output.getAnalyticId()));
    }

    private static void countAnalyticsDataset() throws ServiceException {
        printMessage("\ncountAnalyticsDataset...");

        String datasetId = "dataset://custom-dataset";

        CountAnalyticsDatasetOutput output = cmsClient.countAnalyticsDataset(datasetId);

        printMessage(String.format("Quantidade de analytics que utilizam o dataset: %s", output.getSize()));
    }

    private static void listFactoryDefaultAnalytics() throws ServiceException {
        printMessage("\nlistFactoryDefaultAnalytics...");

        ListFactoryDefaultAnalyticsInput payload = new ListFactoryDefaultAnalyticsInput();
        payload.setSearchValue("Analytic 1");
        payload.setPagination(new Pagination());
        payload.getPagination().setPageNumber(0L);
        payload.getPagination().setPageSize(10L);

        ListFactoryDefaultAnalyticsOutput output = cmsClient.listFactoryDefaultAnalytics(payload);

        output.getAnalytics().stream().forEach(o -> printMessage(String.format("Id: %s \nNome: %s \nTítulo: %s", o.getId(), o.getName(), o.getTitle())));
    }

    private static void setPageAnalyticFilter() throws ServiceException {
        printMessage("\nsetPageAnalyticFilter...");

        SetPageAnalyticFilterInput payload = new SetPageAnalyticFilterInput();
        payload.setAnalyticId("analytic://senior.com.br/analytic_1");
        payload.setPageId("page://senior.com.br/my_custom_page");

        cmsClient.setPageAnalyticFilter(payload);
    }

    private static void savePage() throws ServiceException {
        printMessage("\nsavePage...");

        SavePageInput payload = new SavePageInput();
        payload.setId("page://senior.com.br/my_custom_page");
        payload.setName("My Custom Page");
        payload.setCredentials(false);
        payload.setIncludeToolbar(false);
        payload.setPositionType(PositionType.ABSOLUTE);

        BasicComponent basicComponent = new BasicComponent();
        basicComponent.setHeight(2L);
        basicComponent.setWidth(6L);
        basicComponent.setPosition(new Position(0L, 0L));

        payload.setComponents(List.of(basicComponent));

        SavePageOutput output = cmsClient.savePage(payload);

        printMessage(String.format("Identificador da página criada: %s", output.getPageId()));
    }

    private static void listPages() throws ServiceException {
        printMessage("\nlistPages...");

        ListPagesInput payload = new ListPagesInput();
        payload.setSearchValue("My");
        payload.setOwnerOnly(true);
        payload.setPagination(new Pagination(0L, 3L));

        ListPagesOutput output = cmsClient.listPages(payload);

        output.getPages().stream().forEach(o -> printMessage(String.format("Id: %s \nNome: %s \nTipo de posição: %s", o.getId(), o.getName(), o.getPositionType())));
    }

    private static void getPage() throws ServiceException {
        printMessage("\ngetPage...");

        String pageId = "page://senior.com.br/my_custom_page";

        GetPageOutput output = cmsClient.getPage(pageId);

        printMessage(String.format("Id: %s \nNome: %s \nTipo de posição: %s", output.getPage().getId(), output.getPage().getName(), output.getPage().getPositionType()));
    }

    private static void getPageResources() throws ServiceException {
        printMessage("\ngetPageResources...");

        String pageId = "page://senior.com.br/my_custom_page";

        GetPageResourcesOutput output = cmsClient.getPageResources(pageId);

        output.getResources().stream().forEach(o -> printMessage(String.format("Nome: %s \nTipo: %s \nURI: %s \nAction URI: %s", o.getName(), o.getType(), o.getUri(), o.getActionUri())));
    }

    private static void copyPage() throws ServiceException {
        printMessage("\ncopyPage...");

        CopyPageInput payload = new CopyPageInput();
        payload.setPageId("page://senior.com.br/my_custom_page");
        payload.setName("My Custom Page - Cópia teste");

        CopyPageOutput output = cmsClient.copyPage(payload);

        printMessage(String.format("Identificador da página criada: %s", output.getPageId()));
    }

    private static void removePage() throws ServiceException {
        printMessage("\nremovePage...");

        String pageId = "page://senior.com.br/my_custom_page";

        RemovePageOutput output = cmsClient.removePage(pageId);

        printMessage(String.format("Identificador da página excluída: %s", output.getPageId()));
    }

    private static void listFactoryDefaultPages() throws ServiceException {
        printMessage("\nlistFactoryDefaultPages...");

        ListFactoryDefaultPagesInput payload = new ListFactoryDefaultPagesInput();
        payload.setSearchValue("My Custom Page");
        payload.setPagination(new Pagination(0L, 3L));

        ListFactoryDefaultPagesOutput output = cmsClient.listFactoryDefaultPages(payload);

        output.getPages().stream().forEach(o -> printMessage(String.format("Id: %s \nNome: %s \nTipo de posição: %s", o.getId(), o.getName(), o.getPositionType())));
    }

    private static void saveLandingPage() throws ServiceException {
        printMessage("\nsaveLandingPage...");

        SaveLandingPageInput payload = new SaveLandingPageInput();
        payload.setId("landing://senior.com.br/landing_1");
        payload.setPageId("page://senior.com.br/my_custom_page");
        payload.setTitle("Page X");
        payload.setIncludeHeader(true);
        payload.setLandingPageType(LandingPageType.SHARED);

        SaveLandingPageOutput output = cmsClient.saveLandingPage(payload);

        printMessage(String.format("Identificador da landing page criada: %s", output.getLandingPageId()));
    }

    private static void saveLandingPagesOrder() throws ServiceException {
        printMessage("\nsaveLandingPagesOrder...");

        SaveLandingPagesOrderInput payload = new SaveLandingPagesOrderInput();
        payload.setLandingPageId(List.of("landing://senior.com.br/landing_3", "landing://senior.com.br/landing_1", "landing://senior.com.br/landing_2"));

        cmsClient.saveLandingPagesOrder(payload);
    }

    private static void listLandingPages() throws ServiceException {
        printMessage("\nlistLandingPages...");

        ListLandingPagesInput payload = new ListLandingPagesInput();
        payload.setSearchValue("Page");
        payload.setPagination(new Pagination(0L, 5L));

        ListLandingPagesOutput output = cmsClient.listLandingPages(payload);

        output.getLandingPages().stream().forEach(o -> printMessage(String.format("Id: %s \nId da Página: %s \nTítulo: %s", o.getId(), o.getPageId(), o.getTitle())));
    }

    private static void getLandingPage() throws ServiceException {
        printMessage("\ngetLandingPage...");

        String landingPageId = "landing://senior.com.br/landing_1";

        GetLandingPageOutput output = cmsClient.getLandingPage(landingPageId);

        printMessage(String.format("Id: %s \nId da Página: %s \nTítulo: %s", output.getLandingPage().getId(), output.getLandingPage().getPage().getId(), output.getLandingPage().getTitle()));
    }

    private static void getUserLandingPages() throws ServiceException {
        printMessage("\ngetUserLandingPages...");

        GetUserLandingPagesOutput output = cmsClient.getUserLandingPages();

        output.getLandingPages().stream().forEach(o -> printMessage(String.format("Id: %s \nId da Página: %s \nTítulo: %s", o.getId(), o.getPageId(), o.getTitle())));
    }

    private static void removeLandingPage() throws ServiceException {
        printMessage("\nremoveLandingPage...");

        String landingPageId = "landing://senior.com.br/landing_2";

        RemoveLandingPageOutput output = cmsClient.removeLandingPage(landingPageId);

        printMessage(String.format("Identificador da landing page excluída: %s", output.getLandingPageId()));
    }

    private static void removePersonalLandingPages() throws ServiceException {
        printMessage("\nremovePersonalLandingPages...");

        String user = "test@senior.com.br";

        cmsClient.removePersonalLandingPages(user);
    }

    private static void removeAllPersonalLandingPages() throws ServiceException {
        printMessage("\nremoveAllPersonalLandingPages...");

        cmsClient.removeAllPersonalLandingPages();
    }

    private static void listFactoryDefaultLandingPages() throws ServiceException {
        printMessage("\nlistFactoryDefaultLandingPages...");

        ListFactoryDefaultLandingPagesInput payload = new ListFactoryDefaultLandingPagesInput();
        payload.setSearchValue("0");
        payload.setPagination(new Pagination(0L, 10L));

        ListFactoryDefaultLandingPagesOutput output = cmsClient.listFactoryDefaultLandingPages(payload);

        output.getLandingPages().stream().forEach(o -> printMessage(String.format("Id: %s \nId da Página: %s \nTítulo: %s", o.getId(), o.getPageId(), o.getTitle())));
    }

    private static void listWidgets() throws ServiceException {
        printMessage("\nlistWidgets...");

        ListWidgetsInput payload = new ListWidgetsInput();
        payload.setSearchValue("tag");
        payload.setPagination(new Pagination(0L, 10L));

        ListWidgetsOutput output = cmsClient.listWidgets(payload);

        output.getWidgets().stream().forEach(o -> printMessage(String.format("Id: %s \nId da Nome: %s \nDescrição: %s", o.getId(), o.getName(), o.getDescription())));
    }

    private static void getWidget() throws ServiceException {
        printMessage("\ngetWidget...");

        String widgetId = "widget://factory/domain/service/widget";

        Widget output = cmsClient.getWidget(widgetId);

        printMessage(String.format("Id: %s \nId da Nome: %s \nDescrição: %s", output.getId(), output.getName(), output.getDescription()));
    }

    private static void listFactoryDefaultWidgets() throws ServiceException {
        printMessage("\nlistFactoryDefaultWidgets...");

        ListFactoryDefaultWidgetsInput payload = new ListFactoryDefaultWidgetsInput();
        payload.setSearchValue("tag");
        payload.setPagination(new Pagination(0L, 10L));

        ListFactoryDefaultWidgetsOutput output = cmsClient.listFactoryDefaultWidgets(payload);

        output.getWidgets().stream().forEach(o -> printMessage(String.format("Id: %s \nId da Nome: %s \nDescrição: %s", o.getId(), o.getName(), o.getDescription())));
    }

    private static String authenticate() throws ServiceException {
        printMessage("Login...");

        // adicione estas variáveis de ambiente com seu usuário e senha ou substitua seus valores aqui
        final String username = System.getenv("SENIOR_USERNAME");
        final String password = System.getenv("PASS");

        AuthenticationClient client = new AuthenticationClient(Environment.HOMOLOG);
        LoginInput loginInput = LoginInput.builder().username(username).password(password).build();

        LoginOutput output = client.login(loginInput);
        return output.getJsonToken().getAccessToken();
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

}
