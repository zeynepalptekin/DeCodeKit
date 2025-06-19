package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* loaded from: classes.dex */
public class h50 {

    /* renamed from: a, reason: collision with root package name */
    private final b70 f3629a;

    /* renamed from: b, reason: collision with root package name */
    private final View f3630b;

    /* renamed from: c, reason: collision with root package name */
    private final jm1 f3631c;
    private final rw d;

    public h50(View view, @androidx.annotation.i0 rw rwVar, b70 b70Var, jm1 jm1Var) {
        this.f3630b = view;
        this.d = rwVar;
        this.f3629a = b70Var;
        this.f3631c = jm1Var;
    }

    public mc0 a(Set<ch0<nc0>> set) {
        return new mc0(set);
    }

    @androidx.annotation.i0
    public final rw b() {
        return this.d;
    }

    public final View c() {
        return this.f3630b;
    }

    public final b70 d() {
        return this.f3629a;
    }

    public final jm1 e() {
        return this.f3631c;
    }
}
