package com.google.android.gms.common.internal.z;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface d extends Parcelable {

    @RecentlyNonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface a {
        @RecentlyNonNull
        String creator();

        @RecentlyNonNull
        boolean validate() default false;
    }

    public @interface b {
    }

    public @interface c {
        @RecentlyNonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @RecentlyNonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        @RecentlyNonNull
        int id();

        @RecentlyNonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.z.d$d, reason: collision with other inner class name */
    public @interface InterfaceC0170d {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface e {
        @RecentlyNonNull
        int id();
    }

    public @interface f {
        @RecentlyNonNull
        int[] value();
    }

    public @interface g {
        @RecentlyNonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        @RecentlyNonNull
        int id();

        @RecentlyNonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
