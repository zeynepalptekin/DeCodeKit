package com.google.ads.consent;

import c.a.e.z.c;
import java.util.HashSet;

/* loaded from: classes.dex */
class ConsentData {
    private static final String SDK_PLATFORM = "android";
    private static final String SDK_VERSION = "1.0.4";

    @c("consent_source")
    private String consentSource;

    @c("providers")
    private HashSet<AdProvider> adProviders = new HashSet<>();

    @c("consented_providers")
    private HashSet<AdProvider> consentedAdProviders = new HashSet<>();

    @c("pub_ids")
    private HashSet<String> publisherIds = new HashSet<>();

    @c("tag_for_under_age_of_consent")
    private Boolean underAgeOfConsent = Boolean.FALSE;

    @c("consent_state")
    private ConsentStatus consentStatus = ConsentStatus.UNKNOWN;

    @c("is_request_in_eea_or_unknown")
    private boolean isRequestLocationInEeaOrUnknown = false;

    @c("has_any_npa_pub_id")
    private boolean hasNonPersonalizedPublisherId = false;

    @c("version")
    private final String sdkVersionString = SDK_VERSION;

    @c("plat")
    private final String sdkPlatformString = SDK_PLATFORM;

    @c("raw_response")
    private String rawResponse = "";

    ConsentData() {
    }

    HashSet<AdProvider> a() {
        return this.adProviders;
    }

    public String b() {
        return this.consentSource;
    }

    ConsentStatus c() {
        return this.consentStatus;
    }

    HashSet<AdProvider> d() {
        return this.consentedAdProviders;
    }

    HashSet<String> e() {
        return this.publisherIds;
    }

    String f() {
        return this.rawResponse;
    }

    public String g() {
        return this.sdkPlatformString;
    }

    public String h() {
        return this.sdkVersionString;
    }

    boolean i() {
        return this.hasNonPersonalizedPublisherId;
    }

    boolean j() {
        return this.isRequestLocationInEeaOrUnknown;
    }

    boolean k() {
        return this.underAgeOfConsent.booleanValue();
    }

    void l(HashSet<AdProvider> adProviders) {
        this.adProviders = adProviders;
    }

    public void m(String consentSource) {
        this.consentSource = consentSource;
    }

    void n(ConsentStatus consentStatus) {
        this.consentStatus = consentStatus;
    }

    void o(HashSet<AdProvider> consentedAdProviders) {
        this.consentedAdProviders = consentedAdProviders;
    }

    void p(boolean hasNonPersonalizedPublisherId) {
        this.hasNonPersonalizedPublisherId = hasNonPersonalizedPublisherId;
    }

    void q(HashSet<String> publisherIds) {
        this.publisherIds = publisherIds;
    }

    void r(String rawResponse) {
        this.rawResponse = rawResponse;
    }

    void s(boolean eeaRequestLocationOrUnknown) {
        this.isRequestLocationInEeaOrUnknown = eeaRequestLocationOrUnknown;
    }

    void t(boolean underAgeOfConsent) {
        this.underAgeOfConsent = Boolean.valueOf(underAgeOfConsent);
    }
}
