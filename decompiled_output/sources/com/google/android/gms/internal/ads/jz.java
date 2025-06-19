package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class jz {

    /* renamed from: a, reason: collision with root package name */
    private final as f4024a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4025b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f4026c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private as f4027a;

        /* renamed from: b, reason: collision with root package name */
        private Context f4028b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<Context> f4029c;

        public final a b(as asVar) {
            this.f4027a = asVar;
            return this;
        }

        public final a d(Context context) {
            this.f4029c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f4028b = context;
            return this;
        }
    }

    private jz(a aVar) {
        this.f4024a = aVar.f4027a;
        this.f4025b = aVar.f4028b;
        this.f4026c = aVar.f4029c;
    }

    final Context a() {
        return this.f4025b;
    }

    final WeakReference<Context> b() {
        return this.f4026c;
    }

    final as c() {
        return this.f4024a;
    }

    final String d() {
        return com.google.android.gms.ads.internal.p.c().m0(this.f4025b, this.f4024a.d);
    }

    public final i52 e() {
        return new i52(new com.google.android.gms.ads.internal.f(this.f4025b, this.f4024a));
    }
}
