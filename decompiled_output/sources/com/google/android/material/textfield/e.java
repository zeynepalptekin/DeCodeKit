package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.h0;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f6838a;

    /* renamed from: b, reason: collision with root package name */
    Context f6839b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f6840c;

    e(@h0 TextInputLayout textInputLayout) {
        this.f6838a = textInputLayout;
        this.f6839b = textInputLayout.getContext();
        this.f6840c = textInputLayout.getEndIconView();
    }

    abstract void a();

    boolean b(int r1) {
        return true;
    }

    void c(boolean z) {
    }

    boolean d() {
        return false;
    }
}
