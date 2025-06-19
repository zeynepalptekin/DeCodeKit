package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b41<AdT> implements u01<AdT> {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        return !TextUtils.isEmpty(km1Var.u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<AdT> b(wm1 wm1Var, km1 km1Var) {
        String strOptString = km1Var.u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        an1 an1Var = wm1Var.f5857a.f5710a;
        cn1 cn1VarZ = new cn1().o(an1Var).z(strOptString);
        Bundle bundleD = d(an1Var.d.p);
        Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        String strOptString2 = km1Var.u.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = km1Var.u.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = km1Var.C.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = km1Var.C.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        jw2 jw2Var = an1Var.d;
        an1 an1VarE = cn1VarZ.B(new jw2(jw2Var.d, jw2Var.e, bundleD2, jw2Var.g, jw2Var.h, jw2Var.i, jw2Var.j, jw2Var.k, jw2Var.l, jw2Var.m, jw2Var.n, jw2Var.o, bundleD, jw2Var.q, jw2Var.r, jw2Var.s, jw2Var.t, jw2Var.u, jw2Var.v, jw2Var.w, jw2Var.x, jw2Var.y)).e();
        Bundle bundle = new Bundle();
        lm1 lm1Var = wm1Var.f5858b.f5551b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(lm1Var.f4274a));
        bundle2.putInt("refresh_interval", lm1Var.f4276c);
        bundle2.putString("gws_query_id", lm1Var.f4275b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = wm1Var.f5857a.f5710a.f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", km1Var.v);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(km1Var.f4113c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(km1Var.d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(km1Var.o));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(km1Var.m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(km1Var.g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(km1Var.h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(km1Var.i));
        bundle3.putString(FirebaseAnalytics.b.H, km1Var.j);
        bundle3.putString("valid_from_timestamp", km1Var.k);
        bundle3.putBoolean("is_closable_area_disabled", km1Var.K);
        if (km1Var.l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", km1Var.l.e);
            bundle4.putString("rb_type", km1Var.l.d);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(an1VarE, bundle);
    }

    protected abstract dy1<AdT> c(an1 an1Var, Bundle bundle);
}
