package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f756a = "a";

    private c() {
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static <T extends h> T a(InputStream inputStream) {
        return (T) new g(inputStream, null).g0();
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static <T extends h> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @i0
    public static <T extends h> T c(@h0 Bundle bundle, @h0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(c.class.getClassLoader());
            return (T) b(bundle2.getParcelable(f756a));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @i0
    public static <T extends h> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(c.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList(f756a).iterator();
            while (it.hasNext()) {
                arrayList.add(b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(@h0 Bundle bundle, @h0 String str, @i0 h hVar) {
        if (hVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(f756a, h(hVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void f(@h0 Bundle bundle, @h0 String str, @h0 List<? extends h> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next()));
        }
        bundle2.putParcelableArrayList(f756a, arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static void g(h hVar, OutputStream outputStream) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g gVar = new g(null, outputStream);
        gVar.l1(hVar);
        gVar.a();
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Parcelable h(h hVar) {
        return new ParcelImpl(hVar);
    }
}
