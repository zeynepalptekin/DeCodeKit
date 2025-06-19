package c.a.e.a0.p;

import c.a.e.o;
import c.a.e.r;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends c.a.e.c0.a {
    private static final Reader Y = new a();
    private static final Object Z = new Object();
    private Object[] U;
    private int V;
    private String[] W;
    private int[] X;

    static class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int r2, int r3) throws IOException {
            throw new AssertionError();
        }
    }

    public e(c.a.e.l lVar) {
        super(Y);
        this.U = new Object[32];
        this.V = 0;
        this.W = new String[32];
        this.X = new int[32];
        P(lVar);
    }

    private void L(c.a.e.c0.c cVar) throws IOException {
        if (z() == cVar) {
            return;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + z() + o());
    }

    private Object M() {
        return this.U[this.V - 1];
    }

    private Object N() {
        Object[] objArr = this.U;
        int r1 = this.V - 1;
        this.V = r1;
        Object obj = objArr[r1];
        objArr[r1] = null;
        return obj;
    }

    private void P(Object obj) {
        int r0 = this.V;
        Object[] objArr = this.U;
        if (r0 == objArr.length) {
            Object[] objArr2 = new Object[r0 * 2];
            int[] r3 = new int[r0 * 2];
            String[] strArr = new String[r0 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, r0);
            System.arraycopy(this.X, 0, r3, 0, this.V);
            System.arraycopy(this.W, 0, strArr, 0, this.V);
            this.U = objArr2;
            this.X = r3;
            this.W = strArr;
        }
        Object[] objArr3 = this.U;
        int r1 = this.V;
        this.V = r1 + 1;
        objArr3[r1] = obj;
    }

    private String o() {
        return " at path " + k();
    }

    @Override // c.a.e.c0.a
    public void J() throws IOException {
        if (z() == c.a.e.c0.c.NAME) {
            t();
            this.W[this.V - 2] = "null";
        } else {
            N();
            int r0 = this.V;
            if (r0 > 0) {
                this.W[r0 - 1] = "null";
            }
        }
        int r02 = this.V;
        if (r02 > 0) {
            int[] r1 = this.X;
            int r03 = r02 - 1;
            r1[r03] = r1[r03] + 1;
        }
    }

    public void O() throws IOException {
        L(c.a.e.c0.c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) M()).next();
        P(entry.getValue());
        P(new r((String) entry.getKey()));
    }

    @Override // c.a.e.c0.a
    public void a() throws IOException {
        L(c.a.e.c0.c.BEGIN_ARRAY);
        P(((c.a.e.i) M()).iterator());
        this.X[this.V - 1] = 0;
    }

    @Override // c.a.e.c0.a
    public void b() throws IOException {
        L(c.a.e.c0.c.BEGIN_OBJECT);
        P(((o) M()).V().iterator());
    }

    @Override // c.a.e.c0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.U = new Object[]{Z};
        this.V = 1;
    }

    @Override // c.a.e.c0.a
    public void h() throws IOException {
        L(c.a.e.c0.c.END_ARRAY);
        N();
        N();
        int r0 = this.V;
        if (r0 > 0) {
            int[] r1 = this.X;
            int r02 = r0 - 1;
            r1[r02] = r1[r02] + 1;
        }
    }

    @Override // c.a.e.c0.a
    public void i() throws IOException {
        L(c.a.e.c0.c.END_OBJECT);
        N();
        N();
        int r0 = this.V;
        if (r0 > 0) {
            int[] r1 = this.X;
            int r02 = r0 - 1;
            r1[r02] = r1[r02] + 1;
        }
    }

    @Override // c.a.e.c0.a
    public String k() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int r1 = 0;
        while (r1 < this.V) {
            Object[] objArr = this.U;
            if (objArr[r1] instanceof c.a.e.i) {
                r1++;
                if (objArr[r1] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.X[r1]);
                    sb.append(']');
                }
            } else if (objArr[r1] instanceof o) {
                r1++;
                if (objArr[r1] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.W;
                    if (strArr[r1] != null) {
                        sb.append(strArr[r1]);
                    }
                }
            }
            r1++;
        }
        return sb.toString();
    }

    @Override // c.a.e.c0.a
    public boolean l() throws IOException {
        c.a.e.c0.c cVarZ = z();
        return (cVarZ == c.a.e.c0.c.END_OBJECT || cVarZ == c.a.e.c0.c.END_ARRAY) ? false : true;
    }

    @Override // c.a.e.c0.a
    public boolean p() throws IOException {
        L(c.a.e.c0.c.BOOLEAN);
        boolean zJ = ((r) N()).j();
        int r1 = this.V;
        if (r1 > 0) {
            int[] r2 = this.X;
            int r12 = r1 - 1;
            r2[r12] = r2[r12] + 1;
        }
        return zJ;
    }

    @Override // c.a.e.c0.a
    public double q() throws IOException {
        c.a.e.c0.c cVarZ = z();
        if (cVarZ != c.a.e.c0.c.NUMBER && cVarZ != c.a.e.c0.c.STRING) {
            throw new IllegalStateException("Expected " + c.a.e.c0.c.NUMBER + " but was " + cVarZ + o());
        }
        double dR = ((r) M()).r();
        if (!m() && (Double.isNaN(dR) || Double.isInfinite(dR))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dR);
        }
        N();
        int r2 = this.V;
        if (r2 > 0) {
            int[] r3 = this.X;
            int r22 = r2 - 1;
            r3[r22] = r3[r22] + 1;
        }
        return dR;
    }

    @Override // c.a.e.c0.a
    public int r() throws IOException {
        c.a.e.c0.c cVarZ = z();
        if (cVarZ != c.a.e.c0.c.NUMBER && cVarZ != c.a.e.c0.c.STRING) {
            throw new IllegalStateException("Expected " + c.a.e.c0.c.NUMBER + " but was " + cVarZ + o());
        }
        int r0 = ((r) M()).t();
        N();
        int r1 = this.V;
        if (r1 > 0) {
            int[] r2 = this.X;
            int r12 = r1 - 1;
            r2[r12] = r2[r12] + 1;
        }
        return r0;
    }

    @Override // c.a.e.c0.a
    public long s() throws IOException {
        c.a.e.c0.c cVarZ = z();
        if (cVarZ != c.a.e.c0.c.NUMBER && cVarZ != c.a.e.c0.c.STRING) {
            throw new IllegalStateException("Expected " + c.a.e.c0.c.NUMBER + " but was " + cVarZ + o());
        }
        long jA = ((r) M()).A();
        N();
        int r2 = this.V;
        if (r2 > 0) {
            int[] r3 = this.X;
            int r22 = r2 - 1;
            r3[r22] = r3[r22] + 1;
        }
        return jA;
    }

    @Override // c.a.e.c0.a
    public String t() throws IOException {
        L(c.a.e.c0.c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) M()).next();
        String str = (String) entry.getKey();
        this.W[this.V - 1] = str;
        P(entry.getValue());
        return str;
    }

    @Override // c.a.e.c0.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // c.a.e.c0.a
    public void v() throws IOException {
        L(c.a.e.c0.c.NULL);
        N();
        int r0 = this.V;
        if (r0 > 0) {
            int[] r1 = this.X;
            int r02 = r0 - 1;
            r1[r02] = r1[r02] + 1;
        }
    }

    @Override // c.a.e.c0.a
    public String x() throws IOException {
        c.a.e.c0.c cVarZ = z();
        if (cVarZ == c.a.e.c0.c.STRING || cVarZ == c.a.e.c0.c.NUMBER) {
            String strD = ((r) N()).D();
            int r1 = this.V;
            if (r1 > 0) {
                int[] r2 = this.X;
                int r12 = r1 - 1;
                r2[r12] = r2[r12] + 1;
            }
            return strD;
        }
        throw new IllegalStateException("Expected " + c.a.e.c0.c.STRING + " but was " + cVarZ + o());
    }

    @Override // c.a.e.c0.a
    public c.a.e.c0.c z() throws IOException {
        if (this.V == 0) {
            return c.a.e.c0.c.END_DOCUMENT;
        }
        Object objM = M();
        if (objM instanceof Iterator) {
            boolean z = this.U[this.V - 2] instanceof o;
            Iterator it = (Iterator) objM;
            if (!it.hasNext()) {
                return z ? c.a.e.c0.c.END_OBJECT : c.a.e.c0.c.END_ARRAY;
            }
            if (z) {
                return c.a.e.c0.c.NAME;
            }
            P(it.next());
            return z();
        }
        if (objM instanceof o) {
            return c.a.e.c0.c.BEGIN_OBJECT;
        }
        if (objM instanceof c.a.e.i) {
            return c.a.e.c0.c.BEGIN_ARRAY;
        }
        if (!(objM instanceof r)) {
            if (objM instanceof c.a.e.n) {
                return c.a.e.c0.c.NULL;
            }
            if (objM == Z) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        r rVar = (r) objM;
        if (rVar.S()) {
            return c.a.e.c0.c.STRING;
        }
        if (rVar.K()) {
            return c.a.e.c0.c.BOOLEAN;
        }
        if (rVar.P()) {
            return c.a.e.c0.c.NUMBER;
        }
        throw new AssertionError();
    }
}
