package b.a.f;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import b.a.f.b;
import java.util.ArrayList;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f817a;

    /* renamed from: b, reason: collision with root package name */
    final b f818b;

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f819a;

        /* renamed from: b, reason: collision with root package name */
        final Context f820b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f821c = new ArrayList<>();
        final b.f.i<Menu, Menu> d = new b.f.i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f820b = context;
            this.f819a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p pVar = new p(this.f820b, (b.i.g.b.a) menu);
            this.d.put(menu, pVar);
            return pVar;
        }

        @Override // b.a.f.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f819a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // b.a.f.b.a
        public void b(b bVar) {
            this.f819a.onDestroyActionMode(e(bVar));
        }

        @Override // b.a.f.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f819a.onActionItemClicked(e(bVar), new k(this.f820b, (b.i.g.b.b) menuItem));
        }

        @Override // b.a.f.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f819a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f821c.size();
            for (int r1 = 0; r1 < size; r1++) {
                f fVar = this.f821c.get(r1);
                if (fVar != null && fVar.f818b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f820b, bVar);
            this.f821c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f817a = context;
        this.f818b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f818b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f818b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p(this.f817a, (b.i.g.b.a) this.f818b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f818b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f818b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f818b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f818b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f818b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f818b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f818b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f818b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int r2) {
        this.f818b.o(r2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f818b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f818b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int r2) {
        this.f818b.r(r2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f818b.s(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f818b.t(z);
    }
}
