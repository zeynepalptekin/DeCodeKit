package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public final class rc extends tc {
    private static final ef f = new ef();
    private Map<Class<? extends com.google.android.gms.ads.mediation.b0>, com.google.android.gms.ads.mediation.b0> e;

    private final vc A8(String str) throws RemoteException {
        try {
            tr.f("Reflection failed, retrying using direct instantiation");
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            tr.d(sb.toString(), th);
        }
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new md(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new md(new AdUrlAdapter());
        }
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            return new md(new CustomEventAdapter());
        }
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
            return new vd(customEventAdapter, (com.google.android.gms.ads.mediation.customevent.c) this.e.get(customEventAdapter.getAdditionalParametersType()));
        }
        throw new RemoteException();
    }

    private final <NetworkExtrasT extends com.google.ads.mediation.g, ServerParametersT extends com.google.ads.mediation.f> vc z8(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, rc.class.getClassLoader());
            if (com.google.ads.mediation.c.class.isAssignableFrom(cls)) {
                com.google.ads.mediation.c cVar = (com.google.ads.mediation.c) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new vd(cVar, (com.google.ads.mediation.g) this.e.get(cVar.getAdditionalParametersType()));
            }
            if (com.google.android.gms.ads.mediation.g.class.isAssignableFrom(cls)) {
                return new md((com.google.android.gms.ads.mediation.g) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (com.google.android.gms.ads.mediation.a.class.isAssignableFrom(cls)) {
                return new md((com.google.android.gms.ads.mediation.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(" (not a valid adapter).");
            tr.i(sb.toString());
            throw new RemoteException();
        } catch (Throwable unused) {
            return A8(str);
        }
    }

    public final void B8(Map<Class<? extends com.google.android.gms.ads.mediation.b0>, com.google.android.gms.ads.mediation.b0> map) {
        this.e = map;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final boolean F4(String str) throws RemoteException {
        try {
            return com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(str, false, rc.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            tr.i(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final ye H5(String str) throws RemoteException {
        return ef.a(str);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final vc O2(String str) throws RemoteException {
        return z8(str);
    }
}
