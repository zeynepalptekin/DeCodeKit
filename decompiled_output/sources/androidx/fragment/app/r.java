package androidx.fragment.app;

import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.lifecycle.g;
import b.i.p.f0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r {
    static final int A = 8;
    static final int B = 9;
    static final int C = 10;
    public static final int D = 4096;
    public static final int E = 8192;
    public static final int F = -1;
    public static final int G = 0;
    public static final int H = 4097;
    public static final int I = 8194;
    public static final int J = 4099;
    static final int s = 0;
    static final int t = 1;
    static final int u = 2;
    static final int v = 3;
    static final int w = 4;
    static final int x = 5;
    static final int y = 6;
    static final int z = 7;

    /* renamed from: b, reason: collision with root package name */
    int f463b;

    /* renamed from: c, reason: collision with root package name */
    int f464c;
    int d;
    int e;
    int f;
    int g;
    boolean h;

    @i0
    String j;
    int k;
    CharSequence l;
    int m;
    CharSequence n;
    ArrayList<String> o;
    ArrayList<String> p;
    ArrayList<Runnable> r;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f462a = new ArrayList<>();
    boolean i = true;
    boolean q = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f465a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f466b;

        /* renamed from: c, reason: collision with root package name */
        int f467c;
        int d;
        int e;
        int f;
        g.b g;
        g.b h;

        a() {
        }

        a(int r1, Fragment fragment) {
            this.f465a = r1;
            this.f466b = fragment;
            g.b bVar = g.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }

        a(int r1, @h0 Fragment fragment, g.b bVar) {
            this.f465a = r1;
            this.f466b = fragment;
            this.g = fragment.U;
            this.h = bVar;
        }
    }

    @h0
    public r A(@h0 Runnable runnable) {
        s();
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        this.r.add(runnable);
        return this;
    }

    @h0
    @Deprecated
    public r B(boolean z2) {
        return L(z2);
    }

    @h0
    public r C(@s0 int r1) {
        this.m = r1;
        this.n = null;
        return this;
    }

    @h0
    public r D(@i0 CharSequence charSequence) {
        this.m = 0;
        this.n = charSequence;
        return this;
    }

    @h0
    public r E(@s0 int r1) {
        this.k = r1;
        this.l = null;
        return this;
    }

    @h0
    public r F(@i0 CharSequence charSequence) {
        this.k = 0;
        this.l = charSequence;
        return this;
    }

    @h0
    public r G(@androidx.annotation.a @androidx.annotation.b int r2, @androidx.annotation.a @androidx.annotation.b int r3) {
        return H(r2, r3, 0, 0);
    }

    @h0
    public r H(@androidx.annotation.a @androidx.annotation.b int r1, @androidx.annotation.a @androidx.annotation.b int r2, @androidx.annotation.a @androidx.annotation.b int r3, @androidx.annotation.a @androidx.annotation.b int r4) {
        this.f463b = r1;
        this.f464c = r2;
        this.d = r3;
        this.e = r4;
        return this;
    }

    @h0
    public r I(@h0 Fragment fragment, @h0 g.b bVar) {
        j(new a(10, fragment, bVar));
        return this;
    }

    @h0
    public r K(@i0 Fragment fragment) {
        j(new a(8, fragment));
        return this;
    }

    @h0
    public r L(boolean z2) {
        this.q = z2;
        return this;
    }

    @h0
    public r M(int r1) {
        this.f = r1;
        return this;
    }

    @h0
    public r N(@t0 int r1) {
        this.g = r1;
        return this;
    }

    @h0
    public r O(@h0 Fragment fragment) {
        j(new a(5, fragment));
        return this;
    }

    @h0
    public r g(@androidx.annotation.w int r3, @h0 Fragment fragment) {
        t(r3, fragment, null, 1);
        return this;
    }

    @h0
    public r h(@androidx.annotation.w int r2, @h0 Fragment fragment, @i0 String str) {
        t(r2, fragment, str, 1);
        return this;
    }

    @h0
    public r i(@h0 Fragment fragment, @i0 String str) {
        t(0, fragment, str, 1);
        return this;
    }

    void j(a aVar) {
        this.f462a.add(aVar);
        aVar.f467c = this.f463b;
        aVar.d = this.f464c;
        aVar.e = this.d;
        aVar.f = this.e;
    }

    @h0
    public r k(@h0 View view, @h0 String str) {
        if (s.D()) {
            String strT0 = f0.t0(view);
            if (strT0 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.o == null) {
                this.o = new ArrayList<>();
                this.p = new ArrayList<>();
            } else {
                if (this.p.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.o.contains(strT0)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strT0 + "' has already been added to the transaction.");
                }
            }
            this.o.add(strT0);
            this.p.add(str);
        }
        return this;
    }

    @h0
    public r l(@i0 String str) {
        if (!this.i) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.h = true;
        this.j = str;
        return this;
    }

    @h0
    public r m(@h0 Fragment fragment) {
        j(new a(7, fragment));
        return this;
    }

    public abstract int n();

    public abstract int o();

    public abstract void p();

    public abstract void q();

    @h0
    public r r(@h0 Fragment fragment) {
        j(new a(6, fragment));
        return this;
    }

    @h0
    public r s() {
        if (this.h) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.i = false;
        return this;
    }

    void t(int r4, Fragment fragment, @i0 String str, int r7) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.A;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.A + " now " + str);
            }
            fragment.A = str;
        }
        if (r4 != 0) {
            if (r4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int r6 = fragment.y;
            if (r6 != 0 && r6 != r4) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.y + " now " + r4);
            }
            fragment.y = r4;
            fragment.z = r4;
        }
        j(new a(r7, fragment));
    }

    @h0
    public r u(@h0 Fragment fragment) {
        j(new a(4, fragment));
        return this;
    }

    public boolean v() {
        return this.i;
    }

    public boolean w() {
        return this.f462a.isEmpty();
    }

    @h0
    public r x(@h0 Fragment fragment) {
        j(new a(3, fragment));
        return this;
    }

    @h0
    public r y(@androidx.annotation.w int r2, @h0 Fragment fragment) {
        return z(r2, fragment, null);
    }

    @h0
    public r z(@androidx.annotation.w int r2, @h0 Fragment fragment, @i0 String str) {
        if (r2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        t(r2, fragment, str, 2);
        return this;
    }
}
