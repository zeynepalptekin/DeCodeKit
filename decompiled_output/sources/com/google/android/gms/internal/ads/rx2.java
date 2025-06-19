package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
abstract class rx2<T> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private static final uy2 f5194a = e();

    rx2() {
    }

    private static uy2 e() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = ax2.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                tr.i("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return iInterfaceQueryLocalInterface instanceof uy2 ? (uy2) iInterfaceQueryLocalInterface : new wy2(iBinder);
        } catch (Exception unused) {
            tr.i("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    @androidx.annotation.i0
    private final T f() {
        uy2 uy2Var = f5194a;
        if (uy2Var == null) {
            tr.i("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return a(uy2Var);
        } catch (RemoteException e) {
            tr.d("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    @androidx.annotation.i0
    private final T g() {
        try {
            return d();
        } catch (RemoteException e) {
            tr.d("Cannot invoke remote loader.", e);
            return null;
        }
    }

    @androidx.annotation.i0
    protected abstract T a(uy2 uy2Var) throws RemoteException;

    public final T b(Context context, boolean z) {
        T tF;
        boolean z2 = z;
        if (!z2) {
            qx2.a();
            if (!jr.t(context, 12451000)) {
                tr.f("Google Play Services is not available.");
                z2 = true;
            }
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.c(context, ModuleDescriptor.MODULE_ID)) {
            z2 = true;
        }
        e0.a(context);
        if (w1.f5764a.a().booleanValue()) {
            z2 = false;
        }
        if (z2) {
            tF = f();
            if (tF == null) {
                tF = g();
            }
        } else {
            T tG = g();
            int r2 = tG == null ? 1 : 0;
            if (r2 != 0) {
                if (qx2.h().nextInt(g2.f3488a.a().intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", r2);
                    qx2.a().d(context, qx2.g().d, "gmob-apps", bundle, true);
                }
            }
            tF = tG == null ? f() : tG;
        }
        return tF == null ? c() : tF;
    }

    @androidx.annotation.h0
    protected abstract T c();

    @androidx.annotation.i0
    protected abstract T d() throws RemoteException;
}
