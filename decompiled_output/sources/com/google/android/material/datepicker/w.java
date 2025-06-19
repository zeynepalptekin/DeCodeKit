package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class w extends LinearLayoutManager {
    private static final float O = 100.0f;

    class a extends androidx.recyclerview.widget.q {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q
        protected float w(DisplayMetrics displayMetrics) {
            return w.O / displayMetrics.densityDpi;
        }
    }

    w(Context context, int r2, boolean z) {
        super(context, r2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int r3) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(r3);
        g2(aVar);
    }
}
