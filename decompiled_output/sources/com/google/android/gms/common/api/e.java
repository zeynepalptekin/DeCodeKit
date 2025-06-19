package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public abstract class e<R extends g> extends i<R> {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2499a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2500b;

    protected e(@RecentlyNonNull Activity activity, @RecentlyNonNull int r3) {
        this.f2499a = (Activity) r.l(activity, "Activity must not be null");
        this.f2500b = r3;
    }

    @Override // com.google.android.gms.common.api.i
    @com.google.android.gms.common.annotation.a
    public final void b(@RecentlyNonNull Status status) {
        if (!status.t()) {
            d(status);
            return;
        }
        try {
            status.C(this.f2499a, this.f2500b);
        } catch (IntentSender.SendIntentException e) {
            Log.e("ResolvingResultCallback", "Failed to start resolution", e);
            d(new Status(8));
        }
    }

    @Override // com.google.android.gms.common.api.i
    public abstract void c(@RecentlyNonNull R r);

    public abstract void d(@RecentlyNonNull Status status);
}
