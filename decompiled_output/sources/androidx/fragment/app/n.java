package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.g;

/* loaded from: classes.dex */
public abstract class n extends androidx.viewpager.widget.a {
    private static final String i = "FragmentPagerAdapter";
    private static final boolean j = false;

    @Deprecated
    public static final int k = 0;
    public static final int l = 1;
    private final i e;
    private final int f;
    private r g;
    private Fragment h;

    @Deprecated
    public n(@h0 i iVar) {
        this(iVar, 0);
    }

    public n(@h0 i iVar, int r3) {
        this.g = null;
        this.h = null;
        this.e = iVar;
        this.f = r3;
    }

    private static String x(int r2, long j2) {
        return "android:switcher:" + r2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.a
    public void b(@h0 ViewGroup viewGroup, int r2, @h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.g == null) {
            this.g = this.e.b();
        }
        this.g.r(fragment);
        if (fragment == this.h) {
            this.h = null;
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
    public Object j(@h0 ViewGroup viewGroup, int r6) {
        if (this.g == null) {
            this.g = this.e.b();
        }
        long jW = w(r6);
        Fragment fragmentG = this.e.g(x(viewGroup.getId(), jW));
        if (fragmentG != null) {
            this.g.m(fragmentG);
        } else {
            fragmentG = v(r6);
            this.g.h(viewGroup.getId(), fragmentG, x(viewGroup.getId(), jW));
        }
        if (fragmentG != this.h) {
            fragmentG.V1(false);
            if (this.f == 1) {
                this.g.I(fragmentG, g.b.STARTED);
            } else {
                fragmentG.g2(false);
            }
        }
        return fragmentG;
    }

    @Override // androidx.viewpager.widget.a
    public boolean k(@h0 View view, @h0 Object obj) {
        return ((Fragment) obj).X() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void n(@i0 Parcelable parcelable, @i0 ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    @i0
    public Parcelable o() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void q(@h0 ViewGroup viewGroup, int r4, @h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.V1(false);
                if (this.f == 1) {
                    if (this.g == null) {
                        this.g = this.e.b();
                    }
                    this.g.I(this.h, g.b.STARTED);
                } else {
                    this.h.g2(false);
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
            this.h = fragment;
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

    public long w(int r3) {
        return r3;
    }
}
