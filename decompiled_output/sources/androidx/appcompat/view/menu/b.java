package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class b implements n {
    protected Context d;
    protected Context e;
    protected g f;
    protected LayoutInflater g;
    protected LayoutInflater h;
    private n.a i;
    private int j;
    private int k;
    protected o l;
    private int m;

    public b(Context context, int r2, int r3) {
        this.d = context;
        this.g = LayoutInflater.from(context);
        this.j = r2;
        this.k = r3;
    }

    @Override // androidx.appcompat.view.menu.n
    public int J() {
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.n
    public void K(Context context, g gVar) {
        this.e = context;
        this.h = LayoutInflater.from(context);
        this.f = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.n
    public boolean M(s sVar) {
        n.a aVar = this.i;
        s sVar2 = sVar;
        if (aVar == null) {
            return false;
        }
        if (sVar == null) {
            sVar2 = this.f;
        }
        return aVar.b(sVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.n
    public void N(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.l;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f;
        int r1 = 0;
        if (gVar != null) {
            gVar.u();
            ArrayList<j> arrayListH = this.f.H();
            int size = arrayListH.size();
            int r4 = 0;
            for (int r3 = 0; r3 < size; r3++) {
                j jVar = arrayListH.get(r3);
                if (j(r4, jVar)) {
                    View childAt = viewGroup.getChildAt(r4);
                    j itemData = childAt instanceof o.a ? ((o.a) childAt).getItemData() : null;
                    View viewH = h(jVar, childAt, viewGroup);
                    if (jVar != itemData) {
                        viewH.setPressed(false);
                        viewH.jumpDrawablesToCurrentState();
                    }
                    if (viewH != childAt) {
                        c(viewH, r4);
                    }
                    r4++;
                }
            }
            r1 = r4;
        }
        while (r1 < viewGroup.getChildCount()) {
            if (!f(viewGroup, r1)) {
                r1++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public o O(ViewGroup viewGroup) {
        if (this.l == null) {
            o oVar = (o) this.g.inflate(this.j, viewGroup, false);
            this.l = oVar;
            oVar.c(this.f);
            N(true);
        }
        return this.l;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean P() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean R(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean S(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void T(n.a aVar) {
        this.i = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        n.a aVar = this.i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    protected void c(View view, int r3) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.l).addView(view, r3);
    }

    public abstract void d(j jVar, o.a aVar);

    public o.a e(ViewGroup viewGroup) {
        return (o.a) this.g.inflate(this.k, viewGroup, false);
    }

    protected boolean f(ViewGroup viewGroup, int r2) {
        viewGroup.removeViewAt(r2);
        return true;
    }

    public n.a g() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View h(j jVar, View view, ViewGroup viewGroup) {
        o.a aVarE = view instanceof o.a ? (o.a) view : e(viewGroup);
        d(jVar, aVarE);
        return (View) aVarE;
    }

    public void i(int r1) {
        this.m = r1;
    }

    public boolean j(int r1, j jVar) {
        return true;
    }
}
