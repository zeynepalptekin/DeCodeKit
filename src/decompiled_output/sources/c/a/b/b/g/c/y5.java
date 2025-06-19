package c.a.b.b.g.c;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class y5 implements Serializable, Iterable<Byte> {
    public static final y5 e = new j6(l7.f1764c);
    private static final e6 f;
    private static final Comparator<y5> g;
    private int d = 0;

    static {
        x5 x5Var = null;
        f = r5.b() ? new i6(x5Var) : new c6(x5Var);
        g = new a6();
    }

    y5() {
    }

    static g6 A(int r2) {
        return new g6(r2, null);
    }

    public static y5 n(String str) {
        return new j6(str.getBytes(l7.f1762a));
    }

    static y5 o(byte[] bArr) {
        return new j6(bArr);
    }

    public static y5 r(byte[] bArr, int r3, int r4) {
        x(r3, r3 + r4, bArr.length);
        return new j6(f.a(bArr, r3, r4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(byte b2) {
        return b2 & 255;
    }

    static int x(int r3, int r4, int r5) {
        int r0 = r4 - r3;
        if ((r3 | r4 | r0 | (r5 - r4)) >= 0) {
            return r0;
        }
        if (r3 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(r3);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (r4 < r3) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(r3);
            sb2.append(", ");
            sb2.append(r4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(r4);
        sb3.append(" >= ");
        sb3.append(r5);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public abstract boolean B();

    protected final int C() {
        return this.d;
    }

    public abstract byte c(int r1);

    public abstract boolean equals(Object obj);

    public abstract int h();

    public final int hashCode() {
        int r0 = this.d;
        if (r0 == 0) {
            int r02 = h();
            r0 = j(r02, 0, r02);
            if (r0 == 0) {
                r0 = 1;
            }
            this.d = r0;
        }
        return r0;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new x5(this);
    }

    protected abstract int j(int r1, int r2, int r3);

    public abstract y5 l(int r1, int r2);

    protected abstract String s(Charset charset);

    abstract void t(v5 v5Var) throws IOException;

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? y9.a(this) : String.valueOf(y9.a(l(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    abstract byte u(int r1);

    public final String y() {
        return h() == 0 ? "" : s(l7.f1762a);
    }
}
