package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3934a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f3935b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lockClient")
    private pb f3936c;

    @GuardedBy("lockService")
    private pb d;

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final pb a(Context context, as asVar) {
        pb pbVar;
        synchronized (this.f3935b) {
            if (this.d == null) {
                this.d = new pb(c(context), asVar, j2.f3903b.a());
            }
            pbVar = this.d;
        }
        return pbVar;
    }

    public final pb b(Context context, as asVar) {
        pb pbVar;
        synchronized (this.f3934a) {
            if (this.f3936c == null) {
                this.f3936c = new pb(c(context), asVar, (String) qx2.e().c(e0.f3190a));
            }
            pbVar = this.f3936c;
        }
        return pbVar;
    }
}
