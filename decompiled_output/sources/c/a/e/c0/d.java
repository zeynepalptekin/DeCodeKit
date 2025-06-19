package c.a.e.c0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public class d implements Closeable, Flushable {
    private static final String[] m = new String[128];
    private static final String[] n;
    private final Writer d;
    private int[] e = new int[32];
    private int f = 0;
    private String g;
    private String h;
    private boolean i;
    private boolean j;
    private String k;
    private boolean l;

    static {
        for (int r1 = 0; r1 <= 31; r1++) {
            m[r1] = String.format("\\u%04x", Integer.valueOf(r1));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public d(Writer writer) {
        s(6);
        this.h = ":";
        this.l = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.d = writer;
    }

    private void F() throws IOException {
        if (this.k != null) {
            a();
            y(this.k);
            this.k = null;
        }
    }

    private void a() throws IOException {
        int r0 = r();
        if (r0 == 5) {
            this.d.write(44);
        } else if (r0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        o();
        t(4);
    }

    private void b() throws IOException {
        int r0 = r();
        if (r0 == 1) {
            t(2);
        } else {
            if (r0 != 2) {
                if (r0 == 4) {
                    this.d.append((CharSequence) this.h);
                    t(5);
                    return;
                }
                if (r0 != 6) {
                    if (r0 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.i) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                t(7);
                return;
            }
            this.d.append(',');
        }
        o();
    }

    private d g(int r2, int r3, String str) throws IOException {
        int r0 = r();
        if (r0 != r3 && r0 != r2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Dangling name: " + this.k);
        }
        this.f--;
        if (r0 == r3) {
            o();
        }
        this.d.write(str);
        return this;
    }

    private void o() throws IOException {
        if (this.g == null) {
            return;
        }
        this.d.write("\n");
        int r0 = this.f;
        for (int r1 = 1; r1 < r0; r1++) {
            this.d.write(this.g);
        }
    }

    private d q(int r1, String str) throws IOException {
        b();
        s(r1);
        this.d.write(str);
        return this;
    }

    private int r() {
        int r0 = this.f;
        if (r0 != 0) {
            return this.e[r0 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void s(int r5) {
        int r0 = this.f;
        int[] r1 = this.e;
        if (r0 == r1.length) {
            int[] r2 = new int[r0 * 2];
            System.arraycopy(r1, 0, r2, 0, r0);
            this.e = r2;
        }
        int[] r02 = this.e;
        int r12 = this.f;
        this.f = r12 + 1;
        r02[r12] = r5;
    }

    private void t(int r3) {
        this.e[this.f - 1] = r3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void y(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.j
            if (r0 == 0) goto L7
            java.lang.String[] r0 = c.a.e.c0.d.n
            goto L9
        L7:
            java.lang.String[] r0 = c.a.e.c0.d.m
        L9:
            java.io.Writer r1 = r8.d
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.d
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.d
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.d
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.d
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.c0.d.y(java.lang.String):void");
    }

    public d A(long j) throws IOException {
        F();
        b();
        this.d.write(Long.toString(j));
        return this;
    }

    public d B(Boolean bool) throws IOException {
        if (bool == null) {
            return p();
        }
        F();
        b();
        this.d.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public d C(Number number) throws IOException {
        if (number == null) {
            return p();
        }
        F();
        String string = number.toString();
        if (this.i || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            b();
            this.d.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public d D(String str) throws IOException {
        if (str == null) {
            return p();
        }
        F();
        b();
        y(str);
        return this;
    }

    public d E(boolean z) throws IOException {
        F();
        b();
        this.d.write(z ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
        int r0 = this.f;
        if (r0 > 1 || (r0 == 1 && this.e[r0 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f = 0;
    }

    public d e() throws IOException {
        F();
        return q(1, "[");
    }

    public d f() throws IOException {
        F();
        return q(3, "{");
    }

    public void flush() throws IOException {
        if (this.f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.d.flush();
    }

    public d h() throws IOException {
        return g(1, 2, "]");
    }

    public d i() throws IOException {
        return g(3, 5, "}");
    }

    public final boolean j() {
        return this.l;
    }

    public final boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.i;
    }

    public d m(String str) throws IOException {
        if (str == null) {
            return p();
        }
        F();
        b();
        this.d.append((CharSequence) str);
        return this;
    }

    public d n(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.k != null) {
            throw new IllegalStateException();
        }
        if (this.f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.k = str;
        return this;
    }

    public d p() throws IOException {
        if (this.k != null) {
            if (!this.l) {
                this.k = null;
                return this;
            }
            F();
        }
        b();
        this.d.write("null");
        return this;
    }

    public final void u(boolean z) {
        this.j = z;
    }

    public final void v(String str) {
        String str2;
        if (str.length() == 0) {
            this.g = null;
            str2 = ":";
        } else {
            this.g = str;
            str2 = ": ";
        }
        this.h = str2;
    }

    public final void w(boolean z) {
        this.i = z;
    }

    public final void x(boolean z) {
        this.l = z;
    }

    public d z(double d) throws IOException {
        F();
        if (this.i || !(Double.isNaN(d) || Double.isInfinite(d))) {
            b();
            this.d.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }
}
