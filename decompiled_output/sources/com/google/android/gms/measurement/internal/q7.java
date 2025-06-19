package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public final class q7 {
    public static Object a(Object obj) throws Throwable {
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        Object object = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return object;
                    } catch (Throwable th) {
                        th = th;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public static String b(Context context, String str) {
        try {
            return new com.google.android.gms.common.internal.w(context).a(str);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @androidx.annotation.i0
    public static String c(String str, String[] strArr, String[] strArr2) {
        com.google.android.gms.common.internal.r.k(strArr);
        com.google.android.gms.common.internal.r.k(strArr2);
        int r0 = Math.min(strArr.length, strArr2.length);
        for (int r2 = 0; r2 < r0; r2++) {
            String str2 = strArr[r2];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[r2];
            }
        }
        return null;
    }
}
