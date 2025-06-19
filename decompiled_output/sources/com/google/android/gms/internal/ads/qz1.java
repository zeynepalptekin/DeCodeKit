package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qz1<P> {

    /* renamed from: a, reason: collision with root package name */
    private final P f5077a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f5078b;

    /* renamed from: c, reason: collision with root package name */
    private final k42 f5079c;
    private final d52 d;
    private final int e;

    qz1(P p, byte[] bArr, k42 k42Var, d52 d52Var, int r5) {
        this.f5077a = p;
        this.f5078b = Arrays.copyOf(bArr, bArr.length);
        this.f5079c = k42Var;
        this.d = d52Var;
        this.e = r5;
    }

    public final P a() {
        return this.f5077a;
    }

    public final k42 b() {
        return this.f5079c;
    }

    public final d52 c() {
        return this.d;
    }

    public final byte[] d() {
        byte[] bArr = this.f5078b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
