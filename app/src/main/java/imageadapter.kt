import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ozonzonzon.Kategories
import com.example.ozonzonzon.R
import com.example.ozonzonzon.databinding.ActivityRecycleBinding
import java.util.Objects


class imageadapter(private val foodList : List<Kategories>) : RecyclerView.Adapter<imageadapter.imageholder>() {


    class imageholder(item: View): RecyclerView.ViewHolder(item) {

        val carimage : ImageButton = item.findViewById(R.id.imageView4)
        val carname : TextView = item.findViewById(R.id.textView11)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): imageholder {
        val viewfs = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycle , parent , false)
        return imageholder(viewfs)
    }

    override fun onBindViewHolder(holder: imageholder, position: Int) {
        val food = foodList[position]
        holder.carimage.setImageResource(food.imageid)
        holder.carname.text = food.title
    }

    override fun getItemCount(): Int {
        return foodList.size

    }

}