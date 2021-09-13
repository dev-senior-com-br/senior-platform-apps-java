package br.com.senior.platform.utils;

import lombok.experimental.UtilityClass;

/**
 * Utilitário com os caminhos dos serviços
 */
@UtilityClass
public class ApiPath {

    /**
     * Caminhos do serviço Workflow
     */
    @UtilityClass
    public class Workflow {

        public static final String START_PROCESS = "startProcess";
        public static final String FIND_PROCESS = "findProcess";
        public static final String GET_PROCESSES_LIST = "getProcessesList";
        public static final String GET_RANKING_PROCESSES = "getRankingProcesses";
        public static final String GET_PROCESS_INSTANCE = "getProcessInstance";
        public static final String CANCEL_PROCESS_INSTANCE = "cancelProcessInstance";
        public static final String START_REQUEST = "startRequest";
        public static final String NEW_ATTACHMENT = "newAttachment";
        public static final String COMMIT_ATTACHMENT = "commitAttachment";
        public static final String LINK_ATTACHMENTS = "linkAttachments";
        public static final String GET_REQUESTS_RESUME = "getRequestsResume";
        public static final String GET_REQUEST_HISTORY_TIMELINE = "getRequestHistoryTimeline";
        public static final String GET_THIRD_PARTY_REQUEST_BY_STATUS = "getThirdPartyRequestByStatus";
        public static final String SEARCH_TASKS = "searchTasks";
        public static final String GET_SUBJECTS = "getSubjects";
        public static final String GET_NEXT_SUBJECT = "getNextSubject";
        public static final String GET_NEXT_SUBJECT_FROM_INITIAL_TASK = "getNextSubjectFromInitialTask";
        public static final String RESPONSE_PENDENCY = "responsePendency";
        public static final String BATCH_PENDENCIES_RESPONSE = "batchPendenciesResponse";
        public static final String CHANGE_PENDENCY_USER = "changePendencyUser";
        public static final String GET_PENDENCY_PROCESS_ACTIONS = "getPendencyProcessActions";
        public static final String GET_MY_PENDENCIES = "getMyPendencies";

    }

    @UtilityClass
    public class Cms {

        public static final String REGISTER_ANALYTIC = "registerAnalytic";
        public static final String LIST_ANALYTICS = "listAnalytics";
        public static final String GET_ANALYTIC = "getAnalytic";
        public static final String GET_ANALYTICS = "getAnalytics";
        public static final String COPY_ANALYTIC = "copyAnalytic";
        public static final String UNREGISTERAN_ALYTIC = "unregisterAnalytic";
        public static final String COUNT_ANALYTICS_DATASET = "countAnalyticsDataset";
        public static final String LIST_FACTORY_DEFAULT_ANALYTICS = "listFactoryDefaultAnalytics";
        public static final String SET_PAGE_ANALYTIC_FILTER = "setPageAnalyticFilter";
        public static final String SAVE_PAGE = "savePage";
        public static final String LIST_PAGES = "listPages";
        public static final String GET_PAGE = "getPage";
        public static final String GET_PAGE_RESOURCES = "getPageResources";
        public static final String COPY_PAGE = "copyPage";
        public static final String REMOVE_PAGE = "removePage";
        public static final String LIST_FACTORY_DEFAULT_PAGES = "listFactoryDefaultPages";
        public static final String SAVE_LANDING_PAGE = "saveLandingPage";
        public static final String SAVE_LANDING_PAGES_ORDER = "saveLandingPagesOrder";
        public static final String LIST_LANDING_PAGES = "listLandingPages";
        public static final String GET_LANDING_PAGE = "getLandingPage";
        public static final String GET_USER_LANDING_PAGES = "getUserLandingPages";
        public static final String REMOVE_LANDING_PAGE = "removeLandingPage";
        public static final String REMOVE_PERSONAL_LANDING_PAGES = "removePersonalLandingPages";
        public static final String REMOVE_ALL_PERSONAL_LANDING_PAGES = "removeAllPersonalLandingPages";
        public static final String LIST_FACTORY_DEFAULT_LANDING_PAGES = "listFactoryDefaultLandingPages";
        public static final String LIST_WIDGETS = "listWidgets";
        public static final String GET_WIDGET = "getWidget";
        public static final String LIST_FACTORY_DEFAULT_WIDGETS = "listFactoryDefaultWidgets";

    }

}
