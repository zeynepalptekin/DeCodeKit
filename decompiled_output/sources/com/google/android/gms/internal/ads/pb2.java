package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
final class pb2 implements va2 {

    /* renamed from: a, reason: collision with root package name */
    private final xa2 f4795a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4796b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f4797c;
    private final int d;

    pb2(xa2 xa2Var, String str, Object[] objArr) {
        this.f4795a = xa2Var;
        this.f4796b = str;
        this.f4797c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int r4 = cCharAt & 8191;
        int r0 = 13;
        int r1 = 1;
        while (true) {
            int r2 = r1 + 1;
            char cCharAt2 = str.charAt(r1);
            if (cCharAt2 < 55296) {
                this.d = r4 | (cCharAt2 << r0);
                return;
            } else {
                r4 |= (cCharAt2 & 8191) << r0;
                r0 += 13;
                r1 = r2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.va2
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.va2
    public final xa2 b() {
        return this.f4795a;
    }

    @Override // com.google.android.gms.internal.ads.va2
    public final int c() {
        return (this.d & 1) == 1 ? l92.e.i : l92.e.j;
    }

    final String d() {
        return this.f4796b;
    }

    final Object[] e() {
        return this.f4797c;
    }
}
