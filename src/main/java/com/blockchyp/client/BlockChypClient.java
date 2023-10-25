/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.util.encoders.Hex;

import com.blockchyp.client.crypto.CryptoUtils;
import com.blockchyp.client.APICredentials;
import com.blockchyp.client.TerminalRequest;
import com.blockchyp.client.dto.IAbstractAcknowledgement;
import com.blockchyp.client.dto.ITerminalReference;
import com.blockchyp.client.dto.ISignatureResponse;
import com.blockchyp.client.dto.ISignatureRequest;
import com.blockchyp.client.dto.IApprovalResponse;
import com.blockchyp.client.dto.ITimeoutRequest;
import com.blockchyp.client.dto.ICoreRequest;
import com.blockchyp.client.dto.IPaymentMethodResponse;
import com.blockchyp.client.dto.ICryptocurrencyResponse;
import com.blockchyp.client.dto.IPaymentAmounts;
import com.blockchyp.client.dto.IPaymentMethod;
import com.blockchyp.client.dto.IRequestAmount;
import com.blockchyp.client.dto.ISubtotals;
import com.blockchyp.client.dto.IPreviousTransaction;
import com.blockchyp.client.dto.ICoreResponse;
import com.blockchyp.client.dto.ReceiptSuggestions;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.CaptureSignatureRequest;
import com.blockchyp.client.dto.CaptureSignatureResponse;
import com.blockchyp.client.dto.PingRequest;
import com.blockchyp.client.dto.PingResponse;
import com.blockchyp.client.dto.LocateRequest;
import com.blockchyp.client.dto.LocateResponse;
import com.blockchyp.client.dto.MessageRequest;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.TextPromptRequest;
import com.blockchyp.client.dto.CustomerRequest;
import com.blockchyp.client.dto.CustomerResponse;
import com.blockchyp.client.dto.CustomerSearchRequest;
import com.blockchyp.client.dto.UpdateCustomerRequest;
import com.blockchyp.client.dto.CustomerSearchResponse;
import com.blockchyp.client.dto.Customer;
import com.blockchyp.client.dto.TokenMetadataRequest;
import com.blockchyp.client.dto.TokenMetadataResponse;
import com.blockchyp.client.dto.CustomerToken;
import com.blockchyp.client.dto.TextPromptResponse;
import com.blockchyp.client.dto.BooleanPromptResponse;
import com.blockchyp.client.dto.WhiteListedCard;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.BalanceRequest;
import com.blockchyp.client.dto.BalanceResponse;
import com.blockchyp.client.dto.RefundRequest;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;
import com.blockchyp.client.dto.VoidRequest;
import com.blockchyp.client.dto.VoidResponse;
import com.blockchyp.client.dto.EnrollRequest;
import com.blockchyp.client.dto.EnrollResponse;
import com.blockchyp.client.dto.ClearTerminalRequest;
import com.blockchyp.client.dto.GiftActivateRequest;
import com.blockchyp.client.dto.GiftActivateResponse;
import com.blockchyp.client.dto.CloseBatchRequest;
import com.blockchyp.client.dto.CloseBatchResponse;
import com.blockchyp.client.dto.TermsAndConditionsRequest;
import com.blockchyp.client.dto.TermsAndConditionsResponse;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.TransactionStatusRequest;
import com.blockchyp.client.dto.PaymentLinkStatusRequest;
import com.blockchyp.client.dto.PaymentLinkStatusResponse;
import com.blockchyp.client.dto.TransactionStatus;
import com.blockchyp.client.dto.TransactionDisplayDiscount;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.HeartbeatResponse;
import com.blockchyp.client.dto.TerminalStatusRequest;
import com.blockchyp.client.dto.TerminalStatusResponse;
import com.blockchyp.client.dto.PaymentLinkRequest;
import com.blockchyp.client.dto.PaymentLinkResponse;
import com.blockchyp.client.dto.CancelPaymentLinkRequest;
import com.blockchyp.client.dto.CancelPaymentLinkResponse;
import com.blockchyp.client.dto.ResendPaymentLinkRequest;
import com.blockchyp.client.dto.ResendPaymentLinkResponse;
import com.blockchyp.client.dto.CashDiscountRequest;
import com.blockchyp.client.dto.CashDiscountResponse;
import com.blockchyp.client.dto.TransactionHistoryRequest;
import com.blockchyp.client.dto.TransactionHistoryResponse;
import com.blockchyp.client.dto.BatchHistoryRequest;
import com.blockchyp.client.dto.BatchHistoryResponse;
import com.blockchyp.client.dto.BatchSummary;
import com.blockchyp.client.dto.BatchDetailsRequest;
import com.blockchyp.client.dto.BatchDetailsResponse;
import com.blockchyp.client.dto.TerminalVolume;
import com.blockchyp.client.dto.AddTestMerchantRequest;
import com.blockchyp.client.dto.MerchantProfileRequest;
import com.blockchyp.client.dto.MerchantPlatformRequest;
import com.blockchyp.client.dto.InviteMerchantUserRequest;
import com.blockchyp.client.dto.Address;
import com.blockchyp.client.dto.MerchantProfile;
import com.blockchyp.client.dto.MerchantProfileResponse;
import com.blockchyp.client.dto.BankAccount;
import com.blockchyp.client.dto.ListQueuedTransactionsRequest;
import com.blockchyp.client.dto.ListQueuedTransactionsResponse;
import com.blockchyp.client.dto.DeleteQueuedTransactionRequest;
import com.blockchyp.client.dto.DeleteQueuedTransactionResponse;
import com.blockchyp.client.dto.DeleteCustomerRequest;
import com.blockchyp.client.dto.DeleteCustomerResponse;
import com.blockchyp.client.dto.DeleteTokenRequest;
import com.blockchyp.client.dto.DeleteTokenResponse;
import com.blockchyp.client.dto.LinkTokenRequest;
import com.blockchyp.client.dto.UnlinkTokenRequest;
import com.blockchyp.client.dto.Healthcare;
import com.blockchyp.client.dto.HealthcareGroup;
import com.blockchyp.client.dto.GetMerchantsRequest;
import com.blockchyp.client.dto.GetMerchantsResponse;
import com.blockchyp.client.dto.MerchantUsersResponse;
import com.blockchyp.client.dto.MerchantUser;
import com.blockchyp.client.dto.MerchantPlatformsResponse;
import com.blockchyp.client.dto.MerchantPlatform;
import com.blockchyp.client.dto.TerminalProfileRequest;
import com.blockchyp.client.dto.TerminalProfileResponse;
import com.blockchyp.client.dto.TerminalDeactivationRequest;
import com.blockchyp.client.dto.TerminalActivationRequest;
import com.blockchyp.client.dto.TerminalProfile;
import com.blockchyp.client.dto.TermsAndConditionsTemplate;
import com.blockchyp.client.dto.TermsAndConditionsTemplateRequest;
import com.blockchyp.client.dto.TermsAndConditionsTemplateResponse;
import com.blockchyp.client.dto.TermsAndConditionsLogRequest;
import com.blockchyp.client.dto.TermsAndConditionsLogResponse;
import com.blockchyp.client.dto.TermsAndConditionsLogEntry;
import com.blockchyp.client.dto.SurveyQuestion;
import com.blockchyp.client.dto.SurveyQuestionRequest;
import com.blockchyp.client.dto.SurveyQuestionResponse;
import com.blockchyp.client.dto.SurveyDataPoint;
import com.blockchyp.client.dto.SurveyResultsRequest;
import com.blockchyp.client.dto.MediaMetadata;
import com.blockchyp.client.dto.UploadMetadata;
import com.blockchyp.client.dto.UploadStatus;
import com.blockchyp.client.dto.UploadStatusRequest;
import com.blockchyp.client.dto.MediaRequest;
import com.blockchyp.client.dto.MediaLibraryResponse;
import com.blockchyp.client.dto.Slide;
import com.blockchyp.client.dto.SlideShow;
import com.blockchyp.client.dto.SlideShowResponse;
import com.blockchyp.client.dto.SlideShowRequest;
import com.blockchyp.client.dto.BrandingAssetRequest;
import com.blockchyp.client.dto.BrandingAsset;
import com.blockchyp.client.dto.BrandingAssetResponse;
import com.blockchyp.client.dto.PricingPolicyRequest;
import com.blockchyp.client.dto.PricePoint;
import com.blockchyp.client.dto.PricingPolicyResponse;
import com.blockchyp.client.dto.PartnerStatementListRequest;
import com.blockchyp.client.dto.PartnerStatementSummary;
import com.blockchyp.client.dto.PartnerStatementListResponse;
import com.blockchyp.client.dto.PartnerStatementDetailRequest;
import com.blockchyp.client.dto.PartnerStatementDetailResponse;
import com.blockchyp.client.dto.PartnerStatementLineItem;
import com.blockchyp.client.dto.PartnerStatementDisbursement;
import com.blockchyp.client.dto.PartnerStatementAdjustment;
import com.blockchyp.client.dto.MerchantInvoiceListRequest;
import com.blockchyp.client.dto.MerchantInvoiceListResponse;
import com.blockchyp.client.dto.MerchantInvoiceSummary;
import com.blockchyp.client.dto.MerchantInvoiceDetailRequest;
import com.blockchyp.client.dto.MerchantInvoiceDetailResponse;
import com.blockchyp.client.dto.InvoiceLineItem;
import com.blockchyp.client.dto.InvoicePayment;
import com.blockchyp.client.dto.StatementDeposit;
import com.blockchyp.client.dto.PartnerCommissionBreakdownRequest;
import com.blockchyp.client.dto.PartnerCommissionBreakdownResponse;
import com.blockchyp.client.dto.BuyRateLineItem;
import com.blockchyp.client.dto.AggregateBillingLineItem;
import com.blockchyp.client.dto.AggregateBillingLineItemStats;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;

