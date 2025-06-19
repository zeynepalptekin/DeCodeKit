package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class v22 extends l92<v22, a> implements za2 {
    private static volatile kb2<v22> zzel;
    private static final v22 zzhxk;
    private int zzhwq;
    private a82 zzhwr = a82.e;
    private z22 zzhxj;

    public static final class a extends l92.b<v22, a> implements za2 {
        private a() {
            super(v22.zzhxk);
        }

        /* synthetic */ a(u22 u22Var) {
            this();
        }

        public final a v(z22 z22Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((v22) this.e).M(z22Var);
            return this;
        }

        public final a w(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((v22) this.e).I(0);
            return this;
        }

        public final a x(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((v22) this.e).T(a82Var);
            return this;
        }
    }

    static {
        v22 v22Var = new v22();
        zzhxk = v22Var;
        l92.w(v22.class, v22Var);
    }

    private v22() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(z22 z22Var) {
        z22Var.getClass();
        this.zzhxj = z22Var;
    }

    public static a Q() {
        return zzhxk.z();
    }

    public static v22 S(a82 a82Var, y82 y82Var) throws w92 {
        return (v22) l92.m(zzhxk, a82Var, y82Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(a82 a82Var) {
        a82Var.getClass();
        this.zzhwr = a82Var;
    }

    public final int H() {
        return this.zzhwq;
    }

    public final a82 N() {
        return this.zzhwr;
    }

    public final z22 O() {
        z22 z22Var = this.zzhxj;
        return z22Var == null ? z22.I() : z22Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        u22 u22Var = null;
        switch (u22.f5472a[r2 - 1]) {
            case 1:
                return new v22();
            case 2:
                return new a(u22Var);
            case 3:
                return l92.u(zzhxk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhwq", "zzhxj", "zzhwr"});
            case 4:
                return zzhxk;
            case 5:
                kb2<v22> aVar = zzel;
                if (aVar == null) {
                    synchronized (v22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxk);
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
