package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: classes.dex */
public final class iy extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f3882a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3883b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3884c;

    public iy(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Context a() {
        return this.f3884c;
    }

    public final Activity b() {
        return this.f3882a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f3884c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        this.f3883b = context.getApplicationContext();
        this.f3882a = context instanceof Activity ? (Activity) context : null;
        this.f3884c = context;
        super.setBaseContext(this.f3883b);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f3882a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f3883b.startActivity(intent);
        }
    }
}
