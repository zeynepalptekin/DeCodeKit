package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.h0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class e {
    private static final String d = "VersionedParcel";
    private static final int e = -1;
    private static final int f = -2;
    private static final int g = -3;
    private static final int h = -4;
    private static final int i = -5;
    private static final int j = -6;
    private static final int k = -7;
    private static final int l = -9;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final int r = 7;
    private static final int s = 8;

    /* renamed from: a, reason: collision with root package name */
    protected final b.f.a<String, Method> f757a;

    /* renamed from: b, reason: collision with root package name */
    protected final b.f.a<String, Method> f758b;

    /* renamed from: c, reason: collision with root package name */
    protected final b.f.a<String, Class> f759c;

    class a extends ObjectInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, a.class.getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public static class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    public e(b.f.a<String, Method> aVar, b.f.a<String, Method> aVar2, b.f.a<String, Class> aVar3) {
        this.f757a = aVar;
        this.f758b = aVar2;
        this.f759c = aVar3;
    }

    private <T> void A0(Collection<T> collection) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (collection == null) {
            L0(-1);
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int r0 = g(collection.iterator().next());
            L0(r0);
            switch (r0) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        l1((h) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        W0((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Y0((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        e1((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        g1((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        L0(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        H0(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private <T> void B0(Collection<T> collection, int r2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        i0(r2);
        A0(collection);
    }

    private Exception C(int r1, String str) {
        return b(r1, str);
    }

    private int E() {
        return L();
    }

    private void Y0(Serializable serializable) throws IOException {
        if (serializable == null) {
            e1(null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e2);
        }
    }

    private Exception b(int r4, String str) {
        switch (r4) {
            case l /* -9 */:
                return (Exception) V();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + r4 + " msg " + str);
            case k /* -7 */:
                return new UnsupportedOperationException(str);
            case j /* -6 */:
                return new NetworkOnMainThreadException();
            case i /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class d(Class<? extends h> cls) throws ClassNotFoundException {
        Class cls2 = this.f759c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f759c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method e(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = this.f757a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, e.class.getClassLoader()).getDeclaredMethod("read", e.class);
        this.f757a.put(str, declaredMethod);
        return declaredMethod;
    }

    @h0
    protected static Throwable f(@h0 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int g(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof h) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.f758b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsD = d(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsD.getDeclaredMethod("write", cls, e.class);
        this.f758b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n1(h hVar) {
        try {
            e1(d(hVar.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(hVar.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    private <T, S extends Collection<T>> S x(S s2) {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        if (r0 != 0) {
            int r2 = L();
            if (r0 < 0) {
                return null;
            }
            if (r2 == 1) {
                while (r0 > 0) {
                    s2.add(g0());
                    r0--;
                }
            } else if (r2 == 2) {
                while (r0 > 0) {
                    s2.add(V());
                    r0--;
                }
            } else if (r2 == 3) {
                while (r0 > 0) {
                    s2.add(X());
                    r0--;
                }
            } else if (r2 == 4) {
                while (r0 > 0) {
                    s2.add(c0());
                    r0--;
                }
            } else if (r2 == 5) {
                while (r0 > 0) {
                    s2.add(e0());
                    r0--;
                }
            }
        }
        return s2;
    }

    protected double[] A() {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        double[] dArr = new double[r0];
        for (int r2 = 0; r2 < r0; r2++) {
            dArr[r2] = y();
        }
        return dArr;
    }

    public double[] B(double[] dArr, int r2) {
        return !F(r2) ? dArr : A();
    }

    protected abstract void C0(double d2);

    public Exception D(Exception exc, int r2) {
        int r22;
        return (F(r2) && (r22 = E()) != 0) ? C(r22, c0()) : exc;
    }

    public void D0(double d2, int r3) {
        i0(r3);
        C0(d2);
    }

    protected void E0(double[] dArr) {
        if (dArr == null) {
            L0(-1);
            return;
        }
        L0(dArr.length);
        for (double d2 : dArr) {
            C0(d2);
        }
    }

    protected abstract boolean F(int r1);

    public void F0(double[] dArr, int r2) {
        i0(r2);
        E0(dArr);
    }

    protected abstract float G();

    /* JADX WARN: Multi-variable type inference failed */
    public void G0(Exception exc, int r5) {
        i0(r5);
        if (exc == 0) {
            V0();
            return;
        }
        int r52 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            r52 = l;
        } else if (exc instanceof SecurityException) {
            r52 = -1;
        } else if (exc instanceof BadParcelableException) {
            r52 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            r52 = -3;
        } else if (exc instanceof NullPointerException) {
            r52 = -4;
        } else if (exc instanceof IllegalStateException) {
            r52 = i;
        } else if (exc instanceof NetworkOnMainThreadException) {
            r52 = j;
        } else if (exc instanceof UnsupportedOperationException) {
            r52 = k;
        }
        L0(r52);
        if (r52 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        e1(exc.getMessage());
        if (r52 != l) {
            return;
        }
        W0((Parcelable) exc);
    }

    public float H(float f2, int r2) {
        return !F(r2) ? f2 : G();
    }

    protected abstract void H0(float f2);

    protected float[] I() {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        float[] fArr = new float[r0];
        for (int r2 = 0; r2 < r0; r2++) {
            fArr[r2] = G();
        }
        return fArr;
    }

    public void I0(float f2, int r2) {
        i0(r2);
        H0(f2);
    }

    public float[] J(float[] fArr, int r2) {
        return !F(r2) ? fArr : I();
    }

    protected void J0(float[] fArr) {
        if (fArr == null) {
            L0(-1);
            return;
        }
        L0(fArr.length);
        for (float f2 : fArr) {
            H0(f2);
        }
    }

    protected <T extends h> T K(String str, e eVar) {
        try {
            return (T) e(str).invoke(null, eVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public void K0(float[] fArr, int r2) {
        i0(r2);
        J0(fArr);
    }

    protected abstract int L();

    protected abstract void L0(int r1);

    public int M(int r1, int r2) {
        return !F(r2) ? r1 : L();
    }

    public void M0(int r1, int r2) {
        i0(r2);
        L0(r1);
    }

    protected int[] N() {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        int[] r1 = new int[r0];
        for (int r2 = 0; r2 < r0; r2++) {
            r1[r2] = L();
        }
        return r1;
    }

    protected void N0(int[] r4) {
        if (r4 == null) {
            L0(-1);
            return;
        }
        L0(r4.length);
        for (int r0 : r4) {
            L0(r0);
        }
    }

    public int[] O(int[] r1, int r2) {
        return !F(r2) ? r1 : N();
    }

    public void O0(int[] r1, int r2) {
        i0(r2);
        N0(r1);
    }

    public <T> List<T> P(List<T> list, int r2) {
        return !F(r2) ? list : (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int r2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        B0(list, r2);
    }

    protected abstract long Q();

    protected abstract void Q0(long j2);

    public long R(long j2, int r3) {
        return !F(r3) ? j2 : Q();
    }

    public void R0(long j2, int r3) {
        i0(r3);
        Q0(j2);
    }

    protected long[] S() {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        long[] jArr = new long[r0];
        for (int r2 = 0; r2 < r0; r2++) {
            jArr[r2] = Q();
        }
        return jArr;
    }

    protected void S0(long[] jArr) {
        if (jArr == null) {
            L0(-1);
            return;
        }
        L0(jArr.length);
        for (long j2 : jArr) {
            Q0(j2);
        }
    }

    public long[] T(long[] jArr, int r2) {
        return !F(r2) ? jArr : S();
    }

    public void T0(long[] jArr, int r2) {
        i0(r2);
        S0(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> U(Map<K, V> map, int r7) {
        if (!F(r7)) {
            return map;
        }
        int r6 = L();
        if (r6 < 0) {
            return null;
        }
        b.f.a aVar = new b.f.a();
        if (r6 == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x(arrayList);
        x(arrayList2);
        for (int r2 = 0; r2 < r6; r2++) {
            aVar.put(arrayList.get(r2), arrayList2.get(r2));
        }
        return aVar;
    }

    public <K, V> void U0(Map<K, V> map, int r5) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        i0(r5);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        A0(arrayList);
        A0(arrayList2);
    }

    protected abstract <T extends Parcelable> T V();

    protected void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t, int r2) {
        return !F(r2) ? t : (T) V();
    }

    protected abstract void W0(Parcelable parcelable);

    protected Serializable X() {
        String strC0 = c0();
        if (strC0 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e2) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + strC0 + ")", e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + strC0 + ")", e3);
        }
    }

    public void X0(Parcelable parcelable, int r2) {
        i0(r2);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int r2) {
        return !F(r2) ? set : (Set) x(new b.f.b());
    }

    @m0(api = 21)
    public Size Z(Size size, int r3) {
        if (!F(r3)) {
            return size;
        }
        if (l()) {
            return new Size(L(), L());
        }
        return null;
    }

    public void Z0(Serializable serializable, int r2) throws IOException {
        i0(r2);
        Y0(serializable);
    }

    protected abstract void a();

    @m0(api = 21)
    public SizeF a0(SizeF sizeF, int r3) {
        if (!F(r3)) {
            return sizeF;
        }
        if (l()) {
            return new SizeF(G(), G());
        }
        return null;
    }

    public <T> void a1(Set<T> set, int r2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        B0(set, r2);
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int r5) {
        if (!F(r5)) {
            return sparseBooleanArray;
        }
        int r4 = L();
        if (r4 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(r4);
        for (int r0 = 0; r0 < r4; r0++) {
            sparseBooleanArray2.put(L(), l());
        }
        return sparseBooleanArray2;
    }

    @m0(api = 21)
    public void b1(Size size, int r2) {
        i0(r2);
        m0(size != null);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    protected abstract e c();

    protected abstract String c0();

    @m0(api = 21)
    public void c1(SizeF sizeF, int r2) {
        i0(r2);
        m0(sizeF != null);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public String d0(String str, int r2) {
        return !F(r2) ? str : c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int r4) {
        i0(r4);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int r0 = 0; r0 < size; r0++) {
            L0(sparseBooleanArray.keyAt(r0));
            m0(sparseBooleanArray.valueAt(r0));
        }
    }

    protected abstract IBinder e0();

    protected abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int r2) {
        return !F(r2) ? iBinder : e0();
    }

    public void f1(String str, int r2) {
        i0(r2);
        e1(str);
    }

    protected <T extends h> T g0() {
        String strC0 = c0();
        if (strC0 == null) {
            return null;
        }
        return (T) K(strC0, c());
    }

    protected abstract void g1(IBinder iBinder);

    public <T extends h> T h0(T t, int r2) {
        return !F(r2) ? t : (T) g0();
    }

    public void h1(IBinder iBinder, int r2) {
        i0(r2);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    protected abstract void i0(int r1);

    protected abstract void i1(IInterface iInterface);

    protected <T> T[] j(T[] tArr) {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r0);
        if (r0 != 0) {
            int r3 = L();
            if (r0 < 0) {
                return null;
            }
            if (r3 == 1) {
                while (r0 > 0) {
                    arrayList.add(g0());
                    r0--;
                }
            } else if (r3 == 2) {
                while (r0 > 0) {
                    arrayList.add(V());
                    r0--;
                }
            } else if (r3 == 3) {
                while (r0 > 0) {
                    arrayList.add(X());
                    r0--;
                }
            } else if (r3 == 4) {
                while (r0 > 0) {
                    arrayList.add(c0());
                    r0--;
                }
            } else if (r3 == 5) {
                while (r0 > 0) {
                    arrayList.add(e0());
                    r0--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public void j0(boolean z, boolean z2) {
    }

    public void j1(IInterface iInterface, int r2) {
        i0(r2);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int r2) {
        return !F(r2) ? tArr : (T[]) j(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void k0(T[] tArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (tArr == 0) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int r1 = 0;
            int r2 = g(tArr[0]);
            L0(r2);
            if (r2 == 1) {
                while (r1 < length) {
                    l1((h) tArr[r1]);
                    r1++;
                }
                return;
            }
            if (r2 == 2) {
                while (r1 < length) {
                    W0((Parcelable) tArr[r1]);
                    r1++;
                }
                return;
            }
            if (r2 == 3) {
                while (r1 < length) {
                    Y0((Serializable) tArr[r1]);
                    r1++;
                }
            } else if (r2 == 4) {
                while (r1 < length) {
                    e1((String) tArr[r1]);
                    r1++;
                }
            } else {
                if (r2 != 5) {
                    return;
                }
                while (r1 < length) {
                    g1((IBinder) tArr[r1]);
                    r1++;
                }
            }
        }
    }

    protected <T extends h> void k1(T t, e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            h(t.getClass()).invoke(null, t, eVar);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (!(e5.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
            }
            throw ((RuntimeException) e5.getCause());
        }
    }

    protected abstract boolean l();

    public <T> void l0(T[] tArr, int r2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        i0(r2);
        k0(tArr);
    }

    protected void l1(h hVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (hVar == null) {
            e1(null);
            return;
        }
        n1(hVar);
        e eVarC = c();
        k1(hVar, eVarC);
        eVarC.a();
    }

    public boolean m(boolean z, int r2) {
        return !F(r2) ? z : l();
    }

    protected abstract void m0(boolean z);

    public void m1(h hVar, int r2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        i0(r2);
        l1(hVar);
    }

    protected boolean[] n() {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[r0];
        for (int r3 = 0; r3 < r0; r3++) {
            zArr[r3] = L() != 0;
        }
        return zArr;
    }

    public void n0(boolean z, int r2) {
        i0(r2);
        m0(z);
    }

    public boolean[] o(boolean[] zArr, int r2) {
        return !F(r2) ? zArr : n();
    }

    protected void o0(boolean[] zArr) {
        if (zArr == null) {
            L0(-1);
            return;
        }
        L0(zArr.length);
        for (boolean z : zArr) {
            L0(z ? 1 : 0);
        }
    }

    protected abstract Bundle p();

    public void p0(boolean[] zArr, int r2) {
        i0(r2);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int r2) {
        return !F(r2) ? bundle : p();
    }

    protected abstract void q0(Bundle bundle);

    public byte r(byte b2, int r2) {
        return !F(r2) ? b2 : (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int r2) {
        i0(r2);
        q0(bundle);
    }

    protected abstract byte[] s();

    public void s0(byte b2, int r2) {
        i0(r2);
        L0(b2);
    }

    public byte[] t(byte[] bArr, int r2) {
        return !F(r2) ? bArr : s();
    }

    protected abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int r4) {
        if (!F(r4)) {
            return cArr;
        }
        int r3 = L();
        if (r3 < 0) {
            return null;
        }
        char[] cArr2 = new char[r3];
        for (int r0 = 0; r0 < r3; r0++) {
            cArr2[r0] = (char) L();
        }
        return cArr2;
    }

    public void u0(byte[] bArr, int r2) {
        i0(r2);
        t0(bArr);
    }

    protected abstract CharSequence v();

    protected abstract void v0(byte[] bArr, int r2, int r3);

    public CharSequence w(CharSequence charSequence, int r2) {
        return !F(r2) ? charSequence : v();
    }

    public void w0(byte[] bArr, int r2, int r3, int r4) {
        i0(r4);
        v0(bArr, r2, r3);
    }

    public void x0(char[] cArr, int r4) {
        i0(r4);
        if (cArr == null) {
            L0(-1);
            return;
        }
        L0(cArr.length);
        for (char c2 : cArr) {
            L0(c2);
        }
    }

    protected abstract double y();

    protected abstract void y0(CharSequence charSequence);

    public double z(double d2, int r3) {
        return !F(r3) ? d2 : y();
    }

    public void z0(CharSequence charSequence, int r2) {
        i0(r2);
        y0(charSequence);
    }
}
