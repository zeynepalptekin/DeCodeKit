package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6916c = "ComponentDiscovery";
    private static final String d = "com.google.firebase.components.ComponentRegistrar";
    private static final String e = "com.google.firebase.components:";

    /* renamed from: a, reason: collision with root package name */
    private final T f6917a;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f6918b;

    private static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f6919a;

        private b(Class<? extends Service> cls) {
            this.f6919a = cls;
        }

        private Bundle b(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(h.f6916c, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f6919a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(h.f6916c, this.f6919a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(h.f6916c, "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.h.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w(h.f6916c, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if (h.d.equals(bundleB.get(str)) && str.startsWith(h.e)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @x0
    interface c<T> {
        List<String> a(T t);
    }

    @x0
    h(T t, c<T> cVar) {
        this.f6917a = t;
        this.f6918b = cVar;
    }

    public static h<Context> b(Context context, Class<? extends Service> cls) {
        return new h<>(context, new b(cls));
    }

    private static List<j> c(List<String> list) throws ClassNotFoundException {
        String str;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            try {
                Class<?> cls = Class.forName(str2);
                if (j.class.isAssignableFrom(cls)) {
                    arrayList.add((j) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    Log.w(f6916c, String.format("Class %s is not an instance of %s", str2, d));
                }
            } catch (ClassNotFoundException e2) {
                e = e2;
                str = String.format("Class %s is not an found.", str2);
                Log.w(f6916c, str, e);
            } catch (IllegalAccessException e3) {
                e = e3;
                str = String.format("Could not instantiate %s.", str2);
                Log.w(f6916c, str, e);
            } catch (InstantiationException e4) {
                e = e4;
                str = String.format("Could not instantiate %s.", str2);
                Log.w(f6916c, str, e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                str = String.format("Could not instantiate %s", str2);
                Log.w(f6916c, str, e);
            } catch (InvocationTargetException e6) {
                e = e6;
                str = String.format("Could not instantiate %s", str2);
                Log.w(f6916c, str, e);
            }
        }
        return arrayList;
    }

    public List<j> a() {
        return c(this.f6918b.a(this.f6917a));
    }
}
