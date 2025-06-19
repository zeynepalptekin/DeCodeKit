package c.a.b.b.g.c;

import c.a.b.b.g.c.h7;

/* loaded from: classes.dex */
public final class n1 {

    public static final class a extends h7<a, C0128a> implements t8 {
        private static final a zzd;
        private static volatile e9<a> zze;
        private r7<b> zzc = h7.B();

        /* renamed from: c.a.b.b.g.c.n1$a$a, reason: collision with other inner class name */
        public static final class C0128a extends h7.a<a, C0128a> implements t8 {
            private C0128a() {
                super(a.zzd);
            }

            /* synthetic */ C0128a(o1 o1Var) {
                this();
            }
        }

        static {
            a aVar = new a();
            zzd = aVar;
            h7.u(a.class, aVar);
        }

        private a() {
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            o1 o1Var = null;
            switch (o1.f1781a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0128a(o1Var);
                case 3:
                    return h7.s(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", b.class});
                case 4:
                    return zzd;
                case 5:
                    e9<a> cVar = zze;
                    if (cVar == null) {
                        synchronized (a.class) {
                            cVar = zze;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzd);
                                zze = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class b extends h7<b, C0129b> implements t8 {
        private static final b zzk;
        private static volatile e9<b> zzl;
        private int zzc;
        private int zzd;
        private boolean zzf;
        private long zzg;
        private double zzh;
        private String zze = "";
        private r7<b> zzi = h7.B();
        private String zzj = "";

        public enum a implements k7 {
            UNDEFINED(0),
            NULL(1),
            STRING(2),
            NUMBER(3),
            BOOLEAN(4),
            LIST(5),
            MAP(6),
            STATEMENT(7);

            private static final n7<a> m = new q1();
            private final int d;

            a(int r3) {
                this.d = r3;
            }

            public static a e(int r0) {
                switch (r0) {
                    case 0:
                        return UNDEFINED;
                    case 1:
                        return NULL;
                    case 2:
                        return STRING;
                    case 3:
                        return NUMBER;
                    case 4:
                        return BOOLEAN;
                    case 5:
                        return LIST;
                    case 6:
                        return MAP;
                    case 7:
                        return STATEMENT;
                    default:
                        return null;
                }
            }

            public static m7 g() {
                return p1.f1787a;
            }

            @Override // c.a.b.b.g.c.k7
            public final int a() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        /* renamed from: c.a.b.b.g.c.n1$b$b, reason: collision with other inner class name */
        public static final class C0129b extends h7.a<b, C0129b> implements t8 {
            private C0129b() {
                super(b.zzk);
            }

            /* synthetic */ C0129b(o1 o1Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzk = bVar;
            h7.u(b.class, bVar);
        }

        private b() {
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r3, Object obj, Object obj2) {
            o1 o1Var = null;
            switch (o1.f1781a[r3 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new C0129b(o1Var);
                case 3:
                    return h7.s(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006\u001b\u0007ဈ\u0005", new Object[]{"zzc", "zzd", a.g(), "zze", "zzf", "zzg", "zzh", "zzi", b.class, "zzj"});
                case 4:
                    return zzk;
                case 5:
                    e9<b> cVar = zzl;
                    if (cVar == null) {
                        synchronized (b.class) {
                            cVar = zzl;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzk);
                                zzl = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
