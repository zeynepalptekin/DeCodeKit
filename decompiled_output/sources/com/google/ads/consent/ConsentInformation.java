package com.google.ads.consent;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.x0;
import b.i.k.d;
import c.a.e.f;
import c.a.e.z.c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class ConsentInformation {
    private static final String CONSENT_DATA_KEY = "consent_string";
    private static final String MOBILE_ADS_SERVER_URL = "https://adservice.google.com/getconfig/pubvendors";
    private static final String PREFERENCES_FILE_KEY = "mobileads_consent";
    private static final String TAG = "ConsentInformation";
    private static ConsentInformation instance;
    private final Context context;
    private DebugGeography debugGeography = DebugGeography.DEBUG_GEOGRAPHY_DISABLED;
    private List<String> testDevices = new ArrayList();
    private String hashedDeviceId = f();

    private static class AdNetworkLookupResponse {

        @c("company_ids")
        private List<String> companyIds;

        @c("ad_network_id")
        private String id;

        @c("is_npa")
        private boolean isNPA;

        @c("lookup_failed")
        private boolean lookupFailed;

        @c("not_found")
        private boolean notFound;

        private AdNetworkLookupResponse() {
        }
    }

    private static class ConsentInfoUpdateResponse {
        String responseInfo;
        boolean success;

        ConsentInfoUpdateResponse(boolean success, String responseInfo) {
            this.success = success;
            this.responseInfo = responseInfo;
        }
    }

    private static class ConsentInfoUpdateTask extends AsyncTask<Void, Void, ConsentInfoUpdateResponse> {
        private static final String UPDATE_SUCCESS = "Consent update successful.";
        private final ConsentInformation consentInformation;
        private final ConsentInfoUpdateListener listener;
        private final List<String> publisherIds;
        private final String url;

        ConsentInfoUpdateTask(String url, ConsentInformation consentInformation, List<String> publisherIds, ConsentInfoUpdateListener listener) {
            this.url = url;
            this.listener = listener;
            this.publisherIds = publisherIds;
            this.consentInformation = consentInformation;
        }

        private ConsentInfoUpdateResponse b(String urlString) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(urlString).openConnection();
                if (httpURLConnection.getResponseCode() != 200) {
                    return new ConsentInfoUpdateResponse(false, httpURLConnection.getResponseMessage());
                }
                String strD = d(httpURLConnection.getInputStream());
                httpURLConnection.disconnect();
                this.consentInformation.x(strD, this.publisherIds);
                return new ConsentInfoUpdateResponse(true, UPDATE_SUCCESS);
            } catch (Exception e) {
                return new ConsentInfoUpdateResponse(false, e.getLocalizedMessage());
            }
        }

        private String d(InputStream inputStream) throws IOException {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            while (true) {
                try {
                    try {
                        int r7 = bufferedInputStream.read(bArr);
                        if (r7 != -1) {
                            sb.append(new String(bArr, 0, r7));
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                            }
                        }
                    } finally {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e2) {
                            Log.e(ConsentInformation.TAG, e2.getLocalizedMessage());
                        }
                    }
                } catch (IOException e3) {
                    Log.e(ConsentInformation.TAG, e3.getLocalizedMessage());
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e4) {
                        Log.e(ConsentInformation.TAG, e4.getLocalizedMessage());
                    }
                    return null;
                }
            }
            return sb.toString();
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConsentInfoUpdateResponse doInBackground(Void... unused) {
            String strJoin = TextUtils.join(",", this.publisherIds);
            ConsentData consentDataM = this.consentInformation.m();
            Uri.Builder builderAppendQueryParameter = Uri.parse(this.url).buildUpon().appendQueryParameter("pubs", strJoin).appendQueryParameter("es", "2").appendQueryParameter("plat", consentDataM.g()).appendQueryParameter("v", consentDataM.h());
            if (this.consentInformation.l() && this.consentInformation.e() != DebugGeography.DEBUG_GEOGRAPHY_DISABLED) {
                builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("debug_geo", this.consentInformation.e().e().toString());
            }
            return b(builderAppendQueryParameter.build().toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ConsentInfoUpdateResponse result) {
            if (result.success) {
                this.listener.b(this.consentInformation.d());
            } else {
                this.listener.a(result.responseInfo);
            }
        }
    }

    @x0
    protected static class ServerResponse {

        @c("ad_network_ids")
        List<AdNetworkLookupResponse> adNetworkLookupResponses;
        List<AdProvider> companies;

        @c("is_request_in_eea_or_unknown")
        Boolean isRequestLocationInEeaOrUnknown;

        protected ServerResponse() {
        }
    }

    private ConsentInformation(Context context) {
        this.context = context.getApplicationContext();
    }

    private String f() {
        ContentResolver contentResolver = this.context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || i()) {
            string = "emulator";
        }
        return n(string);
    }

    public static synchronized ConsentInformation g(Context context) {
        if (instance == null) {
            instance = new ConsentInformation(context);
        }
        return instance;
    }

    private HashSet<AdProvider> h(List<AdProvider> adProviders, HashSet<String> nonPersonalizedAdProviderIds) {
        ArrayList arrayList = new ArrayList();
        for (AdProvider adProvider : adProviders) {
            if (nonPersonalizedAdProviderIds.contains(adProvider.a())) {
                arrayList.add(adProvider);
            }
        }
        return new HashSet<>(arrayList);
    }

    private boolean i() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith(d.f1056b) || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    private String n(String string) throws NoSuchAlgorithmException {
        for (int r1 = 0; r1 < 3; r1++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(string.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private void r(ConsentData consentData) {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).edit();
        editorEdit.putString(CONSENT_DATA_KEY, new f().z(consentData));
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void x(String responseString, List<String> publisherIds) throws Exception {
        boolean z;
        ServerResponse serverResponse = (ServerResponse) new f().n(responseString, ServerResponse.class);
        y(serverResponse);
        HashSet<String> hashSet = new HashSet<>();
        boolean z2 = true;
        if (serverResponse.adNetworkLookupResponses != null) {
            z = false;
            for (AdNetworkLookupResponse adNetworkLookupResponse : serverResponse.adNetworkLookupResponses) {
                if (adNetworkLookupResponse.isNPA) {
                    List list = adNetworkLookupResponse.companyIds;
                    if (list != null) {
                        hashSet.addAll(list);
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        HashSet<AdProvider> hashSet2 = serverResponse.companies == null ? new HashSet<>() : z ? h(serverResponse.companies, hashSet) : new HashSet<>(serverResponse.companies);
        ConsentData consentDataM = m();
        if (consentDataM.i() == z) {
            z2 = false;
        }
        consentDataM.p(z);
        consentDataM.r(responseString);
        consentDataM.q(new HashSet<>(publisherIds));
        consentDataM.l(hashSet2);
        consentDataM.s(serverResponse.isRequestLocationInEeaOrUnknown.booleanValue());
        if (!serverResponse.isRequestLocationInEeaOrUnknown.booleanValue()) {
            r(consentDataM);
            return;
        }
        if (!consentDataM.a().equals(consentDataM.d()) || z2) {
            consentDataM.m("sdk");
            consentDataM.n(ConsentStatus.UNKNOWN);
            consentDataM.o(new HashSet<>());
        }
        r(consentDataM);
    }

    private void y(final ServerResponse response) throws Exception {
        Boolean bool = response.isRequestLocationInEeaOrUnknown;
        if (bool == null) {
            throw new Exception("Could not parse Event FE preflight response.");
        }
        if (response.companies == null && bool.booleanValue()) {
            throw new Exception("Could not parse Event FE preflight response.");
        }
        if (response.isRequestLocationInEeaOrUnknown.booleanValue()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (AdNetworkLookupResponse adNetworkLookupResponse : response.adNetworkLookupResponses) {
                if (adNetworkLookupResponse.lookupFailed) {
                    hashSet.add(adNetworkLookupResponse.id);
                }
                if (adNetworkLookupResponse.notFound) {
                    hashSet2.add(adNetworkLookupResponse.id);
                }
            }
            if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Response error.");
            if (!hashSet.isEmpty()) {
                sb.append(String.format(" Lookup failure for: %s.", TextUtils.join(",", hashSet)));
            }
            if (!hashSet2.isEmpty()) {
                sb.append(String.format(" Publisher Ids not found: %s", TextUtils.join(",", hashSet2)));
            }
            throw new Exception(sb.toString());
        }
    }

    public void b(String hashedDeviceId) {
        this.testDevices.add(hashedDeviceId);
    }

    public synchronized List<AdProvider> c() {
        return new ArrayList(m().a());
    }

    public synchronized ConsentStatus d() {
        return m().c();
    }

    public DebugGeography e() {
        return this.debugGeography;
    }

    public boolean j() {
        return m().j();
    }

    public synchronized boolean k() {
        return m().k();
    }

    public boolean l() {
        return i() || this.testDevices.contains(this.hashedDeviceId);
    }

    protected ConsentData m() {
        String string = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).getString(CONSENT_DATA_KEY, "");
        return TextUtils.isEmpty(string) ? new ConsentData() : (ConsentData) new f().n(string, ConsentData.class);
    }

    public void o(String[] publisherIds, ConsentInfoUpdateListener listener) {
        p(publisherIds, MOBILE_ADS_SERVER_URL, listener);
    }

    @x0
    protected void p(String[] publisherIds, String url, ConsentInfoUpdateListener listener) {
        String string;
        if (l()) {
            string = "This request is sent from a test device.";
        } else {
            String strF = f();
            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 93);
            sb.append("Use ConsentInformation.getInstance(context).addTestDevice(\"");
            sb.append(strF);
            sb.append("\") to get test ads on this device.");
            string = sb.toString();
        }
        Log.i(TAG, string);
        new ConsentInfoUpdateTask(url, this, Arrays.asList(publisherIds), listener).execute(new Void[0]);
    }

    public synchronized void q() {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).edit();
        editorEdit.clear();
        editorEdit.apply();
        this.testDevices = new ArrayList();
    }

    public void s(ConsentStatus consentStatus) {
        t(consentStatus, "programmatic");
    }

    protected synchronized void t(ConsentStatus consentStatus, String source) {
        ConsentData consentDataM = m();
        consentDataM.o(consentStatus == ConsentStatus.UNKNOWN ? new HashSet<>() : consentDataM.a());
        consentDataM.m(source);
        consentDataM.n(consentStatus);
        r(consentDataM);
    }

    public void u(DebugGeography debugGeography) {
        this.debugGeography = debugGeography;
    }

    @x0
    protected void v(String hashedDeviceId) {
        this.hashedDeviceId = hashedDeviceId;
    }

    public synchronized void w(boolean underAgeOfConsent) {
        ConsentData consentDataM = m();
        consentDataM.t(underAgeOfConsent);
        r(consentDataM);
    }
}
