package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class v42 extends l92<v42, a> implements za2 {
    private static volatile kb2<v42> zzel;
    private static final v42 zziaq;
    private int zzhwq;
    private y42 zziap;

    public static final class a extends l92.b<v42, a> implements za2 {
        private a() {
            super(v42.zziaq);
        }

        /* synthetic */ a(w42 w42Var) {
            this();
        }

        public final a v(y42 y42Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((v42) this.e).L(y42Var);
            return this;
        }

        public final a w(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((v42) this.e).I(0);
            return this;
        }
    }

    static {
        v42 v42Var = new v42();
        zziaq = v42Var;
        l92.w(v42.class, v42Var);
    }

    private v42() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(y42 y42Var) {
        y42Var.getClass();
        this.zziap = y42Var;
    }

    public static a N() {
        return zziaq.z();
    }

    public static v42 Q(a82 a82Var, y82 y82Var) throws w92 {
        return (v42) l92.m(zziaq, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwq;
    }

    public final y42 M() {
        y42 y42Var = this.zziap;
        return y42Var == null ? y42.I() : y42Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        w42 w42Var = null;
        switch (w42.f5785a[r2 - 1]) {
            case 1:
                return new v42();
            case 2:
                return new a(w42Var);
            case 3:
                return l92.u(zziaq, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhwq", "zziap"});
            case 4:
                return zziaq;
            case 5:
                kb2<v42> aVar = zzel;
                if (aVar == null) {
                    synchronized (v42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zziaq);
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