/**
 * This is the main class Java developers will interact with. You can
 * instantiate this class directly or use it with a dependency injection
 * framework like Spring or Guice. Most developers will only need to inject
 * credentials, but you may also want to override default endpoints if you're
 * targeting non production BlockChyp systems (which is unlikely).
 *
 * You can inject settings via the constructors or via setters depending on your
 * preferences.
 *
 * You'll also notice that we're not using generics or any features from Java
 * 1.7 or later. This is just to maintain as much backward compatibility as
 * possible with older systems (1.6 or later). The underlying REST API's are
 * invoked using commons-httpclient 3.1 and we use Jackson for JSON
 * serialization.
 *
 * Most internal methods are scoped as protected in order to give developers the
 * ability to override things if they need special behavior or have weird
 * classpath issues.
 *
 */

public class BlockChypClient {

    public static final String OFFLINE_CACHE = ".blockchyp_routes";
    public static final String OFFLINE_FIXED_KEY = "cb22789c9d5c344a10e0474f134db39e25eb3bbf5a1b1a5e89b507f15ea9519c";
    public static final long MS_PER_HOUR = 3600000;

    private static final String USER_AGENT = getUserAgent();

    private String gatewayHost = "https://api.blockchyp.com";
    private String testGatewayHost = "https://test.blockchyp.com";
    private String dashboardHost = "https://dashboard.blockchyp.com";
    private APICredentials defaultCredentials;
    private PaymentLogger paymentLogger = new SystemOutPaymentLogger();

    @SuppressWarnings("rawtypes")
    private Map routeCache = new HashMap();

    private boolean offlineRouteCacheEnabled = true;

    private String offlineRouteCacheLocation = null;

    private int connectionTimeout = 0;

    private int timeout = 0;

    private ObjectMapper objectMapper;

    private HttpClient gatewayClient;

    private HttpClient terminalClient;

    private MultiThreadedHttpConnectionManager gatewayManager;

    private MultiThreadedHttpConnectionManager terminalManager;

    private boolean terminalHttps = false;

