package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.InterfaceC0171b interfaceC0171b) throws DynamiteModule.a {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int r1 = interfaceC0171b.b(context, str);
        aVar.f2603a = r1;
        if (r1 != 0) {
            aVar.f2605c = -1;
        } else {
            int r3 = interfaceC0171b.a(context, str, true);
            aVar.f2604b = r3;
            if (r3 != 0) {
                aVar.f2605c = 1;
            }
        }
        return aVar;
    }
}
