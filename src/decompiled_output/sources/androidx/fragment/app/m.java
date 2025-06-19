package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class m extends androidx.lifecycle.u {
    private static final v.b i = new a();
    private final boolean f;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<Fragment> f457c = new HashSet<>();
    private final HashMap<String, m> d = new HashMap<>();
    private final HashMap<String, androidx.lifecycle.w> e = new HashMap<>();
    private boolean g = false;
    private boolean h = false;

    static class a implements v.b {
        a() {
        }

        @Override // androidx.lifecycle.v.b
        @h0
        public <T extends androidx.lifecycle.u> T a(@h0 Class<T> cls) {
            return new m(true);
        }
    }

    m(boolean z) {
        this.f = z;
    }

    @h0
    static m i(androidx.lifecycle.w wVar) {
        return (m) new androidx.lifecycle.v(wVar, i).a(m.class);
    }

    @Override // androidx.lifecycle.u
    protected void d() {
        if (j.L) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f457c.equals(mVar.f457c) && this.d.equals(mVar.d) && this.e.equals(mVar.e);
    }

    boolean f(@h0 Fragment fragment) {
        return this.f457c.add(fragment);
    }

    void g(@h0 Fragment fragment) {
        if (j.L) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m mVar = this.d.get(fragment.h);
        if (mVar != null) {
            mVar.d();
            this.d.remove(fragment.h);
        }
        androidx.lifecycle.w wVar = this.e.get(fragment.h);
        if (wVar != null) {
            wVar.a();
            this.e.remove(fragment.h);
        }
    }

    @h0
    m h(@h0 Fragment fragment) {
        m mVar = this.d.get(fragment.h);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this.f);
        this.d.put(fragment.h, mVar2);
        return mVar2;
    }

    public int hashCode() {
        return (((this.f457c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @h0
    Collection<Fragment> j() {
        return this.f457c;
    }

    @i0
    @Deprecated
    k k() {
        if (this.f457c.isEmpty() && this.d.isEmpty() && this.e.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, m> entry : this.d.entrySet()) {
            k kVarK = entry.getValue().k();
            if (kVarK != null) {
                map.put(entry.getKey(), kVarK);
            }
        }
        this.h = true;
        if (this.f457c.isEmpty() && map.isEmpty() && this.e.isEmpty()) {
            return null;
        }
        return new k(new ArrayList(this.f457c), map, new HashMap(this.e));
    }

    @h0
    androidx.lifecycle.w l(@h0 Fragment fragment) {
        androidx.lifecycle.w wVar = this.e.get(fragment.h);
        if (wVar != null) {
            return wVar;
        }
        androidx.lifecycle.w wVar2 = new androidx.lifecycle.w();
        this.e.put(fragment.h, wVar2);
        return wVar2;
    }

    boolean m() {
        return this.g;
    }

    boolean n(@h0 Fragment fragment) {
        return this.f457c.remove(fragment);
    }

    @Deprecated
    void o(@i0 k kVar) {
        this.f457c.clear();
        this.d.clear();
        this.e.clear();
        if (kVar != null) {
            Collection<Fragment> collectionB = kVar.b();
            if (collectionB != null) {
                this.f457c.addAll(collectionB);
            }
            Map<String, k> mapA = kVar.a();
            if (mapA != null) {
                for (Map.Entry<String, k> entry : mapA.entrySet()) {
                    m mVar = new m(this.f);
                    mVar.o(entry.getValue());
                    this.d.put(entry.getKey(), mVar);
                }
            }
            Map<String, androidx.lifecycle.w> mapC = kVar.c();
            if (mapC != null) {
                this.e.putAll(mapC);
            }
        }
        this.h = false;
    }

    boolean p(@h0 Fragment fragment) {
        if (this.f457c.contains(fragment)) {
            return this.f ? this.g : !this.h;
        }
        return true;
    }

    @h0
    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f457c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
