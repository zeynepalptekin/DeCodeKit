package b.i.o;

import androidx.annotation.p0;
import java.io.PrintWriter;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static final int f1155a = 19;

    /* renamed from: b, reason: collision with root package name */
    private static final int f1156b = 60;

    /* renamed from: c, reason: collision with root package name */
    private static final int f1157c = 3600;
    private static final int d = 86400;
    private static final Object e = new Object();
    private static char[] f = new char[24];

    private l() {
    }

    private static int a(int r2, int r3, boolean z, int r5) {
        if (r2 > 99 || (z && r5 >= 3)) {
            return r3 + 3;
        }
        if (r2 > 9 || (z && r5 >= 2)) {
            return r3 + 2;
        }
        if (z || r2 > 0) {
            return r3 + 1;
        }
        return 0;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static void b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            d(j - j2, printWriter, 0);
        }
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static void c(long j, PrintWriter printWriter) {
        d(j, printWriter, 0);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static void d(long j, PrintWriter printWriter, int r5) {
        synchronized (e) {
            printWriter.print(new String(f, 0, f(j, r5)));
        }
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static void e(long j, StringBuilder sb) {
        synchronized (e) {
            sb.append(f, 0, f(j, 0));
        }
    }

    private static int f(long j, int r19) {
        char c2;
        int r5;
        int r1;
        int r12;
        int r0;
        int r8;
        long j2 = j;
        if (f.length < r19) {
            f = new char[r19];
        }
        char[] cArr = f;
        if (j2 == 0) {
            int r02 = r19 - 1;
            while (r02 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c2 = '+';
        } else {
            c2 = '-';
            j2 = -j2;
        }
        int r13 = (int) (j2 % 1000);
        int r03 = (int) Math.floor(j2 / 1000);
        if (r03 > d) {
            r5 = r03 / d;
            r03 -= d * r5;
        } else {
            r5 = 0;
        }
        if (r03 > f1157c) {
            r1 = r03 / f1157c;
            r03 -= r1 * f1157c;
        } else {
            r1 = 0;
        }
        if (r03 > 60) {
            int r7 = r03 / 60;
            r12 = r03 - (r7 * 60);
            r0 = r7;
        } else {
            r12 = r03;
            r0 = 0;
        }
        if (r19 != 0) {
            int r72 = a(r5, 1, false, 0);
            int r73 = r72 + a(r1, 1, r72 > 0, 2);
            int r74 = r73 + a(r0, 1, r73 > 0, 2);
            int r75 = r74 + a(r12, 1, r74 > 0, 2);
            r8 = 0;
            for (int r76 = r75 + a(r13, 2, true, r75 > 0 ? 3 : 0) + 1; r76 < r19; r76++) {
                cArr[r8] = ' ';
                r8++;
            }
        } else {
            r8 = 0;
        }
        cArr[r8] = c2;
        int r9 = r8 + 1;
        boolean z = r19 != 0;
        int r77 = g(cArr, r5, 'd', r9, false, 0);
        int r78 = g(cArr, r1, 'h', r77, r77 != r9, z ? 2 : 0);
        int r79 = g(cArr, r0, 'm', r78, r78 != r9, z ? 2 : 0);
        int r710 = g(cArr, r12, 's', r79, r79 != r9, z ? 2 : 0);
        int r04 = g(cArr, r13, 'm', r710, true, (!z || r710 == r9) ? 0 : 3);
        cArr[r04] = 's';
        return r04 + 1;
    }

    private static int g(char[] cArr, int r3, char c2, int r5, boolean z, int r7) {
        int r1;
        if (!z && r3 <= 0) {
            return r5;
        }
        if ((!z || r7 < 3) && r3 <= 99) {
            r1 = r5;
        } else {
            int r0 = r3 / 100;
            cArr[r5] = (char) (r0 + 48);
            r1 = r5 + 1;
            r3 -= r0 * 100;
        }
        if ((z && r7 >= 2) || r3 > 9 || r5 != r1) {
            int r52 = r3 / 10;
            cArr[r1] = (char) (r52 + 48);
            r1++;
            r3 -= r52 * 10;
        }
        cArr[r1] = (char) (r3 + 48);
        int r12 = r1 + 1;
        cArr[r12] = c2;
        return r12 + 1;
    }
}
