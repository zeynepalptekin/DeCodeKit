package c.a.e.a0;

import c.a.e.p;
import c.a.e.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public final class n {

    private static final class a extends Writer {
        private final Appendable d;
        private final C0153a e = new C0153a();

        /* renamed from: c.a.e.a0.n$a$a, reason: collision with other inner class name */
        static class C0153a implements CharSequence {
            char[] d;

            C0153a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int r2) {
                return this.d[r2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.d.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int r3, int r4) {
                return new String(this.d, r3, r4 - r3);
            }
        }

        a(Appendable appendable) {
            this.d = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int r2) throws IOException {
            this.d.append((char) r2);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int r3, int r4) throws IOException {
            C0153a c0153a = this.e;
            c0153a.d = cArr;
            this.d.append(c0153a, r3, r4 + r3);
        }
    }

    private n() {
        throw new UnsupportedOperationException();
    }

    public static c.a.e.l a(c.a.e.c0.a aVar) throws p {
        boolean z;
        try {
            try {
                aVar.z();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return c.a.e.a0.p.n.X.e(aVar);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return c.a.e.n.f2315a;
                }
                throw new v(e);
            }
        } catch (c.a.e.c0.e e3) {
            throw new v(e3);
        } catch (IOException e4) {
            throw new c.a.e.m(e4);
        } catch (NumberFormatException e5) {
            throw new v(e5);
        }
    }

    public static void b(c.a.e.l lVar, c.a.e.c0.d dVar) throws IOException {
        c.a.e.a0.p.n.X.i(dVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
