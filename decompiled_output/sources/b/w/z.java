package b.w;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* loaded from: classes.dex */
class z {
    private z() {
    }

    static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new x(property, path), 0.0f, 1.0f);
    }
}
