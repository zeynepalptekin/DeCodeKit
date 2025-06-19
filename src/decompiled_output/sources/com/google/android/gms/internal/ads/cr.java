package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private final int f3020a;

    /* renamed from: b, reason: collision with root package name */
    private final List<bv2> f3021b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3022c;
    private final InputStream d;

    public cr(int r3, List<bv2> list) {
        this(r3, list, -1, null);
    }

    public cr(int r1, List<bv2> list, int r3, InputStream inputStream) {
        this.f3020a = r1;
        this.f3021b = list;
        this.f3022c = r3;
        this.d = inputStream;
    }

    public final InputStream a() {
        return this.d;
    }

    public final int b() {
        return this.f3022c;
    }

    public final int c() {
        return this.f3020a;
    }

    public final List<bv2> d() {
        return Collections.unmodifiableList(this.f3021b);
    }
}
