package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.savedstate.Recreator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {
    private static final String f = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* renamed from: b, reason: collision with root package name */
    @i0
    private Bundle f751b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f752c;
    private Recreator.a d;

    /* renamed from: a, reason: collision with root package name */
    private b.b.a.c.b<String, b> f750a = new b.b.a.c.b<>();
    boolean e = true;

    public interface a {
        void a(@h0 c cVar);
    }

    public interface b {
        @h0
        Bundle a();
    }

    SavedStateRegistry() {
    }

    @i0
    @e0
    public Bundle a(@h0 String str) {
        if (!this.f752c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f751b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f751b.remove(str);
        if (this.f751b.isEmpty()) {
            this.f751b = null;
        }
        return bundle2;
    }

    @e0
    public boolean b() {
        return this.f752c;
    }

    @e0
    void c(@h0 g gVar, @i0 Bundle bundle) {
        if (this.f752c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f751b = bundle.getBundle(f);
        }
        gVar.a(new f() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.h
            public void d(j jVar, g.a aVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z;
                if (aVar == g.a.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z = true;
                } else {
                    if (aVar != g.a.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z = false;
                }
                savedStateRegistry.e = z;
            }
        });
        this.f752c = true;
    }

    @e0
    void d(@h0 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f751b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.b.a.c.b<String, b>.d dVarJ = this.f750a.j();
        while (dVarJ.hasNext()) {
            Map.Entry next = dVarJ.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle(f, bundle2);
    }

    @e0
    public void e(@h0 String str, @h0 b bVar) {
        if (this.f750a.o(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @e0
    public void f(@h0 Class<? extends a> cls) throws NoSuchMethodException, SecurityException {
        if (!this.e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.d == null) {
            this.d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.d.b(cls.getName());
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @e0
    public void g(@h0 String str) {
        this.f750a.r(str);
    }
}
