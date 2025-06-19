package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.i0;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class y extends b.i.p.a {
    final RecyclerView d;
    private final a e;

    public static class a extends b.i.p.a {
        final y d;
        private Map<View, b.i.p.a> e = new WeakHashMap();

        public a(@androidx.annotation.h0 y yVar) {
            this.d = yVar;
        }

        @Override // b.i.p.a
        public boolean a(@androidx.annotation.h0 View view, @androidx.annotation.h0 AccessibilityEvent accessibilityEvent) {
            b.i.p.a aVar = this.e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // b.i.p.a
        @i0
        public b.i.p.p0.e b(@androidx.annotation.h0 View view) {
            b.i.p.a aVar = this.e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // b.i.p.a
        public void f(@androidx.annotation.h0 View view, @androidx.annotation.h0 AccessibilityEvent accessibilityEvent) {
            b.i.p.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // b.i.p.a
        public void g(View view, b.i.p.p0.d dVar) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().f1(view, dVar);
                b.i.p.a aVar = this.e.get(view);
                if (aVar != null) {
                    aVar.g(view, dVar);
                    return;
                }
            }
            super.g(view, dVar);
        }

        @Override // b.i.p.a
        public void h(@androidx.annotation.h0 View view, @androidx.annotation.h0 AccessibilityEvent accessibilityEvent) {
            b.i.p.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // b.i.p.a
        public boolean i(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.h0 View view, @androidx.annotation.h0 AccessibilityEvent accessibilityEvent) {
            b.i.p.a aVar = this.e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // b.i.p.a
        public boolean j(View view, int r4, Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, r4, bundle);
            }
            b.i.p.a aVar = this.e.get(view);
            if (aVar != null) {
                if (aVar.j(view, r4, bundle)) {
                    return true;
                }
            } else if (super.j(view, r4, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().z1(view, r4, bundle);
        }

        @Override // b.i.p.a
        public void l(@androidx.annotation.h0 View view, int r3) {
            b.i.p.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.l(view, r3);
            } else {
                super.l(view, r3);
            }
        }

        @Override // b.i.p.a
        public void m(@androidx.annotation.h0 View view, @androidx.annotation.h0 AccessibilityEvent accessibilityEvent) {
            b.i.p.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        b.i.p.a n(View view) {
            return this.e.remove(view);
        }

        void o(View view) {
            b.i.p.a aVarC = b.i.p.f0.C(view);
            if (aVarC == null || aVarC == this) {
                return;
            }
            this.e.put(view, aVarC);
        }
    }

    public y(@androidx.annotation.h0 RecyclerView recyclerView) {
        this.d = recyclerView;
        b.i.p.a aVarN = n();
        this.e = (aVarN == null || !(aVarN instanceof a)) ? new a(this) : (a) aVarN;
    }

    @Override // b.i.p.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().b1(accessibilityEvent);
        }
    }

    @Override // b.i.p.a
    public void g(View view, b.i.p.p0.d dVar) {
        super.g(view, dVar);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().d1(dVar);
    }

    @Override // b.i.p.a
    public boolean j(View view, int r2, Bundle bundle) {
        if (super.j(view, r2, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().x1(r2, bundle);
    }

    @androidx.annotation.h0
    public b.i.p.a n() {
        return this.e;
    }

    boolean o() {
        return this.d.C0();
    }
}
