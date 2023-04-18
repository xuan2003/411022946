package tw.edu.pu.csim.s1102294.a411022946

import android.annotation.SuppressLint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, View.OnTouchListener {
    lateinit var txv:TextView
    lateinit var txv2:TextView
    lateinit var txv3:TextView
    lateinit var txv4:TextView
    lateinit var txv5:TextView
    lateinit var btn:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var imgv2:ImageView
    lateinit var gDetector: GestureDetector
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gDetector = GestureDetector(this, this)
        txv = findViewById(R.id.txv)
        txv2 = findViewById(R.id.txv2)
        txv3 = findViewById(R.id.txv3)
        txv4 = findViewById(R.id.txv4)
        txv5 = findViewById(R.id.txv5)
        btn = findViewById(R.id.btn)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        imgv2 = findViewById(R.id.imgv2)
        imgv2.setOnTouchListener(this)
        txv.text = "\n如果有機會去做喜歡的事，那就果斷去做，不要拘謹"
        txv2.text = ""
        txv3.text = ""
        txv4.text = ""
        txv5.text = "圖片可以進行拖曳"
        txv.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        txv2.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        txv3.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        txv4.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        txv5.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        btn.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        btn2.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        btn3.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        btn4.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))

    }
    fun a(view: View) {
        txv2.text = "自我介紹：\n我的名字是劉羿萱，出生於2003年7月25日，目前正就讀靜宜大學資訊管理系二年級B班，平時在休閒時間喜歡看小說和玩遊戲，而目前正在學習APP，並希望未來能從事相關工作。"
        txv3.text = ""
        txv4.text = ""
    }

    fun b(view: View) {
        txv2.text = ""
        txv3.text = "學歷：\n國小：烏日國小\n國中：光德國中\n大學：靜宜大學"
        txv4.text = ""
    }
    fun c(view: View) {
        txv2.text = ""
        txv3.text = ""
        txv4.text = "未來期許：\n目前除了學校課程外，正在學習日文及APP，希望在未來能學習一門新語言和從事APP相關工作"
    }
    fun d(view: View) {
        txv2.text = ""
        txv3.text = ""
        txv4.text = ""
    }

    override fun onDown(p0: MotionEvent): Boolean {
        TODO("Not yet implemented")
    }

    override fun onShowPress(p0: MotionEvent) {
        TODO("Not yet implemented")
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        TODO("Not yet implemented")
    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        TODO("Not yet implemented")
    }

    override fun onLongPress(p0: MotionEvent) {
        TODO("Not yet implemented")
    }

    override fun onFling(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        TODO("Not yet implemented")
    }
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (v == imgv2) {
            txv5.text = "哎呀~"
        }
        if (event?.action == MotionEvent.ACTION_MOVE) {
            v?.x = event.rawX- v!!.width/2
            v?.y = event.rawY- v!!.height/2
        }
        return true
    }

    }