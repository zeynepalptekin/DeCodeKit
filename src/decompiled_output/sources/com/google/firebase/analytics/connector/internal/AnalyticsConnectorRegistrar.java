package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.j;
import com.google.firebase.components.p;
import java.util.Arrays;
import java.util.List;

@Keep
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements j {
    @Override // com.google.firebase.components.j
    @Keep
    @SuppressLint({"MissingPermission"})
    @com.google.android.gms.common.annotation.a
    public List<com.google.firebase.components.f<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.f.a(com.google.firebase.analytics.a.a.class).b(p.g(c.a.d.e.class)).b(p.g(Context.class)).b(p.g(c.a.d.o.d.class)).f(c.f6894a).e().d(), c.a.d.w.g.a("fire-analytics", "17.6.0"));
    }
}
