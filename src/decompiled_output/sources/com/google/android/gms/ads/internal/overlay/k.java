package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.rw;

@d0
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f2413a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f2414b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2415c;
    public final Context d;

    public k(rw rwVar) throws i {
        this.f2414b = rwVar.getLayoutParams();
        ViewParent parent = rwVar.getParent();
        this.d = rwVar.f0();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new i("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f2415c = viewGroup;
        this.f2413a = viewGroup.indexOfChild(rwVar.getView());
        this.f2415c.removeView(rwVar.getView());
        rwVar.y0(true);
    }
}
