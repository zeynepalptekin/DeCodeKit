package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.h0;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class Recreator implements f {

    /* renamed from: b, reason: collision with root package name */
    static final String f746b = "classes_to_restore";

    /* renamed from: c, reason: collision with root package name */
    static final String f747c = "androidx.savedstate.Restarter";

    /* renamed from: a, reason: collision with root package name */
    private final c f748a;

    static final class a implements SavedStateRegistry.b {

        /* renamed from: a, reason: collision with root package name */
        final Set<String> f749a = new HashSet();

        a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.e(Recreator.f747c, this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @h0
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f746b, new ArrayList<>(this.f749a));
            return bundle;
        }

        void b(String str) {
            this.f749a.add(str);
        }
    }

    Recreator(c cVar) {
        this.f748a = cVar;
    }

    private void h(String str) throws NoSuchMethodException, SecurityException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).a(this.f748a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.h
    public void d(j jVar, g.a aVar) throws NoSuchMethodException, SecurityException {
        if (aVar != g.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        jVar.b().c(this);
        Bundle bundleA = this.f748a.e().a(f747c);
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList(f746b);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }
}
