package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class j42 extends l92<j42, b> implements za2 {
    private static volatile kb2<j42> zzel;
    private static final j42 zzhzk;
    private String zzhzh = "";
    private a82 zzhzi = a82.e;
    private int zzhzj;

    public enum a implements r92 {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private static final q92<a> k = new l42();
        private final int d;

        a(int r3) {
            this.d = r3;
        }

        public static a e(int r1) {
            if (r1 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (r1 == 1) {
                return SYMMETRIC;
            }
            if (r1 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (r1 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (r1 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.android.gms.internal.ads.r92
        public final int h() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(a.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(h());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class b extends l92.b<j42, b> implements za2 {
        private b() {
            super(j42.zzhzk);
        }

        /* synthetic */ b(i42 i42Var) {
            this();
        }

        public final b v(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((j42) this.e).L(a82Var);
            return this;
        }

        public final b w(a aVar) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((j42) this.e).H(aVar);
            return this;
        }

        public final b x(String str) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((j42) this.e).T(str);
            return this;
        }
    }

    static {
        j42 j42Var = new j42();
        zzhzk = j42Var;
        l92.w(j42.class, j42Var);
    }

    private j42() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(a aVar) {
        this.zzhzj = aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(a82 a82Var) {
        a82Var.getClass();
        this.zzhzi = a82Var;
    }

    public static b Q() {
        return zzhzk.z();
    }

    public static j42 R() {
        return zzhzk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(String str) {
        str.getClass();
        this.zzhzh = str;
    }

    public final String M() {
        return this.zzhzh;
    }

    public final a82 N() {
        return this.zzhzi;
    }

    public final a O() {
        a aVarE = a.e(this.zzhzj);
        return aVarE == null ? a.UNRECOGNIZED : aVarE;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        i42 i42Var = null;
        switch (i42.f3766a[r2 - 1]) {
            case 1:
                return new j42();
            case 2:
                return new b(i42Var);
            case 3:
                return l92.u(zzhzk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhzh", "zzhzi", "zzhzj"});
            case 4:
                return zzhzk;
            case 5:
                kb2<j42> aVar = zzel;
                if (aVar == null) {
                    synchronized (j42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhzk);
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
