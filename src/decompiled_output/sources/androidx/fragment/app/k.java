package androidx.fragment.app;

import androidx.annotation.i0;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    @i0
    private final Collection<Fragment> f454a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    private final Map<String, k> f455b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    private final Map<String, androidx.lifecycle.w> f456c;

    k(@i0 Collection<Fragment> collection, @i0 Map<String, k> map, @i0 Map<String, androidx.lifecycle.w> map2) {
        this.f454a = collection;
        this.f455b = map;
        this.f456c = map2;
    }

    @i0
    Map<String, k> a() {
        return this.f455b;
    }

    @i0
    Collection<Fragment> b() {
        return this.f454a;
    }

    @i0
    Map<String, androidx.lifecycle.w> c() {
        return this.f456c;
    }

    boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f454a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
