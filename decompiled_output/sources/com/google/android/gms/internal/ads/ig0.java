package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ig0 implements pe2<qf0> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f3820a;

    private ig0(qf0 qf0Var) {
        this.f3820a = qf0Var;
    }

    public static ig0 a(qf0 qf0Var) {
        return new ig0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        qf0 qf0Var = this.f3820a;
        if (qf0Var != null) {
            return (qf0) we2.b(qf0Var, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
