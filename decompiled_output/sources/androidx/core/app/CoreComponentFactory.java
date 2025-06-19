package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;

@m0(api = 28)
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        Object a();
    }

    static <T> T a(T t) {
        T t2;
        return (!(t instanceof a) || (t2 = (T) ((a) t).a()) == null) ? t : t2;
    }

    @Override // android.app.AppComponentFactory
    @h0
    public Activity instantiateActivity(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public Application instantiateApplication(@h0 ClassLoader classLoader, @h0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public ContentProvider instantiateProvider(@h0 ClassLoader classLoader, @h0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public BroadcastReceiver instantiateReceiver(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public Service instantiateService(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
