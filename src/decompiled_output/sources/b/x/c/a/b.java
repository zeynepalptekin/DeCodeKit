package b.x.c.a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.h0;
import androidx.annotation.m0;

/* loaded from: classes.dex */
public interface b extends Animatable {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        Animatable2.AnimationCallback f1527a;

        /* renamed from: b.x.c.a.b$a$a, reason: collision with other inner class name */
        class C0111a extends Animatable2.AnimationCallback {
            C0111a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @m0(23)
        Animatable2.AnimationCallback a() {
            if (this.f1527a == null) {
                this.f1527a = new C0111a();
            }
            return this.f1527a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    boolean a(@h0 a aVar);

    void b(@h0 a aVar);

    void clearAnimationCallbacks();
}
