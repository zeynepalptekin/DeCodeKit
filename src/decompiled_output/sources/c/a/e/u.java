package c.a.e;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class u implements Iterator<l> {
    private final c.a.e.c0.a d;
    private final Object e;

    public u(Reader reader) {
        c.a.e.c0.a aVar = new c.a.e.c0.a(reader);
        this.d = aVar;
        aVar.E(true);
        this.e = new Object();
    }

    public u(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l next() throws p {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return c.a.e.a0.n.a(this.d);
        } catch (p e) {
            if (e.getCause() instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e;
        } catch (OutOfMemoryError e2) {
            throw new p("Failed parsing JSON source to Json", e2);
        } catch (StackOverflowError e3) {
            throw new p("Failed parsing JSON source to Json", e3);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        synchronized (this.e) {
            try {
                try {
                    try {
                        z = this.d.z() != c.a.e.c0.c.END_DOCUMENT;
                    } catch (IOException e) {
                        throw new m(e);
                    }
                } catch (c.a.e.c0.e e2) {
                    throw new v(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
