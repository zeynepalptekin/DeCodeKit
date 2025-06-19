package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class a32 extends l92<a32, a> implements za2 {
    private static volatile kb2<a32> zzel;
    private static final a32 zzhxn;
    private int zzhwq;
    private a82 zzhwr = a82.e;

    public static final class a extends l92.b<a32, a> implements za2 {
        private a() {
            super(a32.zzhxn);
        }

        /* synthetic */ a(b32 b32Var) {
            this();
        }

        public final a v(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((a32) this.e).I(0);
            return this;
        }

        public final a w(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((a32) this.e).Q(a82Var);
            return this;
        }
    }

    static {
        a32 a32Var = new a32();
        zzhxn = a32Var;
        l92.w(a32.class, a32Var);
    }

    private a32() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    public static a M() {
        return zzhxn.z();
    }

    public static a32 O(a82 a82Var, y82 y82Var) throws w92 {
        return (a32) l92.m(zzhxn, a82Var, y82Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(a82 a82Var) {
        a82Var.getClass();
        this.zzhwr = a82Var;
    }

    public final int H() {
        return this.zzhwq;
    }

    public final a82 L() {
        return this.zzhwr;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        b32 b32Var = null;
        switch (b32.f2789a[r2 - 1]) {
            case 1:
                return new a32();
            case 2:
                return new a(b32Var);
            case 3:
                return l92.u(zzhxn, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhwq", "zzhwr"});
            case 4:
                return zzhxn;
            case 5:
                kb2<a32> aVar = zzel;
                if (aVar == null) {
                    synchronized (a32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxn);
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
