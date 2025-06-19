package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class f5 extends e5 {
    public static int a(int r3, int r4, int r5) {
        if (r4 <= 1073741823) {
            return Math.min(Math.max(r3, r4), 1073741823);
        }
        throw new IllegalArgumentException(i3.b("min (%s) must be less than or equal to max (%s)", Integer.valueOf(r4), 1073741823));
    }
}
