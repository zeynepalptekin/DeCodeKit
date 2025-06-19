package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends BaseAdapter {
    g d;
    private int e = -1;
    private boolean f;
    private final boolean g;
    private final LayoutInflater h;
    private final int i;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int r5) {
        this.g = z;
        this.h = layoutInflater;
        this.d = gVar;
        this.i = r5;
        a();
    }

    void a() {
        j jVarY = this.d.y();
        if (jVarY != null) {
            ArrayList<j> arrayListC = this.d.C();
            int size = arrayListC.size();
            for (int r3 = 0; r3 < size; r3++) {
                if (arrayListC.get(r3) == jVarY) {
                    this.e = r3;
                    return;
                }
            }
        }
        this.e = -1;
    }

    public g b() {
        return this.d;
    }

    public boolean c() {
        return this.f;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j getItem(int r3) {
        ArrayList<j> arrayListC = this.g ? this.d.C() : this.d.H();
        int r1 = this.e;
        if (r1 >= 0 && r3 >= r1) {
            r3++;
        }
        return arrayListC.get(r3);
    }

    public void e(boolean z) {
        this.f = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> arrayListC = this.g ? this.d.C() : this.d.H();
        int r1 = this.e;
        int size = arrayListC.size();
        return r1 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public View getView(int r6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.h.inflate(this.i, viewGroup, false);
        }
        int groupId = getItem(r6).getGroupId();
        int r1 = r6 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.d.I() && groupId != (r1 >= 0 ? getItem(r1).getGroupId() : groupId));
        o.a aVar = (o.a) view;
        if (this.f) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.g(getItem(r6), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
