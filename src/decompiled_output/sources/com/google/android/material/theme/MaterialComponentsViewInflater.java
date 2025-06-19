package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.app.k;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.t;
import c.a.b.c.g.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.g;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends k {
    @Override // androidx.appcompat.app.k
    @h0
    protected e b(@h0 Context context, @i0 AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @h0
    protected androidx.appcompat.widget.g c(@h0 Context context, @h0 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @h0
    protected h d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @h0
    protected t j(Context context, AttributeSet attributeSet) {
        return new c.a.b.c.q.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.k
    @h0
    protected a0 n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
