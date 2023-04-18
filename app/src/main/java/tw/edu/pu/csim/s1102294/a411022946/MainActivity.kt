package tw.edu.pu.csim.s1102294.a411022946

import android.annotation.SuppressLint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var txv:TextView
    lateinit var txv2:TextView
    lateinit var txv3:TextView
    lateinit var txv4:TextView
    lateinit var btn:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv2 = findViewById(R.id.txv2)
        txv3 = findViewById(R.id.txv3)
        txv4 = findViewById(R.id.txv4)
        btn = findViewById(R.id.btn)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        txv.text = "\n如果有機會去做喜歡的事，那就果斷去做，不要拘謹\n"
        txv2.text = ""
        txv3.text = ""
        txv4.text = ""
        txv.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        txv2.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        txv3.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
        txv4.setTypeface(Typeface.createFromAsset(assets,"font/cwTeXFangSong-zhonly.ttf"))
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
}