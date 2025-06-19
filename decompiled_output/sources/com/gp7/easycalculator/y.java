package com.gp7.easycalculator;

import android.nfc.Tag;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class y extends androidx.fragment.app.n {
    private final List<Fragment> m;
    private final List<String> n;
    private final List<Tag> o;

    y(androidx.fragment.app.i iVar) {
        super(iVar);
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
    }

    @Override // androidx.viewpager.widget.a
    public int e() {
        return this.m.size();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence g(int r2) {
        return this.n.get(r2);
    }

    @Override // androidx.fragment.app.n
    public Fragment v(int r2) {
        return this.m.get(r2);
    }

    void y(Fragment fragment, String str, Tag tag) {
        this.m.add(fragment);
        this.n.add(str);
        this.o.add(tag);
    }
}