    /**
     * Default constructor.
     */
    public BlockChypClient() {
        initObjectMapper();
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     *
     * @param gatewayHost alternate gateway endpoint.
     */
    public BlockChypClient(String gatewayHost) {
        this();
        this.gatewayHost = gatewayHost;
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     *
     * @param defaultCredentials {@link APICredentials}
     */
    public BlockChypClient(APICredentials defaultCredentials) {
        this();
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     *
     * @param gatewayHost alternate gateway endpoint.
     * @param defaultCredentials {@link APICredentials}
     */
    public BlockChypClient(String gatewayHost, APICredentials defaultCredentials) {
        this();
        this.gatewayHost = gatewayHost;
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     *
     * @param gatewayHost alternate gateway endpoint.
     * @param testGatewayHost alternate gateway endpoint.
     * @param defaultCredentials {@link APICredentials}
     */
    public BlockChypClient(String gatewayHost, String testGatewayHost, APICredentials defaultCredentials) {
        this();
        this.gatewayHost = gatewayHost;
        this.testGatewayHost = testGatewayHost;
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Provided as a convenience to support constructor based dependency injection.
     *
     * @param dashboardHost alternate dashboard endpoint.
     * @param gatewayHost alternate gateway endpoint.
     * @param testGatewayHost alternate gateway endpoint.
     * @param defaultCredentials {@link APICredentials}
     */
    public BlockChypClient(String dashboardHost, String gatewayHost, String testGatewayHost, APICredentials defaultCredentials) {
        this();
        this.dashboardHost = dashboardHost;
        this.gatewayHost = gatewayHost;
        this.testGatewayHost = testGatewayHost;
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Used to override the live gateway host.  Unless you work at BlockChyp, you probably
     * won't ever need to do this.
     *
     * @param gatewayHost alternate gateway endpoint.
     */

    public void setGatewayHost(String gatewayHost) {
        this.gatewayHost = gatewayHost;
    }

    /**
     * Used to override the dashboard host.  Unless you work at BlockChyp, you probably
     * won't ever need to do this.
     *
     * @param dashboardHost alternate dashboard endpoint.
     */

    public void setDashboardHost(String dashboardHost) {
        this.dashboardHost = dashboardHost;
    }


    /**
     * Used to override the test gateway host.  Unless you work at BlockChyp, you probably
     * won't ever need to do this.
     *
     * @param testGatewayHost alternate gateway endpoint.
     */
    public void setTestGatewayHost(String testGatewayHost) {
        this.testGatewayHost = testGatewayHost;
    }

    /**
     * Sets the default root API credentials for the client.
     * @param defaultCredentials {@link APICredentials}
     */
    public void setDefaultCredentials(APICredentials defaultCredentials) {
        this.defaultCredentials = defaultCredentials;
    }

    /**
     * Enables or disables offline terminal route caching.  Offline route caching is really meant
     * as a defense for situations where developers are creating new BlockChypClient instances
     * over and over for each request and therefore making the in memory cache useless.  The
     * BlockChypClient is thread safe so we encourage you to only create one instance and share it
     * for all requests.  If you're doing this, you can safely disable offline route caching
     * and we recommend it.  Defaults to enabled.
     *
     * @param offlineRouteCacheEnabled true if offline route caching is enabled.
     */
    public void setOfflineRouteCacheEnabled(boolean offlineRouteCacheEnabled) {
        this.offlineRouteCacheEnabled = offlineRouteCacheEnabled;
    }

    /**
     * Sets the payment logger.  Can be used to override that default
     * System.out based logging.
     * @param paymentLogger an implementation of {@link PaymentLogger}
     */
    public void setPaymentLogger(PaymentLogger paymentLogger) {
        this.paymentLogger = paymentLogger;
    }

    /**
     * Initializes the JSON encoder and parser.
     */
    protected void initObjectMapper() {
        objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
    }

    /**
     * Tests communication with the Gateway.  If authentication is successful, a merchantPk value
     * is returned.
     * @param test whether or not to route the the transaction to the test gateway.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public HeartbeatResponse heartbeat(boolean test) throws Exception {

        return (HeartbeatResponse) getGateway("/api/heartbeat", test, HeartbeatResponse.class);

    }


    /**
     * Returns routing and location data for a payment terminal.
     * @param request the request parameters.
     * @return {@link LocateResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public LocateResponse locate(LocateRequest request) throws Exception {

        return (LocateResponse) postGateway("/api/terminal-locate", request, LocateResponse.class);

    }

    /**
     * Captures a preauthorization.
     * @param request the request parameters.
     * @return {@link CaptureResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CaptureResponse capture(CaptureRequest request) throws Exception {

        return (CaptureResponse) postGateway("/api/capture", request, CaptureResponse.class);

    }

    /**
     * Discards a previous transaction.
     * @param request the request parameters.
     * @return {@link VoidResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public VoidResponse voidTx(VoidRequest request) throws Exception {

        return (VoidResponse) postGateway("/api/void", request, VoidResponse.class);

    }

    /**
     * Executes a manual time out reversal.
     *
     * We love time out reversals. Don't be afraid to use them whenever a request to a
     * BlockChyp terminal times out. You have up to two minutes to reverse any
     * transaction. The only caveat is that you must assign transactionRef values when
     * you build the original request. Otherwise, we have no real way of knowing which
     * transaction you're trying to reverse because we may not have assigned it an id yet.
     * And if we did assign it an id, you wouldn't know what it is because your request to the
     * terminal timed out before you got a response.
     * @param request the request parameters.
     * @return {@link AuthorizationResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public AuthorizationResponse reverse(AuthorizationRequest request) throws Exception {

        return (AuthorizationResponse) postGateway("/api/reverse", request, AuthorizationResponse.class);

    }

    /**
     * Closes the current credit card batch.
     * @param request the request parameters.
     * @return {@link CloseBatchResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CloseBatchResponse closeBatch(CloseBatchRequest request) throws Exception {

        return (CloseBatchResponse) postGateway("/api/close-batch", request, CloseBatchResponse.class);

    }

    /**
     * Creates and send a payment link to a customer.
     * @param request the request parameters.
     * @return {@link PaymentLinkResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public PaymentLinkResponse sendPaymentLink(PaymentLinkRequest request) throws Exception {

        return (PaymentLinkResponse) postGateway("/api/send-payment-link", request, PaymentLinkResponse.class);

    }

    /**
     * Resends payment link.
     * @param request the request parameters.
     * @return {@link ResendPaymentLinkResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public ResendPaymentLinkResponse resendPaymentLink(ResendPaymentLinkRequest request) throws Exception {

        return (ResendPaymentLinkResponse) postGateway("/api/resend-payment-link", request, ResendPaymentLinkResponse.class);

    }

    /**
     * Cancels a payment link.
     * @param request the request parameters.
     * @return {@link CancelPaymentLinkResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CancelPaymentLinkResponse cancelPaymentLink(CancelPaymentLinkRequest request) throws Exception {

        return (CancelPaymentLinkResponse) postGateway("/api/cancel-payment-link", request, CancelPaymentLinkResponse.class);

    }

    /**
     * Retrieves the status of a payment link.
     * @param request the request parameters.
     * @return {@link PaymentLinkStatusResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public PaymentLinkStatusResponse paymentLinkStatus(PaymentLinkStatusRequest request) throws Exception {

        return (PaymentLinkStatusResponse) postGateway("/api/payment-link-status", request, PaymentLinkStatusResponse.class);

    }

    /**
     * Retrieves the current status of a transaction.
     * @param request the request parameters.
     * @return {@link AuthorizationResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public AuthorizationResponse transactionStatus(TransactionStatusRequest request) throws Exception {

        return (AuthorizationResponse) postGateway("/api/tx-status", request, AuthorizationResponse.class);

    }

    /**
     * Updates or creates a customer record.
     * @param request the request parameters.
     * @return {@link CustomerResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CustomerResponse updateCustomer(UpdateCustomerRequest request) throws Exception {

        return (CustomerResponse) postGateway("/api/update-customer", request, CustomerResponse.class);

    }

    /**
     * Retrieves a customer by id.
     * @param request the request parameters.
     * @return {@link CustomerResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CustomerResponse customer(CustomerRequest request) throws Exception {

        return (CustomerResponse) postGateway("/api/customer", request, CustomerResponse.class);

    }

    /**
     * Searches the customer database.
     * @param request the request parameters.
     * @return {@link CustomerSearchResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CustomerSearchResponse customerSearch(CustomerSearchRequest request) throws Exception {

        return (CustomerSearchResponse) postGateway("/api/customer-search", request, CustomerSearchResponse.class);

    }

    /**
     * Calculates the discount for actual cash transactions.
     * @param request the request parameters.
     * @return {@link CashDiscountResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CashDiscountResponse cashDiscount(CashDiscountRequest request) throws Exception {

        return (CashDiscountResponse) postGateway("/api/cash-discount", request, CashDiscountResponse.class);

    }

    /**
     * Returns the batch history for a merchant.
     * @param request the request parameters.
     * @return {@link BatchHistoryResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public BatchHistoryResponse batchHistory(BatchHistoryRequest request) throws Exception {

        return (BatchHistoryResponse) postGateway("/api/batch-history", request, BatchHistoryResponse.class);

    }

    /**
     * Returns the batch details for a single batch.
     * @param request the request parameters.
     * @return {@link BatchDetailsResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public BatchDetailsResponse batchDetails(BatchDetailsRequest request) throws Exception {

        return (BatchDetailsResponse) postGateway("/api/batch-details", request, BatchDetailsResponse.class);

    }

    /**
     * Returns the transaction history for a merchant.
     * @param request the request parameters.
     * @return {@link TransactionHistoryResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public TransactionHistoryResponse transactionHistory(TransactionHistoryRequest request) throws Exception {

        return (TransactionHistoryResponse) postGateway("/api/tx-history", request, TransactionHistoryResponse.class);

    }

    /**
     * Returns a list of partner statements.
     * @param request the request parameters.
     * @return {@link PartnerStatementListResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public PartnerStatementListResponse partnerStatements(PartnerStatementListRequest request) throws Exception {

        return (PartnerStatementListResponse) postGateway("/api/partner-statement-list", request, PartnerStatementListResponse.class);

    }

    /**
     * Returns a list of merchant invoices.
     * @param request the request parameters.
     * @return {@link MerchantInvoiceListResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public MerchantInvoiceListResponse merchantInvoices(MerchantInvoiceListRequest request) throws Exception {

        return (MerchantInvoiceListResponse) postGateway("/api/merchant-invoice-list", request, MerchantInvoiceListResponse.class);

    }

    /**
     * Returns detail for a single merchant-invoice statement.
     * @param request the request parameters.
     * @return {@link MerchantInvoiceDetailResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public MerchantInvoiceDetailResponse merchantInvoiceDetail(MerchantInvoiceDetailRequest request) throws Exception {

        return (MerchantInvoiceDetailResponse) postGateway("/api/merchant-invoice-detail", request, MerchantInvoiceDetailResponse.class);

    }

    /**
     * Returns detail for a single partner statement.
     * @param request the request parameters.
     * @return {@link PartnerStatementDetailResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public PartnerStatementDetailResponse partnerStatementDetail(PartnerStatementDetailRequest request) throws Exception {

        return (PartnerStatementDetailResponse) postGateway("/api/partner-statement-detail", request, PartnerStatementDetailResponse.class);

    }

    /**
     * Returns pricing policy for a merchant.
     * @param request the request parameters.
     * @return {@link PricingPolicyResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public PricingPolicyResponse pricingPolicy(PricingPolicyRequest request) throws Exception {

        return (PricingPolicyResponse) postGateway("/api/read-pricing-policy", request, PricingPolicyResponse.class);

    }

    /**
     * Returns low level details for how partner commissions were calculated for a
     * specific merchant statement.
     * @param request the request parameters.
     * @return {@link PartnerCommissionBreakdownResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public PartnerCommissionBreakdownResponse partnerCommissionBreakdown(PartnerCommissionBreakdownRequest request) throws Exception {

        return (PartnerCommissionBreakdownResponse) postGateway("/api/partner-commission-breakdown", request, PartnerCommissionBreakdownResponse.class);

    }

    /**
     * Returns profile information for a merchant.
     * @param request the request parameters.
     * @return {@link MerchantProfileResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public MerchantProfileResponse merchantProfile(MerchantProfileRequest request) throws Exception {

        return (MerchantProfileResponse) postGateway("/api/public-merchant-profile", request, MerchantProfileResponse.class);

    }

    /**
     * Deletes a customer record.
     * @param request the request parameters.
     * @return {@link DeleteCustomerResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public DeleteCustomerResponse deleteCustomer(DeleteCustomerRequest request) throws Exception {

        return (DeleteCustomerResponse) deleteGateway("/api/customer/" + request.getCustomerId(), request, DeleteCustomerResponse.class);

    }

    /**
     * Retrieves payment token metadata.
     * @param request the request parameters.
     * @return {@link TokenMetadataResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public TokenMetadataResponse tokenMetadata(TokenMetadataRequest request) throws Exception {

        return (TokenMetadataResponse) getGateway("/api/token/" + request.getToken(), request.isTest(), TokenMetadataResponse.class);

    }

    /**
     * Links a token to a customer record.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public Acknowledgement linkToken(LinkTokenRequest request) throws Exception {

        return (Acknowledgement) postGateway("/api/link-token", request, Acknowledgement.class);

    }

    /**
     * Removes a link between a customer and a token.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public Acknowledgement unlinkToken(UnlinkTokenRequest request) throws Exception {

        return (Acknowledgement) postGateway("/api/unlink-token", request, Acknowledgement.class);

    }

    /**
     * Deletes a payment token.
     * @param request the request parameters.
     * @return {@link DeleteTokenResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public DeleteTokenResponse deleteToken(DeleteTokenRequest request) throws Exception {

        return (DeleteTokenResponse) deleteGateway("/api/token/" + request.getToken(), request, DeleteTokenResponse.class);

    }




    /**
     * Adds a test merchant account.
     * @param request the request parameters.
     * @return {@link GetMerchantsResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public GetMerchantsResponse getMerchants(GetMerchantsRequest request) throws Exception {

        return (GetMerchantsResponse) postDashboard("/api/get-merchants", request, GetMerchantsResponse.class);

    }
    
    /**
     * Adds or updates a merchant account. Can be used to create or update test merchants.
     * Only gateway partners may create new live merchants.
     * @param request the request parameters.
     * @return {@link MerchantProfileResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public MerchantProfileResponse updateMerchant(MerchantProfile request) throws Exception {

        return (MerchantProfileResponse) postDashboard("/api/update-merchant", request, MerchantProfileResponse.class);

    }
    
    /**
     * List all active users and pending invites for a merchant account.
     * @param request the request parameters.
     * @return {@link MerchantUsersResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public MerchantUsersResponse merchantUsers(MerchantProfileRequest request) throws Exception {

        return (MerchantUsersResponse) postDashboard("/api/merchant-users", request, MerchantUsersResponse.class);

    }
    
    /**
     * Invites a user to join a merchant account.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement inviteMerchantUser(InviteMerchantUserRequest request) throws Exception {

        return (Acknowledgement) postDashboard("/api/invite-merchant-user", request, Acknowledgement.class);

    }
    
    /**
     * Adds a test merchant account.
     * @param request the request parameters.
     * @return {@link MerchantProfileResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public MerchantProfileResponse addTestMerchant(AddTestMerchantRequest request) throws Exception {

        return (MerchantProfileResponse) postDashboard("/api/add-test-merchant", request, MerchantProfileResponse.class);

    }
    
    /**
     * Deletes a test merchant account. Supports partner scoped API credentials only.
     * Live merchant accounts cannot be deleted.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement deleteTestMerchant(MerchantProfileRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/test-merchant/" + request.getMerchantId(), request, Acknowledgement.class);

    }
    
    /**
     * List all merchant platforms configured for a gateway merchant.
     * @param request the request parameters.
     * @return {@link MerchantPlatformsResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public MerchantPlatformsResponse merchantPlatforms(MerchantProfileRequest request) throws Exception {

        return (MerchantPlatformsResponse) getDashboard("/api/plugin-configs/" + request.getMerchantId(), request, MerchantPlatformsResponse.class);

    }
    
    /**
     * List all merchant platforms configured for a gateway merchant.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement updateMerchantPlatforms(MerchantPlatform request) throws Exception {

        return (Acknowledgement) postDashboard("/api/plugin-configs", request, Acknowledgement.class);

    }
    
    /**
     * Deletes a boarding platform configuration.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement deleteMerchantPlatforms(MerchantPlatformRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/plugin-config/" + request.getPlatformId(), request, Acknowledgement.class);

    }
    
    /**
     * Returns all terminals associated with the merchant account.
     * @param request the request parameters.
     * @return {@link TerminalProfileResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public TerminalProfileResponse terminals(TerminalProfileRequest request) throws Exception {

        return (TerminalProfileResponse) getDashboard("/api/terminals", request, TerminalProfileResponse.class);

    }
    
    /**
     * Deactivates a terminal.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement deactivateTerminal(TerminalDeactivationRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/terminal/" + request.getTerminalId(), request, Acknowledgement.class);

    }
    
    /**
     * Activates a terminal.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement activateTerminal(TerminalActivationRequest request) throws Exception {

        return (Acknowledgement) postDashboard("/api/terminal-activate", request, Acknowledgement.class);

    }
    
    /**
     * Returns a list of terms and conditions templates associated with a merchant
     * account.
     * @param request the request parameters.
     * @return {@link TermsAndConditionsTemplateResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public TermsAndConditionsTemplateResponse tcTemplates(TermsAndConditionsTemplateRequest request) throws Exception {

        return (TermsAndConditionsTemplateResponse) getDashboard("/api/tc-templates", request, TermsAndConditionsTemplateResponse.class);

    }
    
    /**
     * Returns a single terms and conditions template.
     * @param request the request parameters.
     * @return {@link TermsAndConditionsTemplate}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public TermsAndConditionsTemplate tcTemplate(TermsAndConditionsTemplateRequest request) throws Exception {

        return (TermsAndConditionsTemplate) getDashboard("/api/tc-templates/" + request.getTemplateId(), request, TermsAndConditionsTemplate.class);

    }
    
    /**
     * Updates or creates a terms and conditions template.
     * @param request the request parameters.
     * @return {@link TermsAndConditionsTemplate}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public TermsAndConditionsTemplate tcUpdateTemplate(TermsAndConditionsTemplate request) throws Exception {

        return (TermsAndConditionsTemplate) postDashboard("/api/tc-templates", request, TermsAndConditionsTemplate.class);

    }
    
    /**
     * Deletes a single terms and conditions template.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement tcDeleteTemplate(TermsAndConditionsTemplateRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/tc-templates/" + request.getTemplateId(), request, Acknowledgement.class);

    }
    
    /**
     * Returns up to 250 entries from the Terms and Conditions log.
     * @param request the request parameters.
     * @return {@link TermsAndConditionsLogResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public TermsAndConditionsLogResponse tcLog(TermsAndConditionsLogRequest request) throws Exception {

        return (TermsAndConditionsLogResponse) postDashboard("/api/tc-log", request, TermsAndConditionsLogResponse.class);

    }
    
    /**
     * Returns a single detailed Terms and Conditions entry.
     * @param request the request parameters.
     * @return {@link TermsAndConditionsLogEntry}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public TermsAndConditionsLogEntry tcEntry(TermsAndConditionsLogRequest request) throws Exception {

        return (TermsAndConditionsLogEntry) getDashboard("/api/tc-entry/" + request.getLogEntryId(), request, TermsAndConditionsLogEntry.class);

    }
    
    /**
     * Returns all survey questions for a given merchant.
     * @param request the request parameters.
     * @return {@link SurveyQuestionResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public SurveyQuestionResponse surveyQuestions(SurveyQuestionRequest request) throws Exception {

        return (SurveyQuestionResponse) getDashboard("/api/survey-questions", request, SurveyQuestionResponse.class);

    }
    
    /**
     * Returns a single survey question with response data.
     * @param request the request parameters.
     * @return {@link SurveyQuestion}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public SurveyQuestion surveyQuestion(SurveyQuestionRequest request) throws Exception {

        return (SurveyQuestion) getDashboard("/api/survey-questions/" + request.getQuestionId(), request, SurveyQuestion.class);

    }
    
    /**
     * Updates or creates a survey question.
     * @param request the request parameters.
     * @return {@link SurveyQuestion}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public SurveyQuestion updateSurveyQuestion(SurveyQuestion request) throws Exception {

        return (SurveyQuestion) postDashboard("/api/survey-questions", request, SurveyQuestion.class);

    }
    
    /**
     * Deletes a survey question.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement deleteSurveyQuestion(SurveyQuestionRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/survey-questions/" + request.getQuestionId(), request, Acknowledgement.class);

    }
    
    /**
     * Returns results for a single survey question.
     * @param request the request parameters.
     * @return {@link SurveyQuestion}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public SurveyQuestion surveyResults(SurveyResultsRequest request) throws Exception {

        return (SurveyQuestion) postDashboard("/api/survey-results", request, SurveyQuestion.class);

    }
    
    /**
     * Returns the media library for a given partner, merchant, or organization.
     * @param request the request parameters.
     * @return {@link MediaLibraryResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public MediaLibraryResponse media(MediaRequest request) throws Exception {

        return (MediaLibraryResponse) getDashboard("/api/media", request, MediaLibraryResponse.class);

    }
    
    /**
     * Uploads a media asset to the media library.
     * @param request the request parameters.
     * @return {@link MediaMetadata}
     * @throws Exception exception if any errors occurred processing the request.
     */
        public MediaMetadata uploadMedia(UploadMetadata request, InputStream inStream) throws Exception {

        return (MediaMetadata) postUpload("/api/upload-media", request, inStream, MediaMetadata.class);

    }

    
    /**
     * Retrieves the current status of a file upload.
     * @param request the request parameters.
     * @return {@link UploadStatus}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public UploadStatus uploadStatus(UploadStatusRequest request) throws Exception {

        return (UploadStatus) getDashboard("/api/media-upload/" + request.getUploadId(), request, UploadStatus.class);

    }
    
    /**
     * Returns the media details for a single media asset.
     * @param request the request parameters.
     * @return {@link MediaMetadata}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public MediaMetadata mediaAsset(MediaRequest request) throws Exception {

        return (MediaMetadata) getDashboard("/api/media/" + request.getMediaId(), request, MediaMetadata.class);

    }
    
    /**
     * Deletes a media asset.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement deleteMediaAsset(MediaRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/media/" + request.getMediaId(), request, Acknowledgement.class);

    }
    
    /**
     * Returns a collection of slide shows.
     * @param request the request parameters.
     * @return {@link SlideShowResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public SlideShowResponse slideShows(SlideShowRequest request) throws Exception {

        return (SlideShowResponse) getDashboard("/api/slide-shows", request, SlideShowResponse.class);

    }
    
    /**
     * Returns a single slide show with slides.
     * @param request the request parameters.
     * @return {@link SlideShow}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public SlideShow slideShow(SlideShowRequest request) throws Exception {

        return (SlideShow) getDashboard("/api/slide-shows/" + request.getSlideShowId(), request, SlideShow.class);

    }
    
    /**
     * Updates or creates a slide show.
     * @param request the request parameters.
     * @return {@link SlideShow}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public SlideShow updateSlideShow(SlideShow request) throws Exception {

        return (SlideShow) postDashboard("/api/slide-shows", request, SlideShow.class);

    }
    
    /**
     * Deletes a single slide show.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement deleteSlideShow(SlideShowRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/slide-shows/" + request.getSlideShowId(), request, Acknowledgement.class);

    }
    
    /**
     * Returns the terminal branding stack for a given set of API credentials.
     * @param request the request parameters.
     * @return {@link BrandingAssetResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public BrandingAssetResponse terminalBranding(BrandingAssetRequest request) throws Exception {

        return (BrandingAssetResponse) getDashboard("/api/terminal-branding", request, BrandingAssetResponse.class);

    }
    
    /**
     * Updates a branding asset.
     * @param request the request parameters.
     * @return {@link BrandingAsset}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public BrandingAsset updateBrandingAsset(BrandingAsset request) throws Exception {

        return (BrandingAsset) postDashboard("/api/terminal-branding", request, BrandingAsset.class);

    }
    
    /**
     * Deletes a branding asset.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */

        public Acknowledgement deleteBrandingAsset(BrandingAssetRequest request) throws Exception {

        return (Acknowledgement) deleteDashboard("/api/terminal-branding/" + request.getAssetId(), request, Acknowledgement.class);

    }
    



    /**
     * Tests connectivity with a payment terminal.
     * @param request the request parameters.
     * @return {@link PingResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public PingResponse ping(PingRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (PingResponse) postTerminal("/api/test", request, PingResponse.class);
        } else {
            return (PingResponse) postGateway("/api/terminal-test", request, PingResponse.class);
        }

    }

    /**
     * Executes a standard direct preauth and capture.
     * @param request the request parameters.
     * @return {@link AuthorizationResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public AuthorizationResponse charge(AuthorizationRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (AuthorizationResponse) postTerminal("/api/charge", request, AuthorizationResponse.class);
        } else {
            return (AuthorizationResponse) postGateway("/api/charge", request, AuthorizationResponse.class);
        }

    }

    /**
     * Executes a preauthorization intended to be captured later.
     * @param request the request parameters.
     * @return {@link AuthorizationResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public AuthorizationResponse preauth(AuthorizationRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (AuthorizationResponse) postTerminal("/api/preauth", request, AuthorizationResponse.class);
        } else {
            return (AuthorizationResponse) postGateway("/api/preauth", request, AuthorizationResponse.class);
        }

    }

    /**
     * Executes a refund.
     * @param request the request parameters.
     * @return {@link AuthorizationResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public AuthorizationResponse refund(RefundRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (AuthorizationResponse) postTerminal("/api/refund", request, AuthorizationResponse.class);
        } else {
            return (AuthorizationResponse) postGateway("/api/refund", request, AuthorizationResponse.class);
        }

    }

    /**
     * Adds a new payment method to the token vault.
     * @param request the request parameters.
     * @return {@link EnrollResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public EnrollResponse enroll(EnrollRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (EnrollResponse) postTerminal("/api/enroll", request, EnrollResponse.class);
        } else {
            return (EnrollResponse) postGateway("/api/enroll", request, EnrollResponse.class);
        }

    }

    /**
     * Activates or recharges a gift card.
     * @param request the request parameters.
     * @return {@link GiftActivateResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public GiftActivateResponse giftActivate(GiftActivateRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (GiftActivateResponse) postTerminal("/api/gift-activate", request, GiftActivateResponse.class);
        } else {
            return (GiftActivateResponse) postGateway("/api/gift-activate", request, GiftActivateResponse.class);
        }

    }

    /**
     * Checks the remaining balance on a payment method.
     * @param request the request parameters.
     * @return {@link BalanceResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public BalanceResponse balance(BalanceRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (BalanceResponse) postTerminal("/api/balance", request, BalanceResponse.class);
        } else {
            return (BalanceResponse) postGateway("/api/balance", request, BalanceResponse.class);
        }

    }

    /**
     * Clears the line item display and any in progress transaction.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public Acknowledgement clear(ClearTerminalRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) postTerminal("/api/clear", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) postGateway("/api/terminal-clear", request, Acknowledgement.class);
        }

    }

    /**
     * Returns the current status of a terminal.
     * @param request the request parameters.
     * @return {@link TerminalStatusResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public TerminalStatusResponse terminalStatus(TerminalStatusRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (TerminalStatusResponse) postTerminal("/api/terminal-status", request, TerminalStatusResponse.class);
        } else {
            return (TerminalStatusResponse) postGateway("/api/terminal-status", request, TerminalStatusResponse.class);
        }

    }

    /**
     * Prompts the user to accept terms and conditions.
     * @param request the request parameters.
     * @return {@link TermsAndConditionsResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public TermsAndConditionsResponse termsAndConditions(TermsAndConditionsRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (TermsAndConditionsResponse) postTerminal("/api/tc", request, TermsAndConditionsResponse.class);
        } else {
            return (TermsAndConditionsResponse) postGateway("/api/terminal-tc", request, TermsAndConditionsResponse.class);
        }

    }

    /**
     * Captures and returns a signature.
     * @param request the request parameters.
     * @return {@link CaptureSignatureResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public CaptureSignatureResponse captureSignature(CaptureSignatureRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (CaptureSignatureResponse) postTerminal("/api/capture-signature", request, CaptureSignatureResponse.class);
        } else {
            return (CaptureSignatureResponse) postGateway("/api/capture-signature", request, CaptureSignatureResponse.class);
        }

    }

    /**
     * Displays a new transaction on the terminal.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public Acknowledgement newTransactionDisplay(TransactionDisplayRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) postTerminal("/api/txdisplay", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) postGateway("/api/terminal-txdisplay", request, Acknowledgement.class);
        }

    }

    /**
     * Appends items to an existing transaction display. Subtotal, Tax, and Total are
     * overwritten by the request. Items with the same description are combined into
     * groups.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public Acknowledgement updateTransactionDisplay(TransactionDisplayRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) putTerminal("/api/txdisplay", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) putGateway("/api/terminal-txdisplay", request, Acknowledgement.class);
        }

    }

    /**
     * Displays a short message on the terminal.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public Acknowledgement message(MessageRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) postTerminal("/api/message", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) postGateway("/api/message", request, Acknowledgement.class);
        }

    }

    /**
     * Asks the consumer a yes/no question.
     * @param request the request parameters.
     * @return {@link BooleanPromptResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public BooleanPromptResponse booleanPrompt(BooleanPromptRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (BooleanPromptResponse) postTerminal("/api/boolean-prompt", request, BooleanPromptResponse.class);
        } else {
            return (BooleanPromptResponse) postGateway("/api/boolean-prompt", request, BooleanPromptResponse.class);
        }

    }

    /**
     * Asks the consumer a text based question.
     * @param request the request parameters.
     * @return {@link TextPromptResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public TextPromptResponse textPrompt(TextPromptRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (TextPromptResponse) postTerminal("/api/text-prompt", request, TextPromptResponse.class);
        } else {
            return (TextPromptResponse) postGateway("/api/text-prompt", request, TextPromptResponse.class);
        }

    }

    /**
     * Returns a list of queued transactions on a terminal.
     * @param request the request parameters.
     * @return {@link ListQueuedTransactionsResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public ListQueuedTransactionsResponse listQueuedTransactions(ListQueuedTransactionsRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (ListQueuedTransactionsResponse) postTerminal("/api/queue/list", request, ListQueuedTransactionsResponse.class);
        } else {
            return (ListQueuedTransactionsResponse) postGateway("/api/queue/list", request, ListQueuedTransactionsResponse.class);
        }

    }

    /**
     * Deletes a queued transaction from the terminal.
     * @param request the request parameters.
     * @return {@link DeleteQueuedTransactionResponse}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public DeleteQueuedTransactionResponse deleteQueuedTransaction(DeleteQueuedTransactionRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (DeleteQueuedTransactionResponse) postTerminal("/api/queue/delete", request, DeleteQueuedTransactionResponse.class);
        } else {
            return (DeleteQueuedTransactionResponse) postGateway("/api/queue/delete", request, DeleteQueuedTransactionResponse.class);
        }

    }

    /**
     * Reboot a payment terminal.
     * @param request the request parameters.
     * @return {@link Acknowledgement}
     * @throws Exception exception if any errors occurred processing the request.
     */
    public Acknowledgement reboot(PingRequest request) throws Exception {

        if (isTerminalRouted(request)) {
            return (Acknowledgement) postTerminal("/api/reboot", request, Acknowledgement.class);
        } else {
            return (Acknowledgement) postGateway("/api/terminal-reboot", request, Acknowledgement.class);
        }

    }


    /**
     * Decrypts API credentials using the offline cache key.
     * @param creds blockchyp API credentials.
     * @return a decrypted copy of the original credentials.
     */
    protected APICredentials decrypt(APICredentials creds) {
        CryptoUtils crypto = CryptoUtils.getInstance();

        APICredentials results = new APICredentials();

        byte[] key = deriveOfflineKey();
        try {

            results.setApiKey(crypto.decrypt(creds.getApiKey(), key));
            results.setBearerToken(crypto.decrypt(creds.getBearerToken(), key));
            results.setSigningKey(crypto.decrypt(creds.getSigningKey(), key));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return results;
    }

    /**
     * Encrypts API credentials using the offline cache key.
     * @param creds blockchyp API credentials.
     * @return an encrypted copy of the original credentials.
     */
    protected APICredentials encrypt(APICredentials creds) {

        CryptoUtils crypto = CryptoUtils.getInstance();

        APICredentials results = new APICredentials();

        byte[] key = deriveOfflineKey();
        try {
            results.setApiKey(crypto.encrypt(creds.getApiKey(), key));
            results.setBearerToken(crypto.encrypt(creds.getBearerToken(), key));
            results.setSigningKey(crypto.encrypt(creds.getSigningKey(), key));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return results;
    }

    /**
     * Generates the encryption key used for offline cache records.
     * @return the key in bytes.
     */
    protected byte[] deriveOfflineKey() {

        MessageDigest md = DigestUtils.getSha1Digest();
        md.digest(Hex.decode(OFFLINE_FIXED_KEY));
        return Arrays.copyOfRange(md.digest(Hex.decode(defaultCredentials.getSigningKey())), 0, CryptoUtils.AES_KEY_SIZE_IN_BYTES);

    }

    /**
     * Looks up a terminal route from the cache.
     * @param terminalName terminal name assigned at activation.
     * @return the terminal route record.
     */
    protected TerminalRouteResponse routeCacheGet(String terminalName) {

        TerminalRouteResponse route = (TerminalRouteResponse) routeCache.get(toTerminalRouteKey(terminalName));
        if (route != null) {
            paymentLogger.debug("Memory Route Cache Hit: " + terminalName);
            return route;
        }

        if (offlineRouteCacheEnabled) {
            route = getOfflineCache(terminalName);
            if (route != null) {
                routeCachePut(route);
            }
        }

        return route;
    }

    /**
     * Puts a terminal route in the cache (both caches).
     * @param route the terminal route record.
     */
    @SuppressWarnings({ "unchecked" })
    protected void routeCachePut(TerminalRouteResponse route) {

        routeCache.put(defaultCredentials.getApiKey() + route.getTerminalName(), route);

        if (offlineRouteCacheEnabled) {
            try {
                // we clone this because we're going to store a version of it with transient
                // creds encrypted
                TerminalRouteResponse offlineRoute = (TerminalRouteResponse) BeanUtils.cloneBean(route);
                offlineRoute.setTransientCredentials(encrypt(route.getTransientCredentials()));

                File offlineFile = new File(resolveOfflineRouteCacheLocation(route.getTerminalName()));
                FileWriter writer = new FileWriter(offlineFile);
                objectMapper.writeValue(writer, offlineRoute);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    /**
     * Creates a cache key for terminal routes.
     * @param terminalName terminal name.
     * @return terminal cache key.
     */
    protected String toTerminalRouteKey(String terminalName) {

        return defaultCredentials.getApiKey() + terminalName;

    }

    /**
     * Writes the signature to a file if a signature is present and the caller has
     * requested it. Notice this does not throw exceptions in order to prevent
     * the calling application from losing track of the authorization.
     *
     * @param request {@link ISignatureRequest}
     * @param response {@link ISignatureResponse}
     */
    protected void dumpSignatureFile(Object request, Object response) {


        if ( (request instanceof ISignatureRequest) && (response instanceof ISignatureResponse) ) {

          ISignatureRequest sigRequest = (ISignatureRequest) request;
          ISignatureResponse sigResponse = (ISignatureResponse) response;

          if (StringUtils.isEmpty(sigResponse.getSigFile())) {
              return;
          }

          if (StringUtils.isEmpty(sigRequest.getSigFile())) {
              return;
          }

          try {
              byte[] sigBinary = Hex.decode(sigResponse.getSigFile());
              FileUtils.writeByteArrayToFile(new File(sigRequest.getSigFile()), sigBinary);
          } catch (Exception e) {
              paymentLogger.error("Exception storing signature file", e);
          }

        }

    }

    /**
     * Finds the terminal route record for the given terminal name.
     * First the local in memory cache is checked, then the offline cache (if enabled).
     * If the first two cache lookups come up empty or the cache is over an hour old,
     * the gateway route API is invoked.  If we have a stale cache entry and the
     * gateway route lookup fails or times out, we fall back to the stale cache entry.
     * @param terminalName name of the terminal assigned at activation.
     * @return the terminal route record.
     */
    protected TerminalRouteResponse resolveTerminalRoute(String terminalName) {

        if (StringUtils.isEmpty(terminalName)) {
            return null;
        }

        TerminalRouteResponse route = routeCacheGet(terminalName);

        TerminalRouteResponse fallbackRoute = null; // fallback to stale cache if route lookup fails

        if (route != null) {
            fallbackRoute = route;
            long expiry = route.getTimestamp().getTime() + MS_PER_HOUR;
            if (System.currentTimeMillis() > expiry) {
                paymentLogger.debug("Ignoring stale route in memory route cache.");
                route = null;
            }
        }

        if (route == null) {
            try {
                route = (TerminalRouteResponse) getGateway(
                        "/api/terminal-route?terminal=" + URLEncoder.encode(terminalName, "UTF-8"), false,
                        TerminalRouteResponse.class);
                if (route != null) {
                    route.setTimestamp(new Date());
                    routeCachePut(route);
                }
            } catch (ConnectTimeoutException e) {
                e.printStackTrace();
                return fallbackRoute;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return route;

    }

    /**
     * Returns the gateway client singleton.
     * @return HttpClient configured for gateway requests.
     */
    protected HttpClient getGatewayClient() {
        if (gatewayClient == null) {
            gatewayManager = new MultiThreadedHttpConnectionManager();
            gatewayClient = new HttpClient(gatewayManager);
            if (connectionTimeout > 0) {
                gatewayClient.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
            }
            if (timeout > 0) {
                gatewayClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);
            }
        }
        return gatewayClient;
    }

    /**
     * Returns the terminal client singleton.
     * @return HttpClient configured for terminal requests.
     */
    protected HttpClient getTerminalClient() {
        if (terminalClient == null) {
            terminalManager = new MultiThreadedHttpConnectionManager();
            terminalClient = new HttpClient(terminalManager);
            if (connectionTimeout > 0) {
                terminalClient.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
            }
            if (timeout > 0) {
                terminalClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);
            }
        }
        return terminalClient;
    }


    /**
     * Assembles the scheme, ip address, and port number bits of a terminal URL.
     * @param route the terminal route record.
     * @return scheme, ip addres, and port number.
     */
    protected String resolveTerminalHost(TerminalRouteResponse route) {

        //Note: our terminals don't actually run Java, but port 8080 should make you feel at home.
        return (isTerminalHttps() ? "https://" : "http://") + route.getIpAddress() + (isTerminalHttps() ? ":8443" : ":8080");

    }

    /**
     * Assembles a full path to the terminal for an API call.
     * @param route the terminal route record.
     * @param path API path relative to the root (e.g. "/api/charge")
     * @return the fully qualified URI.
     */
    protected String toFullyQualifiedTerminalPath(TerminalRouteResponse route, String path) {

        return resolveTerminalHost(route) + path;

    }

    /**
     * Returns true if transaction for the given terminal reference should be routed over the local subnet.
     * @param terminalName reference to the terminal.
     * @return true, if terminal (local subnet) routed.
     */
    protected boolean isTerminalRouted(ITerminalReference terminalName) {

        TerminalRouteResponse route = resolveTerminalRoute(terminalName.getTerminalName());

        return StringUtils.isNotEmpty(terminalName.getTerminalName()) && !route.isCloudRelayEnabled();

    }


    /**
     * This handles all the common logic associated with processing terminal http requests.
     * @param route the terminal route record
     * @param request the request payload, if put or post
     * @param method the HttpMethod prepopulated
     * @param responseType expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected Object finishTerminalRequest(TerminalRouteResponse route, Object request, HttpMethod method,
            Class responseType) throws Exception {

        TerminalRequest termRequest = newTerminalRequestForRoute(route);
        termRequest.setRequest(request);

        HttpClient client = getGatewayClient();

        if (method instanceof EntityEnclosingMethod) {
            StringRequestEntity requestEntity = new StringRequestEntity(objectMapper.writeValueAsString(termRequest),
                    "application/json", "UTF-8");

            EntityEnclosingMethod entityMethod = (EntityEnclosingMethod) method;
            entityMethod.setRequestEntity(requestEntity);
        }

        method.setRequestHeader("User-Agent", USER_AGENT);

        paymentLogger.debug("Terminal: " + method.getURI().toString());

        try {
            int status = client.executeMethod(method);
            if (status != HttpStatus.SC_OK) {
                throw new IOException(method.getStatusText());
            }
            return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        } finally {
            method.releaseConnection();
        }

    }

    /**
     * Executes a put http request against the terminal API.
     * @param path api path relative to the root (e.g. "/api/charge")
     * @param request the request payload object.
     * @param responseType expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object putTerminal(String path, Object request, Class responseType) throws Exception {

        String terminalName = null;
        if (request instanceof ITerminalReference) {
            ITerminalReference ref = (ITerminalReference) request;
            terminalName = ref.getTerminalName();
        }

        TerminalRouteResponse route = resolveTerminalRoute(terminalName);

        PutMethod method = new PutMethod(resolveTerminalHost(route) + path);

        return finishTerminalRequest(route, request, method, responseType);

    }

    /**
     * Assembles a new terminal request and populates the credentials, using transient
     * credentials if available.
     * @param route the terminal route record.
     * @return {@link TerminalRequest}
     */
    protected TerminalRequest newTerminalRequestForRoute(TerminalRouteResponse route) {

        TerminalRequest termRequest = new TerminalRequest();

        if ((route.getTransientCredentials() != null) &&
            StringUtils.isNotEmpty(route.getTransientCredentials().getApiKey())) {
            termRequest.setApiKey(route.getTransientCredentials().getApiKey());
            termRequest.setBearerToken(route.getTransientCredentials().getBearerToken());
            termRequest.setSigningKey(route.getTransientCredentials().getSigningKey());
        } else {
            termRequest.setApiKey(defaultCredentials.getApiKey());
            termRequest.setBearerToken(defaultCredentials.getBearerToken());
            termRequest.setSigningKey(defaultCredentials.getSigningKey());
        }

        return termRequest;

    }

    /**
     * Posts an http request to the terminal API.
     * @param path api path relative to the root (e.g. "/api/charge")
     * @param request the request payload object.
     * @param responseType expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object postTerminal(String path, Object request, Class responseType) throws Exception {

        String terminalName = null;
        if (request instanceof ITerminalReference) {
            ITerminalReference ref = (ITerminalReference) request;
            terminalName = ref.getTerminalName();
        }

        TerminalRouteResponse route = resolveTerminalRoute(terminalName);

        PostMethod method = new PostMethod(resolveTerminalHost(route) + path);

        if (request instanceof ITimeoutRequest) {
            ITimeoutRequest coreRequest = (ITimeoutRequest) request;
            if (coreRequest.getTimeout() > 0) {
                method.getParams().setSoTimeout(coreRequest.getTimeout());
            }
        }



        return finishTerminalRequest(route, request, method, responseType);

    }

    /**
     * Executes an http get request against the gateway with a timeout override.
     * @param path api path relative to the root (e.g. "/api/heartbeat")
     * @param test whether or not this request should go to the test gateway
     * @param responseType expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object getGateway(String path, boolean test, Class responseType) throws Exception {

        return getGateway(path, test, responseType, timeout);

    }

    /**
     * Executes an http get request against the gateway with a timeout override.
     * @param path API path relative to the root (e.g. "/api/heartbeat")
     * @param test whether or not this request should go to the test gateway
     * @param responseType expected response type.
     * @param requestTimeout timeout for the request in milliseconds
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object getGateway(String path, boolean test, Class responseType, int requestTimeout) throws Exception {

        HttpMethod method = new GetMethod(toFullyQualifiedGatewayPath(path, test));
        if (requestTimeout > 0) {
            method.getParams().setSoTimeout(requestTimeout);
        }
        return finishGatewayRequest(method, responseType);

    }

    /**
     * Executes an http get request against the gateway with a timeout override.
     * @param path API path relative to the root (e.g. "/api/heartbeat")
     * @param request the request object.
     * @param responseType expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object getDashboard(String path, ITimeoutRequest request, Class responseType) throws Exception {

        HttpMethod method = new GetMethod(toFullyQualifiedDashboardPath(path));
        if (request.getTimeout() > 0) {
            method.getParams().setSoTimeout(request.getTimeout());
        }
        return finishGatewayRequest(method, responseType);

    }

    /**
     * Executes a previously assembled HttpMethod against the gateway.  Aggregates common logic
     * associated with hitting the gateway.
     * @param method the HttpMethod to execute.
     * @param responseType expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Object finishGatewayRequest(HttpMethod method, Class responseType) throws Exception {

        HttpClient client = getGatewayClient();

        method.setRequestHeader("User-Agent", USER_AGENT);

        Map headers = new HashMap();
        if (defaultCredentials != null) {
            headers = CryptoUtils.getInstance().generateApiHeaders(defaultCredentials.getApiKey(),
                    defaultCredentials.getBearerToken(), defaultCredentials.getSigningKey());
        }

        paymentLogger.debug("Gateway: " + method.getURI().toString());

        Iterator itr = headers.keySet().iterator();
        while (itr.hasNext()) {
            String key = (String) itr.next();
            String value = (String) headers.get(key);
            method.addRequestHeader(key, value);
        }
        try {
            int status = client.executeMethod(method);
            if (status == HttpStatus.SC_FORBIDDEN) {
                // check clock drift
                paymentLogger.info("Checking clock drift");
            }
            if (status != HttpStatus.SC_OK) {
                throw new IOException(method.getStatusText());
            }
            return objectMapper.readValue(method.getResponseBodyAsStream(), responseType);
        } finally {
            method.releaseConnection();
        }
    }

    /**
     * Executes a post HTTP request against the dashboard.
     * @param path API path from root (e.g. "/api/charge")
     * @param request the request object.
     * @param inStream is the upload input stream
     * @param responseClass expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object postUpload(String path, UploadMetadata request, InputStream inStream, Class responseClass) throws Exception {

        PostMethod method = new PostMethod(toFullyQualifiedDashboardPath(path));
        if (request.getFileSize() > 0) {
            method.addRequestHeader("X-File-Size", Integer.toString(request.getFileSize(), 10));
        }
        if (request.getFileName() != null && !request.getFileName().equals("")) {
            method.addRequestHeader("X-Upload-File-Name", request.getFileName());
        }
        if (request.getUploadId() != null && !request.getUploadId().equals("")) {
            method.addRequestHeader("X-Upload-ID", request.getUploadId());
        }

        InputStreamRequestEntity requestEntity = new InputStreamRequestEntity(inStream);

        method.setRequestEntity(requestEntity);

        if (request.getTimeout() > 0) {
            method.getParams().setSoTimeout(request.getTimeout());
        }

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Executes a post HTTP request against the dashboard.
     * @param path API path from root (e.g. "/api/charge")
     * @param request the request object.
     * @param responseClass expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object postDashboard(String path, ITimeoutRequest request, Class responseClass) throws Exception {

        PostMethod method = new PostMethod(toFullyQualifiedDashboardPath(path));
        StringRequestEntity requestEntity = new StringRequestEntity(objectMapper.writeValueAsString(request),
                "application/json", "UTF-8");

        method.setRequestEntity(requestEntity);

        if (request.getTimeout() > 0) {
            method.getParams().setSoTimeout(request.getTimeout());
        }

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Executes a post HTTP request against the gateway.
     * @param path API path from root (e.g. "/api/charge")
     * @param request the request object.
     * @param responseClass expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object postGateway(String path, ITimeoutRequest request, Class responseClass) throws Exception {

        PostMethod method = new PostMethod(toFullyQualifiedGatewayPath(path, request.isTest()));
        StringRequestEntity requestEntity = new StringRequestEntity(objectMapper.writeValueAsString(request),
                "application/json", "UTF-8");

        method.setRequestEntity(requestEntity);

        if (request.getTimeout() > 0) {
            method.getParams().setSoTimeout(request.getTimeout());
        }

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Executes a put HTTP request against the gateway.
     * @param path API path from root (e.g. "/api/charge")
     * @param request the request object.
     * @param responseClass expected response type.
     * @return a reponse of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object putGateway(String path, ITimeoutRequest request, Class responseClass) throws Exception {

        PutMethod method = new PutMethod(toFullyQualifiedGatewayPath(path, request.isTest()));
        StringRequestEntity requestEntity = new StringRequestEntity(objectMapper.writeValueAsString(request),
                "application/json", "UTF-8");

        method.setRequestEntity(requestEntity);

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Executes a delete HTTP request against the gateway.
     * @param path API path from root (e.g. "/api/charge")
     * @param request the request object.
     * @param responseClass expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object deleteGateway(String path, ITimeoutRequest request, Class responseClass) throws Exception {

        DeleteMethod method = new DeleteMethod(toFullyQualifiedGatewayPath(path, request.isTest()));

        if (request.getTimeout() > 0) {
            method.getParams().setSoTimeout(request.getTimeout());
        }

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Executes a delete HTTP request against the gateway.
     * @param path API path from root (e.g. "/api/charge")
     * @param request the request object.
     * @param responseClass expected response type.
     * @return a response of type specified by responseClass
     * @throws Exception exception if any errors occurred processing the request.
     */
    @SuppressWarnings({ "rawtypes" })
    protected Object deleteDashboard(String path, ITimeoutRequest request, Class responseClass) throws Exception {

        DeleteMethod method = new DeleteMethod(toFullyQualifiedDashboardPath(path));

        if (request.getTimeout() > 0) {
            method.getParams().setSoTimeout(request.getTimeout());
        }

        return finishGatewayRequest(method, responseClass);

    }

    /**
     * Returns the offline cache location.  This will be the value of offlineRouteCacheLocation if specified
     * and the operation system default tmp folder otherwise.
     *
     * @param terminalName the target terminal name.
     * @return local path.
     */
    protected String resolveOfflineRouteCacheLocation(String terminalName) {

        if (offlineRouteCacheLocation != null) {
            return offlineRouteCacheLocation + "_" +
                    StringUtils.replaceChars(toTerminalRouteKey(terminalName), " ", "_");
        } else {
            String temp = System.getProperty("java.io.tmpdir");
            if (!StringUtils.endsWith(temp, String.valueOf(File.separatorChar))) {
                temp = temp + File.separatorChar;
            }
            return temp + OFFLINE_CACHE + "_" + StringUtils.replaceChars(toTerminalRouteKey(terminalName), " ", "_");
        }

    }

    /**
     * Returns the route stored in the offline cache for the given terminal.
     * @param terminalName the target terminal name.
     * @return terminal route, null if not found.
     */
    public TerminalRouteResponse getOfflineCache(String terminalName) {

        File file = new File(resolveOfflineRouteCacheLocation(terminalName));

        paymentLogger.debug("Checking Offline Route Cache: " + file.getAbsolutePath());

        if (!file.exists()) {
            paymentLogger.debug("Offline Route Cache Miss: " + terminalName);
            return null;
        }

        try {
            TerminalRouteResponse route = objectMapper.readValue(file, TerminalRouteResponse.class);
            route.setTransientCredentials(decrypt(route.getTransientCredentials()));
            paymentLogger.debug("Offline Route Cache Hit: " + terminalName);
            return route;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Returns the offline route cache location.
     * @return offline route cache location.
     */
    public String getOfflineRouteCacheLocation() {
        return offlineRouteCacheLocation;
    }

    /**
     * Sets the offline route cache location if you want to override the default.  Defaults
     * to your operation system's tmp file location.
     * @param offlineRouteCacheLocation offline route cache location.
     */
    public void setOfflineRouteCacheLocation(String offlineRouteCacheLocation) {
        this.offlineRouteCacheLocation = offlineRouteCacheLocation;
    }

    /**
     * Converts path to the fully qualified URL for a gateway API call.
     * @param path path relative to the root (e.g. "/api/charge")
     * @param test whether or not this should route to the test transaction.
     * @return fully qualified URI.
     */
    protected String toFullyQualifiedGatewayPath(String path, boolean test) {
        if (test) {
            return this.testGatewayHost + path;
        } else {
            return this.gatewayHost + path;
        }
    }

    /**
     * Converts path to the fully qualified URL for a dashboard API call.
     * @param path path relative to the root (e.g. "/api/charge")
     * @return fully qualified URI.
     */
    protected String toFullyQualifiedDashboardPath(String path) {
        return this.dashboardHost + path;
    }

    /**
     * Gets the terminal https flag.  The Java SDK defaults to using http for
     * terminal communication because installing custom root certificate authorities
     * in Java is quite tricky and cannot be done programmatically.  We strongly
     * recommend that all developers install our root CA in your local keystores
     * and then turn https on in production.
     *
     * Our terminal root CA can be found here: https://docs.blockchyp.com/rest-api/terminal/index.html#ssl-tls
     *
     * @return https flag.
     */
    public boolean isTerminalHttps() {
        return terminalHttps;
    }

    /**
     * Sets the terminal https flag.  The Java SDK defaults to using http for
     * terminal communication because installing custom root certificate authorities
     * in Java is quite tricky and cannot be done programmatically.  We strongly
     * recommend that all developers install our root CA in your local keystores
     * and then turn https on in production.
     *
     * Our terminal root CA can be found here: https://docs.blockchyp.com/rest-api/terminal/index.html#ssl-tls
     *
     * @param terminalHttps https flag.
     */
    public void setTerminalHttps(boolean terminalHttps) {
        this.terminalHttps = terminalHttps;
    }

    /**
     * Gets a user agent for HTTP requests.
     */
    private static String getUserAgent() {
        String version = BlockChypClient.class.getPackage().getSpecificationVersion();
        return String.format("BlockChyp-Java/%s", version);
    }

}
