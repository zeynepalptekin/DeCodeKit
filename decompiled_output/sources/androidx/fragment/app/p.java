package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p extends androidx.viewpager.widget.a {
    private static final String k = "FragmentStatePagerAdapt";
    private static final boolean l = false;

    @Deprecated
    public static final int m = 0;
    public static final int n = 1;
    private final i e;
    private final int f;
    private r g;
    private ArrayList<Fragment.g> h;
    private ArrayList<Fragment> i;
    private Fragment j;

    @Deprecated
    public p(@h0 i iVar) {
        this(iVar, 0);
    }

    public p(@h0 i iVar, int r4) {
        this.g = null;
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.j = null;
        this.e = iVar;
        this.f = r4;
    }

    @Override // androidx.viewpager.widget.a
    public void b(@h0 ViewGroup viewGroup, int r4, @h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.g == null) {
            this.g = this.e.b();
        }
        while (this.h.size() <= r4) {
            this.h.add(null);
        }
        this.h.set(r4, fragment.f0() ? this.e.z(fragment) : null);
        this.i.set(r4, null);
        this.g.x(fragment);
        if (fragment == this.j) {
            this.j = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void d(@h0 ViewGroup viewGroup) {
        r rVar = this.g;
        if (rVar != null) {
            rVar.q();
            this.g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @h0
    public Object j(@h0 ViewGroup viewGroup, int r5) {
        Fragment.g gVar;
        Fragment fragment;
        if (this.i.size() > r5 && (fragment = this.i.get(r5)) != null) {
            return fragment;
        }
        if (this.g == null) {
            this.g = this.e.b();
        }
        Fragment fragmentV = v(r5);
        if (this.h.size() > r5 && (gVar = this.h.get(r5)) != null) {
            fragmentV.U1(gVar);
        }
        while (this.i.size() <= r5) {
            this.i.add(null);
        }
        fragmentV.V1(false);
        if (this.f == 0) {
            fragmentV.g2(false);
        }
        this.i.set(r5, fragmentV);
        this.g.g(viewGroup.getId(), fragmentV);
        if (this.f == 1) {
            this.g.I(fragmentV, g.b.STARTED);
        }
        return fragmentV;
    }

    @Override // androidx.viewpager.widget.a
    public boolean k(@h0 View view, @h0 Object obj) {
        return ((Fragment) obj).X() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void n(@i0 Parcelable parcelable, @i0 ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.h.clear();
            this.i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.h.add((Fragment.g) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int r2 = Integer.parseInt(str.substring(1));
                    Fragment fragmentJ = this.e.j(bundle, str);
                    if (fragmentJ != null) {
                        while (this.i.size() <= r2) {
                            this.i.add(null);
                        }
                        fragmentJ.V1(false);
                        this.i.set(r2, fragmentJ);
                    } else {
                        Log.w(k, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    @i0
    public Parcelable o() {
        Bundle bundle;
        if (this.h.size() > 0) {
            bundle = new Bundle();
            Fragment.g[] gVarArr = new Fragment.g[this.h.size()];
            this.h.toArray(gVarArr);
            bundle.putParcelableArray("states", gVarArr);
        } else {
            bundle = null;
        }
        for (int r1 = 0; r1 < this.i.size(); r1++) {
            Fragment fragment = this.i.get(r1);
            if (fragment != null && fragment.f0()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.e.w(bundle, "f" + r1, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void q(@h0 ViewGroup viewGroup, int r4, @h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.V1(false);
                if (this.f == 1) {
                    if (this.g == null) {
                        this.g = this.e.b();
                    }
                    this.g.I(this.j, g.b.STARTED);
                } else {
                    this.j.g2(false);
                }
            }
            fragment.V1(true);
            if (this.f == 1) {
                if (this.g == null) {
                    this.g = this.e.b();
                }
                this.g.I(fragment, g.b.RESUMED);
            } else {
                fragment.g2(true);
            }
            this.j = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void t(@h0 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @h0
    public abstract Fragment v(int r1);
}
