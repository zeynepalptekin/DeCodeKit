package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class zd2 implements r80, Closeable, Iterator<o50> {
    private static final o50 k = new yd2("eof ");
    private static he2 l = he2.b(zd2.class);
    protected n40 d;
    protected be2 e;
    private o50 f = null;
    long g = 0;
    long h = 0;
    long i = 0;
    private List<o50> j = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final o50 next() {
        o50 o50VarA;
        o50 o50Var = this.f;
        if (o50Var != null && o50Var != k) {
            this.f = null;
            return o50Var;
        }
        be2 be2Var = this.e;
        if (be2Var == null || this.g >= this.i) {
            this.f = k;
            throw new NoSuchElementException();
        }
        try {
            synchronized (be2Var) {
                this.e.c(this.g);
                o50VarA = this.d.a(this.e, this);
                this.g = this.e.position();
            }
            return o50VarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() throws IOException {
        this.e.close();
    }

    public void f(be2 be2Var, long j, n40 n40Var) throws IOException {
        this.e = be2Var;
        long jPosition = be2Var.position();
        this.h = jPosition;
        this.g = jPosition;
        be2Var.c(be2Var.position() + j);
        this.i = be2Var.position();
        this.d = n40Var;
    }

    public final List<o50> g() {
        return (this.e == null || this.f == k) ? this.j : new fe2(this.j, this);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        o50 o50Var = this.f;
        if (o50Var == k) {
            return false;
        }
        if (o50Var != null) {
            return true;
        }
        try {
            this.f = (o50) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f = k;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int r1 = 0; r1 < this.j.size(); r1++) {
            if (r1 > 0) {
                sb.append(";");
            }
            sb.append(this.j.get(r1).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
