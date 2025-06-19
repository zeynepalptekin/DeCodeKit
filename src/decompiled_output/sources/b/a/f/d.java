package b.a.f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.t0;
import b.a.a;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private int f814a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f815b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f816c;
    private Configuration d;
    private Resources e;

    public d() {
        super(null);
    }

    public d(Context context, @t0 int r2) {
        super(context);
        this.f814a = r2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f815b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.d);
                this.e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.e = resources;
        }
        return this.e;
    }

    private void d() {
        boolean z = this.f815b == null;
        if (z) {
            this.f815b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f815b.setTo(theme);
            }
        }
        e(this.f815b, this.f814a, z);
    }

    public void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f814a;
    }

    protected void e(Resources.Theme theme, int r2, boolean z) {
        theme.applyStyle(r2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f816c == null) {
            this.f816c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f816c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f815b;
        if (theme != null) {
            return theme;
        }
        if (this.f814a == 0) {
            this.f814a = a.l.Theme_AppCompat_Light;
        }
        d();
        return this.f815b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
        if (this.f814a != r2) {
            this.f814a = r2;
            d();
        }
    }
}
