package c.a.b.b.g.c;

import c.a.b.b.g.c.h7;
import c.a.b.b.g.c.h7.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class h7<MessageType extends h7<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends o5<MessageType, BuilderType> {
    private static Map<Object, h7<?, ?>> zzd = new ConcurrentHashMap();
    protected fa zzb = fa.a();
    private int zzc = -1;

    public static abstract class a<MessageType extends h7<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends n5<MessageType, BuilderType> {
        private final MessageType d;
        protected MessageType e;
        protected boolean f = false;

        protected a(MessageType messagetype) {
            this.d = messagetype;
            this.e = (MessageType) messagetype.r(f.d, null, null);
        }

        private static void r(MessageType messagetype, MessageType messagetype2) {
            f9.a().c(messagetype).j(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // c.a.b.b.g.c.n5
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final BuilderType l(l6 l6Var, u6 u6Var) throws IOException {
            if (this.f) {
                u();
                this.f = false;
            }
            try {
                f9.a().c(this.e).i(this.e, m6.G(l6Var), u6Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        private final BuilderType t(byte[] bArr, int r9, int r10, u6 u6Var) throws q7 {
            if (this.f) {
                u();
                this.f = false;
            }
            try {
                f9.a().c(this.e).d(this.e, bArr, 0, r10, new t5(u6Var));
                return this;
            } catch (q7 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw q7.a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.a.b.b.g.c.n5
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.d.r(f.e, null, null);
            aVar.k((h7) i());
            return aVar;
        }

        @Override // c.a.b.b.g.c.t8
        public final /* synthetic */ r8 g() {
            return this.d;
        }

        @Override // c.a.b.b.g.c.t8
        public final boolean h() {
            return h7.v(this.e, false);
        }

        @Override // c.a.b.b.g.c.n5
        public final /* synthetic */ n5 m(byte[] bArr, int r3, int r4) throws q7 {
            return t(bArr, 0, r4, u6.a());
        }

        @Override // c.a.b.b.g.c.n5
        public final /* synthetic */ n5 n(byte[] bArr, int r2, int r3, u6 u6Var) throws q7 {
            return t(bArr, 0, r3, u6Var);
        }

        @Override // c.a.b.b.g.c.n5
        /* renamed from: p */
        public final /* synthetic */ n5 clone() {
            return (a) clone();
        }

        @Override // c.a.b.b.g.c.n5
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final BuilderType k(MessageType messagetype) {
            if (this.f) {
                u();
                this.f = false;
            }
            r(this.e, messagetype);
            return this;
        }

        protected void u() {
            MessageType messagetype = (MessageType) this.e.r(f.d, null, null);
            r(messagetype, this.e);
            this.e = messagetype;
        }

        @Override // c.a.b.b.g.c.u8
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public MessageType i() {
            if (this.f) {
                return this.e;
            }
            MessageType messagetype = this.e;
            f9.a().c(messagetype).g(messagetype);
            this.f = true;
            return this.e;
        }

        @Override // c.a.b.b.g.c.u8
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public final MessageType j() {
            MessageType messagetype = (MessageType) i();
            if (messagetype.h()) {
                return messagetype;
            }
            throw new da(messagetype);
        }
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends h7<MessageType, BuilderType> implements t8 {
        protected x6<e> zzc = x6.c();

        final x6<e> C() {
            if (this.zzc.o()) {
                this.zzc = (x6) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    protected static class c<T extends h7<T, ?>> extends p5<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f1709b;

        public c(T t) {
            this.f1709b = t;
        }
    }

    public static class d<ContainingType extends r8, Type> extends s6<ContainingType, Type> {
    }

    static final class e implements z6<e> {
        @Override // c.a.b.b.g.c.z6
        public final a9 C(a9 a9Var, a9 a9Var2) {
            throw new NoSuchMethodError();
        }

        @Override // c.a.b.b.g.c.z6
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override // c.a.b.b.g.c.z6
        public final ua b() {
            throw new NoSuchMethodError();
        }

        @Override // c.a.b.b.g.c.z6
        public final xa c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // c.a.b.b.g.c.z6
        public final boolean d() {
            throw new NoSuchMethodError();
        }

        @Override // c.a.b.b.g.c.z6
        public final boolean f() {
            throw new NoSuchMethodError();
        }

        @Override // c.a.b.b.g.c.z6
        public final u8 t(u8 u8Var, r8 r8Var) {
            throw new NoSuchMethodError();
        }
    }

    public enum f {

        /* renamed from: a, reason: collision with root package name */
        public static final int f1710a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f1711b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f1712c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    protected static o7 A() {
        return e8.i();
    }

    protected static <E> r7<E> B() {
        return i9.j();
    }

    static <T extends h7<?, ?>> T o(Class<T> cls) throws ClassNotFoundException {
        h7<?, ?> h7Var = zzd.get(cls);
        if (h7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                h7Var = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (h7Var == null) {
            h7Var = (T) ((h7) ia.c(cls)).r(f.f, null, null);
            if (h7Var == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, h7Var);
        }
        return (T) h7Var;
    }

    protected static o7 p(o7 o7Var) {
        int size = o7Var.size();
        return o7Var.e(size == 0 ? 10 : size << 1);
    }

    protected static <E> r7<E> q(r7<E> r7Var) {
        int size = r7Var.size();
        return r7Var.e(size == 0 ? 10 : size << 1);
    }

    protected static Object s(r8 r8Var, String str, Object[] objArr) {
        return new h9(r8Var, str, objArr);
    }

    static Object t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <T extends h7<?, ?>> void u(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends h7<T, ?>> boolean v(T t, boolean z) {
        byte bByteValue = ((Byte) t.r(f.f1710a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = f9.a().c(t).e(t);
        if (z) {
            t.r(f.f1711b, zE ? t : null, null);
        }
        return zE;
    }

    protected static p7 z() {
        return j7.i();
    }

    @Override // c.a.b.b.g.c.r8
    public final int b() {
        if (this.zzc == -1) {
            this.zzc = f9.a().c(this).c(this);
        }
        return this.zzc;
    }

    @Override // c.a.b.b.g.c.r8
    public final /* synthetic */ u8 c() {
        a aVar = (a) r(f.e, null, null);
        aVar.k(this);
        return aVar;
    }

    @Override // c.a.b.b.g.c.r8
    public final void d(o6 o6Var) throws IOException {
        f9.a().c(this).h(this, r6.P(o6Var));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return f9.a().c(this).f(this, (h7) obj);
        }
        return false;
    }

    @Override // c.a.b.b.g.c.r8
    public final /* synthetic */ u8 f() {
        return (a) r(f.e, null, null);
    }

    @Override // c.a.b.b.g.c.t8
    public final /* synthetic */ r8 g() {
        return (h7) r(f.f, null, null);
    }

    @Override // c.a.b.b.g.c.t8
    public final boolean h() {
        return v(this, true);
    }

    public int hashCode() {
        int r0 = this.zza;
        if (r0 != 0) {
            return r0;
        }
        int r02 = f9.a().c(this).b(this);
        this.zza = r02;
        return r02;
    }

    @Override // c.a.b.b.g.c.o5
    final int m() {
        return this.zzc;
    }

    @Override // c.a.b.b.g.c.o5
    final void n(int r1) {
        this.zzc = r1;
    }

    protected abstract Object r(int r1, Object obj, Object obj2);

    public String toString() {
        return w8.a(this, super.toString());
    }

    protected final <MessageType extends h7<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType w() {
        return (BuilderType) r(f.e, null, null);
    }

    public final BuilderType x() {
        BuilderType buildertype = (BuilderType) r(f.e, null, null);
        buildertype.k(this);
        return buildertype;
    }
}
