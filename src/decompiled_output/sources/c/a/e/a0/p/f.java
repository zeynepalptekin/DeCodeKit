package c.a.e.a0.p;

import c.a.e.o;
import c.a.e.r;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends c.a.e.c0.d {
    private static final Writer r = new a();
    private static final r s = new r("closed");
    private final List<c.a.e.l> o;
    private String p;
    private c.a.e.l q;

    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int r2, int r3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(r);
        this.o = new ArrayList();
        this.q = c.a.e.n.f2315a;
    }

    private c.a.e.l H() {
        return this.o.get(r0.size() - 1);
    }

    private void I(c.a.e.l lVar) {
        if (this.p != null) {
            if (!lVar.F() || j()) {
                ((o) H()).I(this.p, lVar);
            }
            this.p = null;
            return;
        }
        if (this.o.isEmpty()) {
            this.q = lVar;
            return;
        }
        c.a.e.l lVarH = H();
        if (!(lVarH instanceof c.a.e.i)) {
            throw new IllegalStateException();
        }
        ((c.a.e.i) lVarH).I(lVar);
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d A(long j) throws IOException {
        I(new r((Number) Long.valueOf(j)));
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d B(Boolean bool) throws IOException {
        if (bool == null) {
            return p();
        }
        I(new r(bool));
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d C(Number number) throws IOException {
        if (number == null) {
            return p();
        }
        if (!l()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        I(new r(number));
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d D(String str) throws IOException {
        if (str == null) {
            return p();
        }
        I(new r(str));
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d E(boolean z) throws IOException {
        I(new r(Boolean.valueOf(z)));
        return this;
    }

    public c.a.e.l G() {
        if (this.o.isEmpty()) {
            return this.q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.o);
    }

    @Override // c.a.e.c0.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.o.add(s);
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d e() throws IOException {
        c.a.e.i iVar = new c.a.e.i();
        I(iVar);
        this.o.add(iVar);
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d f() throws IOException {
        o oVar = new o();
        I(oVar);
        this.o.add(oVar);
        return this;
    }

    @Override // c.a.e.c0.d, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d h() throws IOException {
        if (this.o.isEmpty() || this.p != null) {
            throw new IllegalStateException();
        }
        if (!(H() instanceof c.a.e.i)) {
            throw new IllegalStateException();
        }
        this.o.remove(r0.size() - 1);
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d i() throws IOException {
        if (this.o.isEmpty() || this.p != null) {
            throw new IllegalStateException();
        }
        if (!(H() instanceof o)) {
            throw new IllegalStateException();
        }
        this.o.remove(r0.size() - 1);
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d n(String str) throws IOException {
        if (this.o.isEmpty() || this.p != null) {
            throw new IllegalStateException();
        }
        if (!(H() instanceof o)) {
            throw new IllegalStateException();
        }
        this.p = str;
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d p() throws IOException {
        I(c.a.e.n.f2315a);
        return this;
    }

    @Override // c.a.e.c0.d
    public c.a.e.c0.d z(double d) throws IOException {
        if (l() || !(Double.isNaN(d) || Double.isInfinite(d))) {
            I(new r((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }
}
