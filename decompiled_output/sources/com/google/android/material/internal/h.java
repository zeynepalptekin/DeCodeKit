package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.h0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class h extends androidx.appcompat.view.menu.g {
    public h(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @h0
    public SubMenu addSubMenu(int r1, int r2, int r3, CharSequence charSequence) {
        androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) a(r1, r2, r3, charSequence);
        j jVar2 = new j(x(), this, jVar);
        jVar.A(jVar2);
        return jVar2;
    }
}
