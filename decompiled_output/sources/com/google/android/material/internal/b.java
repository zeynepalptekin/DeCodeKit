package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.i0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b {
    @i0
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
