package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.f0.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class tf extends eg {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f5394c;
    private final Context d;
    private String e;
    private long f;
    private long g;
    private String h;
    private String i;

    public tf(rw rwVar, Map<String, String> map) {
        super(rwVar, "createCalendarEvent");
        this.f5394c = map;
        this.d = rwVar.a();
        this.e = k("description");
        this.h = k("summary");
        this.f = l("start_ticks");
        this.g = l("end_ticks");
        this.i = k(FirebaseAnalytics.b.t);
    }

    private final String k(String str) {
        return TextUtils.isEmpty(this.f5394c.get(str)) ? "" : this.f5394c.get(str);
    }

    private final long l(String str) {
        String str2 = this.f5394c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @TargetApi(14)
    final Intent h() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void i() throws JSONException {
        if (this.d == null) {
            e("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.p.c();
        if (!to.y(this.d).e()) {
            e("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.p.c();
        AlertDialog.Builder builderX = to.x(this.d);
        Resources resourcesB = com.google.android.gms.ads.internal.p.g().b();
        builderX.setTitle(resourcesB != null ? resourcesB.getString(a.C0161a.s5) : "Create calendar event");
        builderX.setMessage(resourcesB != null ? resourcesB.getString(a.C0161a.s6) : "Allow Ad to create a calendar event?");
        builderX.setPositiveButton(resourcesB != null ? resourcesB.getString(a.C0161a.s3) : "Accept", new sf(this));
        builderX.setNegativeButton(resourcesB != null ? resourcesB.getString(a.C0161a.s4) : "Decline", new vf(this));
        builderX.create().show();
    }
}
