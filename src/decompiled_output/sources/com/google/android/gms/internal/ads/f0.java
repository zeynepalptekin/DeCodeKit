package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class f0 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ z f3342a;

    f0(z zVar) {
        this.f3342a = zVar;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final Long a(String str, long j) {
        try {
            return Long.valueOf(this.f3342a.e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f3342a.e.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final String b(String str, String str2) {
        return this.f3342a.e.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final Boolean c(String str, boolean z) {
        return Boolean.valueOf(this.f3342a.e.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final Double d(String str, double d) {
        return Double.valueOf(this.f3342a.e.getFloat(str, (float) d));
    }
}
