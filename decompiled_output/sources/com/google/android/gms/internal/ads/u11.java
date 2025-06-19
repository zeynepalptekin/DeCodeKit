package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class u11<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5471a = "u11";

    protected static <K, V> HashMap<K, V> b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d(f5471a, "decode object failure");
            return null;
        }
    }

    protected abstract void a(String str);

    protected abstract HashMap<K, V> c();

    public String toString() throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(c());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException unused) {
            return null;
        }
    }
}
