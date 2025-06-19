package b.g.a.i;

import java.util.Arrays;

/* loaded from: classes.dex */
public class l extends h {
    protected h[] c1 = new h[4];
    protected int d1 = 0;

    public void P1(h hVar) {
        int r0 = this.d1 + 1;
        h[] hVarArr = this.c1;
        if (r0 > hVarArr.length) {
            this.c1 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
        }
        h[] hVarArr2 = this.c1;
        int r1 = this.d1;
        hVarArr2[r1] = hVar;
        this.d1 = r1 + 1;
    }

    public void Q1() {
        this.d1 = 0;
    }
}
