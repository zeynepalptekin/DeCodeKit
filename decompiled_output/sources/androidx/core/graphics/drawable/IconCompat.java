package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.w;
import androidx.annotation.x0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b.i.p.f0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final String A = "int1";
    private static final String B = "int2";
    private static final String C = "tint_list";
    private static final String D = "tint_mode";
    static final PorterDuff.Mode E = PorterDuff.Mode.SRC_IN;
    private static final String j = "IconCompat";
    public static final int k = -1;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    public static final int p = 5;
    public static final int q = 6;
    private static final float r = 0.25f;
    private static final float s = 0.6666667f;
    private static final float t = 0.9166667f;
    private static final float u = 0.010416667f;
    private static final float v = 0.020833334f;
    private static final int w = 61;
    private static final int x = 30;
    private static final String y = "type";
    private static final String z = "obj";

    /* renamed from: a, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int f385a;

    /* renamed from: b, reason: collision with root package name */
    Object f386b;

    /* renamed from: c, reason: collision with root package name */
    @p0({p0.a.LIBRARY})
    public byte[] f387c;

    @p0({p0.a.LIBRARY})
    public Parcelable d;

    @p0({p0.a.LIBRARY})
    public int e;

    @p0({p0.a.LIBRARY})
    public int f;

    @p0({p0.a.LIBRARY})
    public ColorStateList g;
    PorterDuff.Mode h;

    @p0({p0.a.LIBRARY})
    public String i;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY})
    public @interface a {
    }

    @p0({p0.a.LIBRARY})
    public IconCompat() {
        this.f385a = -1;
        this.f387c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = E;
        this.i = null;
    }

    private IconCompat(int r3) {
        this.f385a = -1;
        this.f387c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = E;
        this.i = null;
        this.f385a = r3;
    }

    @i0
    @m0(23)
    private static Uri B(@h0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(j, "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e(j, "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e(j, "Unable to get icon uri", e3);
            return null;
        }
    }

    private InputStream C(Context context) {
        StringBuilder sb;
        String str;
        Uri uriA = A();
        String scheme = uriA.getScheme();
        if (FirebaseAnalytics.b.R.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriA);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f386b));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriA);
        Log.w(j, sb.toString(), e);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable E(Context context) {
        switch (this.f385a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f386b);
            case 2:
                String strV = v();
                if (TextUtils.isEmpty(strV)) {
                    strV = context.getPackageName();
                }
                try {
                    return b.i.c.j.g.c(x(context, strV), this.e, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e(j, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.e), this.f386b), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f386b, this.e, this.f));
            case 4:
                InputStream inputStreamC = C(context);
                if (inputStreamC != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamC));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), i((Bitmap) this.f386b, false));
            case 6:
                InputStream inputStreamC2 = C(context);
                if (inputStreamC2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamC2))) : new BitmapDrawable(context.getResources(), i(BitmapFactory.decodeStream(inputStreamC2), false));
                }
                return null;
            default:
                return null;
        }
    }

    private static String L(int r0) {
        switch (r0) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @i0
    public static IconCompat e(@h0 Bundle bundle) {
        Object parcelable;
        int r0 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(r0);
        iconCompat.e = bundle.getInt(A);
        iconCompat.f = bundle.getInt(B);
        if (bundle.containsKey(C)) {
            iconCompat.g = (ColorStateList) bundle.getParcelable(C);
        }
        if (bundle.containsKey(D)) {
            iconCompat.h = PorterDuff.Mode.valueOf(bundle.getString(D));
        }
        switch (r0) {
            case -1:
            case 1:
            case 5:
                parcelable = bundle.getParcelable(z);
                iconCompat.f386b = parcelable;
                return iconCompat;
            case 0:
            default:
                Log.w(j, "Unknown type " + r0);
                return null;
            case 2:
            case 4:
            case 6:
                parcelable = bundle.getString(z);
                iconCompat.f386b = parcelable;
                return iconCompat;
            case 3:
                iconCompat.f386b = bundle.getByteArray(z);
                return iconCompat;
        }
    }

    @i0
    @m0(23)
    public static IconCompat f(@h0 Context context, @h0 Icon icon) {
        b.i.o.i.f(icon);
        int r0 = z(icon);
        if (r0 == 2) {
            String strW = w(icon);
            try {
                return r(x(context, strW), strW, u(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (r0 == 4) {
            return n(B(icon));
        }
        if (r0 == 6) {
            return k(B(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f386b = icon;
        return iconCompat;
    }

    @i0
    @m0(23)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat g(@h0 Icon icon) {
        b.i.o.i.f(icon);
        int r0 = z(icon);
        if (r0 == 2) {
            return r(null, w(icon), u(icon));
        }
        if (r0 == 4) {
            return n(B(icon));
        }
        if (r0 == 6) {
            return k(B(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f386b = icon;
        return iconCompat;
    }

    @i0
    @m0(23)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat h(@h0 Icon icon) {
        if (z(icon) == 2 && u(icon) == 0) {
            return null;
        }
        return g(icon);
    }

    @x0
    static Bitmap i(Bitmap bitmap, boolean z2) {
        int r0 = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * s);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r0, r0, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = r0;
        float f2 = 0.5f * f;
        float f3 = t * f2;
        if (z2) {
            float f4 = u * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * v, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(f0.t);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - r0)) / 2, (-(bitmap.getHeight() - r0)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat j(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f386b = bitmap;
        return iconCompat;
    }

    @h0
    public static IconCompat k(@h0 Uri uri) {
        if (uri != null) {
            return l(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    @h0
    public static IconCompat l(@h0 String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f386b = str;
        return iconCompat;
    }

    public static IconCompat m(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f386b = bitmap;
        return iconCompat;
    }

    public static IconCompat n(Uri uri) {
        if (uri != null) {
            return o(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat o(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f386b = str;
        return iconCompat;
    }

    public static IconCompat p(byte[] bArr, int r3, int r4) {
        if (bArr == null) {
            throw new IllegalArgumentException("Data must not be null.");
        }
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f386b = bArr;
        iconCompat.e = r3;
        iconCompat.f = r4;
        return iconCompat;
    }

    public static IconCompat q(Context context, @q int r2) {
        if (context != null) {
            return r(context.getResources(), context.getPackageName(), r2);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static IconCompat r(Resources resources, String str, @q int r4) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (r4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = r4;
        if (resources != null) {
            try {
                iconCompat.f386b = resources.getResourceName(r4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f386b = str;
        }
        return iconCompat;
    }

    @m0(23)
    @q
    @w
    private static int u(@h0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e(j, "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e(j, "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e(j, "Unable to get icon resource", e3);
            return 0;
        }
    }

    @i0
    @m0(23)
    private static String w(@h0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(j, "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e(j, "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e(j, "Unable to get icon package", e3);
            return null;
        }
    }

    private static Resources x(Context context, String str) throws PackageManager.NameNotFoundException {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(j, String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    @m0(23)
    private static int z(@h0 Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e(j, sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e(j, sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e(j, sb.toString(), e);
            return -1;
        }
    }

    @h0
    public Uri A() {
        if (this.f385a == -1 && Build.VERSION.SDK_INT >= 23) {
            return B((Icon) this.f386b);
        }
        int r0 = this.f385a;
        if (r0 == 4 || r0 == 6) {
            return Uri.parse((String) this.f386b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @i0
    public Drawable D(@h0 Context context) {
        d(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return K(context).loadDrawable(context);
        }
        Drawable drawableE = E(context);
        if (drawableE != null && (this.g != null || this.h != E)) {
            drawableE.mutate();
            androidx.core.graphics.drawable.a.o(drawableE, this.g);
            androidx.core.graphics.drawable.a.p(drawableE, this.h);
        }
        return drawableE;
    }

    public IconCompat F(@k int r1) {
        return G(ColorStateList.valueOf(r1));
    }

    public IconCompat G(ColorStateList colorStateList) {
        this.g = colorStateList;
        return this;
    }

    public IconCompat H(PorterDuff.Mode mode) {
        this.h = mode;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle I() {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.f385a
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L29;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.f386b
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L30
        L1c:
            java.lang.Object r1 = r3.f386b
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L30
        L24:
            java.lang.Object r1 = r3.f386b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L2d
        L29:
            java.lang.Object r1 = r3.f386b
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L2d:
            r0.putParcelable(r2, r1)
        L30:
            int r1 = r3.f385a
            java.lang.String r2 = "type"
            r0.putInt(r2, r1)
            int r1 = r3.e
            java.lang.String r2 = "int1"
            r0.putInt(r2, r1)
            int r1 = r3.f
            java.lang.String r2 = "int2"
            r0.putInt(r2, r1)
            android.content.res.ColorStateList r1 = r3.g
            if (r1 == 0) goto L4e
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L4e:
            android.graphics.PorterDuff$Mode r1 = r3.h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.E
            if (r1 == r2) goto L5d
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "tint_mode"
            r0.putString(r2, r1)
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.I():android.os.Bundle");
    }

    @m0(23)
    @h0
    @Deprecated
    public Icon J() {
        return K(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 >= 26) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    @androidx.annotation.m0(23)
    @androidx.annotation.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Icon K(@androidx.annotation.i0 android.content.Context r4) {
        /*
            r3 = this;
            int r0 = r3.f385a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto La7;
                case 0: goto L8;
                case 1: goto L8e;
                case 2: goto L83;
                case 3: goto L76;
                case 4: goto L6d;
                case 5: goto L57;
                case 6: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r4.<init>(r0)
            throw r4
        L10:
            if (r4 == 0) goto L3c
            java.io.InputStream r4 = r3.C(r4)
            if (r4 == 0) goto L21
            int r0 = android.os.Build.VERSION.SDK_INT
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)
            if (r0 < r2) goto L68
            goto L5f
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r3.A()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L3c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r3.A()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L57:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L64
            java.lang.Object r4 = r3.f386b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L5f:
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r4)
            goto L96
        L64:
            java.lang.Object r4 = r3.f386b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L68:
            android.graphics.Bitmap r4 = i(r4, r1)
            goto L92
        L6d:
            java.lang.Object r4 = r3.f386b
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithContentUri(r4)
            goto L96
        L76:
            java.lang.Object r4 = r3.f386b
            byte[] r4 = (byte[]) r4
            int r0 = r3.e
            int r1 = r3.f
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithData(r4, r0, r1)
            goto L96
        L83:
            java.lang.String r4 = r3.v()
            int r0 = r3.e
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithResource(r4, r0)
            goto L96
        L8e:
            java.lang.Object r4 = r3.f386b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L92:
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithBitmap(r4)
        L96:
            android.content.res.ColorStateList r0 = r3.g
            if (r0 == 0) goto L9d
            r4.setTintList(r0)
        L9d:
            android.graphics.PorterDuff$Mode r0 = r3.h
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.E
            if (r0 == r1) goto La6
            r4.setTintMode(r0)
        La6:
            return r4
        La7:
            java.lang.Object r4 = r3.f386b
            android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.K(android.content.Context):android.graphics.drawable.Icon");
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        Parcelable parcelable;
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch (this.f385a) {
            case -1:
                parcelable = this.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.d;
                if (parcelable == null) {
                    byte[] bArr = this.f387c;
                    this.f386b = bArr;
                    this.f385a = 3;
                    this.e = 0;
                    this.f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f386b = new String(this.f387c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f386b = this.f387c;
                return;
        }
        this.f386b = parcelable;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void b(boolean z2) {
        this.i = this.h.name();
        switch (this.f385a) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z2) {
                    Bitmap bitmap = (Bitmap) this.f386b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f387c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f387c = ((String) this.f386b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f387c = (byte[]) this.f386b;
                return;
            case 4:
            case 6:
                this.f387c = this.f386b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.d = (Parcelable) this.f386b;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void c(@h0 Intent intent, @i0 Drawable drawable, @h0 Context context) throws PackageManager.NameNotFoundException {
        Bitmap bitmapCopy;
        d(context);
        int r0 = this.f385a;
        if (r0 == 1) {
            bitmapCopy = (Bitmap) this.f386b;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (r0 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(v(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.e));
                    return;
                }
                Drawable drawableH = b.i.c.c.h(contextCreatePackageContext, this.e);
                if (drawableH.getIntrinsicWidth() <= 0 || drawableH.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableH.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableH.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f386b, e);
            }
        } else {
            if (r0 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = i((Bitmap) this.f386b, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void d(@h0 Context context) {
        if (this.f385a == 2) {
            String str = (String) this.f386b;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                int identifier = x(context, str5).getIdentifier(str4, str3, str5);
                if (this.e != identifier) {
                    Log.i(j, "Id has changed for " + str5 + "/" + str4);
                    this.e = identifier;
                }
            }
        }
    }

    @i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public Bitmap s() {
        if (this.f385a == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f386b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        int r0 = this.f385a;
        if (r0 == 1) {
            return (Bitmap) this.f386b;
        }
        if (r0 == 5) {
            return i((Bitmap) this.f386b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @w
    public int t() {
        if (this.f385a == -1 && Build.VERSION.SDK_INT >= 23) {
            return u((Icon) this.f386b);
        }
        if (this.f385a == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @h0
    public String toString() {
        int height;
        if (this.f385a == -1) {
            return String.valueOf(this.f386b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(L(this.f385a));
        switch (this.f385a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f386b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f386b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(v());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(t())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    height = this.f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f386b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != E) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    @h0
    public String v() {
        if (this.f385a == -1 && Build.VERSION.SDK_INT >= 23) {
            return w((Icon) this.f386b);
        }
        if (this.f385a == 2) {
            return ((String) this.f386b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int y() {
        return (this.f385a != -1 || Build.VERSION.SDK_INT < 23) ? this.f385a : z((Icon) this.f386b);
    }
}
