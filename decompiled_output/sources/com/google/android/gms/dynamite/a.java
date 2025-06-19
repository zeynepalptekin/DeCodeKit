package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class a implements DynamiteModule.b {
    a() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.InterfaceC0171b interfaceC0171b) throws DynamiteModule.a {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int r2 = interfaceC0171b.a(context, str, true);
        aVar.f2604b = r2;
        if (r2 != 0) {
            aVar.f2605c = 1;
        } else {
            int r4 = interfaceC0171b.b(context, str);
            aVar.f2603a = r4;
            if (r4 != 0) {
                aVar.f2605c = -1;
            }
        }
        return aVar;
    }
}
