import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.lightcore.hhreplica.R
import com.lightcore.hhreplica.adapters.OnItemClickListener
import com.lightcore.hhreplica.dataModels.Offers

class OffersRecAdapter(
    private val offers: List<Offers>,
    private val context: Context,
    private val listener: OnItemClickListener
) : RecyclerView.Adapter<OffersRecAdapter.OfferViewHolder>() {

    class OfferViewHolder(itemView: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val icon: ImageView = itemView.findViewById(R.id.icon_offer)
        val btntext: TextView = itemView.findViewById(R.id.btn)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(itemView.tag as Offers) // Передаем объект Offers
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.offers_item, parent, false)
        return OfferViewHolder(view, listener)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val offer = offers[position]
        holder.title.text = offer.title
        holder.btntext.text = offer.buttonText

        // Устанавливаем иконку
        val iconResId = context.resources.getIdentifier(offer.img, "drawable", context.packageName)
        if (iconResId != 0) {
            val drawable = AppCompatResources.getDrawable(context, iconResId)
            if (drawable != null) {
                holder.icon.setImageDrawable(drawable)
            } else {
                holder.icon.visibility = View.GONE
            }
        } else {
            holder.icon.visibility = View.GONE
        }

        // Устанавливаем объект Offers как тег элемента
        holder.itemView.tag = offer
    }

    override fun getItemCount(): Int {
        return offers.size
    }
}
