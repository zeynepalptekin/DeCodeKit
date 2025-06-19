package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class s32 extends l92<s32, a> implements za2 {
    private static volatile kb2<s32> zzel;
    private static final s32 zzhyg;
    private int zzhwq;
    private a82 zzhwr = a82.e;
    private t32 zzhyf;

    public static final class a extends l92.b<s32, a> implements za2 {
        private a() {
            super(s32.zzhyg);
        }

        /* synthetic */ a(r32 r32Var) {
            this();
        }

        public final a v(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((s32) this.e).T(a82Var);
            return this;
        }

        public final a w(t32 t32Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((s32) this.e).M(t32Var);
            return this;
        }

        public final a x(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((s32) this.e).I(0);
            return this;
        }
    }

    static {
        s32 s32Var = new s32();
        zzhyg = s32Var;
        l92.w(s32.class, s32Var);
    }

    private s32() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(t32 t32Var) {
        t32Var.getClass();
        this.zzhyf = t32Var;
    }

    public static a Q() {
        return zzhyg.z();
    }

    public static s32 S(a82 a82Var, y82 y82Var) throws w92 {
        return (s32) l92.m(zzhyg, a82Var, y82Var);
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

    public final t32 O() {
        t32 t32Var = this.zzhyf;
        return t32Var == null ? t32.T() : t32Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        r32 r32Var = null;
        switch (r32.f5099a[r2 - 1]) {
            case 1:
                return new s32();
            case 2:
                return new a(r32Var);
            case 3:
                return l92.u(zzhyg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhwq", "zzhyf", "zzhwr"});
            case 4:
                return zzhyg;
            case 5:
                kb2<s32> aVar = zzel;
                if (aVar == null) {
                    synchronized (s32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhyg);
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
