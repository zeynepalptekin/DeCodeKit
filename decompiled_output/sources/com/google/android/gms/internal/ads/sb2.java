package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class sb2 implements Iterator<h82> {
    private final ArrayDeque<rb2> d;
    private h82 e;

    private sb2(a82 a82Var) {
        h82 h82VarB;
        if (a82Var instanceof rb2) {
            rb2 rb2Var = (rb2) a82Var;
            ArrayDeque<rb2> arrayDeque = new ArrayDeque<>(rb2Var.y());
            this.d = arrayDeque;
            arrayDeque.push(rb2Var);
            h82VarB = b(rb2Var.i);
        } else {
            this.d = null;
            h82VarB = (h82) a82Var;
        }
        this.e = h82VarB;
    }

    /* synthetic */ sb2(a82 a82Var, qb2 qb2Var) {
        this(a82Var);
    }

    private final h82 b(a82 a82Var) {
        while (a82Var instanceof rb2) {
            rb2 rb2Var = (rb2) a82Var;
            this.d.push(rb2Var);
            a82Var = rb2Var.i;
        }
        return (h82) a82Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ h82 next() {
        h82 h82VarB;
        h82 h82Var = this.e;
        if (h82Var == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<rb2> arrayDeque = this.d;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                h82VarB = null;
                break;
            }
            h82VarB = b(this.d.pop().j);
        } while (h82VarB.isEmpty());
        this.e = h82VarB;
        return h82Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
