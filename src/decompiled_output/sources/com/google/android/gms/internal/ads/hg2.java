package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class hg2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final jf2 f3669a;

    /* renamed from: b, reason: collision with root package name */
    private final fm0.a.C0175a f3670b;

    public hg2(jf2 jf2Var, fm0.a.C0175a c0175a) {
        this.f3669a = jf2Var;
        this.f3670b = c0175a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        if (this.f3669a.A() != null) {
            this.f3669a.A().get();
        }
        fm0.a aVarZ = this.f3669a.z();
        if (aVarZ == null) {
            return null;
        }
        try {
            synchronized (this.f3670b) {
                fm0.a.C0175a c0175a = this.f3670b;
                byte[] bArrF = aVarZ.f();
                c0175a.m(bArrF, 0, bArrF.length, y82.c());
            }
            return null;
        } catch (w92 unused) {
            return null;
        }
    }
}
