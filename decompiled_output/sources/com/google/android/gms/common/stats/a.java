package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d0;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2559b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile a f2560c = null;

    @d0
    private static boolean d = false;

    /* renamed from: a, reason: collision with root package name */
    @d0
    private ConcurrentHashMap<ServiceConnection, ServiceConnection> f2561a = new ConcurrentHashMap<>();

    private a() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a b() {
        if (f2560c == null) {
            synchronized (f2559b) {
                if (f2560c == null) {
                    f2560c = new a();
                }
            }
        }
        return (a) r.k(f2560c);
    }

    @SuppressLint({"UntrackedBindService"})
    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int r7, boolean z) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : com.google.android.gms.common.util.e.c(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (!g(serviceConnection)) {
            return context.bindService(intent, serviceConnection, r7);
        }
        ServiceConnection serviceConnectionPutIfAbsent = this.f2561a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnectionPutIfAbsent != null && serviceConnection != serviceConnectionPutIfAbsent) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, r7);
            return !zBindService ? zBindService : zBindService;
        } finally {
            this.f2561a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof k0);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull int r11) {
        return e(context, context.getClass().getName(), intent, serviceConnection, r11);
    }

    @SuppressLint({"UntrackedBindService"})
    @com.google.android.gms.common.annotation.a
    public void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f2561a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService(this.f2561a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException unused2) {
                }
            } finally {
                this.f2561a.remove(serviceConnection);
            }
        }
    }

    @SuppressLint({"UntrackedBindService"})
    @com.google.android.gms.common.annotation.a
    public void d(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        try {
            c(context, serviceConnection);
        } catch (IllegalArgumentException e) {
            Log.w("ConnectionTracker", "Exception thrown while unbinding", e);
        }
    }

    @RecentlyNonNull
    public final boolean e(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull int r12) {
        return f(context, str, intent, serviceConnection, r12, true);
    }
}
