package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class op2 extends IOException {
    private final int d;
    private final jp2 e;

    public op2(IOException iOException, jp2 jp2Var, int r3) {
        super(iOException);
        this.e = jp2Var;
        this.d = r3;
    }

    public op2(String str, jp2 jp2Var, int r3) {
        super(str);
        this.e = jp2Var;
        this.d = 1;
    }

    public op2(String str, IOException iOException, jp2 jp2Var, int r4) {
        super(str, iOException);
        this.e = jp2Var;
        this.d = 1;
    }
}
