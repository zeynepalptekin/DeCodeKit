package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
final class e91 implements rx1<Uri> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lh f3238a;

    e91(s81 s81Var, lh lhVar) {
        this.f3238a = lhVar;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        try {
            lh lhVar = this.f3238a;
            String strValueOf = String.valueOf(th.getMessage());
            lhVar.u1(strValueOf.length() != 0 ? "Internal error: ".concat(strValueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@Nonnull Uri uri) {
        try {
            this.f3238a.Y7(Collections.singletonList(uri));
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
