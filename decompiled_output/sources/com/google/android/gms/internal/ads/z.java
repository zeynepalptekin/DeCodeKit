package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class z implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f6201a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f6202b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f6203c = false;

    @com.google.android.gms.common.util.d0
    private volatile boolean d = false;

    @androidx.annotation.i0
    private SharedPreferences e = null;
    private Bundle f = new Bundle();
    private JSONObject h = new JSONObject();

    private final void e() {
        if (this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) ar.b(new cv1(this) { // from class: com.google.android.gms.internal.ads.b0

                /* renamed from: a, reason: collision with root package name */
                private final z f2765a;

                {
                    this.f2765a = this;
                }

                @Override // com.google.android.gms.internal.ads.cv1
                public final Object get() {
                    return this.f2765a.f();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final void a(Context context) {
        if (this.f6203c) {
            return;
        }
        synchronized (this.f6201a) {
            if (this.f6203c) {
                return;
            }
            if (!this.d) {
                this.d = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.g = applicationContext;
            try {
                this.f = c.a.b.b.d.s.c.a(applicationContext).c(this.g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context contextI = c.a.b.b.d.i.i(context);
                if (contextI == null && context != null) {
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 != null) {
                        context = applicationContext2;
                    }
                    contextI = context;
                }
                if (contextI == null) {
                    return;
                }
                qx2.c();
                SharedPreferences sharedPreferences = contextI.getSharedPreferences("google_ads_flags", 0);
                this.e = sharedPreferences;
                if (sharedPreferences != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
                o2.a(new f0(this));
                e();
                this.f6203c = true;
            } finally {
                this.d = false;
                this.f6202b.open();
            }
        }
    }

    public final <T> T c(final s<T> sVar) {
        if (!this.f6202b.block(5000L)) {
            synchronized (this.f6201a) {
                if (!this.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f6203c || this.e == null) {
            synchronized (this.f6201a) {
                if (this.f6203c && this.e != null) {
                }
                return sVar.m();
            }
        }
        if (sVar.b() != 2) {
            return (sVar.b() == 1 && this.h.has(sVar.a())) ? sVar.l(this.h) : (T) ar.b(new cv1(this, sVar) { // from class: com.google.android.gms.internal.ads.d0

                /* renamed from: a, reason: collision with root package name */
                private final z f3051a;

                /* renamed from: b, reason: collision with root package name */
                private final s f3052b;

                {
                    this.f3051a = this;
                    this.f3052b = sVar;
                }

                @Override // com.google.android.gms.internal.ads.cv1
                public final Object get() {
                    return this.f3051a.d(this.f3052b);
                }
            });
        }
        Bundle bundle = this.f;
        return bundle == null ? sVar.m() : sVar.h(bundle);
    }

    final /* synthetic */ Object d(s sVar) {
        return sVar.g(this.e);
    }

    final /* synthetic */ String f() {
        return this.e.getString("flag_configuration", "{}");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            e();
        }
    }
}
