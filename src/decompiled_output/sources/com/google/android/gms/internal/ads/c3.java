package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.d0.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c3 extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final b3 f2914a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c.b> f2915b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f2916c;

    public c3(b3 b3Var) {
        k3 m3Var;
        IBinder iBinder;
        this.f2914a = b3Var;
        try {
            this.f2916c = b3Var.X2();
        } catch (RemoteException e) {
            tr.c("", e);
            this.f2916c = "";
        }
        try {
            for (k3 k3Var : b3Var.u5()) {
                if (!(k3Var instanceof IBinder) || (iBinder = (IBinder) k3Var) == null) {
                    m3Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    m3Var = iInterfaceQueryLocalInterface instanceof k3 ? (k3) iInterfaceQueryLocalInterface : new m3(iBinder);
                }
                if (m3Var != null) {
                    this.f2915b.add(new l3(m3Var));
                }
            }
        } catch (RemoteException e2) {
            tr.c("", e2);
        }
    }

    @Override // com.google.android.gms.ads.d0.c.a
    public final List<c.b> a() {
        return this.f2915b;
    }

    @Override // com.google.android.gms.ads.d0.c.a
    public final CharSequence b() {
        return this.f2916c;
    }
}
