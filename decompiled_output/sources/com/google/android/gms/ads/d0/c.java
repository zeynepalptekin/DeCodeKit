package com.google.android.gms.ads.d0;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2357a = "1098";

    public static abstract class a {
        public abstract List<b> a();

        public abstract CharSequence b();
    }

    public static abstract class b {
        public abstract Drawable a();

        public int b() {
            return -1;
        }

        public abstract double c();

        public abstract Uri d();

        public int e() {
            return -1;
        }
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public abstract void a(Bundle bundle);

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public abstract boolean b(Bundle bundle);

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public abstract void c(Bundle bundle);

    protected abstract Object d();
}
