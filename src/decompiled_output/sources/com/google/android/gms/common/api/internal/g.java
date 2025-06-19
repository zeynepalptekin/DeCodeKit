package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g extends Fragment implements d {
    private static WeakHashMap<Activity, WeakReference<g>> g = new WeakHashMap<>();
    private Map<String, LifecycleCallback> d = Collections.synchronizedMap(new b.f.a());
    private int e = 0;

    @i0
    private Bundle f;

    public static g d(Activity activity) {
        g gVar;
        WeakReference<g> weakReference = g.get(activity);
        if (weakReference != null && (gVar = weakReference.get()) != null) {
            return gVar;
        }
        try {
            g gVar2 = (g) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (gVar2 == null || gVar2.isRemoving()) {
                gVar2 = new g();
                activity.getFragmentManager().beginTransaction().add(gVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            g.put(activity, new WeakReference<>(gVar2));
            return gVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean a() {
        return this.e > 0;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void c(String str, @h0 LifecycleCallback lifecycleCallback) {
        if (this.d.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.d.put(str, lifecycleCallback);
        if (this.e > 0) {
            new c.a.b.b.g.b.i(Looper.getMainLooper()).post(new f(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, @i0 FileDescriptor fileDescriptor, PrintWriter printWriter, @i0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final boolean f() {
        return this.e >= 2;
    }

    @Override // com.google.android.gms.common.api.internal.d
    @i0
    public final <T extends LifecycleCallback> T g(String str, Class<T> cls) {
        return cls.cast(this.d.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final Activity h() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r3, int r4, @i0 Intent intent) {
        super.onActivityResult(r3, r4, intent);
        Iterator<LifecycleCallback> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().f(r3, r4, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@i0 Bundle bundle) {
        super.onCreate(bundle);
        this.e = 1;
        this.f = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.d.entrySet()) {
            entry.getValue().g(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.e = 5;
        Iterator<LifecycleCallback> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.e = 3;
        Iterator<LifecycleCallback> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.d.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().j(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.e = 2;
        Iterator<LifecycleCallback> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.e = 4;
        Iterator<LifecycleCallback> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().l();
        }
    }
}
