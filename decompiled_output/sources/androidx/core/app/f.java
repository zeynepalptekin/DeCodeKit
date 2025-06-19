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
import java.lang.reflect.InvocationTargetException;

@m0(28)
/* loaded from: classes.dex */
public class f extends AppComponentFactory {
    @h0
    public Activity a(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @h0
    public Application b(@h0 ClassLoader classLoader, @h0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @h0
    public ContentProvider c(@h0 ClassLoader classLoader, @h0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @h0
    public BroadcastReceiver d(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @h0
    public Service e(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    @Override // android.app.AppComponentFactory
    @h0
    public final Activity instantiateActivity(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public final Application instantiateApplication(@h0 ClassLoader classLoader, @h0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public final ContentProvider instantiateProvider(@h0 ClassLoader classLoader, @h0 String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public final BroadcastReceiver instantiateReceiver(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @h0
    public final Service instantiateService(@h0 ClassLoader classLoader, @h0 String str, @i0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}
