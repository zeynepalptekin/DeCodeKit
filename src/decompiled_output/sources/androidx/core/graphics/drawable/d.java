package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f394a = "RoundedBitmapDrawableFa";

    private static class a extends c {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.c
        void f(int r7, int r8, int r9, Rect rect, Rect rect2) {
            b.i.p.h.b(r7, r8, r9, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.c
        public boolean h() {
            Bitmap bitmap = this.f391a;
            return bitmap != null && b.i.e.a.b(bitmap);
        }

        @Override // androidx.core.graphics.drawable.c
        public void o(boolean z) {
            Bitmap bitmap = this.f391a;
            if (bitmap != null) {
                b.i.e.a.c(bitmap, z);
                invalidateSelf();
            }
        }
    }

    private d() {
    }

    @h0
    public static c a(@h0 Resources resources, @i0 Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 21 ? new b(resources, bitmap) : new a(resources, bitmap);
    }

    @h0
    public static c b(@h0 Resources resources, @h0 InputStream inputStream) {
        c cVarA = a(resources, BitmapFactory.decodeStream(inputStream));
        if (cVarA.b() == null) {
            Log.w(f394a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return cVarA;
    }

    @h0
    public static c c(@h0 Resources resources, @h0 String str) {
        c cVarA = a(resources, BitmapFactory.decodeFile(str));
        if (cVarA.b() == null) {
            Log.w(f394a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return cVarA;
    }
}
