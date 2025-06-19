package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class l implements q, n, AdapterView.OnItemClickListener {
    private Rect d;

    l() {
    }

    protected static int e(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int r12) {
        int r1 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int r2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int r5 = 0;
        int r6 = 0;
        for (int r0 = 0; r0 < count; r0++) {
            int itemViewType = listAdapter.getItemViewType(r0);
            if (itemViewType != r6) {
                view = null;
                r6 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(r0, view, viewGroup);
            view.measure(r1, r2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= r12) {
                return r12;
            }
            if (measuredWidth > r5) {
                r5 = measuredWidth;
            }
        }
        return r5;
    }

    protected static boolean n(g gVar) {
        int size = gVar.size();
        for (int r2 = 0; r2 < size; r2++) {
            MenuItem item = gVar.getItem(r2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static f o(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.n
    public int J() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public void K(@h0 Context context, @i0 g gVar) {
    }

    @Override // androidx.appcompat.view.menu.n
    public o O(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean R(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean S(g gVar, j jVar) {
        return false;
    }

    public abstract void b(g gVar);

    protected boolean c() {
        return true;
    }

    public Rect d() {
        return this.d;
    }

    public abstract void f(View view);

    public void g(Rect rect) {
        this.d = rect;
    }

    public abstract void h(boolean z);

    public abstract void i(int r1);

    public abstract void j(int r1);

    public abstract void k(PopupWindow.OnDismissListener onDismissListener);

    public abstract void l(boolean z);

    public abstract void m(int r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        o(listAdapter).d.P((MenuItem) listAdapter.getItem(r3), this, c() ? 0 : 4);
    }
}
