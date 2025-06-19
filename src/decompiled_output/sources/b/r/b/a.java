package b.r.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    private static final String f = "LocalBroadcastManager";
    private static final boolean g = false;
    static final int h = 1;
    private static final Object i = new Object();
    private static a j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f1338a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f1339b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f1340c = new HashMap<>();
    private final ArrayList<b> d = new ArrayList<>();
    private final Handler e;

    /* renamed from: b.r.b.a$a, reason: collision with other inner class name */
    class HandlerC0094a extends Handler {
        HandlerC0094a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f1342a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f1343b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f1342a = intent;
            this.f1343b = arrayList;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f1344a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f1345b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1346c;
        boolean d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f1344a = intentFilter;
            this.f1345b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f1345b);
            sb.append(" filter=");
            sb.append(this.f1344a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f1338a = context;
        this.e = new HandlerC0094a(context.getMainLooper());
    }

    @h0
    public static a b(@h0 Context context) {
        a aVar;
        synchronized (i) {
            if (j == null) {
                j = new a(context.getApplicationContext());
            }
            aVar = j;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f1339b) {
                size = this.d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.d.toArray(bVarArr);
                this.d.clear();
            }
            for (int r3 = 0; r3 < size; r3++) {
                b bVar = bVarArr[r3];
                int size2 = bVar.f1343b.size();
                for (int r6 = 0; r6 < size2; r6++) {
                    c cVar = bVar.f1343b.get(r6);
                    if (!cVar.d) {
                        cVar.f1345b.onReceive(this.f1338a, bVar.f1342a);
                    }
                }
            }
        }
    }

    public void c(@h0 BroadcastReceiver broadcastReceiver, @h0 IntentFilter intentFilter) {
        synchronized (this.f1339b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f1339b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f1339b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int r7 = 0; r7 < intentFilter.countActions(); r7++) {
                String action = intentFilter.getAction(r7);
                ArrayList<c> arrayList2 = this.f1340c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f1340c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(@h0 Intent intent) {
        int r17;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f1339b) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f1338a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v(f, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f1340c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v(f, "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int r6 = 0;
                while (r6 < arrayList3.size()) {
                    c cVar = arrayList3.get(r6);
                    if (z) {
                        Log.v(f, "Matching against filter " + cVar.f1344a);
                    }
                    if (cVar.f1346c) {
                        if (z) {
                            Log.v(f, "  Filter's target already added");
                        }
                        r17 = r6;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        r17 = r6;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int r3 = cVar.f1344a.match(action, strResolveTypeIfNeeded, scheme, data, categories, f);
                        if (r3 >= 0) {
                            if (z) {
                                Log.v(f, "  Filter matched!  match=0x" + Integer.toHexString(r3));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f1346c = true;
                            r6 = r17 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v(f, "  Filter did not match: " + (r3 != -4 ? r3 != -3 ? r3 != -2 ? r3 != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    r6 = r17 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int r32 = 0; r32 < arrayList5.size(); r32++) {
                        ((c) arrayList5.get(r32)).f1346c = false;
                    }
                    this.d.add(new b(intent, arrayList5));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(@h0 Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@h0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f1339b) {
            ArrayList<c> arrayListRemove = this.f1339b.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                c cVar = arrayListRemove.get(size);
                cVar.d = true;
                for (int r5 = 0; r5 < cVar.f1344a.countActions(); r5++) {
                    String action = cVar.f1344a.getAction(r5);
                    ArrayList<c> arrayList = this.f1340c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f1345b == broadcastReceiver) {
                                cVar2.d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f1340c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
