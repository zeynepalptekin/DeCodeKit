package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rj extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.u("this")
    private Context f5144a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.u("this")
    private WeakReference<Activity> f5145b;

    private rj(Context context) {
        super(context);
        this.f5145b = new WeakReference<>(null);
    }

    public static rj b(Context context) {
        return new rj(f(context));
    }

    public static Context c(Context context) {
        return context instanceof rj ? ((rj) context).getBaseContext() : f(context);
    }

    private final synchronized Intent d(Intent intent) {
        if (this.f5144a != null && intent.getComponent() != null && intent.getComponent().getPackageName().equals(this.f5144a.getPackageName())) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setClassName(super.getPackageName(), intent.getComponent().getClassName());
            return intent2;
        }
        return intent;
    }

    private final synchronized void e(Intent intent) {
        Activity activity = this.f5145b.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = (Intent) intent.clone();
            intent2.setFlags(intent.getFlags() & (-268435457));
            activity.startActivity(intent2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.g().e(th, "");
            intent.addFlags(268435456);
            super.startActivity(intent);
        }
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final synchronized void a(String str) throws PackageManager.NameNotFoundException {
        this.f5144a = super.createPackageContext(str, 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        if (this.f5144a != null) {
            return this.f5144a.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        if (this.f5144a != null) {
            return this.f5144a.getPackageName();
        }
        return super.getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        if (this.f5144a != null) {
            return this.f5144a.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        e(d(intent));
    }
}
