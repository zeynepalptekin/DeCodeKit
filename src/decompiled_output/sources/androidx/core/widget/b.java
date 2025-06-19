package androidx.core.widget;

import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static final boolean f401a;

    static {
        f401a = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@h0 int[] r1, int r2) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int r1);
}
