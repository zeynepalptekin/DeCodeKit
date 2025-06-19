package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, u> f536a = new HashMap<>();

    public final void a() {
        Iterator<u> it = this.f536a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f536a.clear();
    }

    final u b(String str) {
        return this.f536a.get(str);
    }

    Set<String> c() {
        return new HashSet(this.f536a.keySet());
    }

    final void d(String str, u uVar) {
        u uVarPut = this.f536a.put(str, uVar);
        if (uVarPut != null) {
            uVarPut.d();
        }
    }
}
