package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hw0 implements pe2<dy1<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f3725a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3726b;

    private hw0(ze2<cr1> ze2Var, ze2<Context> ze2Var2) {
        this.f3725a = ze2Var;
        this.f3726b = ze2Var2;
    }

    public static hw0 a(ze2<cr1> ze2Var, ze2<Context> ze2Var2) {
        return new hw0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        cr1 cr1Var = this.f3725a.get();
        final CookieManager cookieManagerN = com.google.android.gms.ads.internal.p.e().n(this.f3726b.get());
        return (dy1) we2.b(cr1Var.g(zq1.WEBVIEW_COOKIE).c(new Callable(cookieManagerN) { // from class: com.google.android.gms.internal.ads.dw0

            /* renamed from: a, reason: collision with root package name */
            private final CookieManager f3184a;

            {
                this.f3184a = cookieManagerN;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.f3184a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) qx2.e().c(e0.q0));
            }
        }).a(1L, TimeUnit.SECONDS).d(Exception.class, cw0.f3040a).f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
