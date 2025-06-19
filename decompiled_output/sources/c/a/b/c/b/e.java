package c.a.b.c.b;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e extends Property<Drawable, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final Property<Drawable, Integer> f1940b = new e();

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f1941a;

    private e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f1941a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @i0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@h0 Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f1941a.containsKey(drawable)) {
            return this.f1941a.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@h0 Drawable drawable, @h0 Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f1941a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
