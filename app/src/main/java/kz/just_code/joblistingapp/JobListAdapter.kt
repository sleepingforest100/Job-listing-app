package kz.just_code.joblistingapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.just_code.joblistingapp.databinding.ItemCategoryBinding
import kz.just_code.joblistingapp.databinding.ItemJobBinding

class JobListAdapter(
    private val items: List<JobListDto>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if(viewType == JobListType.CATEGORY_VIEW.ordinal){
CategoryViewHolder(
    ItemCategoryBinding.inflate(
        LayoutInflater.from(parent.context), parent, false
    )
)
        }else JobViewHolder(
            ItemJobBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is JobViewHolder -> holder.bindView(items[position].name)
            is CategoryViewHolder ->  holder.bindView(items[position].name)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].viewType.ordinal
    }
    class JobViewHolder(private val binding: ItemJobBinding ):
        RecyclerView.ViewHolder(binding.root){
            fun bindView(title: String){
                binding.titleView.text = title
            }
        }

    class CategoryViewHolder(private val binding: ItemCategoryBinding):
            RecyclerView.ViewHolder(binding.root){
                fun bindView(title: String){
                    binding.root.text = title
                }
            }
}
enum class JobListType{
    JOB_VIEW, CATEGORY_VIEW
}
data class JobListDto(
    val viewType: JobListType,
    val name: String
)