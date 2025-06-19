package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class tq1 implements tt1 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ vr1 f5436a;

    tq1(qn1 qn1Var, vr1 vr1Var) {
        this.f5436a = vr1Var;
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final boolean a(File file) {
        try {
            return this.f5436a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
