package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    private final b5 f6478a;

    public oa(b5 b5Var) {
        this.f6478a = b5Var;
    }

    private final boolean d() {
        return e() && this.f6478a.z().a() - this.f6478a.t().B.a() > this.f6478a.b().m(null, u.G0);
    }

    private final boolean e() {
        return this.f6478a.t().B.a() > 0;
    }

    @androidx.annotation.y0
    final void a() {
        this.f6478a.x().c();
        if (e()) {
            if (d()) {
                this.f6478a.t().A.b(null);
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.b.O, "(not set)");
                bundle.putString(FirebaseAnalytics.b.P, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f6478a.E().Z("auto", "_cmpx", bundle);
            } else {
                String strA = this.f6478a.t().A.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f6478a.B().G().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f6478a.t().B.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    this.f6478a.E().Z((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f6478a.t().A.b(null);
            }
            this.f6478a.t().B.b(0L);
        }
    }

    @androidx.annotation.y0
    final void b(String str, Bundle bundle) {
        String string;
        this.f6478a.x().c();
        if (this.f6478a.l()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f6478a.t().A.b(string);
        this.f6478a.t().B.b(this.f6478a.z().a());
    }

    final void c() {
        if (e() && d()) {
            this.f6478a.t().A.b(null);
        }
    }
}
