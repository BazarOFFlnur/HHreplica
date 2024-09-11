package com.lightcore.hhreplica.adapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.lightcore.hhreplica.R
import com.lightcore.hhreplica.dataModels.Vacancy
import com.lightcore.hhreplica.ui.home.HomeViewModel

class FullVacancyAdapter(
    private val context: Context,
    private val vacancies: List<Vacancy>,
) : RecyclerView.Adapter<FullVacancyAdapter.VacancyViewHolder>() {


    inner class VacancyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val lookingNumber: TextView = itemView.findViewById(R.id.looktxt)
        val title: TextView = itemView.findViewById(R.id.vac_name)
        val salary: TextView = itemView.findViewById(R.id.zp)
        val city: TextView = itemView.findViewById(R.id.city)
        val companyName: TextView = itemView.findViewById(R.id.companyName)
        val experience: TextView = itemView.findViewById(R.id.opit)
        val datePublished: TextView = itemView.findViewById(R.id.datePublish)
        val button: Button = itemView.findViewById(R.id.OtklickBtn)
        val favbtn: ImageButton = itemView.findViewById(R.id.isFavoriteBtn)

        init {
            button.setOnClickListener {
//                onButtonClick(vacancies[adapterPosition])
            }
            favbtn.setOnClickListener {
                val vacancy = vacancies[adapterPosition]

                // Обновляем состояние через ViewModel
                val homeViewModel = ViewModelProvider(context as FragmentActivity).get(HomeViewModel::class.java)
                homeViewModel.toggleFavorite(vacancy, context)
                notifyDataSetChanged()
                notifyItemChanged(adapterPosition) // Обновляем элемент в списке
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VacancyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.vacanci_item, parent, false)
        return VacancyViewHolder(view)
    }

    override fun onBindViewHolder(holder: VacancyViewHolder, position: Int) {
        val vacancy = vacancies[position]
        holder.lookingNumber.text = vacancy.lookingNumber?.let { getHumanReadableViewersCount(it) }
        holder.title.text = vacancy.title
        holder.salary.text = vacancy.salary.short ?: ""
        holder.salary.visibility = if (vacancy.salary.short != null) View.VISIBLE else View.GONE
        holder.city.text = vacancy.address.town
        holder.companyName.text = vacancy.company
        holder.experience.text = vacancy.experience.previewText
        holder.datePublished.text = vacancy.publishedDate?.let { getCurrentDate(it) }
        if (vacancy.isFavorite) {
            holder.favbtn.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.favorite_active_icon))
        } else {
            holder.favbtn.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.icon_favorites_default))
        }
    }

    override fun getItemCount(): Int {
        return vacancies.size
    }
}

fun getHumanReadableViewersCount(lookingNumber: Int): String {
    val suffix = when {
        lookingNumber % 100 in 11..14 -> "человек"
        lookingNumber % 10 == 1 -> "человек"
        lookingNumber % 10 in 2..4 -> "человека"
        else -> "человек"
    }
    return "Сейчас просматривает $lookingNumber $suffix"
}

fun getCurrentDate(string: String): String{
    val date = string.split("-")
    val month = date[1].toInt()
    val months = arrayOf("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря")
    val result = "Опубликовано ${date[2]} ${months[month-1]}"
    return result
}

