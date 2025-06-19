package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.a1;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, o, AdapterView.OnItemClickListener {
    private static final int[] f = {R.attr.background, R.attr.divider};
    private g d;
    private int e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int r5) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a1 a1VarG = a1.G(context, attributeSet, f, r5, 0);
        if (a1VarG.C(0)) {
            setBackgroundDrawable(a1VarG.h(0));
        }
        if (a1VarG.C(1)) {
            setDivider(a1VarG.h(1));
        }
        a1VarG.I();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(j jVar) {
        return this.d.O(jVar, 0);
    }

    @Override // androidx.appcompat.view.menu.o
    public void c(g gVar) {
        this.d = gVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return this.e;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int r3, long j) {
        a((j) getAdapter().getItem(r3));
    }
}
