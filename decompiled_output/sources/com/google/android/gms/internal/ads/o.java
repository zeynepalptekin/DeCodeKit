package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4620a;

    public o(Context context) {
        com.google.android.gms.common.internal.r.l(context, "Context can not be null");
        this.f4620a = context;
    }

    private final boolean a(Intent intent) {
        com.google.android.gms.common.internal.r.l(intent, "Intent can not be null");
        return !this.f4620a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(intent);
    }

    public final boolean c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(intent);
    }

    public final boolean d() {
        return ((Boolean) ar.a(this.f4620a, new n())).booleanValue() && c.a.b.b.d.s.c.a(this.f4620a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean e() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
