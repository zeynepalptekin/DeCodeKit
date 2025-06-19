package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.InterfaceC0171b interfaceC0171b) throws DynamiteModule.a {
        int r3;
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        aVar.f2603a = interfaceC0171b.b(context, str);
        int r32 = interfaceC0171b.a(context, str, true);
        aVar.f2604b = r32;
        if (aVar.f2603a == 0 && r32 == 0) {
            r3 = 0;
        } else {
            if (aVar.f2603a < aVar.f2604b) {
                aVar.f2605c = 1;
                return aVar;
            }
            r3 = -1;
        }
        aVar.f2605c = r3;
        return aVar;
    }
}
