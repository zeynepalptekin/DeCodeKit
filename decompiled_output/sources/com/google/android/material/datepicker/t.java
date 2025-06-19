package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
abstract class t<S> extends Fragment {
    protected final LinkedHashSet<s<S>> g0 = new LinkedHashSet<>();

    t() {
    }

    boolean o2(s<S> sVar) {
        return this.g0.add(sVar);
    }

    void p2() {
        this.g0.clear();
    }

    abstract f<S> q2();

    boolean r2(s<S> sVar) {
        return this.g0.remove(sVar);
    }
}
