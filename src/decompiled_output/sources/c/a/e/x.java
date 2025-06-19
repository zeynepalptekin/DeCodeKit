package c.a.e;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public abstract class x<T> {

    class a extends x<T> {
        a() {
        }

        @Override // c.a.e.x
        public T e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return (T) x.this.e(aVar);
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        public void i(c.a.e.c0.d dVar, T t) throws IOException {
            if (t == null) {
                dVar.p();
            } else {
                x.this.i(dVar, t);
            }
        }
    }

    public final T a(Reader reader) throws IOException {
        return e(new c.a.e.c0.a(reader));
    }

    public final T b(String str) throws IOException {
        return a(new StringReader(str));
    }

    public final T c(l lVar) {
        try {
            return e(new c.a.e.a0.p.e(lVar));
        } catch (IOException e) {
            throw new m(e);
        }
    }

    public final x<T> d() {
        return new a();
    }

    public abstract T e(c.a.e.c0.a aVar) throws IOException;

    public final String f(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            g(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void g(Writer writer, T t) throws IOException {
        i(new c.a.e.c0.d(writer), t);
    }

    public final l h(T t) {
        try {
            c.a.e.a0.p.f fVar = new c.a.e.a0.p.f();
            i(fVar, t);
            return fVar.G();
        } catch (IOException e) {
            throw new m(e);
        }
    }

    public abstract void i(c.a.e.c0.d dVar, T t) throws IOException;
}
