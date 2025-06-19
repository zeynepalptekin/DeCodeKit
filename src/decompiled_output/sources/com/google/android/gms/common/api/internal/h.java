package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h extends Fragment implements d {
    private static WeakHashMap<androidx.fragment.app.d, WeakReference<h>> j0 = new WeakHashMap<>();
    private Map<String, LifecycleCallback> g0 = Collections.synchronizedMap(new b.f.a());
    private int h0 = 0;

    @i0
    private Bundle i0;

    public static h p2(androidx.fragment.app.d dVar) {
        h hVar;
        WeakReference<h> weakReference = j0.get(dVar);
        if (weakReference != null && (hVar = weakReference.get()) != null) {
            return hVar;
        }
        try {
            h hVar2 = (h) dVar.t().g("SupportLifecycleFragmentImpl");
            if (hVar2 == null || hVar2.n0()) {
                hVar2 = new h();
                dVar.t().b().i(hVar2, "SupportLifecycleFragmentImpl").o();
            }
            j0.put(dVar, new WeakReference<>(hVar2));
            return hVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void D0() {
        super.D0();
        this.h0 = 5;
        Iterator<LifecycleCallback> it = this.g0.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void T0() {
        super.T0();
        this.h0 = 3;
        Iterator<LifecycleCallback> it = this.g0.values().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void U0(Bundle bundle) {
        super.U0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.g0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().j(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void V0() {
        super.V0();
        this.h0 = 2;
        Iterator<LifecycleCallback> it = this.g0.values().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W0() {
        super.W0();
        this.h0 = 4;
        Iterator<LifecycleCallback> it = this.g0.values().iterator();
        while (it.hasNext()) {
            it.next().l();
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean a() {
        return this.h0 > 0;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void c(String str, @h0 LifecycleCallback lifecycleCallback) {
        if (this.g0.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.g0.put(str, lifecycleCallback);
        if (this.h0 > 0) {
            new c.a.b.b.g.b.i(Looper.getMainLooper()).post(new i(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean f() {
        return this.h0 >= 2;
    }

    @Override // com.google.android.gms.common.api.internal.d
    @i0
    public final <T extends LifecycleCallback> T g(String str, Class<T> cls) {
        return cls.cast(this.g0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* synthetic */ Activity h() {
        return n();
    }

    @Override // androidx.fragment.app.Fragment
    public final void k(String str, @i0 FileDescriptor fileDescriptor, PrintWriter printWriter, @i0 String[] strArr) {
        super.k(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.g0.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void t0(int r3, int r4, @i0 Intent intent) {
        super.t0(r3, r4, intent);
        Iterator<LifecycleCallback> it = this.g0.values().iterator();
        while (it.hasNext()) {
            it.next().f(r3, r4, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y0(@i0 Bundle bundle) {
        super.y0(bundle);
        this.h0 = 1;
        this.i0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.g0.entrySet()) {
            entry.getValue().g(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }
}
