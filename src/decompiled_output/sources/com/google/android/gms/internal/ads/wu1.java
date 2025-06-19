package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class wu1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f5895a = Logger.getLogger(wu1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final yu1 f5896b = new a();

    static final class a {
        private a() {
        }
    }

    private wu1() {
    }

    static String a(@NullableDecl String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }

    static boolean b(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    static String c(@NullableDecl String str) {
        return str == null ? "" : str;
    }
}
