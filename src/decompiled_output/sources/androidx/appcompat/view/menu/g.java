package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.h0;
import androidx.annotation.p0;
import b.i.p.g0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g implements b.i.g.b.a {
    private static final String L = "MenuBuilder";
    private static final String M = "android:menu:presenters";
    private static final String N = "android:menu:actionviewstates";
    private static final String O = "android:menu:expandedactionview";
    private static final int[] P = {1, 4, 5, 3, 2, 0};
    View A;
    private j I;
    private boolean K;
    private final Context l;
    private final Resources m;
    private boolean n;
    private boolean o;
    private a p;
    private ContextMenu.ContextMenuInfo x;
    CharSequence y;
    Drawable z;
    private int w = 0;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private ArrayList<j> G = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<n>> H = new CopyOnWriteArrayList<>();
    private boolean J = false;
    private ArrayList<j> q = new ArrayList<>();
    private ArrayList<j> r = new ArrayList<>();
    private boolean s = true;
    private ArrayList<j> t = new ArrayList<>();
    private ArrayList<j> u = new ArrayList<>();
    private boolean v = true;

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a(@h0 g gVar, @h0 MenuItem menuItem);

        void b(@h0 g gVar);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean a(j jVar);
    }

    public g(Context context) {
        this.l = context;
        this.m = context.getResources();
        k0(true);
    }

    private static int E(int r3) {
        int r0 = ((-65536) & r3) >> 16;
        if (r0 >= 0) {
            int[] r1 = P;
            if (r0 < r1.length) {
                return (r3 & b.i.g.b.a.f1046a) | (r1[r0] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void R(int r2, boolean z) {
        if (r2 < 0 || r2 >= this.q.size()) {
            return;
        }
        this.q.remove(r2);
        if (z) {
            N(true);
        }
    }

    private void d0(int r3, CharSequence charSequence, int r5, Drawable drawable, View view) {
        Resources resourcesF = F();
        if (view != null) {
            this.A = view;
            this.y = null;
            this.z = null;
        } else {
            if (r3 > 0) {
                this.y = resourcesF.getText(r3);
            } else if (charSequence != null) {
                this.y = charSequence;
            }
            if (r5 > 0) {
                this.z = b.i.c.c.h(x(), r5);
            } else if (drawable != null) {
                this.z = drawable;
            }
            this.A = null;
        }
        N(false);
    }

    private j h(int r10, int r11, int r12, int r13, CharSequence charSequence, int r15) {
        return new j(this, r10, r11, r12, r13, charSequence, r15);
    }

    private void j(boolean z) {
        if (this.H.isEmpty()) {
            return;
        }
        m0();
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                nVar.N(z);
            }
        }
        l0();
    }

    private void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(M);
        if (sparseParcelableArray == null || this.H.isEmpty()) {
            return;
        }
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                int r1 = nVar.J();
                if (r1 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(r1)) != null) {
                    nVar.L(parcelable);
                }
            }
        }
    }

    private void k0(boolean z) {
        this.o = z && this.m.getConfiguration().keyboard != 1 && g0.g(ViewConfiguration.get(this.l), this.l);
    }

    private void l(Bundle bundle) {
        Parcelable parcelableQ;
        if (this.H.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                int r2 = nVar.J();
                if (r2 > 0 && (parcelableQ = nVar.Q()) != null) {
                    sparseArray.put(r2, parcelableQ);
                }
            }
        }
        bundle.putSparseParcelableArray(M, sparseArray);
    }

    private boolean m(s sVar, n nVar) {
        if (this.H.isEmpty()) {
            return false;
        }
        boolean zM = nVar != null ? nVar.M(sVar) : false;
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null) {
                this.H.remove(next);
            } else if (!zM) {
                zM = nVar2.M(sVar);
            }
        }
        return zM;
    }

    private static int q(ArrayList<j> arrayList, int r3) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= r3) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<j> C() {
        u();
        return this.u;
    }

    boolean D() {
        return this.E;
    }

    Resources F() {
        return this.m;
    }

    public g G() {
        return this;
    }

    @h0
    public ArrayList<j> H() {
        if (!this.s) {
            return this.r;
        }
        this.r.clear();
        int size = this.q.size();
        for (int r2 = 0; r2 < size; r2++) {
            j jVar = this.q.get(r2);
            if (jVar.isVisible()) {
                this.r.add(jVar);
            }
        }
        this.s = false;
        this.v = true;
        return this.r;
    }

    public boolean I() {
        return this.J;
    }

    boolean J() {
        return this.n;
    }

    public boolean K() {
        return this.o;
    }

    void L(j jVar) {
        this.v = true;
        N(true);
    }

    void M(j jVar) {
        this.s = true;
        N(true);
    }

    public void N(boolean z) {
        if (this.B) {
            this.C = true;
            if (z) {
                this.D = true;
                return;
            }
            return;
        }
        if (z) {
            this.s = true;
            this.v = true;
        }
        j(z);
    }

    public boolean O(MenuItem menuItem, int r3) {
        return P(menuItem, null, r3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
  0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean P(android.view.MenuItem r7, androidx.appcompat.view.menu.n r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.j r7 = (androidx.appcompat.view.menu.j) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.n()
            b.i.p.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.b()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.m()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.f(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.f(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.s r9 = new androidx.appcompat.view.menu.s
            android.content.Context r0 = r6.x()
            r9.<init>(r0, r6, r7)
            r7.A(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.s r7 = (androidx.appcompat.view.menu.s) r7
            if (r4 == 0) goto L63
            r2.g(r7)
        L63:
            boolean r7 = r6.m(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.P(android.view.MenuItem, androidx.appcompat.view.menu.n, int):boolean");
    }

    public void Q(int r2) {
        R(r2, true);
    }

    public void S(n nVar) {
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.H.remove(next);
            }
        }
    }

    public void T(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(w());
        int size = size();
        for (int r2 = 0; r2 < size; r2++) {
            MenuItem item = getItem(r2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).T(bundle);
            }
        }
        int r8 = bundle.getInt(O);
        if (r8 <= 0 || (menuItemFindItem = findItem(r8)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int r2 = 0; r2 < size; r2++) {
            MenuItem item = getItem(r2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void W(Bundle bundle) {
        l(bundle);
    }

    public void X(a aVar) {
        this.p = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.x = contextMenuInfo;
    }

    public g Z(int r1) {
        this.w = r1;
        return this;
    }

    protected MenuItem a(int r9, int r10, int r11, CharSequence charSequence) {
        int r7 = E(r11);
        j jVarH = h(r9, r10, r11, r7, charSequence, this.w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.x;
        if (contextMenuInfo != null) {
            jVarH.y(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.q;
        arrayList.add(q(arrayList, r7), jVarH);
        N(true);
        return jVarH;
    }

    void a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.q.size();
        m0();
        for (int r3 = 0; r3 < size; r3++) {
            j jVar = this.q.get(r3);
            if (jVar.getGroupId() == groupId && jVar.p() && jVar.isCheckable()) {
                jVar.v(jVar == menuItem);
            }
        }
        l0();
    }

    @Override // android.view.Menu
    public MenuItem add(int r2) {
        return a(0, 0, 0, this.m.getString(r2));
    }

    @Override // android.view.Menu
    public MenuItem add(int r2, int r3, int r4, int r5) {
        return a(r2, r3, r4, this.m.getString(r5));
    }

    @Override // android.view.Menu
    public MenuItem add(int r1, int r2, int r3, CharSequence charSequence) {
        return a(r1, r2, r3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r8, int r9, int r10, ComponentName componentName, Intent[] intentArr, Intent intent, int r14, MenuItem[] menuItemArr) {
        int r142;
        PackageManager packageManager = this.l.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((r14 & 1) == 0) {
            removeGroup(r8);
        }
        for (int r1 = 0; r1 < size; r1++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(r1);
            int r4 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(r4 < 0 ? intent : intentArr[r4]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(r8, r9, r10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (r142 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[r142] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2) {
        return addSubMenu(0, 0, 0, this.m.getString(r2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return addSubMenu(r2, r3, r4, this.m.getString(r5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r1, int r2, int r3, CharSequence charSequence) {
        j jVar = (j) a(r1, r2, r3, charSequence);
        s sVar = new s(this.l, this, jVar);
        jVar.A(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(n nVar) {
        c(nVar, this.l);
    }

    protected g b0(int r7) {
        d0(0, null, r7, null, null);
        return this;
    }

    public void c(n nVar, Context context) {
        this.H.add(new WeakReference<>(nVar));
        nVar.K(context, this);
        this.v = true;
    }

    protected g c0(Drawable drawable) {
        d0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.I;
        if (jVar != null) {
            g(jVar);
        }
        this.q.clear();
        N(true);
    }

    public void clearHeader() {
        this.z = null;
        this.y = null;
        this.A = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        N(true);
    }

    protected g e0(int r7) {
        d0(r7, null, 0, null, null);
        return this;
    }

    public final void f(boolean z) {
        if (this.F) {
            return;
        }
        this.F = true;
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                nVar.a(this, z);
            }
        }
        this.F = false;
    }

    protected g f0(CharSequence charSequence) {
        d0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int r5) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int r1 = 0; r1 < size; r1++) {
            j jVar = this.q.get(r1);
            if (jVar.getItemId() == r5) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (menuItemFindItem = jVar.getSubMenu().findItem(r5)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(j jVar) {
        boolean zR = false;
        if (!this.H.isEmpty() && this.I == jVar) {
            m0();
            Iterator<WeakReference<n>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.H.remove(next);
                } else {
                    zR = nVar.R(this, jVar);
                    if (zR) {
                        break;
                    }
                }
            }
            l0();
            if (zR) {
                this.I = null;
            }
        }
        return zR;
    }

    protected g g0(View view) {
        d0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int r2) {
        return this.q.get(r2);
    }

    public void h0(boolean z) {
        this.E = z;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int r3 = 0; r3 < size; r3++) {
            if (this.q.get(r3).isVisible()) {
                return true;
            }
        }
        return false;
    }

    boolean i(@h0 g gVar, @h0 MenuItem menuItem) {
        a aVar = this.p;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public void i0(boolean z) {
        this.K = z;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, KeyEvent keyEvent) {
        return s(r1, keyEvent) != null;
    }

    public void j0(boolean z) {
        if (this.o == z) {
            return;
        }
        k0(z);
        N(false);
    }

    public void l0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            N(this.D);
        }
    }

    public void m0() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.C = false;
        this.D = false;
    }

    public boolean n(j jVar) {
        boolean zS = false;
        if (this.H.isEmpty()) {
            return false;
        }
        m0();
        Iterator<WeakReference<n>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.H.remove(next);
            } else {
                zS = nVar.S(this, jVar);
                if (zS) {
                    break;
                }
            }
        }
        l0();
        if (zS) {
            this.I = jVar;
        }
        return zS;
    }

    public int o(int r2) {
        return p(r2, 0);
    }

    public int p(int r3, int r4) {
        int size = size();
        if (r4 < 0) {
            r4 = 0;
        }
        while (r4 < size) {
            if (this.q.get(r4).getGroupId() == r3) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
        return O(findItem(r1), r2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, KeyEvent keyEvent, int r3) {
        j jVarS = s(r1, keyEvent);
        boolean zO = jVarS != null ? O(jVarS, r3) : false;
        if ((r3 & 2) != 0) {
            f(true);
        }
        return zO;
    }

    public int r(int r4) {
        int size = size();
        for (int r1 = 0; r1 < size; r1++) {
            if (this.q.get(r1).getItemId() == r4) {
                return r1;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public void removeGroup(int r6) {
        int r0 = o(r6);
        if (r0 >= 0) {
            int size = this.q.size() - r0;
            int r3 = 0;
            while (true) {
                int r4 = r3 + 1;
                if (r3 >= size || this.q.get(r0).getGroupId() != r6) {
                    break;
                }
                R(r0, false);
                r3 = r4;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
        R(r(r2), true);
    }

    j s(int r12, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.G;
        arrayList.clear();
        t(arrayList, r12, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zJ = J();
        for (int r6 = 0; r6 < size; r6++) {
            j jVar = arrayList.get(r6);
            char alphabeticShortcut = zJ ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && r12 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r5, boolean z, boolean z2) {
        int size = this.q.size();
        for (int r1 = 0; r1 < size; r1++) {
            j jVar = this.q.get(r1);
            if (jVar.getGroupId() == r5) {
                jVar.w(z2);
                jVar.setCheckable(z);
            }
        }
    }

    @Override // b.i.g.b.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.J = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r5, boolean z) {
        int size = this.q.size();
        for (int r1 = 0; r1 < size; r1++) {
            j jVar = this.q.get(r1);
            if (jVar.getGroupId() == r5) {
                jVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r7, boolean z) {
        int size = this.q.size();
        boolean z2 = false;
        for (int r1 = 0; r1 < size; r1++) {
            j jVar = this.q.get(r1);
            if (jVar.getGroupId() == r7 && jVar.B(z)) {
                z2 = true;
            }
        }
        if (z2) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.q.size();
    }

    void t(List<j> list, int r14, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || r14 == 67) {
            int size = this.q.size();
            for (int r6 = 0; r6 < size; r6++) {
                j jVar = this.q.get(r6);
                if (jVar.hasSubMenu()) {
                    ((g) jVar.getSubMenu()).t(list, r14, keyEvent);
                }
                char alphabeticShortcut = zJ ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & b.i.g.b.a.e) == ((zJ ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & b.i.g.b.a.e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && r14 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<j> arrayListH = H();
        if (this.v) {
            Iterator<WeakReference<n>> it = this.H.iterator();
            boolean zP = false;
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.H.remove(next);
                } else {
                    zP |= nVar.P();
                }
            }
            if (zP) {
                this.t.clear();
                this.u.clear();
                int size = arrayListH.size();
                for (int r3 = 0; r3 < size; r3++) {
                    j jVar = arrayListH.get(r3);
                    (jVar.o() ? this.t : this.u).add(jVar);
                }
            } else {
                this.t.clear();
                this.u.clear();
                this.u.addAll(H());
            }
            this.v = false;
        }
    }

    public ArrayList<j> v() {
        u();
        return this.t;
    }

    protected String w() {
        return N;
    }

    public Context x() {
        return this.l;
    }

    public j y() {
        return this.I;
    }

    public Drawable z() {
        return this.z;
    }
}
