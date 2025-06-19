package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
final class f91 implements rx1<ArrayList<Uri>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lh f3385a;

    f91(s81 s81Var, lh lhVar) {
        this.f3385a = lhVar;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        try {
            lh lhVar = this.f3385a;
            String strValueOf = String.valueOf(th.getMessage());
            lhVar.u1(strValueOf.length() != 0 ? "Internal error: ".concat(strValueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@Nonnull ArrayList<Uri> arrayList) {
        try {
            this.f3385a.Y7(arrayList);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
