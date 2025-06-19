package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.g;

/* loaded from: classes.dex */
public abstract class i<R extends g> implements h<R> {
    @Override // com.google.android.gms.common.api.h
    @com.google.android.gms.common.annotation.a
    public final void a(@RecentlyNonNull R r) {
        Status statusC = r.c();
        if (statusC.B()) {
            c(r);
            return;
        }
        b(statusC);
        if (r instanceof c) {
            try {
                ((c) r).a();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(r);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("ResultCallbacks", sb.toString(), e);
            }
        }
    }

    public abstract void b(@RecentlyNonNull Status status);

    public abstract void c(@RecentlyNonNull R r);
}
