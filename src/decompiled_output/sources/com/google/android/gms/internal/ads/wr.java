package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class wr {
    public static <T> T a(Context context, String str, vr<IBinder, T> vrVar) throws yr {
        try {
            return vrVar.a(c(context).d(str));
        } catch (Exception e) {
            throw new yr(e);
        }
    }

    public static Context b(Context context) throws yr {
        return c(context).b();
    }

    private static DynamiteModule c(Context context) throws yr {
        try {
            return DynamiteModule.e(context, DynamiteModule.i, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new yr(e);
        }
    }
}
