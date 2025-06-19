package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xq2 implements oc {

    /* renamed from: a, reason: collision with root package name */
    private int f6024a;

    /* renamed from: b, reason: collision with root package name */
    private int f6025b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6026c;
    private final float d;

    public xq2() {
        this(2500, 1, 1.0f);
    }

    private xq2(int r1, int r2, float f) {
        this.f6024a = 2500;
        this.f6026c = 1;
        this.d = 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.oc
    public final void a(pd pdVar) throws pd {
        int r0 = this.f6025b + 1;
        this.f6025b = r0;
        int r2 = this.f6024a;
        this.f6024a = r2 + ((int) (r2 * this.d));
        if (!(r0 <= this.f6026c)) {
            throw pdVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.oc
    public final int b() {
        return this.f6024a;
    }

    @Override // com.google.android.gms.internal.ads.oc
    public final int c() {
        return this.f6025b;
    }
}
