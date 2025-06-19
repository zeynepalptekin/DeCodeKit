package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a82 implements Serializable, Iterable<Byte> {
    public static final a82 e = new k82(o92.f4661c);
    private static final g82 f;
    private static final Comparator<a82> g;
    private int d = 0;

    static {
        z72 z72Var = null;
        f = t72.a() ? new n82(z72Var) : new e82(z72Var);
        g = new c82();
    }

    a82() {
    }

    static i82 F(int r2) {
        return new i82(r2, null);
    }

    public static a82 H(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int r1 = 256;
        while (true) {
            byte[] bArr = new byte[r1];
            int r4 = 0;
            while (r4 < r1) {
                int r5 = inputStream.read(bArr, r4, r1 - r4);
                if (r5 == -1) {
                    break;
                }
                r4 += r5;
            }
            a82 a82VarP = r4 == 0 ? null : P(bArr, 0, r4);
            if (a82VarP == null) {
                return Q(arrayList);
            }
            arrayList.add(a82VarP);
            r1 = Math.min(r1 << 1, 8192);
        }
    }

    public static a82 K(String str) {
        return new k82(str.getBytes(o92.f4659a));
    }

    static int L(int r3, int r4, int r5) {
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

    public static a82 P(byte[] bArr, int r3, int r4) {
        L(r3, r3 + r4, bArr.length);
        return new k82(f.a(bArr, r3, r4));
    }

    public static a82 Q(Iterable<a82> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            size = 0;
            Iterator<a82> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? e : h(iterable.iterator(), size);
    }

    public static a82 S(byte[] bArr) {
        return P(bArr, 0, bArr.length);
    }

    static a82 T(byte[] bArr) {
        return new k82(bArr);
    }

    private static a82 h(Iterator<a82> it, int r4) {
        if (r4 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(r4)));
        }
        if (r4 == 1) {
            return it.next();
        }
        int r0 = r4 >>> 1;
        a82 a82VarH = h(it, r0);
        a82 a82VarH2 = h(it, r4 - r0);
        if (ActivityChooserView.f.j - a82VarH.size() >= a82VarH2.size()) {
            return rb2.W(a82VarH, a82VarH2);
        }
        int size = a82VarH.size();
        int size2 = a82VarH2.size();
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    static void n(int r3, int r4) {
        if (((r4 - (r3 + 1)) | r3) < 0) {
            if (r3 < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(r3);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(r3);
            sb2.append(", ");
            sb2.append(r4);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(byte b2) {
        return b2 & 255;
    }

    public static j82 x() {
        return new j82(128);
    }

    protected abstract boolean A();

    protected final int B() {
        return this.d;
    }

    public abstract byte D(int r1);

    abstract byte E(int r1);

    protected abstract int G(int r1, int r2, int r3);

    protected abstract int I(int r1, int r2, int r3);

    public abstract a82 V(int r1, int r2);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return o92.f4661c;
        }
        byte[] bArr = new byte[size];
        r(bArr, 0, 0, size);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int I = this.d;
        if (I == 0) {
            int size = size();
            I = I(size, 0, size);
            if (I == 0) {
                I = 1;
            }
            this.d = I;
        }
        return I;
    }

    protected abstract String i(Charset charset);

    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract void j(x72 x72Var) throws IOException;

    @Deprecated
    public final void l(byte[] bArr, int r4, int r5, int r6) {
        L(r4, r4 + r6, size());
        L(r5, r5 + r6, bArr.length);
        if (r6 > 0) {
            r(bArr, r4, r5, r6);
        }
    }

    protected abstract void r(byte[] bArr, int r2, int r3, int r4);

    @Override // java.lang.Iterable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public f82 iterator() {
        return new z72(this);
    }

    public abstract int size();

    public final String t() {
        return size() == 0 ? "" : i(o92.f4659a);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? ic2.a(this) : String.valueOf(ic2.a(V(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract boolean u();

    public abstract m82 v();

    protected abstract int y();
}
