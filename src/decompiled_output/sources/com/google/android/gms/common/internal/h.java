package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.firebase.analytics.FirebaseAnalytics;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static int f2522a = 4225;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2523b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static h f2524c;

    protected static final class a {
        private static final Uri f = new Uri.Builder().scheme(FirebaseAnalytics.b.R).authority("com.google.android.gms.chimera").build();

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.i0
        private final String f2525a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.i0
        private final String f2526b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.i0
        private final ComponentName f2527c;
        private final int d;
        private final boolean e;

        public a(ComponentName componentName, int r3) {
            this.f2525a = null;
            this.f2526b = null;
            this.f2527c = (ComponentName) r.k(componentName);
            this.d = r3;
            this.e = false;
        }

        public a(String str, int r3) {
            this(str, "com.google.android.gms", r3);
        }

        private a(String str, String str2, int r4) {
            this(str, str2, r4, false);
        }

        public a(String str, String str2, int r3, boolean z) {
            this.f2525a = r.g(str);
            this.f2526b = r.g(str2);
            this.f2527c = null;
            this.d = r3;
            this.e = z;
        }

        @androidx.annotation.i0
        private final Intent d(Context context) {
            Bundle bundleCall;
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f2525a);
            try {
                bundleCall = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(strValueOf);
                Log.w("ConnectionStatusConfig", sb.toString());
                bundleCall = null;
            }
            Intent intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                String strValueOf2 = String.valueOf(this.f2525a);
                Log.w("ConnectionStatusConfig", strValueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(strValueOf2) : new String("Dynamic lookup for intent failed for action: "));
            }
            return intent;
        }

        public final Intent a(Context context) {
            if (this.f2525a == null) {
                return new Intent().setComponent(this.f2527c);
            }
            Intent intentD = this.e ? d(context) : null;
            return intentD == null ? new Intent(this.f2525a).setPackage(this.f2526b) : intentD;
        }

        @androidx.annotation.i0
        public final String b() {
            return this.f2526b;
        }

        @androidx.annotation.i0
        public final ComponentName c() {
            return this.f2527c;
        }

        public final int e() {
            return this.d;
        }

        public final boolean equals(@androidx.annotation.i0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return q.b(this.f2525a, aVar.f2525a) && q.b(this.f2526b, aVar.f2526b) && q.b(this.f2527c, aVar.f2527c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return q.c(this.f2525a, this.f2526b, this.f2527c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
        }

        public final String toString() {
            String str = this.f2525a;
            if (str != null) {
                return str;
            }
            r.k(this.f2527c);
            return this.f2527c.flattenToString();
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int c() {
        return f2522a;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static h d(@RecentlyNonNull Context context) {
        synchronized (f2523b) {
            if (f2524c == null) {
                f2524c = new g0(context.getApplicationContext());
            }
        }
        return f2524c;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean a(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str) {
        return h(new a(componentName, c()), serviceConnection, str);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean b(@RecentlyNonNull String str, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str2) {
        return h(new a(str, c()), serviceConnection, str2);
    }

    @com.google.android.gms.common.annotation.a
    public void e(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str) {
        i(new a(componentName, c()), serviceConnection, str);
    }

    @com.google.android.gms.common.annotation.a
    public void f(@RecentlyNonNull String str, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str2) {
        i(new a(str, c()), serviceConnection, str2);
    }

    public final void g(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull int r4, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, @RecentlyNonNull boolean z) {
        i(new a(str, str2, r4, z), serviceConnection, str3);
    }

    protected abstract boolean h(a aVar, ServiceConnection serviceConnection, String str);

    protected abstract void i(a aVar, ServiceConnection serviceConnection, String str);
}
