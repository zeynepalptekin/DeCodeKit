package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements androidx.appcompat.view.menu.o {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int r4) {
        super(context, attributeSet, r4);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // androidx.appcompat.view.menu.o
    public void c(androidx.appcompat.view.menu.g gVar) {
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return 0;
    }
}
