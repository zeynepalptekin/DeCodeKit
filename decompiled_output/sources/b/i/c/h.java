package b.i.c;

import android.content.SharedPreferences;
import androidx.annotation.h0;

@Deprecated
/* loaded from: classes.dex */
public final class h {

    @Deprecated
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static a f975b;

        /* renamed from: a, reason: collision with root package name */
        private final C0055a f976a = new C0055a();

        /* renamed from: b.i.c.h$a$a, reason: collision with other inner class name */
        private static class C0055a {
            C0055a() {
            }

            public void a(@h0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        @Deprecated
        public static a b() {
            if (f975b == null) {
                f975b = new a();
            }
            return f975b;
        }

        @Deprecated
        public void a(@h0 SharedPreferences.Editor editor) {
            this.f976a.a(editor);
        }
    }

    private h() {
    }
}
