package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ul0 {
    public static final ul0 h = new wl0().b();

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private final m4 f5542a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final l4 f5543b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private final a5 f5544c;

    @androidx.annotation.i0
    private final z4 d;

    @androidx.annotation.i0
    private final v8 e;
    private final b.f.i<String, s4> f;
    private final b.f.i<String, r4> g;

    private ul0(wl0 wl0Var) {
        this.f5542a = wl0Var.f5847a;
        this.f5543b = wl0Var.f5848b;
        this.f5544c = wl0Var.f5849c;
        this.f = new b.f.i<>(wl0Var.f);
        this.g = new b.f.i<>(wl0Var.g);
        this.d = wl0Var.d;
        this.e = wl0Var.e;
    }

    @androidx.annotation.i0
    public final m4 a() {
        return this.f5542a;
    }

    @androidx.annotation.i0
    public final l4 b() {
        return this.f5543b;
    }

    @androidx.annotation.i0
    public final a5 c() {
        return this.f5544c;
    }

    @androidx.annotation.i0
    public final z4 d() {
        return this.d;
    }

    @androidx.annotation.i0
    public final v8 e() {
        return this.e;
    }

    public final ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f5544c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f5542a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f5543b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f.size());
        for (int r1 = 0; r1 < this.f.size(); r1++) {
            arrayList.add(this.f.i(r1));
        }
        return arrayList;
    }

    @androidx.annotation.i0
    public final s4 h(String str) {
        return this.f.get(str);
    }

    @androidx.annotation.i0
    public final r4 i(String str) {
        return this.g.get(str);
    }
}
