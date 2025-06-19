package b.g.a;

import b.g.a.h;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a {
    private static final boolean l = false;
    private static final int m = -1;
    private static final boolean n = false;

    /* renamed from: b, reason: collision with root package name */
    private final b f901b;

    /* renamed from: c, reason: collision with root package name */
    private final c f902c;

    /* renamed from: a, reason: collision with root package name */
    int f900a = 0;
    private int d = 8;
    private h e = null;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    a(b bVar, c cVar) {
        this.f901b = bVar;
        this.f902c = cVar;
    }

    private boolean n(h hVar, e eVar) {
        return hVar.j <= 1;
    }

    final void a(h hVar, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int r1 = this.i;
        if (r1 == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = hVar.f919b;
            this.g[0] = -1;
            hVar.j++;
            hVar.a(this.f901b);
            this.f900a++;
            if (this.k) {
                return;
            }
            int r11 = this.j + 1;
            this.j = r11;
            int[] r12 = this.f;
            if (r11 >= r12.length) {
                this.k = true;
                this.j = r12.length - 1;
                return;
            }
            return;
        }
        int r6 = -1;
        for (int r5 = 0; r1 != -1 && r5 < this.f900a; r5++) {
            int[] r7 = this.f;
            int r8 = r7[r1];
            int r9 = hVar.f919b;
            if (r8 == r9) {
                float[] fArr = this.h;
                fArr[r1] = fArr[r1] + f;
                if (fArr[r1] == 0.0f) {
                    if (r1 == this.i) {
                        this.i = this.g[r1];
                    } else {
                        int[] r122 = this.g;
                        r122[r6] = r122[r1];
                    }
                    if (z) {
                        hVar.f(this.f901b);
                    }
                    if (this.k) {
                        this.j = r1;
                    }
                    hVar.j--;
                    this.f900a--;
                    return;
                }
                return;
            }
            if (r7[r1] < r9) {
                r6 = r1;
            }
            r1 = this.g[r1];
        }
        int length = this.j;
        int r0 = length + 1;
        if (this.k) {
            int[] r02 = this.f;
            if (r02[length] != -1) {
                length = r02.length;
            }
        } else {
            length = r0;
        }
        int[] r03 = this.f;
        if (length >= r03.length && this.f900a < r03.length) {
            int r04 = 0;
            while (true) {
                int[] r13 = this.f;
                if (r04 >= r13.length) {
                    break;
                }
                if (r13[r04] == -1) {
                    length = r04;
                    break;
                }
                r04++;
            }
        }
        int[] r05 = this.f;
        if (length >= r05.length) {
            length = r05.length;
            int r06 = this.d * 2;
            this.d = r06;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, r06);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[length] = hVar.f919b;
        this.h[length] = f;
        int[] r123 = this.g;
        if (r6 != -1) {
            r123[length] = r123[r6];
            r123[r6] = length;
        } else {
            r123[length] = this.i;
            this.i = length;
        }
        hVar.j++;
        hVar.a(this.f901b);
        this.f900a++;
        if (!this.k) {
            this.j++;
        }
        int r112 = this.j;
        int[] r124 = this.f;
        if (r112 >= r124.length) {
            this.k = true;
            this.j = r124.length - 1;
        }
    }

    h b(e eVar) {
        int r0 = this.i;
        h hVar = null;
        h hVar2 = null;
        boolean zN = false;
        boolean zN2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int r4 = 0; r0 != -1 && r4 < this.f900a; r4++) {
            float[] fArr = this.h;
            float f3 = fArr[r0];
            h hVar3 = this.f902c.f908c[this.f[r0]];
            if (f3 < 0.0f) {
                if (f3 > -0.001f) {
                    fArr[r0] = 0.0f;
                    hVar3.f(this.f901b);
                    f3 = 0.0f;
                }
            } else if (f3 < 0.001f) {
                fArr[r0] = 0.0f;
                hVar3.f(this.f901b);
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                if (hVar3.g == h.b.UNRESTRICTED) {
                    if (hVar2 == null || f > f3) {
                        zN = n(hVar3, eVar);
                        f = f3;
                        hVar2 = hVar3;
                    } else if (!zN && n(hVar3, eVar)) {
                        f = f3;
                        hVar2 = hVar3;
                        zN = true;
                    }
                } else if (hVar2 == null && f3 < 0.0f) {
                    if (hVar == null || f2 > f3) {
                        zN2 = n(hVar3, eVar);
                        f2 = f3;
                        hVar = hVar3;
                    } else if (!zN2 && n(hVar3, eVar)) {
                        f2 = f3;
                        hVar = hVar3;
                        zN2 = true;
                    }
                }
            }
            r0 = this.g[r0];
        }
        return hVar2 != null ? hVar2 : hVar;
    }

    public final void c() {
        int r0 = this.i;
        for (int r2 = 0; r0 != -1 && r2 < this.f900a; r2++) {
            h hVar = this.f902c.f908c[this.f[r0]];
            if (hVar != null) {
                hVar.f(this.f901b);
            }
            r0 = this.g[r0];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f900a = 0;
    }

    final boolean d(h hVar) {
        int r0 = this.i;
        if (r0 == -1) {
            return false;
        }
        for (int r3 = 0; r0 != -1 && r3 < this.f900a; r3++) {
            if (this.f[r0] == hVar.f919b) {
                return true;
            }
            r0 = this.g[r0];
        }
        return false;
    }

    public void e() {
        int r0 = this.f900a;
        System.out.print("{ ");
        for (int r1 = 0; r1 < r0; r1++) {
            h hVarJ = j(r1);
            if (hVarJ != null) {
                System.out.print(hVarJ + " = " + k(r1) + " ");
            }
        }
        System.out.println(" }");
    }

    void f(float f) {
        int r0 = this.i;
        for (int r1 = 0; r0 != -1 && r1 < this.f900a; r1++) {
            float[] fArr = this.h;
            fArr[r0] = fArr[r0] / f;
            r0 = this.g[r0];
        }
    }

    public final float g(h hVar) {
        int r0 = this.i;
        for (int r1 = 0; r0 != -1 && r1 < this.f900a; r1++) {
            if (this.f[r0] == hVar.f919b) {
                return this.h[r0];
            }
            r0 = this.g[r0];
        }
        return 0.0f;
    }

    h h() {
        h hVar = this.e;
        if (hVar != null) {
            return hVar;
        }
        int r0 = this.i;
        h hVar2 = null;
        for (int r1 = 0; r0 != -1 && r1 < this.f900a; r1++) {
            if (this.h[r0] < 0.0f) {
                h hVar3 = this.f902c.f908c[this.f[r0]];
                if (hVar2 == null || hVar2.d < hVar3.d) {
                    hVar2 = hVar3;
                }
            }
            r0 = this.g[r0];
        }
        return hVar2;
    }

    h i(boolean[] zArr, h hVar) {
        h.b bVar;
        int r0 = this.i;
        h hVar2 = null;
        float f = 0.0f;
        for (int r2 = 0; r0 != -1 && r2 < this.f900a; r2++) {
            if (this.h[r0] < 0.0f) {
                h hVar3 = this.f902c.f908c[this.f[r0]];
                if ((zArr == null || !zArr[hVar3.f919b]) && hVar3 != hVar && ((bVar = hVar3.g) == h.b.SLACK || bVar == h.b.ERROR)) {
                    float f2 = this.h[r0];
                    if (f2 < f) {
                        hVar2 = hVar3;
                        f = f2;
                    }
                }
            }
            r0 = this.g[r0];
        }
        return hVar2;
    }

    final h j(int r4) {
        int r0 = this.i;
        for (int r1 = 0; r0 != -1 && r1 < this.f900a; r1++) {
            if (r1 == r4) {
                return this.f902c.f908c[this.f[r0]];
            }
            r0 = this.g[r0];
        }
        return null;
    }

    final float k(int r4) {
        int r0 = this.i;
        for (int r1 = 0; r0 != -1 && r1 < this.f900a; r1++) {
            if (r1 == r4) {
                return this.h[r0];
            }
            r0 = this.g[r0];
        }
        return 0.0f;
    }

    boolean l() {
        int r0 = this.i;
        for (int r2 = 0; r0 != -1 && r2 < this.f900a; r2++) {
            if (this.h[r0] > 0.0f) {
                return true;
            }
            r0 = this.g[r0];
        }
        return false;
    }

    void m() {
        int r0 = this.i;
        for (int r1 = 0; r0 != -1 && r1 < this.f900a; r1++) {
            float[] fArr = this.h;
            fArr[r0] = fArr[r0] * (-1.0f);
            r0 = this.g[r0];
        }
    }

    public final void o(h hVar, float f) {
        if (f == 0.0f) {
            p(hVar, true);
            return;
        }
        int r1 = this.i;
        if (r1 == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = hVar.f919b;
            this.g[0] = -1;
            hVar.j++;
            hVar.a(this.f901b);
            this.f900a++;
            if (this.k) {
                return;
            }
            int r10 = this.j + 1;
            this.j = r10;
            int[] r11 = this.f;
            if (r10 >= r11.length) {
                this.k = true;
                this.j = r11.length - 1;
                return;
            }
            return;
        }
        int r5 = -1;
        for (int r4 = 0; r1 != -1 && r4 < this.f900a; r4++) {
            int[] r6 = this.f;
            int r7 = r6[r1];
            int r8 = hVar.f919b;
            if (r7 == r8) {
                this.h[r1] = f;
                return;
            }
            if (r6[r1] < r8) {
                r5 = r1;
            }
            r1 = this.g[r1];
        }
        int length = this.j;
        int r42 = length + 1;
        if (this.k) {
            int[] r43 = this.f;
            if (r43[length] != -1) {
                length = r43.length;
            }
        } else {
            length = r42;
        }
        int[] r44 = this.f;
        if (length >= r44.length && this.f900a < r44.length) {
            int r45 = 0;
            while (true) {
                int[] r62 = this.f;
                if (r45 >= r62.length) {
                    break;
                }
                if (r62[r45] == -1) {
                    length = r45;
                    break;
                }
                r45++;
            }
        }
        int[] r46 = this.f;
        if (length >= r46.length) {
            length = r46.length;
            int r47 = this.d * 2;
            this.d = r47;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, r47);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[length] = hVar.f919b;
        this.h[length] = f;
        int[] r112 = this.g;
        if (r5 != -1) {
            r112[length] = r112[r5];
            r112[r5] = length;
        } else {
            r112[length] = this.i;
            this.i = length;
        }
        hVar.j++;
        hVar.a(this.f901b);
        this.f900a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f900a >= this.f.length) {
            this.k = true;
        }
        int r102 = this.j;
        int[] r113 = this.f;
        if (r102 >= r113.length) {
            this.k = true;
            this.j = r113.length - 1;
        }
    }

    public final float p(h hVar, boolean z) {
        if (this.e == hVar) {
            this.e = null;
        }
        int r0 = this.i;
        if (r0 == -1) {
            return 0.0f;
        }
        int r3 = 0;
        int r4 = -1;
        while (r0 != -1 && r3 < this.f900a) {
            if (this.f[r0] == hVar.f919b) {
                if (r0 == this.i) {
                    this.i = this.g[r0];
                } else {
                    int[] r1 = this.g;
                    r1[r4] = r1[r0];
                }
                if (z) {
                    hVar.f(this.f901b);
                }
                hVar.j--;
                this.f900a--;
                this.f[r0] = -1;
                if (this.k) {
                    this.j = r0;
                }
                return this.h[r0];
            }
            r3++;
            r4 = r0;
            r0 = this.g[r0];
        }
        return 0.0f;
    }

    int q() {
        return (this.f.length * 4 * 3) + 0 + 36;
    }

    final void r(b bVar, b bVar2, boolean z) {
        int r0 = this.i;
        while (true) {
            for (int r2 = 0; r0 != -1 && r2 < this.f900a; r2++) {
                int r4 = this.f[r0];
                h hVar = bVar2.f903a;
                if (r4 == hVar.f919b) {
                    float f = this.h[r0];
                    p(hVar, z);
                    a aVar = bVar2.d;
                    int r42 = aVar.i;
                    for (int r5 = 0; r42 != -1 && r5 < aVar.f900a; r5++) {
                        a(this.f902c.f908c[aVar.f[r42]], aVar.h[r42] * f, z);
                        r42 = aVar.g[r42];
                    }
                    bVar.f904b += bVar2.f904b * f;
                    if (z) {
                        bVar2.f903a.f(bVar);
                    }
                    r0 = this.i;
                } else {
                    r0 = this.g[r0];
                }
            }
            return;
        }
    }

    void s(b bVar, b[] bVarArr) {
        int r0 = this.i;
        while (true) {
            for (int r2 = 0; r0 != -1 && r2 < this.f900a; r2++) {
                h hVar = this.f902c.f908c[this.f[r0]];
                if (hVar.f920c != -1) {
                    float f = this.h[r0];
                    p(hVar, true);
                    b bVar2 = bVarArr[hVar.f920c];
                    if (!bVar2.e) {
                        a aVar = bVar2.d;
                        int r6 = aVar.i;
                        for (int r7 = 0; r6 != -1 && r7 < aVar.f900a; r7++) {
                            a(this.f902c.f908c[aVar.f[r6]], aVar.h[r6] * f, true);
                            r6 = aVar.g[r6];
                        }
                    }
                    bVar.f904b += bVar2.f904b * f;
                    bVar2.f903a.f(bVar);
                    r0 = this.i;
                } else {
                    r0 = this.g[r0];
                }
            }
            return;
        }
    }

    public String toString() {
        int r0 = this.i;
        String str = "";
        for (int r2 = 0; r0 != -1 && r2 < this.f900a; r2++) {
            str = ((str + " -> ") + this.h[r0] + " : ") + this.f902c.f908c[this.f[r0]];
            r0 = this.g[r0];
        }
        return str;
    }
}
