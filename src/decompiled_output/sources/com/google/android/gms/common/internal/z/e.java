package com.google.android.gms.common.internal.z;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d0;
import java.util.ArrayList;
import java.util.Iterator;

@d0
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class e {
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T extends d> T a(@RecentlyNonNull byte[] bArr, @RecentlyNonNull Parcelable.Creator<T> creator) {
        r.k(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static <T extends d> T b(@RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T extends d> T c(@RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        return (T) a(com.google.android.gms.common.util.c.b(str), creator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNullable
    public static <T extends d> ArrayList<T> d(@RecentlyNonNull Bundle bundle, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        int r1 = 0;
        while (r1 < size) {
            Object obj = arrayList.get(r1);
            r1++;
            arrayList2.add(a((byte[]) obj, creator));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static <T extends d> ArrayList<T> e(@RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        int r1 = 0;
        while (r1 < size) {
            Object obj = arrayList.get(r1);
            r1++;
            arrayList2.add(a((byte[]) obj, creator));
        }
        return arrayList2;
    }

    public static <T extends d> void f(@RecentlyNonNull Iterable<T> iterable, @RecentlyNonNull Bundle bundle, @RecentlyNonNull String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    @com.google.android.gms.common.annotation.a
    public static <T extends d> void g(@RecentlyNonNull Iterable<T> iterable, @RecentlyNonNull Intent intent, @RecentlyNonNull String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T extends d> byte[] h(@RecentlyNonNull T t) {
        Parcel parcelObtain = Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @com.google.android.gms.common.annotation.a
    public static <T extends d> void i(@RecentlyNonNull T t, @RecentlyNonNull Intent intent, @RecentlyNonNull String str) {
        intent.putExtra(str, h(t));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T extends d> String j(@RecentlyNonNull T t) {
        return com.google.android.gms.common.util.c.e(h(t));
    }
}
