package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r30 implements pe2<Set<ch0<com.google.android.gms.ads.internal.overlay.p>>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<g30> f5093a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5094b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<JSONObject> f5095c;

    private r30(ze2<g30> ze2Var, ze2<Executor> ze2Var2, ze2<JSONObject> ze2Var3) {
        this.f5093a = ze2Var;
        this.f5094b = ze2Var2;
        this.f5095c = ze2Var3;
    }

    public static r30 a(ze2<g30> ze2Var, ze2<Executor> ze2Var2, ze2<JSONObject> ze2Var3) {
        return new r30(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f5095c.get() == null ? Collections.emptySet() : Collections.singleton(new ch0(this.f5093a.get(), this.f5094b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
