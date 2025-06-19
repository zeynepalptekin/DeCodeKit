package c.a.e;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes.dex */
public final class q {
    public l a(c.a.e.c0.a aVar) throws v, m {
        boolean zM = aVar.m();
        aVar.E(true);
        try {
            try {
                return c.a.e.a0.n.a(aVar);
            } catch (OutOfMemoryError e) {
                throw new p("Failed parsing JSON source: " + aVar + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new p("Failed parsing JSON source: " + aVar + " to Json", e2);
            }
        } finally {
            aVar.E(zM);
        }
    }

    public l b(Reader reader) throws v, m {
        try {
            c.a.e.c0.a aVar = new c.a.e.c0.a(reader);
            l lVarA = a(aVar);
            if (!lVarA.F() && aVar.z() != c.a.e.c0.c.END_DOCUMENT) {
                throw new v("Did not consume the entire document.");
            }
            return lVarA;
        } catch (c.a.e.c0.e e) {
            throw new v(e);
        } catch (IOException e2) {
            throw new m(e2);
        } catch (NumberFormatException e3) {
            throw new v(e3);
        }
    }

    public l c(String str) throws v {
        return b(new StringReader(str));
    }
}
