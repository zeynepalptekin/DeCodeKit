package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p30 implements pe2<Set<ch0<sb0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<g30> f4776a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f4777b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<JSONObject> f4778c;

    private p30(ze2<g30> ze2Var, ze2<Executor> ze2Var2, ze2<JSONObject> ze2Var3) {
        this.f4776a = ze2Var;
        this.f4777b = ze2Var2;
        this.f4778c = ze2Var3;
    }

    public static p30 a(ze2<g30> ze2Var, ze2<Executor> ze2Var2, ze2<JSONObject> ze2Var3) {
        return new p30(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f4778c.get() == null ? Collections.emptySet() : Collections.singleton(new ch0(this.f4776a.get(), this.f4777b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
