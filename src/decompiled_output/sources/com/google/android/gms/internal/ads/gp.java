package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* loaded from: classes.dex */
public class gp extends hp {
    @Override // com.google.android.gms.internal.ads.hp, com.google.android.gms.internal.ads.dp
    public final boolean b(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final ViewGroup.LayoutParams r() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
