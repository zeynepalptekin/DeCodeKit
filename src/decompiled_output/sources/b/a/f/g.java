package b.a.f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.f0;
import b.a.a;
import b.i.p.o;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g extends MenuInflater {
    static final String e = "SupportMenuInflater";
    private static final String f = "menu";
    private static final String g = "group";
    private static final String h = "item";
    static final int i = 0;
    static final Class<?>[] j;
    static final Class<?>[] k;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f822a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f823b;

    /* renamed from: c, reason: collision with root package name */
    Context f824c;
    private Object d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f825c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f826a;

        /* renamed from: b, reason: collision with root package name */
        private Method f827b;

        public a(Object obj, String str) {
            this.f826a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f827b = cls.getMethod(str, f825c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f827b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f827b.invoke(this.f826a, menuItem)).booleanValue();
                }
                this.f827b.invoke(this.f826a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class b {
        private static final int G = 0;
        private static final int H = 0;
        private static final int I = 0;
        private static final int J = 0;
        private static final int K = 0;
        private static final boolean L = false;
        private static final boolean M = true;
        private static final boolean N = true;
        b.i.p.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f828a;

        /* renamed from: b, reason: collision with root package name */
        private int f829b;

        /* renamed from: c, reason: collision with root package name */
        private int f830c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f828a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f824c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(g.e, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int r0 = this.v;
            if (r0 >= 0) {
                menuItem.setShowAsAction(r0);
            }
            if (this.z != null) {
                if (g.this.f824c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).w(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).j(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.j, g.this.f822a));
                z = true;
            }
            int r02 = this.w;
            if (r02 > 0) {
                if (z) {
                    Log.w(g.e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(r02);
                }
            }
            b.i.p.b bVar = this.A;
            if (bVar != null) {
                o.l(menuItem, bVar);
            }
            o.p(menuItem, this.B);
            o.w(menuItem, this.C);
            o.o(menuItem, this.n, this.o);
            o.s(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                o.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                o.q(menuItem, colorStateList);
            }
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.h = true;
            i(this.f828a.add(this.f829b, this.i, this.j, this.k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.f828a.addSubMenu(this.f829b, this.i, this.j, this.k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f824c.obtainStyledAttributes(attributeSet, a.m.MenuGroup);
            this.f829b = typedArrayObtainStyledAttributes.getResourceId(a.m.MenuGroup_android_id, 0);
            this.f830c = typedArrayObtainStyledAttributes.getInt(a.m.MenuGroup_android_menuCategory, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(a.m.MenuGroup_android_orderInCategory, 0);
            this.e = typedArrayObtainStyledAttributes.getInt(a.m.MenuGroup_android_checkableBehavior, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(a.m.MenuGroup_android_visible, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(a.m.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            a1 a1VarF = a1.F(g.this.f824c, attributeSet, a.m.MenuItem);
            this.i = a1VarF.u(a.m.MenuItem_android_id, 0);
            this.j = (a1VarF.o(a.m.MenuItem_android_menuCategory, this.f830c) & b.i.g.b.a.f1048c) | (a1VarF.o(a.m.MenuItem_android_orderInCategory, this.d) & b.i.g.b.a.f1046a);
            this.k = a1VarF.x(a.m.MenuItem_android_title);
            this.l = a1VarF.x(a.m.MenuItem_android_titleCondensed);
            this.m = a1VarF.u(a.m.MenuItem_android_icon, 0);
            this.n = c(a1VarF.w(a.m.MenuItem_android_alphabeticShortcut));
            this.o = a1VarF.o(a.m.MenuItem_alphabeticModifiers, 4096);
            this.p = c(a1VarF.w(a.m.MenuItem_android_numericShortcut));
            this.q = a1VarF.o(a.m.MenuItem_numericModifiers, 4096);
            this.r = a1VarF.C(a.m.MenuItem_android_checkable) ? a1VarF.a(a.m.MenuItem_android_checkable, false) : this.e;
            this.s = a1VarF.a(a.m.MenuItem_android_checked, false);
            this.t = a1VarF.a(a.m.MenuItem_android_visible, this.f);
            this.u = a1VarF.a(a.m.MenuItem_android_enabled, this.g);
            this.v = a1VarF.o(a.m.MenuItem_showAsAction, -1);
            this.z = a1VarF.w(a.m.MenuItem_android_onClick);
            this.w = a1VarF.u(a.m.MenuItem_actionLayout, 0);
            this.x = a1VarF.w(a.m.MenuItem_actionViewClass);
            String strW = a1VarF.w(a.m.MenuItem_actionProviderClass);
            this.y = strW;
            boolean z = strW != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (b.i.p.b) e(this.y, g.k, g.this.f823b);
            } else {
                if (z) {
                    Log.w(g.e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a1VarF.x(a.m.MenuItem_contentDescription);
            this.C = a1VarF.x(a.m.MenuItem_tooltipText);
            if (a1VarF.C(a.m.MenuItem_iconTintMode)) {
                this.E = f0.e(a1VarF.o(a.m.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (a1VarF.C(a.m.MenuItem_iconTint)) {
                this.D = a1VarF.d(a.m.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            a1VarF.I();
            this.h = false;
        }

        public void h() {
            this.f829b = 0;
            this.f830c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        j = clsArr;
        k = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f824c = context;
        Object[] objArr = {context};
        this.f822a = objArr;
        this.f823b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(f)) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals(g)) {
                        bVar.h();
                    } else if (name2.equals(h)) {
                        if (!bVar.d()) {
                            b.i.p.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals(f)) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals(g)) {
                    bVar.f(attributeSet);
                } else if (name3.equals(h)) {
                    bVar.g(attributeSet);
                } else if (name3.equals(f)) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.d == null) {
            this.d = a(this.f824c);
        }
        return this.d;
    }

    @Override // android.view.MenuInflater
    public void inflate(@c0 int r4, Menu menu) {
        if (!(menu instanceof b.i.g.b.a)) {
            super.inflate(r4, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f824c.getResources().getLayout(r4);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
