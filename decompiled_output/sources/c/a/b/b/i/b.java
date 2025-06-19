package c.a.b.b.i;

import android.content.Context;
import android.os.AsyncTask;
import c.a.b.b.d.g;
import c.a.b.b.d.h;
import c.a.b.b.i.a;

/* loaded from: classes.dex */
final class b extends AsyncTask<Void, Void, Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f1886a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a.InterfaceC0131a f1887b;

    b(Context context, a.InterfaceC0131a interfaceC0131a) {
        this.f1886a = context;
        this.f1887b = interfaceC0131a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer doInBackground(Void... voidArr) {
        int r1;
        try {
            a.a(this.f1886a);
            r1 = 0;
        } catch (g e) {
            r1 = e.d;
        } catch (h e2) {
            r1 = e2.b();
        }
        return Integer.valueOf(r1);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Integer num) {
        Integer num2 = num;
        if (num2.intValue() == 0) {
            this.f1887b.a();
        } else {
            this.f1887b.b(num2.intValue(), a.f1883a.e(this.f1886a, num2.intValue(), "pi"));
        }
    }
}
