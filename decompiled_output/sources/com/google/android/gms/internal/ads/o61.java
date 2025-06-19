package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o61 implements pe2<m61> {

    /* renamed from: a, reason: collision with root package name */
    private final m61 f4651a;

    private o61(m61 m61Var) {
        this.f4651a = m61Var;
    }

    public static o61 a(m61 m61Var) {
        return new o61(m61Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        m61 m61Var = this.f4651a;
        if (m61Var != null) {
            return (m61) we2.b(m61Var, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
