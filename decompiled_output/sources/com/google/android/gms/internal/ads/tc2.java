package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class tc2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f5385a = Logger.getLogger(tc2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f5386b = o();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f5387c = t72.b();
    private static final boolean d = C(Long.TYPE);
    private static final boolean e = C(Integer.TYPE);
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

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void a(Object obj, long j, double d) {
            c(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void b(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void d(Object obj, long j, boolean z) {
            if (tc2.x) {
                tc2.l(obj, j, z);
            } else {
                tc2.t(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void f(Object obj, long j, byte b2) {
            if (tc2.x) {
                tc2.b(obj, j, b2);
            } else {
                tc2.j(obj, j, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final boolean i(Object obj, long j) {
            return tc2.x ? tc2.J(obj, j) : tc2.K(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final byte l(Object obj, long j) {
            return tc2.x ? tc2.H(obj, j) : tc2.I(obj, j);
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void a(Object obj, long j, double d) {
            this.f5388a.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void b(Object obj, long j, float f) {
            this.f5388a.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void d(Object obj, long j, boolean z) {
            this.f5388a.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void f(Object obj, long j, byte b2) {
            this.f5388a.putByte(obj, j, b2);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final boolean i(Object obj, long j) {
            return this.f5388a.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final float j(Object obj, long j) {
            return this.f5388a.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final double k(Object obj, long j) {
            return this.f5388a.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final byte l(Object obj, long j) {
            return this.f5388a.getByte(obj, j);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void a(Object obj, long j, double d) {
            c(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void b(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void d(Object obj, long j, boolean z) {
            if (tc2.x) {
                tc2.l(obj, j, z);
            } else {
                tc2.t(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final void f(Object obj, long j, byte b2) {
            if (tc2.x) {
                tc2.b(obj, j, b2);
            } else {
                tc2.j(obj, j, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final boolean i(Object obj, long j) {
            return tc2.x ? tc2.J(obj, j) : tc2.K(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.tc2.d
        public final byte l(Object obj, long j) {
            return tc2.x ? tc2.H(obj, j) : tc2.I(obj, j);
        }
    }

    static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f5388a;

        d(Unsafe unsafe) {
            this.f5388a = unsafe;
        }

        public abstract void a(Object obj, long j, double d);

        public abstract void b(Object obj, long j, float f);

        public final void c(Object obj, long j, long j2) {
            this.f5388a.putLong(obj, j, j2);
        }

        public abstract void d(Object obj, long j, boolean z);

        public final void e(Object obj, long j, int r5) {
            this.f5388a.putInt(obj, j, r5);
        }

        public abstract void f(Object obj, long j, byte b2);

        public final int g(Object obj, long j) {
            return this.f5388a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.f5388a.getLong(obj, j);
        }

        public abstract boolean i(Object obj, long j);

        public abstract float j(Object obj, long j);

        public abstract double k(Object obj, long j);

        public abstract byte l(Object obj, long j);
    }

    static {
        d dVar;
        d bVar = null;
        if (f5386b != null) {
            if (!t72.a()) {
                bVar = new b(f5386b);
            } else if (d) {
                bVar = new c(f5386b);
            } else if (e) {
                bVar = new a(f5386b);
            }
        }
        f = bVar;
        g = q();
        h = p();
        i = y(byte[].class);
        j = y(boolean[].class);
        k = A(boolean[].class);
        l = y(int[].class);
        m = A(int[].class);
        n = y(long[].class);
        o = A(long[].class);
        p = y(float[].class);
        q = A(float[].class);
        r = y(double[].class);
        s = A(double[].class);
        t = y(Object[].class);
        u = A(Object[].class);
        Field fieldR = r();
        v = (fieldR == null || (dVar = f) == null) ? -1L : dVar.f5388a.objectFieldOffset(fieldR);
        w = (int) (i & 7);
        x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private tc2() {
    }

    private static int A(Class<?> cls) {
        if (h) {
            return f.f5388a.arrayIndexScale(cls);
        }
        return -1;
    }

    static long B(Object obj, long j2) {
        return f.h(obj, j2);
    }

    private static boolean C(Class<?> cls) {
        if (!t72.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f5387c;
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

    static boolean D(Object obj, long j2) {
        return f.i(obj, j2);
    }

    static float E(Object obj, long j2) {
        return f.j(obj, j2);
    }

    static double F(Object obj, long j2) {
        return f.k(obj, j2);
    }

    static Object G(Object obj, long j2) {
        return f.f5388a.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte H(Object obj, long j2) {
        return (byte) (z(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte I(Object obj, long j2) {
        return (byte) (z(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J(Object obj, long j2) {
        return H(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean K(Object obj, long j2) {
        return I(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f.l(bArr, i + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int r2 = z(obj, j3);
        int r5 = ((~((int) j2)) & 3) << 3;
        k(obj, j3, ((255 & b2) << r5) | (r2 & (~(255 << r5))));
    }

    static void c(Object obj, long j2, double d2) {
        f.a(obj, j2, d2);
    }

    static void d(Object obj, long j2, float f2) {
        f.b(obj, j2, f2);
    }

    static void e(Object obj, long j2, long j3) {
        f.c(obj, j2, j3);
    }

    static void f(Object obj, long j2, Object obj2) {
        f.f5388a.putObject(obj, j2, obj2);
    }

    static void g(Object obj, long j2, boolean z) {
        f.d(obj, j2, z);
    }

    static void h(byte[] bArr, long j2, byte b2) {
        f.f(bArr, i + j2, b2);
    }

    private static Field i(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int r5 = (((int) j2) & 3) << 3;
        k(obj, j3, ((255 & b2) << r5) | (z(obj, j3) & (~(255 << r5))));
    }

    static void k(Object obj, long j2, int r4) {
        f.e(obj, j2, r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    static boolean m() {
        return h;
    }

    static boolean n() {
        return g;
    }

    static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new vc2());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean p() {
        Unsafe unsafe = f5386b;
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
            if (t72.a()) {
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
            Logger logger = f5385a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean q() {
        Unsafe unsafe = f5386b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (r() == null) {
                return false;
            }
            if (t72.a()) {
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
            Logger logger = f5385a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field r() {
        Field fieldI;
        if (t72.a() && (fieldI = i(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldI;
        }
        Field fieldI2 = i(Buffer.class, "address");
        if (fieldI2 == null || fieldI2.getType() != Long.TYPE) {
            return null;
        }
        return fieldI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(Object obj, long j2, boolean z) {
        j(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    static <T> T x(Class<T> cls) {
        try {
            return (T) f5386b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int y(Class<?> cls) {
        if (h) {
            return f.f5388a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int z(Object obj, long j2) {
        return f.g(obj, j2);
    }
}
