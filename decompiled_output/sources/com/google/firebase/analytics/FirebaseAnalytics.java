package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import c.a.b.b.g.c.h;
import c.a.b.b.k.m;
import c.a.b.b.k.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.k7;
import com.google.firebase.installations.i;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f6870c;

    /* renamed from: a, reason: collision with root package name */
    private final h f6871a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f6872b;

    public static class a {
        public static final String A = "view_item_list";
        public static final String B = "view_search_results";
        public static final String C = "earn_virtual_currency";
        public static final String D = "screen_view";
        public static final String E = "remove_from_cart";

        @Deprecated
        public static final String F = "checkout_progress";

        @Deprecated
        public static final String G = "set_checkout_option";
        public static final String H = "add_shipping_info";
        public static final String I = "purchase";
        public static final String J = "refund";
        public static final String K = "select_item";
        public static final String L = "select_promotion";
        public static final String M = "view_cart";
        public static final String N = "view_promotion";

        /* renamed from: a, reason: collision with root package name */
        public static final String f6873a = "ad_impression";

        /* renamed from: b, reason: collision with root package name */
        public static final String f6874b = "add_payment_info";

        /* renamed from: c, reason: collision with root package name */
        public static final String f6875c = "add_to_cart";
        public static final String d = "add_to_wishlist";
        public static final String e = "app_open";
        public static final String f = "begin_checkout";
        public static final String g = "campaign_details";

        @Deprecated
        public static final String h = "ecommerce_purchase";
        public static final String i = "generate_lead";
        public static final String j = "join_group";
        public static final String k = "level_end";
        public static final String l = "level_start";
        public static final String m = "level_up";
        public static final String n = "login";
        public static final String o = "post_score";

        @Deprecated
        public static final String p = "present_offer";

        @Deprecated
        public static final String q = "purchase_refund";
        public static final String r = "search";
        public static final String s = "select_content";
        public static final String t = "share";
        public static final String u = "sign_up";
        public static final String v = "spend_virtual_currency";
        public static final String w = "tutorial_begin";
        public static final String x = "tutorial_complete";
        public static final String y = "unlock_achievement";
        public static final String z = "view_item";

        protected a() {
        }
    }

    public static class b {
        public static final String A = "number_of_rooms";
        public static final String B = "destination";
        public static final String C = "origin";
        public static final String D = "price";
        public static final String E = "quantity";
        public static final String F = "score";
        public static final String G = "shipping";
        public static final String H = "transaction_id";
        public static final String I = "search_term";
        public static final String J = "success";
        public static final String K = "tax";
        public static final String L = "value";
        public static final String M = "virtual_currency_name";
        public static final String N = "campaign";
        public static final String O = "source";
        public static final String P = "medium";
        public static final String Q = "term";
        public static final String R = "content";
        public static final String S = "aclid";
        public static final String T = "cp1";
        public static final String U = "item_brand";
        public static final String V = "item_variant";

        @Deprecated
        public static final String W = "item_list";

        @Deprecated
        public static final String X = "checkout_step";

        @Deprecated
        public static final String Y = "checkout_option";
        public static final String Z = "creative_name";

        /* renamed from: a, reason: collision with root package name */
        public static final String f6876a = "achievement_id";
        public static final String a0 = "creative_slot";

        /* renamed from: b, reason: collision with root package name */
        public static final String f6877b = "ad_format";
        public static final String b0 = "affiliation";

        /* renamed from: c, reason: collision with root package name */
        public static final String f6878c = "ad_platform";
        public static final String c0 = "index";
        public static final String d = "ad_source";
        public static final String d0 = "discount";
        public static final String e = "ad_unit_name";
        public static final String e0 = "item_category2";
        public static final String f = "character";
        public static final String f0 = "item_category3";
        public static final String g = "travel_class";
        public static final String g0 = "item_category4";
        public static final String h = "content_type";
        public static final String h0 = "item_category5";
        public static final String i = "currency";
        public static final String i0 = "item_list_id";
        public static final String j = "coupon";
        public static final String j0 = "item_list_name";
        public static final String k = "start_date";
        public static final String k0 = "items";
        public static final String l = "end_date";
        public static final String l0 = "location_id";
        public static final String m = "extend_session";
        public static final String m0 = "payment_type";
        public static final String n = "flight_number";
        public static final String n0 = "promotion_id";
        public static final String o = "group_id";
        public static final String o0 = "promotion_name";
        public static final String p = "item_category";
        public static final String p0 = "screen_class";
        public static final String q = "item_id";
        public static final String q0 = "screen_name";

        @Deprecated
        public static final String r = "item_location_id";
        public static final String r0 = "shipping_tier";
        public static final String s = "item_name";
        public static final String t = "location";
        public static final String u = "level";
        public static final String v = "level_name";

        @Deprecated
        public static final String w = "sign_up_method";
        public static final String x = "method";
        public static final String y = "number_of_nights";
        public static final String z = "number_of_passengers";

        protected b() {
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final String f6879a = "sign_up_method";

        /* renamed from: b, reason: collision with root package name */
        public static final String f6880b = "allow_personalized_ads";

        protected c() {
        }
    }

    private FirebaseAnalytics(h hVar) {
        r.k(hVar);
        this.f6871a = hVar;
    }

    @Keep
    @o0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @h0
    public static FirebaseAnalytics getInstance(@h0 Context context) {
        if (f6870c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f6870c == null) {
                    f6870c = new FirebaseAnalytics(h.b(context));
                }
            }
        }
        return f6870c;
    }

    @Keep
    public static k7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        h hVarC = h.c(context, null, null, null, bundle);
        if (hVarC == null) {
            return null;
        }
        return new d(hVarC);
    }

    private final ExecutorService k() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f6872b == null) {
                this.f6872b = new com.google.firebase.analytics.c(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f6872b;
        }
        return executorService;
    }

    @h0
    public final m<String> a() {
        try {
            return p.d(k(), new com.google.firebase.analytics.b(this));
        } catch (Exception e) {
            this.f6871a.j(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return p.f(e);
        }
    }

    public final void b(@q0(max = 40, min = 1) @h0 String str, @i0 Bundle bundle) {
        this.f6871a.v(str, bundle);
    }

    public final void c() {
        this.f6871a.I();
    }

    public final void d(boolean z) {
        this.f6871a.s(Boolean.valueOf(z));
    }

    public final void e(@i0 Bundle bundle) {
        this.f6871a.S(bundle);
    }

    @Deprecated
    public final void f(long j) {
        this.f6871a.k(j);
    }

    public final void g(long j) {
        this.f6871a.J(j);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) p.b(i.l().J(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void h(@i0 String str) {
        this.f6871a.u(str);
    }

    public final void i(@q0(max = 24, min = 1) @h0 String str, @i0 @q0(max = 36) String str2) {
        this.f6871a.w(str, str2);
    }

    @Keep
    @e0
    @Deprecated
    public final void setCurrentScreen(@h0 Activity activity, @i0 @q0(max = 36, min = 1) String str, @i0 @q0(max = 36, min = 1) String str2) {
        this.f6871a.l(activity, str, str2);
    }
}
