package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class wf2 extends ah2 {
    private final Activity i;
    private final View j;

    public wf2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13, View view, Activity activity) {
        super(jf2Var, str, str2, c0175a, r12, 62);
        this.j = view;
        this.i = activity;
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.j == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) qx2.e().c(e0.E1)).booleanValue();
        Object[] objArr = (Object[]) this.f.invoke(null, this.j, this.i, Boolean.valueOf(zBooleanValue));
        synchronized (this.e) {
            this.e.S(((Long) objArr[0]).longValue());
            this.e.T(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.e.G((String) objArr[2]);
            }
        }
    }
}
