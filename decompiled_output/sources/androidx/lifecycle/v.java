package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.e0;
import androidx.annotation.h0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class v {

    /* renamed from: c, reason: collision with root package name */
    private static final String f531c = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* renamed from: a, reason: collision with root package name */
    private final b f532a;

    /* renamed from: b, reason: collision with root package name */
    private final w f533b;

    public static class a extends d {

        /* renamed from: b, reason: collision with root package name */
        private static a f534b;

        /* renamed from: a, reason: collision with root package name */
        private Application f535a;

        public a(@h0 Application application) {
            this.f535a = application;
        }

        @h0
        public static a b(@h0 Application application) {
            if (f534b == null) {
                f534b = new a(application);
            }
            return f534b;
        }

        @Override // androidx.lifecycle.v.d, androidx.lifecycle.v.b
        @h0
        public <T extends u> T a(@h0 Class<T> cls) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f535a);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    public interface b {
        @h0
        <T extends u> T a(@h0 Class<T> cls);
    }

    static abstract class c implements b {
        c() {
        }

        @Override // androidx.lifecycle.v.b
        @h0
        public <T extends u> T a(@h0 Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        @h0
        public abstract <T extends u> T b(@h0 String str, @h0 Class<T> cls);
    }

    public static class d implements b {
        @Override // androidx.lifecycle.v.b
        @h0
        public <T extends u> T a(@h0 Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    public v(@h0 w wVar, @h0 b bVar) {
        this.f532a = bVar;
        this.f533b = wVar;
    }

    public v(@h0 x xVar, @h0 b bVar) {
        this(xVar.j(), bVar);
    }

    @e0
    @h0
    public <T extends u> T a(@h0 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    @e0
    @h0
    public <T extends u> T b(@h0 String str, @h0 Class<T> cls) {
        T t = (T) this.f533b.b(str);
        if (cls.isInstance(t)) {
            return t;
        }
        b bVar = this.f532a;
        T t2 = bVar instanceof c ? (T) ((c) bVar).b(str, cls) : (T) bVar.a(cls);
        this.f533b.d(str, t2);
        return t2;
    }
}
