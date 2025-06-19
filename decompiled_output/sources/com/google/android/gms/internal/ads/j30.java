package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j30 implements pe2<Set<ch0<tb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<g30> f3908a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3909b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<JSONObject> f3910c;

    private j30(ze2<g30> ze2Var, ze2<Executor> ze2Var2, ze2<JSONObject> ze2Var3) {
        this.f3908a = ze2Var;
        this.f3909b = ze2Var2;
        this.f3910c = ze2Var3;
    }

    public static j30 a(ze2<g30> ze2Var, ze2<Executor> ze2Var2, ze2<JSONObject> ze2Var3) {
        return new j30(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f3910c.get() == null ? Collections.emptySet() : Collections.singleton(new ch0(this.f3908a.get(), this.f3909b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
