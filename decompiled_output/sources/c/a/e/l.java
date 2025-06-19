package c.a.e;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class l {
    public long A() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number B() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short C() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String D() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean E() {
        return this instanceof i;
    }

    public boolean F() {
        return this instanceof n;
    }

    public boolean G() {
        return this instanceof o;
    }

    public boolean H() {
        return this instanceof r;
    }

    public abstract l c();

    public BigDecimal h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    Boolean l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public char o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int t() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c.a.e.c0.d dVar = new c.a.e.c0.d(stringWriter);
            dVar.w(true);
            c.a.e.a0.n.b(this, dVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public i u() {
        if (E()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n v() {
        if (F()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public o x() {
        if (G()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r y() {
        if (H()) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }
}
