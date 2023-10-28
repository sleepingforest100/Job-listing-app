package kz.just_code.joblistingapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kz.just_code.joblistingapp.databinding.ItemCategoryBinding
import kz.just_code.joblistingapp.databinding.ItemJobBinding

class JobListAdapter : ListAdapter<JobListDto, BaseJobViewHolder<*>>(JobListDiffCallback()) {

    class JobListDiffCallback : DiffUtil.ItemCallback<JobListDto>() {
        override fun areItemsTheSame(oldItem: JobListDto, newItem: JobListDto): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: JobListDto, newItem: JobListDto): Boolean {
            return oldItem == newItem
        }
    }
    class JobViewHolder(binding: ItemJobBinding) : BaseJobViewHolder<ItemJobBinding>(binding) {
        override fun bindView(item: JobListDto) {
            with(binding) {
                titleView.text = itemView.context.getString(item.name)
                descriptionView.text = itemView.context.getString(item.description)
            }
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseJobViewHolder<*> {
return JobViewHolder(
    ItemJobBinding.inflate(LayoutInflater.from(parent.context), parent, false)
)

    }

    override fun onBindViewHolder(holder: BaseJobViewHolder<*>, position: Int) {
holder.bindView(
    getItem(position)
)
    }

}
enum class JobListType{
    JOB
}
data class JobListDto(
    val id: Int,
    @StringRes
    val name: Int,
    @StringRes
    val description: Int,
)