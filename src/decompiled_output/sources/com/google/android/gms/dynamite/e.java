package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.InterfaceC0171b interfaceC0171b) throws DynamiteModule.a {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int r1 = interfaceC0171b.b(context, str);
        aVar.f2603a = r1;
        aVar.f2604b = r1 != 0 ? interfaceC0171b.a(context, str, false) : interfaceC0171b.a(context, str, true);
        if (aVar.f2603a == 0 && aVar.f2604b == 0) {
            aVar.f2605c = 0;
        } else if (aVar.f2603a >= aVar.f2604b) {
            aVar.f2605c = -1;
        } else {
            aVar.f2605c = 1;
        }
        return aVar;
    }
}
