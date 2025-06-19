package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public class j extends androidx.fragment.app.c {
    @Override // androidx.fragment.app.c
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void A2(@h0 Dialog dialog, int r5) {
        if (!(dialog instanceof i)) {
            super.A2(dialog, r5);
            return;
        }
        i iVar = (i) dialog;
        if (r5 != 1 && r5 != 2) {
            if (r5 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        iVar.e(1);
    }

    @Override // androidx.fragment.app.c
    @h0
    public Dialog v2(@i0 Bundle bundle) {
        return new i(u(), t2());
    }
}
