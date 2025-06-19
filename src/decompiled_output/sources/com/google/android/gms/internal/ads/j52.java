package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class j52 extends l92<j52, a> implements za2 {
    private static volatile kb2<j52> zzel;
    private static final j52 zzibi;
    private int zzhwq;
    private a82 zzhwr = a82.e;

    public static final class a extends l92.b<j52, a> implements za2 {
        private a() {
            super(j52.zzibi);
        }

        /* synthetic */ a(h52 h52Var) {
            this();
        }

        public final a v(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((j52) this.e).O(a82Var);
            return this;
        }

        public final a w(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((j52) this.e).I(0);
            return this;
        }
    }

    static {
        j52 j52Var = new j52();
        zzibi = j52Var;
        l92.w(j52.class, j52Var);
    }

    private j52() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    public static a M() {
        return zzibi.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(a82 a82Var) {
        a82Var.getClass();
        this.zzhwr = a82Var;
    }

    public static j52 Q(a82 a82Var, y82 y82Var) throws w92 {
        return (j52) l92.m(zzibi, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwq;
    }

    public final a82 L() {
        return this.zzhwr;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        h52 h52Var = null;
        switch (h52.f3633a[r2 - 1]) {
            case 1:
                return new j52();
            case 2:
                return new a(h52Var);
            case 3:
                return l92.u(zzibi, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhwq", "zzhwr"});
            case 4:
                return zzibi;
            case 5:
                kb2<j52> aVar = zzel;
                if (aVar == null) {
                    synchronized (j52.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzibi);
                            zzel = aVar;
                        }
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
