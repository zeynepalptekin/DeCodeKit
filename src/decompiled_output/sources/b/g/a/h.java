package b.g.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public class h {
    private static final boolean k = false;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    public static final int s = 7;
    private static int t = 1;
    private static int u = 1;
    private static int v = 1;
    private static int w = 1;
    private static int x = 1;
    static final int y = 7;

    /* renamed from: a, reason: collision with root package name */
    private String f918a;

    /* renamed from: b, reason: collision with root package name */
    public int f919b;

    /* renamed from: c, reason: collision with root package name */
    int f920c;
    public int d;
    public float e;
    float[] f;
    b g;
    b.g.a.b[] h;
    int i;
    public int j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f921a;

        static {
            int[] r0 = new int[b.values().length];
            f921a = r0;
            try {
                r0[b.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f921a[b.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f921a[b.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f921a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f921a[b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public h(b bVar, String str) {
        this.f919b = -1;
        this.f920c = -1;
        this.d = 0;
        this.f = new float[7];
        this.h = new b.g.a.b[8];
        this.i = 0;
        this.j = 0;
        this.g = bVar;
    }

    public h(String str, b bVar) {
        this.f919b = -1;
        this.f920c = -1;
        this.d = 0;
        this.f = new float[7];
        this.h = new b.g.a.b[8];
        this.i = 0;
        this.j = 0;
        this.f918a = str;
        this.g = bVar;
    }

    private static String d(b bVar, String str) {
        StringBuilder sb;
        int r3;
        if (str != null) {
            sb = new StringBuilder();
            sb.append(str);
            r3 = u;
        } else {
            int r32 = a.f921a[bVar.ordinal()];
            if (r32 == 1) {
                sb = new StringBuilder();
                sb.append("U");
                r3 = v + 1;
                v = r3;
            } else if (r32 == 2) {
                sb = new StringBuilder();
                sb.append("C");
                r3 = w + 1;
                w = r3;
            } else if (r32 == 3) {
                sb = new StringBuilder();
                sb.append("S");
                r3 = t + 1;
                t = r3;
            } else if (r32 == 4) {
                sb = new StringBuilder();
                sb.append("e");
                r3 = u + 1;
                u = r3;
            } else {
                if (r32 != 5) {
                    throw new AssertionError(bVar.name());
                }
                sb = new StringBuilder();
                sb.append("V");
                r3 = x + 1;
                x = r3;
            }
        }
        sb.append(r3);
        return sb.toString();
    }

    static void e() {
        u++;
    }

    public final void a(b.g.a.b bVar) {
        int r0 = 0;
        while (true) {
            int r1 = this.i;
            if (r0 >= r1) {
                b.g.a.b[] bVarArr = this.h;
                if (r1 >= bVarArr.length) {
                    this.h = (b.g.a.b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b.g.a.b[] bVarArr2 = this.h;
                int r12 = this.i;
                bVarArr2[r12] = bVar;
                this.i = r12 + 1;
                return;
            }
            if (this.h[r0] == bVar) {
                return;
            } else {
                r0++;
            }
        }
    }

    void b() {
        for (int r0 = 0; r0 < 7; r0++) {
            this.f[r0] = 0.0f;
        }
    }

    public String c() {
        return this.f918a;
    }

    public final void f(b.g.a.b bVar) {
        int r0 = this.i;
        for (int r2 = 0; r2 < r0; r2++) {
            if (this.h[r2] == bVar) {
                for (int r1 = 0; r1 < (r0 - r2) - 1; r1++) {
                    b.g.a.b[] bVarArr = this.h;
                    int r3 = r2 + r1;
                    bVarArr[r3] = bVarArr[r3 + 1];
                }
                this.i--;
                return;
            }
        }
    }

    public void g() {
        this.f918a = null;
        this.g = b.UNKNOWN;
        this.d = 0;
        this.f919b = -1;
        this.f920c = -1;
        this.e = 0.0f;
        this.i = 0;
        this.j = 0;
    }

    public void h(String str) {
        this.f918a = str;
    }

    public void i(b bVar, String str) {
        this.g = bVar;
    }

    String j() {
        StringBuilder sb;
        String str;
        String string = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int r3 = 0; r3 < this.f.length; r3++) {
            String str2 = string + this.f[r3];
            float[] fArr = this.f;
            if (fArr[r3] > 0.0f) {
                z = false;
            } else if (fArr[r3] < 0.0f) {
                z = true;
            }
            if (this.f[r3] != 0.0f) {
                z2 = false;
            }
            if (r3 < this.f.length - 1) {
                sb = new StringBuilder();
                sb.append(str2);
                str = ", ";
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                str = "] ";
            }
            sb.append(str);
            string = sb.toString();
        }
        if (z) {
            string = string + " (-)";
        }
        if (!z2) {
            return string;
        }
        return string + " (*)";
    }

    public final void k(b.g.a.b bVar) {
        int r0 = this.i;
        for (int r2 = 0; r2 < r0; r2++) {
            b.g.a.b[] bVarArr = this.h;
            bVarArr[r2].d.r(bVarArr[r2], bVar, false);
        }
        this.i = 0;
    }

    public String toString() {
        return "" + this.f918a;
    }
}
