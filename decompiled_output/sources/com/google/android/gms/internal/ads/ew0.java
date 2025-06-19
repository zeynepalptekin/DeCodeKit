package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ew0 implements pe2<dy1<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<i52> f3334a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3335b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<cy1> f3336c;

    private ew0(ze2<i52> ze2Var, ze2<Context> ze2Var2, ze2<cy1> ze2Var3) {
        this.f3334a = ze2Var;
        this.f3335b = ze2Var2;
        this.f3336c = ze2Var3;
    }

    public static ew0 a(ze2<i52> ze2Var, ze2<Context> ze2Var2, ze2<cy1> ze2Var3) {
        return new ew0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        final i52 i52Var = this.f3334a.get();
        final Context context = this.f3335b.get();
        return (dy1) we2.b(this.f3336c.get().submit(new Callable(i52Var, context) { // from class: com.google.android.gms.internal.ads.fw0

            /* renamed from: a, reason: collision with root package name */
            private final i52 f3466a;

            /* renamed from: b, reason: collision with root package name */
            private final Context f3467b;

            {
                this.f3466a = i52Var;
                this.f3467b = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                i52 i52Var2 = this.f3466a;
                return i52Var2.h().c(this.f3467b);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
