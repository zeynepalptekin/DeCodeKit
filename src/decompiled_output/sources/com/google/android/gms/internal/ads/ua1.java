package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
final /* synthetic */ class ua1 implements ru1 {

    /* renamed from: a, reason: collision with root package name */
    static final ru1 f5494a = new ua1();

    private ua1() {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final Object a(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new cf1(arrayList) { // from class: com.google.android.gms.internal.ads.xa1

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList f5959a;

            {
                this.f5959a = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.f5959a);
            }
        };
    }
}
