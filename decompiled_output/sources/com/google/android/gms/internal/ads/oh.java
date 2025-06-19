package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
public final class oh {

    /* renamed from: a, reason: collision with root package name */
    @Nonnull
    private final View f4692a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final Map<String, WeakReference<View>> f4693b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private final jn f4694c;

    public oh(uh uhVar) {
        Map<String, WeakReference<View>> map;
        this.f4692a = uhVar.f5519a;
        this.f4693b = uhVar.f5520b;
        jn jnVarB = mh.b(uhVar.f5519a.getContext());
        this.f4694c = jnVarB;
        if (jnVarB == null || (map = this.f4693b) == null || map.isEmpty()) {
            return;
        }
        try {
            this.f4694c.L2(new th(c.a.b.b.e.e.i2(this.f4692a).asBinder(), c.a.b.b.e.e.i2(this.f4693b).asBinder()));
        } catch (RemoteException unused) {
            tr.g("Failed to call remote method.");
        }
    }

    public final void a(MotionEvent motionEvent) {
        jn jnVar = this.f4694c;
        if (jnVar == null) {
            tr.f("Failed to get internal reporting info generator.");
            return;
        }
        try {
            jnVar.c7(c.a.b.b.e.e.i2(motionEvent));
        } catch (RemoteException unused) {
            tr.g("Failed to call remote method.");
        }
    }

    public final void b(Uri uri, com.google.android.gms.ads.j0.e eVar) {
        if (this.f4694c == null) {
            eVar.a("Failed to get internal reporting info generator.");
        }
        try {
            this.f4694c.a2(new ArrayList(Arrays.asList(uri)), c.a.b.b.e.e.i2(this.f4692a), new qh(this, eVar));
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(strValueOf);
            eVar.a(sb.toString());
        }
    }

    public final void c(List<Uri> list, com.google.android.gms.ads.j0.f fVar) {
        if (this.f4694c == null) {
            fVar.a("Failed to get internal reporting info generator.");
        }
        try {
            this.f4694c.g7(list, c.a.b.b.e.e.i2(this.f4692a), new rh(this, fVar));
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(strValueOf);
            fVar.a(sb.toString());
        }
    }
}
