package b.g.a.i;

import b.g.a.h;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public class e {
    private static final boolean k = false;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    private static final int o = -1;

    /* renamed from: b, reason: collision with root package name */
    final h f927b;

    /* renamed from: c, reason: collision with root package name */
    final d f928c;
    e d;
    b.g.a.h j;

    /* renamed from: a, reason: collision with root package name */
    private o f926a = new o(this);
    public int e = 0;
    int f = -1;
    private c g = c.NONE;
    private b h = b.RELAXED;
    private int i = 0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f929a;

        static {
            int[] r0 = new int[d.values().length];
            f929a = r0;
            try {
                r0[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f929a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f929a[d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f929a[d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f929a[d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f929a[d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f929a[d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f929a[d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f929a[d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        RELAXED,
        STRICT
    }

    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public e(h hVar, d dVar) {
        this.f927b = hVar;
        this.f928c = dVar;
    }

    private boolean t(h hVar, HashSet<h> hashSet) {
        if (hashSet.contains(hVar)) {
            return false;
        }
        hashSet.add(hVar);
        if (hVar == i()) {
            return true;
        }
        ArrayList<e> arrayListT = hVar.t();
        int size = arrayListT.size();
        for (int r3 = 0; r3 < size; r3++) {
            e eVar = arrayListT.get(r3);
            if (eVar.v(this) && eVar.q() && t(eVar.o().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public void A(b.g.a.c cVar) {
        b.g.a.h hVar = this.j;
        if (hVar == null) {
            this.j = new b.g.a.h(h.b.UNRESTRICTED, (String) null);
        } else {
            hVar.g();
        }
    }

    public void B(int r1) {
        this.i = r1;
    }

    public void C(b bVar) {
        this.h = bVar;
    }

    public void D(int r2) {
        if (q()) {
            this.f = r2;
        }
    }

    public void E(int r2) {
        if (q()) {
            this.e = r2;
        }
    }

    public void F(c cVar) {
        if (q()) {
            this.g = cVar;
        }
    }

    public boolean a(e eVar, int r9) {
        return c(eVar, r9, -1, c.STRONG, 0, false);
    }

    public boolean b(e eVar, int r9, int r10) {
        return c(eVar, r9, -1, c.STRONG, r10, false);
    }

    public boolean c(e eVar, int r4, int r5, c cVar, int r7, boolean z) {
        if (eVar == null) {
            this.d = null;
            this.e = 0;
            this.f = -1;
            this.g = c.NONE;
            this.i = 2;
            return true;
        }
        if (!z && !x(eVar)) {
            return false;
        }
        this.d = eVar;
        if (r4 > 0) {
            this.e = r4;
        } else {
            this.e = 0;
        }
        this.f = r5;
        this.g = cVar;
        this.i = r7;
        return true;
    }

    public boolean d(e eVar, int r9, c cVar, int r11) {
        return c(eVar, r9, -1, cVar, r11, false);
    }

    public int e() {
        return this.i;
    }

    public b f() {
        return this.h;
    }

    public int g() {
        e eVar;
        if (this.f927b.o0() == 8) {
            return 0;
        }
        return (this.f <= -1 || (eVar = this.d) == null || eVar.f927b.o0() != 8) ? this.e : this.f;
    }

    public final e h() {
        switch (a.f929a[this.f928c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f927b.w;
            case 3:
                return this.f927b.u;
            case 4:
                return this.f927b.x;
            case 5:
                return this.f927b.v;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public h i() {
        return this.f927b;
    }

    public int j() {
        switch (a.f929a[this.f928c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 2;
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public o k() {
        return this.f926a;
    }

    public int l() {
        switch (a.f929a[this.f928c.ordinal()]) {
            case 1:
                return 3;
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
                return 0;
            case 6:
                return 2;
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 0;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public b.g.a.h m() {
        return this.j;
    }

    public c n() {
        return this.g;
    }

    public e o() {
        return this.d;
    }

    public d p() {
        return this.f928c;
    }

    public boolean q() {
        return this.d != null;
    }

    public boolean r(h hVar) {
        if (t(hVar, new HashSet<>())) {
            return false;
        }
        h hVarA0 = i().a0();
        return hVarA0 == hVar || hVar.a0() == hVarA0;
    }

    public boolean s(h hVar, e eVar) {
        return r(hVar);
    }

    public String toString() {
        return this.f927b.z() + ":" + this.f928c.toString();
    }

    public boolean u() {
        switch (a.f929a[this.f928c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public boolean v(e eVar) {
        d dVarP = eVar.p();
        d dVar = this.f928c;
        if (dVarP == dVar) {
            return true;
        }
        switch (a.f929a[dVar.ordinal()]) {
            case 1:
                return dVarP != d.BASELINE;
            case 2:
            case 3:
            case 7:
                return dVarP == d.LEFT || dVarP == d.RIGHT || dVarP == d.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return dVarP == d.TOP || dVarP == d.BOTTOM || dVarP == d.CENTER_Y || dVarP == d.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public boolean w(e eVar) {
        d dVar = this.f928c;
        if (dVar == d.CENTER) {
            return false;
        }
        if (dVar == eVar.p()) {
            return true;
        }
        switch (a.f929a[this.f928c.ordinal()]) {
            case 1:
            case 6:
            case 9:
                return false;
            case 2:
                int r10 = a.f929a[eVar.p().ordinal()];
                return r10 == 3 || r10 == 7;
            case 3:
                int r102 = a.f929a[eVar.p().ordinal()];
                return r102 == 2 || r102 == 7;
            case 4:
                int r103 = a.f929a[eVar.p().ordinal()];
                return r103 == 5 || r103 == 8;
            case 5:
                int r104 = a.f929a[eVar.p().ordinal()];
                return r104 == 4 || r104 == 8;
            case 7:
                int r105 = a.f929a[eVar.p().ordinal()];
                return r105 == 2 || r105 == 3;
            case 8:
                int r106 = a.f929a[eVar.p().ordinal()];
                return r106 == 4 || r106 == 5;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public boolean x(e eVar) {
        if (eVar == null) {
            return false;
        }
        d dVarP = eVar.p();
        d dVar = this.f928c;
        if (dVarP == dVar) {
            return dVar != d.BASELINE || (eVar.i().v0() && i().v0());
        }
        switch (a.f929a[dVar.ordinal()]) {
            case 1:
                return (dVarP == d.BASELINE || dVarP == d.CENTER_X || dVarP == d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = dVarP == d.LEFT || dVarP == d.RIGHT;
                if (eVar.i() instanceof k) {
                    return z || dVarP == d.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = dVarP == d.TOP || dVarP == d.BOTTOM;
                if (eVar.i() instanceof k) {
                    return z2 || dVarP == d.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public boolean y() {
        switch (a.f929a[this.f928c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f928c.name());
        }
    }

    public void z() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = c.STRONG;
        this.i = 0;
        this.h = b.RELAXED;
        this.f926a.g();
    }
}
