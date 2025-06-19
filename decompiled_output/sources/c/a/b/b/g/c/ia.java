package c.a.b.b.g.c;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class ia {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f1728a = Logger.getLogger(ia.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f1729b = t();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f1730c = r5.c();
    private static final boolean d = B(Long.TYPE);
    private static final boolean e = B(Integer.TYPE);
    private static final d f;
    private static final boolean g;
    private static final boolean h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final long v;
    private static final int w;
    static final boolean x;

    private static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final byte a(Object obj, long j) {
            return ia.x ? ia.L(obj, j) : ia.M(obj, j);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void b(Object obj, long j, byte b2) {
            if (ia.x) {
                ia.u(obj, j, b2);
            } else {
                ia.y(obj, j, b2);
            }
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void g(Object obj, long j, boolean z) {
            if (ia.x) {
                ia.z(obj, j, z);
            } else {
                ia.D(obj, j, z);
            }
        }

        @Override // c.a.b.b.g.c.ia.d
        public final boolean h(Object obj, long j) {
            return ia.x ? ia.N(obj, j) : ia.O(obj, j);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // c.a.b.b.g.c.ia.d
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    private static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final byte a(Object obj, long j) {
            return this.f1731a.getByte(obj, j);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void b(Object obj, long j, byte b2) {
            this.f1731a.putByte(obj, j, b2);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void c(Object obj, long j, double d) {
            this.f1731a.putDouble(obj, j, d);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void d(Object obj, long j, float f) {
            this.f1731a.putFloat(obj, j, f);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void g(Object obj, long j, boolean z) {
            this.f1731a.putBoolean(obj, j, z);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final boolean h(Object obj, long j) {
            return this.f1731a.getBoolean(obj, j);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final float i(Object obj, long j) {
            return this.f1731a.getFloat(obj, j);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final double j(Object obj, long j) {
            return this.f1731a.getDouble(obj, j);
        }
    }

    private static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final byte a(Object obj, long j) {
            return ia.x ? ia.L(obj, j) : ia.M(obj, j);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void b(Object obj, long j, byte b2) {
            if (ia.x) {
                ia.u(obj, j, b2);
            } else {
                ia.y(obj, j, b2);
            }
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void c(Object obj, long j, double d) {
            f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // c.a.b.b.g.c.ia.d
        public final void g(Object obj, long j, boolean z) {
            if (ia.x) {
                ia.z(obj, j, z);
            } else {
                ia.D(obj, j, z);
            }
        }

        @Override // c.a.b.b.g.c.ia.d
        public final boolean h(Object obj, long j) {
            return ia.x ? ia.N(obj, j) : ia.O(obj, j);
        }

        @Override // c.a.b.b.g.c.ia.d
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // c.a.b.b.g.c.ia.d
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    private static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f1731a;

        d(Unsafe unsafe) {
            this.f1731a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void b(Object obj, long j, byte b2);

        public abstract void c(Object obj, long j, double d);

        public abstract void d(Object obj, long j, float f);

        public final void e(Object obj, long j, int r5) {
            this.f1731a.putInt(obj, j, r5);
        }

        public final void f(Object obj, long j, long j2) {
            this.f1731a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public abstract boolean h(Object obj, long j);

        public abstract float i(Object obj, long j);

        public abstract double j(Object obj, long j);

        public final int k(Object obj, long j) {
            return this.f1731a.getInt(obj, j);
        }

        public final long l(Object obj, long j) {
            return this.f1731a.getLong(obj, j);
        }
    }

    static {
        d dVar;
        d bVar = null;
        if (f1729b != null) {
            if (!r5.b()) {
                bVar = new b(f1729b);
            } else if (d) {
                bVar = new c(f1729b);
            } else if (e) {
                bVar = new a(f1729b);
            }
        }
        f = bVar;
        g = E();
        h = A();
        i = n(byte[].class);
        j = n(boolean[].class);
        k = s(boolean[].class);
        l = n(int[].class);
        m = s(int[].class);
        n = n(long[].class);
        o = s(long[].class);
        p = n(float[].class);
        q = s(float[].class);
        r = n(double[].class);
        s = s(double[].class);
        t = n(Object[].class);
        u = s(Object[].class);
        Field fieldG = G();
        v = (fieldG == null || (dVar = f) == null) ? -1L : dVar.f1731a.objectFieldOffset(fieldG);
        w = (int) (i & 7);
        x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private ia() {
    }

    private static boolean A() {
        Unsafe unsafe = f1729b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (r5.b()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f1728a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        if (!r5.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f1730c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static double C(Object obj, long j2) {
        return f.j(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Object obj, long j2, boolean z) {
        y(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    private static boolean E() {
        Unsafe unsafe = f1729b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (G() == null) {
                return false;
            }
            if (r5.b()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f1728a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static Object F(Object obj, long j2) {
        return f.f1731a.getObject(obj, j2);
    }

    private static Field G() {
        Field fieldD;
        if (r5.b() && (fieldD = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte L(Object obj, long j2) {
        return (byte) (b(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte M(Object obj, long j2) {
        return (byte) (b(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(Object obj, long j2) {
        return L(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(Object obj, long j2) {
        return M(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f.a(bArr, i + j2);
    }

    static int b(Object obj, long j2) {
        return f.k(obj, j2);
    }

    static <T> T c(Class<T> cls) {
        try {
            return (T) f1729b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j2, double d2) {
        f.c(obj, j2, d2);
    }

    static void g(Object obj, long j2, float f2) {
        f.d(obj, j2, f2);
    }

    static void h(Object obj, long j2, int r4) {
        f.e(obj, j2, r4);
    }

    static void i(Object obj, long j2, long j3) {
        f.f(obj, j2, j3);
    }

    static void j(Object obj, long j2, Object obj2) {
        f.f1731a.putObject(obj, j2, obj2);
    }

    static void k(Object obj, long j2, boolean z) {
        f.g(obj, j2, z);
    }

    static void l(byte[] bArr, long j2, byte b2) {
        f.b(bArr, i + j2, b2);
    }

    static boolean m() {
        return h;
    }

    private static int n(Class<?> cls) {
        if (h) {
            return f.f1731a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j2) {
        return f.l(obj, j2);
    }

    static boolean r() {
        return g;
    }

    private static int s(Class<?> cls) {
        if (h) {
            return f.f1731a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ka());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int r2 = b(obj, j3);
        int r5 = ((~((int) j2)) & 3) << 3;
        h(obj, j3, ((255 & b2) << r5) | (r2 & (~(255 << r5))));
    }

    static boolean w(Object obj, long j2) {
        return f.h(obj, j2);
    }

    static float x(Object obj, long j2) {
        return f.i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int r5 = (((int) j2) & 3) << 3;
        h(obj, j3, ((255 & b2) << r5) | (b(obj, j3) & (~(255 << r5))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Object obj, long j2, boolean z) {
        u(obj, j2, z ? (byte) 1 : (byte) 0);
    }
}
